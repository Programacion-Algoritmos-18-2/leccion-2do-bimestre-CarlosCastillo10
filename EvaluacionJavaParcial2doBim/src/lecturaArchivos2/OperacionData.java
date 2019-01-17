/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaArchivos2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author reroes
 */
public class OperacionData {

    ArrayList<Profesor> informacion = new ArrayList<>();

    public void agregarInformacion(ArrayList<Profesor> info) {
        informacion = info;
    }

    public ArrayList<Profesor> obtenerInformacion() {
        return informacion;
    }
    
    // Metodo que une los dos archivos
    public ArrayList<Profesor> concatenarInformacion(ArrayList<Profesor> info1, 
            ArrayList<Profesor> info2) {
        
        for(int x = 0; x < info2.size(); x++){
            info1.add(info2.get(x));
        }
        
        return info1;
    }
    
    // proceso de ordenar, a través del uso de Collections
    public void ordenarPorCanton(){
        ArrayList<Profesor> dataPorCantones = new ArrayList<>();
        dataPorCantones.addAll(informacion);
        Collections.sort(dataPorCantones, 
                        (o1, o2) -> o1.obtener_canton().compareTo(o2.obtener_canton()));
        
        System.out.printf("\n  %-8s%-15s%-33s%-3s%-6s%-3s%-10s%-3s%-16s%-3s%-13s%-3s%"
                + "-13s%-3s%-9s%s\n__________|_______________________________________________|________|_"
                + "___________|__________________|_______________|_______________|___________________|\n"
                + "%11s%48s%9s%13s%19s%16s%16s%20s\n"
                + "","Cedula","|","Nombres","|","Zona","|","Provincia"
                ,"|","Canton","|","Personalidad","|","Razonamiento","|","DictamenIdoniedad","|",
                "|","|","|","|","|","|","|","|");
        for (int i = 0; i < dataPorCantones.size(); i++) {
            System.out.println(dataPorCantones.get(i));
        }
    }
    
    // Metodo que ordena por nombres y devuelve un arraylist de tipo Profeosr.
    public ArrayList<Profesor> ordenarPorNombres(){
        ArrayList<Profesor> dataPorNombres = new ArrayList<>();
        dataPorNombres.addAll(informacion);
        Collections.sort(dataPorNombres, 
                        (o1, o2) -> o1.obtener_nombres().compareTo(o2.obtener_nombres()));
        return dataPorNombres;
        
    }
    
    public void lecturaData() {
        for (int i = 0; i< obtenerInformacion().size(); i++) {
            System.out.println(obtenerInformacion().get(i));    
        }
        
    }
    
    // Metodo que obtiene el numero participantes por el atributo 'personalidad'
    public void obtener_pPersonalidad(){
        
        int cont_adecuado = 0;
        int cont_porConvocar = 0;
        
        for(int x = 0 ; x < informacion.size(); x++){
            
            if(informacion.get(x).obtener_personalidad().equals("ADECUADO")){
                cont_adecuado ++;
            }else{
                cont_porConvocar ++;
            }
        
        }
        
        System.out.printf("El numero de participantes catalogados 'ADECUADOS' es: %d"
                + "\nEl numero de participantes catalogados 'POR CONVOCAR' es: %d\n\n",
                cont_adecuado, cont_porConvocar);
        
    }
    
    // Metodo que obtiene el numero participantes por el atributo 'dictamenIdoniedad'
    public void obtener_pDictamenIdoniedad(){
        int cont_idoneo = 0;
        int cont_noIdoneo = 0;
        
        for(int x = 0; x < informacion.size(); x++){
            
            if(informacion.get(x).obtener_dictamenIdoniedad().equals("IDONEO")){
                cont_idoneo ++;
            }else{
                cont_noIdoneo ++;
            }
        
        }
        
        System.out.printf("\nEl numero de participantes catalogados 'IDONEO' es: %d\n"
                + "El numero de participantes catalogados 'NO IDONEO' es: %d\n",
                cont_idoneo, cont_noIdoneo);
    }

}
