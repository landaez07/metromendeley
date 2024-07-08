/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto2.edd;

import EDD.Hash1;
import EDD.HashTable;
import EDD.Resumenes;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Chris
 */
public class Proyecto2EDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] filePath = {"C:\\ruta\\al\\archivo.txt"}; 
        HashTable hashtable = new HashTable(filePath.length *2);
        Hash1 hash = new Hash1(filePath.length *2);

        for (int i = 0; i < filePath.length; i++) {
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath[i]))) {
                String line;
                String titulo = "";
                String autores = "";
                String resumen = "";
                String palabras = "";
                int estado = 1;
                while ((line = reader.readLine()) != null) {
                    if (!line.isEmpty()) {
                        if (line.equals("Autores")) {
                            estado = 2;
                        } else if (line.equals("Resumen")) {
                            estado = 3;
                        } else if (line.toLowerCase().contains("palabras clave:")) {
                            palabras += line.toLowerCase().replace("palabras clave:", "");
                        }else if(estado == 1){
                            titulo += line;
                        }else if(estado == 2){
                            autores += line + "\n";
                        }else if(estado == 3){
                            resumen += line + " ";
                        }
                    }
                }
                Resumenes art = new Resumenes(titulo, autores, resumen, palabras);
                hashtable.insertar(art);

                hash.insertar(art);
            }
        catch (IOException e) {
                System.err.println("Error leyendo el archivo: " + e.getMessage());
            }
    }
}

}