
package com.mycompany.lista;


public class Lista {
    
    private Nodo prim = null;
    
    public void adiciona(Funcionario funcionario){
        Nodo novo = new Nodo();
        
        novo.setDado(funcionario);
        novo.setProximo(prim);
        prim = novo;
    }
    
    public void imprimeLista(){
        for(Nodo n = prim; n != null; n.getProximo()){
            System.out.println(n.getDado());
        }
    }
    
}
