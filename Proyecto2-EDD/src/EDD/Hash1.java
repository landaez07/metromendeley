/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author pedro
 */
public class Hash1 {
    Lista[] lista;
    int tamano;
    int agregados;
    public Hash1(int tamano){
        this.tamano = tamano;
        this.lista = new Lista[this.tamano];
        for (int i = 0; i < tamano; i++) {
            this.lista[i] = new Lista();
        }
        this.agregados = 0;
    }
    
    public int hash(String clave){
        int indice = 0;
        for (int i = 0; i < clave.length(); i++) {
            indice += Character.valueOf(clave.charAt(i)) * i;
        }
        return indice%this.tamano;
    }
    
    public void insertar(Resumenes resumen){
        int indice = this.hash(resumen.getClaves());
        Lista listas2 = this.comprobacion(resumen.getClaves());
        if (listas2 != null){
            listas2.insertar(resumen);
            return;
        }
        if (this.tamano == this.agregados){
            Lista[] nuevo = new Lista[this.tamano + 1];
            for (int i = 0; i < this.tamano; i++) {
                nuevo[i] = this.lista[i];
            }
            nuevo[this.tamano] = new Lista();
            nuevo[this.tamano].insertar(resumen);
            this.tamano += 1;
        }
        else if (this.lista[indice] != null){
            indice += 1;
            while(this.lista[indice] != null){
                indice += 1;
                if (indice == tamano){
                    indice = 0;
                }
            }
            this.lista[indice] = new Lista();
            this.lista[indice].insertar(resumen);
        }else{
            this.lista[indice] = new Lista();
            this.lista[indice].insertar(resumen);
 
        }
        this.agregados +=1;
    }
    
    public Lista comprobacion( String clave){    //colisiones de las claves
        int indice = this.hash(clave);
        if( this.lista[indice] == null){
            return null;
        }
        if (this.lista[indice].getPrimero().getResumen().getClaves().contains(clave)){
            return this.lista[indice];
        } else {
            indice +=1;
            int contador = 0;
            while (this.lista[indice].getPrimero().getResumen().getClaves().contains(clave) && contador != this.tamano){
                indice += 1;
                contador += 1;
                if (indice == tamano){
                    indice = 0;
                }
            }
            if (contador == this.tamano){
                return null;
            }
            return this.lista[indice];
            
        }
    }
    

    
}
