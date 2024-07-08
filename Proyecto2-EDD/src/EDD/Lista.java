/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author pedro
 */
public class Lista {
    public Nodo primero;

    public Lista() {
        this.primero = null;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }
    
    public void insertar(Resumenes resumen){
        if (primero == null){
            Nodo nuevo = new Nodo (resumen) ;
            primero = nuevo;
        }else{
            Nodo aux = primero;
            while (aux.siguiente != null){
               aux = aux.siguiente; 
            }
            Nodo nuevo = new Nodo(resumen);
            aux.siguiente = nuevo;
        }
    }
    
    public String imprimir (){
        Nodo aux = primero;
        String titulos = "";
        while (aux != null){
            titulos += aux.getResumen().getTitulo() +"\n" ;
            aux = aux.siguiente;
        }
        return titulos;
    }
}
