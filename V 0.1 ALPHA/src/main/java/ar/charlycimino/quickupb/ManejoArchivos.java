package ar.charlycimino.quickupb;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ManejoArchivos {
    public static void escribirArchivo(String nombreArchivo,String contenido){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo,true));
            salida.println(contenido);
            salida.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    public static void leerArchivo(String nombreArchivo){
        String cadena="";
        File archivo = new File(nombreArchivo);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while(lectura!= null){
                System.out.println(lectura);
                //cadena+=lectura;
                //JOptionPane.showMessageDialog(null,lectura);
                lectura = entrada.readLine();
            }
            //JOptionPane.showMessageDialog(null,lectura);
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    public static void eliminarArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        archivo.delete();
    }
    public static void escribirArchivoClientes(String nombreArchivo, List<Cliente> cliente) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            for (Cliente clientes : cliente) {
                salida.println(clientes.getDocumento());
                salida.println(clientes.getNombre());
                salida.println(clientes.getN());
            }
            salida.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static List<Cliente> leerArchivoAutos(String nombreArchivo) {
        List<Cliente> clientes = new ArrayList<>();
        File archivo = new File(nombreArchivo);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String documento, nombre, n;
            while ((documento = entrada.readLine()) != null) {
                nombre = entrada.readLine();
                n = entrada.readLine();
                clientes.add(new Cliente(documento, nombre, Integer.parseInt(n)));
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return clientes;
    }
    public static void buscarArchivo(String nombreArchivo, int posicionDeseada) {
    try {
        File archivo = new File(nombreArchivo);
        BufferedReader entrada = new BufferedReader(new FileReader(archivo));

        // Supongamos que cada objeto ocupa 4 líneas
        int lineasPorObjeto = 3;
        
        // Calculamos el índice de inicio del objeto deseado en la lista de líneas
        int inicio = posicionDeseada * lineasPorObjeto;
        
        // Verificamos si la posición deseada es válida
        if (inicio >= 0) {
            // Nos movemos al inicio del objeto deseado
            for (int i = 0; i < inicio; i++) {
                entrada.readLine();
            }
            
            // Mostramos las líneas del objeto
            int lineasImpresas = 0;
            while (lineasImpresas < lineasPorObjeto) {
                String linea = entrada.readLine();
                if (linea != null) {
                    System.out.println(linea); // Imprimimos cada línea
                    lineasImpresas++;
                } else {
                    break; // En caso de que lleguemos al final del archivo
                }
            }
        } else {
            System.out.println("Posición no válida o fuera de rango.");
        }
        
        entrada.close();
    } catch (FileNotFoundException ex) {
        ex.printStackTrace(System.out);
    } catch (IOException ex) {
        ex.printStackTrace(System.out);
    }
}
    public static boolean archivoVacio(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        return archivo.length() == 0;
    }
}


