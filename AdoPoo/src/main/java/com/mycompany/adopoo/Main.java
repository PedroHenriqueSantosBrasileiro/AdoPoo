

package com.mycompany.adopoo;

import com.mycompany.beneficios.ValeRefeicao;
import com.mycompany.beneficios.ValeTransporte;
import com.mycompany.funcionario.Funcionario;
import com.mycompany.lista.Lista;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner tcString = new Scanner(System.in);
        Scanner tcNumero = new Scanner(System.in);
        
        Lista lista = new Lista();
        
        int resp;
        
        OUTER:
        do {
            System.out.println("----HOLERITE ONLINE-------");
            System.out.println("[1] Adicionar Funcionário");
            System.out.println("[2] Gerar Holerite");
            System.out.println("[3] Sair");
            resp = tcNumero.nextInt();
            switch (resp) {
                case 1 -> {
                    System.out.print("Insira o Nome do Funcionario: ");
                    String nome = tcString.nextLine();
                    System.out.print("Insira o Salário Bruto do funcionário: ");
                    double salario = tcNumero.nextDouble();
                    System.out.print("Insira valor das horas extras caso tenha feito: ");
                    double horaExtra = tcNumero.nextDouble();
                    System.out.print("Insira o valor da bonificação caso tenha: ");
                    double bonificacao = tcNumero.nextDouble();
                    Funcionario funcionario = new Funcionario(nome,salario,horaExtra,bonificacao);
                    lista.adiciona(funcionario);
                    System.out.println("Funcionário adicionado com sucesso");
                    System.out.println("");
                }
                case 2 -> lista.imprimeLista();
                case 3 -> {
                    break OUTER;
                }
                default -> {
                }
            }
        } while (resp != 3);
        System.out.println("Programa Encerrado");
    }
}
