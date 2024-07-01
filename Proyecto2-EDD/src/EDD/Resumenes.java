/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author pedro
 */
public class Resumenes {
    public String titulo;
    public String autores;
    public String cuerpo;
    public String claves;

    public Resumenes(String titulo, String autores, String cuerpo, String claves) {
        this.titulo = titulo;
        this.autores = autores;
        this.cuerpo = cuerpo;
        this.claves = claves;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getClaves() {
        return claves;
    }

    public void setClaves(String claves) {
        this.claves = claves;
    }
    
    
    
}
