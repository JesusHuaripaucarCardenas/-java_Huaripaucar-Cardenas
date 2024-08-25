
package Guia7.actividad2;


public class Biblioteca {
    
    //atributos
    
    String libro;
    String usuario;
    String persona;
   
    
    //metodos 
    
    public void prestarLibro(String libro, String usuario) {
        System.out.println("el libro " + libro + " fue prestado a " + usuario);
    }
    
    public void agregado(String libro, String usuario) {
        System.out.println("el libro " + libro + " fue agregdo a la mochila de " + usuario);
    }
    
    public void prestar(String persona, String libro, String usuario) {
        System.out.println(persona + " pidio prestado " + libro + " a " + usuario);
    }
}
