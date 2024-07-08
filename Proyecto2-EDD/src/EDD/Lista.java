/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 * La clase {@code Lista} representa una lista enlazada de objetos de la clase {@code Nodo}.
 * Permite insertar nodos y obtener una representación en forma de cadena de los títulos de los resúmenes almacenados en la lista.
 * 
 * @autor Pedro
 */
public class Lista {
    public Nodo primero;

    /**
     * Crea una nueva instancia de la clase {@code Lista} con el primer nodo inicializado a {@code null}.
     */
    public Lista() {
        this.primero = null;
    }

    /**
     * Obtiene el primer nodo de la lista.
     * 
     * @return el primer nodo de la lista
     */
    public Nodo getPrimero() {
        return primero;
    }

    /**
     * Establece el primer nodo de la lista.
     * 
     * @param primero el nodo que se establecerá como el primero de la lista
     */
    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }
    
    /**
     * Inserta un nuevo nodo con el resumen dado al final de la lista.
     * 
     * @param resumen el resumen a insertar en la lista
     */
    public void insertar(Resumenes resumen){
        if (primero == null) {
            Nodo nuevo = new Nodo(resumen);
            primero = nuevo;
        } else {
            Nodo aux = primero;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            Nodo nuevo = new Nodo(resumen);
            aux.siguiente = nuevo;
        }
    }
    
    /**
     * Devuelve una representación en forma de cadena de los títulos de los resúmenes almacenados en la lista.
     * 
     * @return una cadena que contiene los títulos de los resúmenes en la lista, separados por saltos de línea
     */
    public String imprimir() {
        Nodo aux = primero;
        String titulos = "";
        while (aux != null) {
            titulos += aux.getResumen().getTitulo() + "\n";
            aux = aux.siguiente;
        }
        return titulos;
    }
}
