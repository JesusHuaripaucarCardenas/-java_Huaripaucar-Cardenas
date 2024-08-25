
package Guia7.Actividad4;


public class Parametros {
    
    //atributos
    
    int suma;
    int resta;
    int multiplicacion;
    
    //metodos
    
    public void sumar(int a, int b){
        suma = a + b;
    }
    
    public void restar(int a, int b){
        resta = a - b;
    }
    
    public void multiplicar(int a, int b){
        multiplicacion = a * b;
    }
    
    public void mostrarDatos(){
        System.out.println("La suma es " + suma); 
        System.out.println("La suma es " + resta);
        System.out.println("La suma es " + multiplicacion);
    }
    
}
