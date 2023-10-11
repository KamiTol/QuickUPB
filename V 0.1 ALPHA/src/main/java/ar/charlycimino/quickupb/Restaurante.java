package ar.charlycimino.quickupb;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Restaurante {
    // nrestaurante: nombre de restaurante , nurestaurante: numero de restaurante
    private String nrestaurante;
    private int nurestaurante,nO,i=3,k=3,q=1;
    ArrayList<Producto> Comida = new ArrayList(); 
    ArrayList<Producto> Bebida = new ArrayList();
    ArrayList<Operario> Operario = new ArrayList(); 
    public Restaurante(String nrestaurante, int nurestaurante) {
        this.nrestaurante = nrestaurante;
        this.nurestaurante = nurestaurante;
    }
    public String getNrestaurante() {
        return nrestaurante;
    }
    public void setNrestaurante(String nrestaurante) {
        this.nrestaurante = nrestaurante;
    }
    public int getNurestaurante() {
        return nurestaurante;
    }
    public void setNurestaurante(int nurestaurante) {
        this.nurestaurante = nurestaurante;
    }
    public String Input(String text){
        return JOptionPane.showInputDialog(text);
    }
    public void predefinirProductos1(){
        //1
        //comidas
            Comida.add(new Producto("Desgranado", 0, 15000, 25));
            Comida.add(new Producto("Pizza", 1, 8000, 15));
            Comida.add(new Producto("Chicken Fries", 2, 20000, 30));
        //bebidas
            Bebida.add(new Producto("Gaseosa", 0, 2500, 5));
            Bebida.add(new Producto("Frape de frutas", 1, 5500, 5));
            Bebida.add(new Producto("Malteada de oreo", 2, 7000, 5));
    }
    public void predefinirProductos2(){
        //2
            Comida.add(new Producto("Salchipapa", 0, 9000, 15));
            Comida.add(new Producto("Hamburguesa", 1, 15000, 25));
            Comida.add(new Producto("Perro caliente", 2, 13500, 15));
        //bebidas
            Bebida.add(new Producto("gaseosa", 0, 2500, 0));
            Bebida.add(new Producto("Jugo Hit", 1, 3000, 2));
            Bebida.add(new Producto("Malteada de oreo", 2, 7000, 5));
    }
    public void predefinirProductos3(){
        //3
        //comidas
            Comida.add(new Producto("Americano", 0, 5000, 5));
            Comida.add(new Producto("Frape de café", 1, 12000, 15));
            Comida.add(new Producto("Capuchino", 2, 7000, 8));
        //bebidas
            Bebida.add(new Producto("Late", 0, 8000, 8));
            Bebida.add(new Producto("Expreso", 1, 5000, 5));
            Bebida.add(new Producto("Granizado de cafe", 2, 12000, 7));
    }
    public void addComidas(){
       String name = Input("Nombre de la Comida ");
       int precio = Integer.parseInt(Input("Precio "));
       int tiempo = Integer.parseInt(Input("tiempo "));
       Producto Comidas = new Producto(name,i,precio,tiempo);
       Comida.add(Comidas);
       i++;
       }
    public void addBebidas(){
       String name = Input("Nombre de la Bebida ");
       int precio = Integer.parseInt(Input("Precio "));
       int tiempo = Integer.parseInt(Input("tiempo "));
       Producto Bebidas = new Producto(name,k,precio,tiempo);
       Bebida.add(Bebidas);
       k++;
       }
    public void getComida(){
        String string = "";
        for (int j = 0; j <Comida.size(); j++) {
            string+="numero de comida: "+/*Comida.get(j).getNumero()*/j+"\n";
            string+="nombre: "+Comida.get(j).getNombre()+"\n";
            string+="precio: "+Comida.get(j).getPrecio()+"\n";
            string+="tiempo: "+Comida.get(j).getTiempo()+"\n";
        }
        JOptionPane.showMessageDialog(null,string);
    }
    public void clearComida(){
        int n = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de comida para eliminar"));
        Comida.remove(n);
    }
    public void clearComidas(){
        Comida.clear();
    }
    public void getBebida(){
        String string = "";
        for (int j = 0; j <Bebida.size(); j++) {
            string+="numero de Bebida: "+/*Bebida.get(j).getNumero()*/j+"\n";
            string+="nombre: "+Bebida.get(j).getNombre()+"\n";
            string+="precio: "+Bebida.get(j).getPrecio()+"\n";
            string+="tiempo: "+Bebida.get(j).getTiempo()+"\n";
        }
        JOptionPane.showMessageDialog(null,string);
    }
    public void clearBebida(){
        int n = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de comida para eliminar"));
        Bebida.remove(n);
    }
    public void clearBebidas(){
        Bebida.clear();
    }
    public void predefinirOperario1(){
        //1
        //Nombre
        Operario.add(new Operario("Candy", "Romero",0));
    }
    
    public void predefinirOperario2(){
        //2
        //Nombre
        Operario.add(new Operario("Maria", "Fuentes",0));
    }
    public void predefinirOperario3(){
        //3
        //Nombre
        Operario.add(new Operario("Luis", "Fuentes",0));
    }
    public void getOperarios(){
        String string = "";
        for (int j = 0; j <Operario.size(); j++) {
            string+="numero del empleado: "+/*Operario.get(j).getNumero()*/j+"\n";
            string+="Nombre del Operario: "+Operario.get(j).getNombre()+"\n";
            string+="Apellido del Operario: "+Operario.get(j).getApellido()+"\n";
        }
        JOptionPane.showMessageDialog(null,string);
    }
    public void addOperario(){
       String name = Input("Nombre del operario ");
       String apellido = Input("Apellido del operario ");
       Operario Operarios = new Operario(name,apellido,q);
       Operario.add(Operarios);
       q++;
       }
    public void clearOperario(){
        Operario.clear();
    }
    public int setNoperario(){
        int nO= Integer.parseInt(JOptionPane.showInputDialog("ingrese el id del operario"));
        return nO;
    }
    public String getOperario(){
        String string = "";
            string+="numero del empleado: "+Operario.get(nO).getNumero()+"\n";
            string+="Nombre del Operario: "+Operario.get(nO).getNombre()+"\n";
            string+="Apellido del Operario: "+Operario.get(nO).getApellido()+"\n";
        return string;
    }
}
