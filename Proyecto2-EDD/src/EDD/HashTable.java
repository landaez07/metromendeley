/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 * La clase {@code HashTable} representa una tabla hash que almacena objetos de la clase {@code Resumenes}.
 * Permite insertar, buscar y analizar resúmenes basados en sus títulos.
 * También proporciona una búsqueda por autores.
 * 
 * @autor Pedro
 */
public class HashTable {
    public Resumenes[] resumenes;
    public int tamano;
    public int agregados;

    /**
     * Crea una nueva instancia de la clase {@code HashTable} con un tamaño especificado.
     * 
     * @param tamano el tamaño inicial de la tabla hash
     */
    public HashTable(int tamano){
        this.tamano = tamano;
        this.resumenes = new Resumenes[this.tamano];
        for (int i = 0; i < tamano; i++) {
            this.resumenes[i] = null;
        }
        this.agregados = 0;
    }
    
    /**
     * Calcula el índice hash para un título dado.
     * 
     * @param titulo el título del resumen
     * @return el índice hash correspondiente
     */
    public int hash(String titulo){
        int indice = 0;
        for (int i = 0; i < titulo.length(); i++) {
            indice += Character.valueOf(titulo.charAt(i)) * i;
        }
        return indice % this.tamano;
    }
    
    /**
     * Inserta un nuevo resumen en la tabla hash.
     * 
     * @param resumen el resumen a insertar
     */
    public void insertar(Resumenes resumen){
        int indice = this.hash(resumen.getTitulo().toLowerCase());
        if (this.comprobacion(resumen.titulo.toLowerCase()) != null){
            System.out.println("El resumen ya se encuentra en el sistema");
            return;
        }
        if (this.tamano == this.agregados){
            Resumenes[] nuevo = new Resumenes[this.tamano + 1];
            for (int i = 0; i < this.tamano; i++) {
                nuevo[i] = this.resumenes[i];
            }
            nuevo[this.tamano] = resumen;
            this.tamano += 1;
        }
        else if (this.resumenes[indice] != null){
            indice += 1;
            while(this.resumenes[indice] != null){
                indice += 1;
                if (indice == tamano){
                    indice = 0;
                }
            }
            this.resumenes[indice] = resumen;
        } else {
            this.resumenes[indice] = resumen;
        }
        this.agregados += 1;
    }
    
    /**
     * Comprueba si un resumen con un título dado ya está presente en la tabla hash.
     * 
     * @param titulo el título del resumen
     * @return el resumen encontrado, o {@code null} si no se encuentra
     */
    public Resumenes comprobacion(String titulo){
        int indice = this.hash(titulo);
        if (this.resumenes[indice] == null) {
            return null;
        }
        if (this.resumenes[indice].getTitulo().toLowerCase().equals(titulo)) {
            return this.resumenes[indice];
        } else {
            indice += 1;
            int contador = 0;
            while (this.resumenes[indice] != null && !this.resumenes[indice].getTitulo().toLowerCase().equals(titulo) && contador != this.tamano) {
                indice += 1;
                contador += 1;
                if (indice == tamano) {
                    indice = 0;
                }
            }
            if (contador == this.tamano) {
                return null;
            }
            return this.resumenes[indice];
        }
    }

    /**
     * Busca un resumen por su título en la tabla hash.
     * 
     * @param titulo el título del resumen
     * @return el resumen encontrado
     */
    public Resumenes buscar(String titulo){
        int indice = this.hash(titulo);
        if (this.resumenes[indice].titulo.toLowerCase().equals(titulo)) {
            return this.resumenes[indice];
        } else {
            indice += 1;
            while (!this.resumenes[indice].titulo.toLowerCase().equals(titulo)) {
                indice += 1;
                if (indice == tamano) {
                    indice = 0;
                }
            }
            return this.resumenes[indice];
        }
    }

    /**
     * Analiza un resumen específico y cuenta las ocurrencias de cada palabra clave en su cuerpo.
     * 
     * @param titulo el título del resumen a analizar
     * @return un string con el análisis del resumen
     */
    public String analizar(String titulo){
        Resumenes resumen = this.buscar(titulo.toLowerCase());
        String Autor = resumen.autores;
        String cuerpo = resumen.getCuerpo().toLowerCase();
        String respuesta = titulo + "\n" + Autor + "\n";
        String[] palabras = resumen.getClaves().toLowerCase().split(",");
        for (int i = 0; i < palabras.length; i++) {
            int aux = 0;
            int contador = 0;
            for (int j = 0; j < resumen.getCuerpo().length(); j++) {
                if (!String.valueOf(cuerpo.charAt(j)).equals(String.valueOf(palabras[i].charAt(aux)))) {
                    aux = 0;
                }
                if (String.valueOf(cuerpo.charAt(j)).equals(String.valueOf(palabras[i].charAt(aux)))) {
                    aux += 1;
                }
                if (aux == palabras[i].length()) {
                    contador++;
                    aux = 0;
                }  
            }
            respuesta += (palabras[i] + ": " + contador + " veces.\n");
        }
        return respuesta;
    }
    
    /**
     * Busca todos los resúmenes que contienen un autor específico.
     * 
     * @param autor el autor a buscar
     * @return una cadena con los resúmenes que contienen el autor especificado
     */
    public String busqueda_autores(String autor){
        Lista lis1 = new Lista();
        for (int i = 0; i < this.tamano; i++) {
            if (this.resumenes[i] != null && this.resumenes[i].getAutores().toLowerCase().contains(autor.toLowerCase())) {
                lis1.insertar(this.resumenes[i]);
            }
        }
        return lis1.imprimir();
    }
}