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
    public Resumenes[] resumenes;
    public int tamano;
    public int agregados;
    public HashTable(int tamano){
        this.tamano = tamano;
        this.resumenes = new Resumenes[this.tamano];
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
        if (this.comprobacion(resumen.titulo) != null){
            System.out.println("El resumen ya se encoentra en el sistema");
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
        }else{
            this.resumenes[indice] = resumen;
 
        }
        this.agregados +=1;
    }
    
    
    public Resumenes comprobacion( String titulo ){
        int indice = this.hash(titulo);
        if( this.resumenes[indice] == null){
            return null;
        }
        if (this.resumenes[indice].getTitulo().equals(titulo)){
            return this.resumenes[indice];
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
                return null;
            }
            return this.resumenes[indice];
            
        }
    }
    public Resumenes buscar(String titulo){
        int indice = this.hash(titulo);
        if(this.resumenes[indice].titulo.equals(titulo)){
            return this.resumenes[indice];
        }else{
            indice += 1;
            while(!this.resumenes[indice].titulo.equals(titulo)){
                indice += 1;
                if (indice == tamano){
                    indice = 0;
                }
            }
            return this.resumenes[indice];
        }
    }
    
    public String analizar (String titulo){
        Resumenes resumen = this.buscar(titulo);
        String Autor = resumen.autores;
        String cuerpo = resumen.getCuerpo();
        String respuesta = titulo + "\n" + Autor + "\n";
        String[] palabras = resumen.getClaves().split(",");
        for (int i = 0; i < palabras.length; i++) {
            int aux = 0;
            int contador = 0;
            for (int j = 0; j < resumen.getCuerpo().length(); j++) {
                if(!String.valueOf(cuerpo.charAt(j)).equals(String.valueOf(palabras[i].charAt(aux)))){
                    aux = 0;
                }
                if(String.valueOf(cuerpo.charAt(j)).equals(String.valueOf(palabras[i].charAt(aux)))){
                    aux += 1;
                }
                if (aux == palabras[i].length()){
                    contador ++;
                    aux = 0;
                }  
            }
            respuesta +=(palabras[i] + ": " + contador + " veces.\n");
        }
        return respuesta;
        
    }
    
    
    public String busqueda_autores( String autor){
        Lista lis1 = new Lista();
        for (int i = 0; i < this.tamano; i++) {
            if (this.resumenes[i].getAutores().contains(autor)){
                lis1.insertar(this.resumenes[i]);
            }
        }
        return lis1.imprimir();
        
    }
    
}
