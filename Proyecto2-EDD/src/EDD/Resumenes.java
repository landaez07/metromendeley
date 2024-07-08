/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 * La clase {@code Resumenes} representa un resumen con un título, autores, cuerpo de texto y palabras clave.
 * Esta clase se utiliza para almacenar y gestionar la información de los resúmenes.
 * 
 * @autor Pedro
 */
public class Resumenes {
    public String titulo;
    public String autores;
    public String cuerpo;
    public String claves;

    /**
     * Crea una nueva instancia de la clase {@code Resumenes} con los detalles proporcionados.
     * 
     * @param titulo el título del resumen
     * @param autores los autores del resumen
     * @param cuerpo el cuerpo del resumen
     * @param claves las palabras clave del resumen
     */
    public Resumenes(String titulo, String autores, String cuerpo, String claves) {
        this.titulo = titulo;
        this.autores = autores;
        this.cuerpo = cuerpo;
        this.claves = claves;
    }

    /**
     * Obtiene el título del resumen.
     * 
     * @return el título del resumen
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el título del resumen.
     * 
     * @param titulo el título a establecer
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene los autores del resumen.
     * 
     * @return los autores del resumen
     */
    public String getAutores() {
        return autores;
    }

    /**
     * Establece los autores del resumen.
     * 
     * @param autores los autores a establecer
     */
    public void setAutores(String autores) {
        this.autores = autores;
    }

    /**
     * Obtiene el cuerpo del resumen.
     * 
     * @return el cuerpo del resumen
     */
    public String getCuerpo() {
        return cuerpo;
    }

    /**
     * Establece el cuerpo del resumen.
     * 
     * @param cuerpo el cuerpo a establecer
     */
    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    /**
     * Obtiene las palabras clave del resumen.
     * 
     * @return las palabras clave del resumen
     */
    public String getClaves() {
        return claves;
    }

    /**
     * Establece las palabras clave del resumen.
     * 
     * @param claves las palabras clave a establecer
     */
    public void setClaves(String claves) {
        this.claves = claves;
    }
}
