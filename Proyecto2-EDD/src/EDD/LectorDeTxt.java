/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Clase LectorDeTxt que se encarga de leer archivos de texto y procesar su contenido.
 * Permite insertar datos en dos tablas hash: una para títulos y otra para autores.
 * 
 * @autor Chris
 */
public class LectorDeTxt {
    public HashTable hashtable;
    public Hash1 hash1;

    /**
     * Constructor de la clase LectorDeTxt.
     * 
     * @param titulos HashTable para almacenar títulos.
     * @param autores Hash1 para almacenar autores.
     */
    public LectorDeTxt(HashTable titulos, Hash1 autores) {
        this.hashtable = titulos;
        this.hash1 = autores;
    }

    /**
     * Método para leer y procesar el contenido de un archivo de texto.
     * 
     * @param path Ruta del archivo de texto a leer.
     */
    public void leerResumen(String path) {
        String linea;
        String titulo=  "";
        String autores = "";
        String resumen = "";
        String llaves = "";
        int modo = 1;
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            while ((linea = br.readLine()) != null) {
                if (!linea.isEmpty()) {
                    if (linea.toLowerCase().equals("autores")) {
                        modo = 2;
                    } else if (linea.toLowerCase().equals("resumen")) {
                        modo = 3;
                    } else if (linea.toLowerCase().contains("palabras claves: ")) {
                        if (String.valueOf(linea.charAt(linea.length() - 1)).equals(".") || String.valueOf(linea.charAt(linea.length() - 1)).equals(".")) {
                            llaves += linea.toLowerCase().replace("palabras claves: ", "").replaceAll(".$", "");
                        } else {
                            llaves += linea.toLowerCase().replace("palabras claves: ", "");
                        }
                    } else if (modo == 1) {
                        titulo += linea;
                    } else if (modo == 2) {
                        autores += linea.replace("-", " ") + ";";
                    } else if (modo == 3) {
                        resumen += linea + " ";
                    }
                }
            }
            autores = autores.replaceAll(".$", "");

            Resumenes nuevo = new Resumenes(titulo, autores, resumen, llaves);
            this.hashtable.insertar(nuevo);
            System.out.println("a");

            String[] llave = llaves.split(", ");

            for (int i = 0; i < llave.length; i++) {
                this.hash1.insertar(nuevo);
            }
            System.out.println("b");
            br.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Método para buscar un archivo de texto en el sistema de archivos.
     * 
     * @return La ruta del archivo seleccionado o una cadena vacía si no se seleccionó ningún archivo.
     */
    public String buscarTXT() {
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Texto", "txt");
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(filter);
        File ruta = new File("e:/carpeta/");
        fileChooser.setCurrentDirectory(ruta);
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String dir = String.valueOf(file).replace("\\", "//");
            return dir;
        }
        return "";
    }
}