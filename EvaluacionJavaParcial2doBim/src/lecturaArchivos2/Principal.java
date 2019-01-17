package lecturaArchivos2;

// Fig. 14.12: PruebaLeerArchivoTexto.java
import java.util.ArrayList;

public class Principal {

    public static void main(String args[]) {
        
        // Objetos
        LeerArchivo1 aplicacion = new LeerArchivo1();
        LeerArchivo2 aplicacion2 = new LeerArchivo2();
        OperacionData operacion = new OperacionData();
        CrearArchivo creacion = new CrearArchivo();

        aplicacion.abrirArchivo();
        ArrayList<Profesor> lista1 = aplicacion.leerRegistros(); // Guardamos en 'lista1' la informacion 

        aplicacion2.abrirArchivo();
        ArrayList<Profesor> lista2 = aplicacion2.leerRegistros(); // Guardamos en 'lista2' la informacion
        
        // Agregamos la informacion concatenada
        operacion.agregarInformacion(operacion.concatenarInformacion(lista1, lista2));

        operacion.ordenarPorCanton();
        System.out.println("__________|_______________________________________________|________|_"
                + "___________|__________________|_______________|_______________|___________________|\n\n");
        
        // Creamos el archivo y le enviamos la informacion
        creacion.abrirArchivo();
        creacion.agregarRegistros(operacion.ordenarPorNombres());
        
        // Llamamos a los metodos.
        operacion.obtener_pPersonalidad();
        operacion.obtener_pDictamenIdoniedad();
        
        // Cerramos los archivos
        creacion.cerrarArchivo();
        aplicacion2.cerrarArchivo();
        aplicacion.cerrarArchivo();
    } // fin de main
} // fin de la clase PruebaLeerArchivoTexto

