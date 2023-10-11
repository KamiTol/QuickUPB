package ar.charlycimino.quickupb;

import javax.swing.JOptionPane;

public class Calificacion {
    //n es numero de calificacion, nc es numero de cliente
    private int n,nc;

    public Calificacion(int n, int nc) {
        this.n = n;
        this.nc = nc;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getNc() {
        return nc;
    }

    public void setNc(int nc) {
        this.nc = nc;
    }
    
    public void mostrarCalificacion(int c){
        if (c == 1){
            try {
               int puntaje = Integer.parseInt(JOptionPane.showInputDialog(null, "Porfavor ingrese su puntaje del 1 (menor) al 5(mayor)"));
            switch (puntaje){
                case 1 ->{
                    JOptionPane.showMessageDialog(null, "Muchas gracias por su puntaje, lamento que no haya disfrutado el programa");
                }
                case 2 ->{
                    JOptionPane.showMessageDialog(null, "Muchas gracias por su puntaje, lamento que no haya disfrutado el programa");
                }
                case 3 ->{
                    JOptionPane.showMessageDialog(null, "Muchas gracias por su puntaje, nos enfocaremos en mejorar más");
                }
                case 4->{
                    JOptionPane.showMessageDialog(null, "Muchas gracias por su puntaje, nos alegra que le haya gustado nuestro programa");
                }
                case 5->{
                    JOptionPane.showMessageDialog(null, "Muchas gracias por su puntaje, nos alegra que haya disfrutado nuestro programa");
                }
            } 
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"ingrese una calificacion valida");
            }
        }
    }
}
