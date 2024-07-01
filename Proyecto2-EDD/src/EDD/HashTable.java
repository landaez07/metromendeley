/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Chris
 */
public class HashTable {
    Resumenes[] resumenes;
    int tamano;
    int agregados;
    public HashTable(int tamano){
        this.tamano = tamano;
        for (int i = 0; i < tamano; i++) {
            this.resumenes[i] = null;
        }
        this.agregados = 0;
        
    }
    
    public int hash(String titulo){
        int indice = 0;
        for (int i = 0; i < titulo.length(); i++) {
            indice += Character.valueOf(titulo.charAt(i)) * i;
        }
        return indice%this.tamano;
    }
    
    public void insertar(Resumenes resumen){
        int indice = this.hash(resumen.getTitulo());
        
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
        }else{
            this.resumenes[indice] = resumen;
 
        }
        this.agregados +=1;
    }
    
    
    public boolean comprobacion( String titulo ){
        int indice = this.hash(titulo);
        if (this.resumenes[indice].getTitulo().equals(titulo)){
            return true;
        } else {
            indice +=1;
            int contador = 0;
            while (this.resumenes[indice].getTitulo().equals(titulo) && contador != this.tamano){
                indice += 1;
                contador += 1;
                if (indice == tamano){
                    indice = 0;
                }
            }
            if (contador == this.tamano){
                return false;
            }
            return true;
            
        }
    }
}
