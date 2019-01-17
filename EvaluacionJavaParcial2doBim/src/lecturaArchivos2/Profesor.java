/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaArchivos2;

/**
 *
 * @author reroes
 */
/*
{"cedula":"1803742806","nombres":"MULLO ROMERO ESTHER DEL CARMEN", 
"zona":"ZONA 3","provincia":"TUNGURAHUA", 
"canton":"AMBATO", "personalidad": "POR CONVOCAR", 
"razonamiento":"POR CONVOCAR", 
"dictamenIdoniedad":"NO IDONEO"}
*/

public class Profesor {
    
    private String cedula;
    private String nombres;
    private String zona;
    private String provincia;
    private String canton;
    private String personalidad;
    private String razonamiento;
    private String dictamenIdoniedad;
    
    // Constructor sin parametros
    public Profesor(){
        this("","","","","","","","");
    }
    
    // Contructor que recibe parametros
    public Profesor(String c, String n, String z, String prov, String cant,
            String pers, String r, String dictamen){
        
        agregar_cedula(c);
        agregar_nombres(n);
        agregar_zona(z);
        agregar_provincia(prov);
        agregar_canton(cant);
        agregar_personalidad(pers);
        agregar_razonamiento(r);
        agregar_dictamenIdoniedad(dictamen);
    }
    
    // Metodos de agregar
    public void agregar_cedula(String c){
        cedula = c;
    }
    
    public void agregar_nombres(String n){
        nombres = n;
    }
    
    public void agregar_zona(String z){
        zona = z;
    }
    
    public void agregar_provincia(String prov){
        provincia = prov;
    }
    
    public void agregar_canton(String cant){
        canton = cant;
    }
    
    public void agregar_personalidad(String pers){
        personalidad = pers;
    }
    
    public void agregar_razonamiento(String r){
        razonamiento = r;
    }
    
    public void agregar_dictamenIdoniedad(String dictamen){
        dictamenIdoniedad = dictamen;
    }
    
    // Metodos de obtener
    public String obtener_cedula(){
        return cedula;
    }
    
    public String obtener_nombres(){
        return nombres;
    }
    
    public String obtener_zona(){
        return zona;
    }
    
    public String obtener_provincia(){
        return provincia;
    }
    
    public String obtener_canton(){
        return canton;
    }    
    
    public String obtener_personalidad(){
        return personalidad;
    }
    
    public String obtener_razonamiento(){
        return razonamiento;
    }
    
    public String obtener_dictamenIdoniedad(){
        return dictamenIdoniedad;
    }
    
    // Sobre escribimos el metodo toString.
    @Override
    public String toString(){
        return String.format("%-3s%-3s%-45s%-3s%-3s%-3s%-10s%-3s%-16s%-3s%-13s%-3s%-13s%-6s%-14s%s",obtener_cedula(),
                "|", obtener_nombres(), "|", obtener_zona(), "|", obtener_provincia(), "|", obtener_canton(),
                "|", obtener_personalidad(), "|", obtener_razonamiento(),"|", obtener_dictamenIdoniedad(), "|");
    }
}







