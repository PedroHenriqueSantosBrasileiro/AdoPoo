
package com.mycompany.lista;

import com.mycompany.funcionario.Funcionario;

public class Nodo {
    
    private Funcionario dado;
    private Nodo proximo;

    public Funcionario getDado() {
        return dado;
    }

    public void setDado(Funcionario dado) {
        this.dado = dado;
    }

    public Nodo getProximo() {
        return proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }
    
    
    
}
