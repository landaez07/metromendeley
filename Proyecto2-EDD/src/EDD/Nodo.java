/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author pedro
 */
public class Nodo {
    public Nodo siguiente;
    public Resumenes resumen;

    public Nodo(Resumenes resumen) {
        this.siguiente = null;
        this.resumen = resumen;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Resumenes getResumen() {
        return resumen;
    }

    public void setResumen(Resumenes resumen) {
        this.resumen = resumen;
    }
    
    
    
    
}
