/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 * La clase {@code Nodo} representa un nodo en una lista enlazada que contiene un resumen.
 * Cada nodo tiene un puntero al siguiente nodo en la lista y un objeto de la clase {@code Resumenes}.
 * 
 * @autor Pedro
 */
public class Nodo {
    public Nodo siguiente;
    public Resumenes resumen;

    /**
     * Crea una nueva instancia de la clase {@code Nodo} con el resumen dado.
     * El puntero al siguiente nodo se inicializa a {@code null}.
     * 
     * @param resumen el resumen a almacenar en el nodo
     */
    public Nodo(Resumenes resumen) {
        this.siguiente = null;
        this.resumen = resumen;
    }

    /**
     * Obtiene el siguiente nodo en la lista.
     * 
     * @return el siguiente nodo
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * Establece el siguiente nodo en la lista.
     * 
     * @param siguiente el nodo que se establecerá como el siguiente
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * Obtiene el resumen almacenado en el nodo.
     * 
     * @return el resumen almacenado en el nodo
     */
    public Resumenes getResumen() {
        return resumen;
    }

    /**
     * Establece el resumen a almacenar en el nodo.
     * 
     * @param resumen el resumen a almacenar en el nodo
     */
    public void setResumen(Resumenes resumen) {
        this.resumen = resumen;
    }
}
