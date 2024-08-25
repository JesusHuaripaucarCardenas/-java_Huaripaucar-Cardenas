
package Guia7.actividad5;


public class Constructor {
    
    //atributos
    
    String nombre;
    int edad;
    String carrera;
    String ubi;
    
    //metodos
    
    public Constructor(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Constructor(String carrera, String ubi){
        this.carrera = carrera;
        this.ubi = ubi;
    }
    
    public void mostarDatos(){
        System.out.println("Mi nombre es " + nombre);
        System.out.println("Tengo " + edad);
    }
        
    public void mostarDato(){
        System.out.println("Estudio " + carrera);
        System.out.println("En " + ubi);
    }   
}
