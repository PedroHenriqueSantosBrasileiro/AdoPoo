package com.mycompany.adopoo;

import com.mycompany.model.beneficios.ValeRefeicao;
import com.mycompany.model.beneficios.ValeTransporte;
import com.mycompany.model.funcionario.Funcionario;
import com.mycompany.lista.Lista;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner tcString = new Scanner(System.in);
        Scanner tcNumero = new Scanner(System.in);

        Lista lista = new Lista();
        double salario = 0;

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
                    do {
                        System.out.print("Insira o Salário Bruto do funcionário: ");
                        salario = tcNumero.nextDouble();
                        if(salario == 0){
                            System.out.println("VALOR INVALIDO");
                        }
                    } while (salario == 0);

                    System.out.print("Insira valor das horas extras caso tenha feito: ");
                    double horaExtra = tcNumero.nextDouble();
                    System.out.print("Insira o valor da bonificação caso tenha: ");
                    double bonificacao = tcNumero.nextDouble();
                    Funcionario funcionario = new Funcionario(nome, salario, horaExtra, bonificacao);
                    lista.adiciona(funcionario);
                    System.out.println("Funcionário adicionado com sucesso");
                    System.out.println("");
                }
                case 2 ->
                    lista.imprimeLista();
                case 3 -> {
                    System.out.println("Programa Encerrado");
                    System.exit(0);
                }
                default -> {
                }
            }
        } while (resp != 3);

    }
}
