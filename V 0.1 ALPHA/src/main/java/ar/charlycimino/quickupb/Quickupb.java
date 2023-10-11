package ar.charlycimino.quickupb;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class Quickupb {
    //brenda
    static List<Restaurante> lista = new ArrayList<Restaurante>();
    static List<Calificacion> lista8 = new ArrayList<Calificacion>();
    static List<Cliente> lista9 = new ArrayList<Cliente>();
    static List<Ticket> lista10 = new ArrayList<Ticket>();
    public static void main(String[] args){
        int restaurante = 0;//numero de restaurante
        int r=0;//contador while secundarios       
        int nc=0;//numero de cliente
        //lista de restaurantes
        lista.add(new Restaurante("Cavamar", 0));
        lista.add(new Restaurante("Eat Box", 1));
        lista.add(new Restaurante("El gualilo", 2));
        //productos predefinidos
        lista.get(0).predefinirProductos1();
        lista.get(1).predefinirProductos2();
        lista.get(2).predefinirProductos3();
        lista.get(0).predefinirOperario1();
        lista.get(1).predefinirOperario2();
        lista.get(2).predefinirOperario3();
        int otro=1;//otro para el switch main
        int otro1;//otro para los switch secundarios
        int n;//variable para ingresar el caso de switch
        int p=0;//contador con el while principal
        int np;//numero de pedido
            while(otro==1){
                n = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a QUICKUPB?\n\n¿Que desea hacer?\n\n1.Gestión pedidos.\n2.Gestión de Clientes.\n3.Gestión de operarios.\n4.Gestión de menús.\n5.salir del programa."));
                switch(n){
                    case 1:
                        otro1=1;
                        while(otro1==1){
                            n = Integer.parseInt(JOptionPane.showInputDialog("Gestión de Pedidos:\n\n1.ingresar Pedidos\n2.lista de Pedidos.\n3.modificar estado del pedido.\n4.pedidos entregados.\n5.pedidos no entregados.\n6.ir al menu principal"));
                            switch(n){
                                case 1:
                                    if(lista9.size() == 0){
                                        JOptionPane.showMessageDialog(null,"no se a creado ningun cliente");
                                        Quickupb.addCliente(r);
                                    }
                                    else{
                                        restaurante = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                               "Bienvenido a nuestro programa de restaurante BETA"
                                                               
                                                               Ingresa el restaurante que desea:
                                                               
                                                               Restaurantes: 
                                                               """+lista.get(0).getNurestaurante()+". "+lista.get(0).getNrestaurante()+"\n"+lista.get(1).getNurestaurante()+". "+lista.get(1).getNrestaurante()+"\n"+lista.get(2).getNurestaurante()+". "+lista.get(2).getNrestaurante()));
                                        switch(restaurante){
                                            case 0:
                                                lista.get(0).setNoperario();
                                                Quickupb.generarPedido(restaurante,p);
                                                JOptionPane.showMessageDialog(null, "No olvide recoger su pedido en el primer piso del edificio A");
                                                break;
                                            case 1:
                                                lista.get(1).setNoperario();
                                                Quickupb.generarPedido(restaurante,p);
                                                JOptionPane.showMessageDialog(null, "No olvide recoger su pedido en el edificio L - sótano 1");
                                                break;
                                            case 2:
                                                lista.get(2).setNoperario();
                                                Quickupb.generarPedido(restaurante,p);
                                                JOptionPane.showMessageDialog(null, "No olvide recoger su pedido en el primer piso del edificio A");
                                                break;
                                        } 
                                        Quickupb.setCalificacion(lista9.get(nc).getN());
                                        p++;
                                        nc++;
                                        break;
                                    }
                                case 2:
                                    if(lista10.size() == 0){
                                        JOptionPane.showMessageDialog(null,"no se a creado ningun pedido");
                                    }
                                    else{
                                    Quickupb.nPedidos();
                                    }
                                    break;
                                case 3:
                                    np = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de pedido"));
                                    lista10.get(np).setEstadoPedido();
                                    break;
                                case 4:
                                    Quickupb.nPedidosEntregados();
                                    break;
                                case 5:
                                    Quickupb.nPedidosSinEntregar();
                                    break;
                                case 6:
                                    otro1=0;
                                    break;
                            }
                        }
                        break;
                    case 2:
                        otro1=1;
                        while(otro1==1){
                            n = Integer.parseInt(JOptionPane.showInputDialog("Gestión de Clientes:\n\n1.ingresar clientes\n2.lista de clientes.\n3.modificar datos del cliente.\n4.eliminar cliente.\n5.eliminar clientes.\n6.ver puntos.\n7.ir al menu principal."));
                            switch(n){
                                case 1:
                                    Quickupb.addCliente(r);
                                    break;
                                case 2:
                                    if(lista9.size()==0){
                                        JOptionPane.showMessageDialog(null,"no hay ningun cliente");
                                    }
                                    else{
                                    Quickupb.listaClientes();
                                    }
                                    break;
                                case 3:
                                    if(lista9.size()==0){
                                        JOptionPane.showMessageDialog(null,"no hay ningun cliente");
                                    }
                                    else{
                                        Quickupb.listaClientes();
                                        Quickupb.modificarCliente();
                                    }
                                    break;
                                case 4:
                                    if(lista9.size()==0){
                                        JOptionPane.showMessageDialog(null,"no hay ningun cliente");
                                    }
                                    else{
                                        Quickupb.listaClientes();
                                        Quickupb.eliminarCliente();
                                    }
                                    break;
                                case 5:
                                    if(lista9.size()==0){
                                        JOptionPane.showMessageDialog(null,"no hay ningun cliente");
                                    }
                                    else{
                                        Quickupb.eliminarClientes();
                                    }
                                    break;
                                case 6: // Nueva opción para consultar puntos
                                    nc = Integer.parseInt(JOptionPane.showInputDialog("ingrese el cliente al que desea mirar los puntos"));
                                    JOptionPane.showMessageDialog(null, "Tienes " + lista9.get(nc).getPuntos() + " puntos.");
                                    break;
                                case 7:
                                    otro1=0;
                                    break;
                            }
                        }
                        break;
                    case 3:
                        otro1=1;
                        while(otro1==1){
                            n = Integer.parseInt(JOptionPane.showInputDialog("Gestión de Operarios:\n\n1.ingresar Operarios\n2.lista de operarios.\n3.modificar datos del operario.\n4.eliminar operario.\n5.eliminar operarios.\n6.ir al menu principal"));
                            switch(n){
                                case 1:
                                    Quickupb.addListOperario(Quickupb.getRestaurante());
                                    break;
                                case 2:
                                    Quickupb.listaOperario(Quickupb.getRestaurante());
                                    break;
                                case 3:
                                    Quickupb.modListOperario(Quickupb.getRestaurante());
                                    break;
                                case 4:
                                    Quickupb.deleteOperario(Quickupb.getRestaurante());
                                    break;
                                case 5:
                                    Quickupb.deleteListOperario(Quickupb.getRestaurante());
                                    break;
                                case 6:
                                    otro1=0;
                                    break;
                            }
                        }
                        break;
                    case 4:
                        Quickupb.gestionarListMenus(Quickupb.getRestaurante());
                        break;
                    case 5:
                        otro=0;
                        break;
                }       
            }
    }
    static void setCalificacion(int a){
        int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Quisiera darle un puntaje a nuestro programa (sí = 1 o No = 0)?"));
        lista8.add(new Calificacion(c, a));
        for(int i=a;i<(a+1);i++){
            lista8.get(i).mostrarCalificacion(c);
        }
    }
    static public void nPedidos(){
        for (int i=0; i<lista10.size(); i++) {
            lista10.get(i).generarFactura();
        }
    }
    static public void nPedidosSinEntregar(){
        for (int i=0; i<lista10.size(); i++) {
            lista10.get(i).generarFacturaNoEntregada();
        }
    }
    static public void nPedidosEntregados(){
        for (int i=0; i<lista10.size(); i++) {
            lista10.get(i).generarFacturaEntregada();
        }
    }
    static public void listaComida(int n){
        if(n==0){
            lista.get(0).getComida();
        }
        if(n==1){
            lista.get(1).getComida();
        }
        if(n==2){
            lista.get(2).getComida();
        }
    }
    static public void listaBebida(int n){
        if(n==0){
            lista.get(0).getBebida();
        }
        if(n==1){
            lista.get(1).getBebida();
        }
        if(n==2){
            lista.get(2).getBebida();
        }
    }
    static public void generarPedido(int restaurante,int  p){
        try {
            int otro= 0;
            int o=0;
            int precio=0,tiempo=0;
            int nc = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero de cliente"));
            while (otro == 0){
                Quickupb.listaComida(restaurante);
                //se solicita que ingrese una bebida y comida
                int comida = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el número de la comida que quiere (bebida y comida obligatoria):"));
                Quickupb.listaBebida(restaurante);
                //se actualiza el precio/tiempo de bebida y comida
                int bebida = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el número de la comida que quiere (bebida y comida obligatoria):"));
                precio += lista.get(restaurante).Comida.get(comida).getPrecio()+lista.get(restaurante).Bebida.get(bebida).getPrecio();
                tiempo += lista.get(restaurante).Comida.get(comida).getTiempo()+lista.get(restaurante).Bebida.get(bebida).getTiempo();
                //pues el joptionpane jsjs
                JOptionPane.showMessageDialog(null, "El precio por todo es: "+precio+" y durará aproximadamente "+tiempo+" minutos");
                otro = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                Quiere otro pedido más? (ingrese 0 si es así)
                                                                (para realizar otro pedido debes pedir otra bebida adiccional)"""));
                o++;
                //se incrementan los puntos del cliente
                lista9.get(nc).setPuntos(lista9.get(nc).getPuntos() + 1);
                //se crea un ticket
                lista10.add(new Ticket(p,"plato: "+lista.get(restaurante).Comida.get(comida).getNombre()+"\nbebida: "+lista.get(restaurante).Bebida.get(bebida).getNombre(),o,precio,lista9.get(nc).getNombre(),lista9.get(nc).getDocumento(), lista.get(restaurante).getOperario()));
                lista10.get(p).generarFactura();
            } 
        }catch(Exception e){
            JOptionPane.showInputDialog("ingrese un dato valido");
        }
    }
    static public void modificarCliente(){
        int nc=0;//numero de cliente
        nc = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero del cliente que desea modificar su información"));
        lista9.get(nc).setNombre(JOptionPane.showInputDialog("ingrese el nombre del cliente: "+nc));
        lista9.get(nc).setDocumento(JOptionPane.showInputDialog("ingrese el documento del cliente: "+nc));
    }
    static public void eliminarClientes(){
        lista9.clear();
    }
    static public void eliminarCliente(){
        int nc=0;//numero de cliente
        nc = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero del cliente que desea eliminar su información"));
        lista9.remove(nc);
    }
    static public void listaClientes(){
        String string="la lista de clientes es:\n";
        for(int i=0;i<lista9.size();i++){
            string+="cliente : "+lista9.get(i).getN()+"\n";
            string+="nombre: "+lista9.get(i).getNombre()+"\n";
            string+="documento: "+lista9.get(i).getDocumento()+"\n";
        }
        JOptionPane.showMessageDialog(null,string);
    }
    static public void addCliente(int r) {
    int otro = 1;
    while (otro == 1) {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        String documento;
        while (true) {
            documento = JOptionPane.showInputDialog("Ingrese su número de documento:");
            // Verificamos si la cadena contiene solo dígitos utilizando el método isNumeric.
            if (isNumeric(documento)) {
                break; // Documento válido, salimos del bucle.
            } else {
                JOptionPane.showMessageDialog(null, "Error: El documento debe contener solo números enteros.");
            }
        }
        lista9.add(new Cliente(nombre, documento, r));
        r++;
        otro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 para continuar, de lo contrario, otro número:"));
    }
}

    // Método auxiliar para verificar si una cadena es numérica.
    static private boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    static public void listaOperario(int n){
        if(n==0){
            lista.get(0).getOperarios();
        }
        if(n==1){
            lista.get(1).getOperarios();
        }
        if(n==2){
            lista.get(2).getOperarios();
        }
    }
    static public void addListOperario(int n){
        if(n==0){
            lista.get(0).addOperario();
        }
        if(n==1){
            lista.get(1).addOperario();
        }
        if(n==2){
            lista.get(2).addOperario();
        }
    }
    static public void modListOperario(int n){
        switch(n){
            case 0:
                Quickupb.modificarOperario(0);
                break;
            case 1:
                Quickupb.modificarOperario(1);
                break;
            case 2:
                Quickupb.modificarOperario(2);
                break;
        }
    }
    static public void modificarOperario(int n){
        int nc=0;//numero de cliente
        nc = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero del cliente que desea modificar su información"));
        lista.get(n).Operario.get(nc).setNombre(JOptionPane.showInputDialog("ingrese el nombre del operario: "+nc));
        lista.get(n).Operario.get(nc).setApellido(JOptionPane.showInputDialog("ingrese el apellido del operario: "+nc));
    }
    static public void deleteOperario(int n){
        switch(n){
            case 0:
                Quickupb.eliminarOperario(0);
                break;
            case 1:
                Quickupb.eliminarOperario(1);
                break;
            case 2:
                Quickupb.eliminarOperario(2);
                break;
        }
    }
    static public void eliminarOperario(int n){
        int nc=0;//numero de cliente
        nc = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero del cliente que desea eliminar su información"));
        lista.get(n).Operario.remove(nc);
    }
    static public void deleteListOperario(int n){
        switch(n){
            case 0:
                lista.get(0).clearOperario();
                break;
            case 1:
                lista.get(1).clearOperario();
                break;
            case 2:
                lista.get(2).clearOperario();
                break;
        }
    }
    static public int getRestaurante(){
        int restaurante = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                               Ingresa el restaurante :
                                                               
                                                               Restaurantes: 
                                                               """+lista.get(0).getNurestaurante()+". "+lista.get(0).getNrestaurante()+"\n"+lista.get(1).getNurestaurante()+". "+lista.get(1).getNrestaurante()+"\n"+lista.get(2).getNurestaurante()+". "+lista.get(2).getNrestaurante()));
        return restaurante;
    }
    static public void gestionarListMenus(int n){
        switch(n){
            case 0:
                Quickupb.gestionarMenus(0,n);
                break;
            case 1:
                Quickupb.gestionarMenus(1,n);
                break;
            case 2:
                Quickupb.gestionarMenus(2,n);
                break;
        }
    }
    static public void gestionarMenus(int r,int restaurante){
        int otro1=1;
        while(otro1==1){
            int n = Integer.parseInt(JOptionPane.showInputDialog("Gestión de menús:\n\n1.ver menú\n2.agregar comida.\n3.agregar bebida.\n4.eliminar comida.\n5.eliminar bebidas.\n6.ir al menu principal"));
            switch(n){
                case 1:
                    Quickupb.listaComida(restaurante);
                    Quickupb.listaBebida(restaurante);
                    break;
                case 2:
                    lista.get(r).addComidas();
                    break;
                case 3:
                    lista.get(r).addBebidas();
                    break;
                case 4:
                    lista.get(r).clearComida();
                    break;
                case 5:
                    lista.get(r).clearBebida();
                    break;
                case 6:
                    otro1=0;
                    break;
            }
        }
    }
}
