/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 * La clase {@code Hash1} representa una tabla hash que almacena listas de
 * objetos de la clase {@code Resumenes}. Permite insertar y comprobar resúmenes
 * basados en sus claves. Utiliza una técnica de manejo de colisiones mediante
 * encadenamiento.
 *
 * @autor Pedro
 */
public class Hash1 {

    Lista[] lista;
    int tamano;
    int agregados;

    /**
     * Crea una nueva instancia de la clase {@code Hash1} con un tamaño
     * especificado.
     *
     * @param tamano el tamaño inicial de la tabla hash
     */
    public Hash1(int tamano) {
        this.tamano = tamano;
        this.lista = new Lista[this.tamano];
        for (int i = 0; i < tamano; i++) {
            this.lista[i] = new Lista();
        }
        this.agregados = 0;
    }

    /**
     * Calcula el índice hash para una clave dada.
     *
     * @param clave la clave del resumen
     * @return el índice hash correspondiente
     */
    public int hash(String clave) {
        int indice = 0;
        for (int i = 0; i < clave.length(); i++) {
            indice += Character.valueOf(clave.charAt(i)) * i;
        }
        return indice % this.tamano;
    }

    /**
     * Inserta un nuevo resumen en la tabla hash.
     *
     * @param resumen el resumen a insertar
     */
    public void insertar(Resumenes resumen) {
        String[] c = resumen.getClaves().split(", ");
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        for (int i = 0; i < c.length; i++) {
            c[i] = c[i].toLowerCase();
            int indice = this.hash(c[i]);
            Lista listas2 = this.comprobacion(c[i]);
            if (listas2 != null && listas2.getPrimero() != null && listas2.getPrimero().getResumen().getClaves().toLowerCase().contains(c[i]) && !listas2.getPrimero().getResumen().getTitulo().toLowerCase().equals(resumen.getTitulo().toLowerCase())) {
                listas2.insertar(resumen);
                return;
            }
            if (this.tamano == this.agregados) {
                Lista[] nuevo = new Lista[this.tamano + 1];
                for (int j = 0; j < this.tamano; j++) {
                    nuevo[j] = this.lista[j];
                }
                nuevo[this.tamano] = new Lista();
                nuevo[this.tamano].insertar(resumen);
                this.tamano += 1;
            } else if (this.lista[indice].getPrimero() != null) {
                indice += 1;
                while (this.lista[indice].getPrimero() != null) {
                    indice += 1;
                    if (indice == tamano) {
                        indice = 0;
                    }
                }
                this.lista[indice] = new Lista();
                this.lista[indice].insertar(resumen);
            } else {
                this.lista[indice] = new Lista();
                this.lista[indice].insertar(resumen);
            }
            this.agregados += 1;
        }
    }

    /**
     * Comprueba si una clave dada ya está presente en la tabla hash.
     *
     * @param clave la clave del resumen
     * @return la lista de resúmenes correspondiente a la clave encontrada, o
     * {@code null} si no se encuentra
     */
    public Lista comprobacion(String clave) {
        int indice = this.hash(clave);
        if (this.lista[indice].getPrimero() == null) {
            return null;
        }
        if (this.lista[indice].getPrimero().getResumen().getClaves().toLowerCase().contains(clave)) {
            return this.lista[indice];
        } else {
            indice += 1;
            int contador = 0;
            while (this.lista[indice].getPrimero() != null && this.lista[indice].getPrimero().getResumen().getClaves().toLowerCase().contains(clave) && contador != this.tamano) {
                indice += 1;
                contador += 1;
                if (indice == tamano) {
                    indice = 0;
                }
            }
            if (contador == this.tamano) {
                return null;
            }
            return this.lista[indice];
        }
    }
}
