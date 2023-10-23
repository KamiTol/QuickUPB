package ar.charlycimino.quickupb;

import javax.swing.JOptionPane;

public class Ticket {
    private int numeroTicket,cantidad,precioTotal;
    private String producto,nc,doc/*,nombreC,nombreB*/,estadoPedido="sin entregar";
    private String nombreOperario;
    private Cliente cliente;
    public Ticket(int numeroTicket, String producto, int cantidad, int precioTotal,String nc,String doc, String nombreOperario) {
        this.numeroTicket = numeroTicket;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioTotal = precioTotal;
        this.nc = nc;
        this.doc = doc;
        this.nombreOperario = nombreOperario;
        this.cliente = cliente;
    }
    public void generarFactura() {
        int puntosCliente = cliente.getPuntos();
        JOptionPane.showMessageDialog(null,"Número de Ticket: "+ numeroTicket +"\nDetalles del Pedido:\nNombre del cliente:"+nc+"\nDocumento: "+doc+"\nProductos: "+producto+/*+nombreC+nombreB+*/"\nCantidad: " + cantidad+"\nPrecio: "+precioTotal+"\nEstado de pedido: "+estadoPedido+"\n"+nombreOperario+ "\nPuntos del cliente: " + puntosCliente);
    }
    public void setEstadoPedido(){
            estadoPedido = "entregado";
    }
    public void generarFacturaEntregada(){
        if(estadoPedido=="entregado"){
            JOptionPane.showMessageDialog(null,"Número de Ticket: "+ numeroTicket +"\nDetalles del Pedido:\nNombre del cliente:"+nc+"\nDocumento: "+doc+"\nProductos: "+producto+/*+nombreC+nombreB+*/"\nCantidad: " + cantidad+"\nPrecio: "+precioTotal+"\nEstado de pedido: "+estadoPedido+"\n"+nombreOperario);
        }
    }
    public void generarFacturaNoEntregada(){
        if(estadoPedido=="sin entregar"){
            JOptionPane.showMessageDialog(null,"Número de Ticket: "+ numeroTicket +"\nDetalles del Pedido:\nNombre del cliente:"+nc+"\nDocumento: "+doc+"\nProductos: "+producto+/*+nombreC+nombreB+*/"\nCantidad: " + cantidad+"\nPrecio: "+precioTotal+"\nEstado de pedido: "+estadoPedido+"\n"+nombreOperario);
        }
    }
}
