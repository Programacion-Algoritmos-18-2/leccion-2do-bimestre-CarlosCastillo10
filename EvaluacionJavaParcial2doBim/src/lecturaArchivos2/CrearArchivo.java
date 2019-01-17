package lecturaArchivos2;

// Fig. 14.7: CrearArchivoTexto.java
// Uso de la clase Formatter para escribir datos en un archivo de texto.

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

// import com.deitel.jhtp7.cap14.RegistroCuenta;

public class CrearArchivo
{
   private Formatter salida; // objeto usado para enviar texto al archivo

   // permite al usuario abrir el archivo
   public void abrirArchivo()
   {
      try
      {
         salida = new Formatter( "data/informacionOrdenada.csv" );
      } // fin de try
      catch ( SecurityException securityException )
      {
         System.err.println(
            "No tiene acceso de escritura a este archivo." );
         System.exit( 1 );
      } // fin de catch
      catch ( FileNotFoundException filesNotFoundException )
      {
         System.err.println( "Error al crear el archivo." );
         System.exit( 1 );
      } // fin de catch
   } // fin del m�todo abrirArchivo

   // agrega registros al archivo
   public void agregarRegistros(ArrayList<Profesor> info)
   {
      // objeto que se va a escribir en el archivo y enviamos un encabezado
       salida.format("%s|%s|%s|%s|%s|%s|%s|%s\n","Cedula","Nombres","Zona","Provincia",
               "Canton","Personalidad","Razonamiento","DictamenIdoneidad");
      
      for (int x = 0; x < info.size(); x++) // itera hasta encontrar el indicador de fin de archivo
      {
         try // env�a valores al archivo
         {
            // obtiene los datos que se van a enviar
            salida.format("%s|%s|%s|%s|%s|%s|%s|%s\n", info.get(x).obtener_cedula(),
                    info.get(x).obtener_nombres(),info.get(x).obtener_zona(),
                    info.get(x).obtener_provincia(),info.get(x).obtener_canton(),
                    info.get(x).obtener_personalidad(),info.get(x).obtener_razonamiento(),
                    info.get(x).obtener_dictamenIdoniedad());    
             
         } // fin de try
         catch ( FormatterClosedException formatterClosedException )
         {
            System.err.println( "Error al escribir en el archivo." );
            return;
         } // fin de catch
         catch ( NoSuchElementException elementException )
         {
            System.err.println( "Entrada invalida. Intente de nuevo." );
         } // fin de catch

         
      } // fin del for
   } // fin del m�todo agregarRegistros

   // cierra el file
   public void cerrarArchivo()
   {
      if ( salida != null )
         salida.close();
   } // fin del m�todo cerrarArchivo
} // fin de la clase CrearArchivoTexto

/**************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *                                                                        *
 * RENUNCIA: Los autores y el editor de este libro han realizado su mejor *
 * esfuerzo para preparar este libro. Esto incluye el desarrollo, la      *
 * investigaci�n y prueba de las teor�as y programas para determinar su   *
 * efectividad. Los autores y el editor no hacen ninguna garant�a de      *
 * ning�n tipo, expresa o impl�cita, en relaci�n con estos programas o    *
 * con la documentaci�n contenida en estos libros. Los autores y el       *
 * editor no ser�n responsables en ning�n caso por los da�os consecuentes *
 * en conexi�n con, o que surjan de, el suministro, desempe�o o uso de    *
 * estos programas.                                                       *
 *************************************************************************/