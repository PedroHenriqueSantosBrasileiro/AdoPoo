package com.mycompany.lista;

import com.mycompany.funcionario.Funcionario;

public class Lista {

    private Nodo prim;
    private int tamanho = 0;

    public void adiciona(Funcionario funcionario) {
        Nodo novo = new Nodo();

        novo.setDado(funcionario);
        novo.setProximo(prim);
        prim = novo;
        tamanho++;
    }

    public void imprimeLista() {

        if (tamanho < 1) {
            System.out.println("Nenhum funcionario cadastrado");
        } else {
            for (Nodo n = prim; n != null; n = n.getProximo()) {
                System.out.println(n.getDado());
            }
        }

    }

}
