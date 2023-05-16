package com.mycompany.funcionario;

import com.mycompany.beneficios.ConvenioMedico;
import com.mycompany.beneficios.ValeAlimentacao;
import com.mycompany.beneficios.ValeRefeicao;
import com.mycompany.beneficios.ValeTransporte;
import com.mycompany.imposto.Inss;
import com.mycompany.imposto.Irpf;

public class Funcionario {

    private String nome;
    private double salarioBruto;
    private double horaExtra;
    private double salarioTotal;
    private double bonificacao;
    private double salarioLiquido;
    private double irfp;
    private double inss;
    private double vt;
    private double vr;
    private double va;
    private double convenio;

    public Funcionario(String nome, double salarioBruto, double horaExtra, double bonificacao) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.horaExtra = horaExtra;
        this.bonificacao = bonificacao;
        this.salarioTotal = salarioBruto + horaExtra;
        this.irfp = new Irpf().calculaImposto(salarioTotal - new Inss().calculaImposto(salarioTotal));
        this.inss = new Inss().calculaImposto(salarioTotal);
        this.vt = new ValeTransporte().calculaDescontoBeneficio(salarioBruto);
        this.vr = new ValeRefeicao().calculaDescontoBeneficio(salarioBruto);
        this.va  = new ValeAlimentacao().calculaDescontoBeneficio(salarioBruto);
        this.convenio = new ConvenioMedico().calculaDescontoBeneficio(salarioBruto);

        this.salarioLiquido = ((salarioTotal + bonificacao) - (irfp + inss + vt + vr + va  + convenio));

    }

    @Override
    public String toString() {
     
        String holerite;
        
        holerite = "------------------------------------------";
        holerite += "\nNome: " + this.nome;
        holerite += "\n--------------Proventos-------------------";
        holerite += "\nSalario Bruto: R$ " + String.format("%.2f", this.salarioBruto);
        holerite += "\nHora Extra: R$ " + String.format("%.2f", this.horaExtra);
        holerite += "\nBonificação: R$ " + String.format("%.2f", this.bonificacao);
        holerite += "\nTotal Proventos: R$ " + String.format("%.2f", this.salarioTotal + this.bonificacao);
        holerite += "\n------------Descontos---------------------";
        holerite += "\nImposto de Renda: R$ " + String.format("%.2f", this.irfp);
        holerite += "\nINSS: R$ " + String.format("%.2f", this.inss);
        holerite += "\nVale Transporte: R$ " + String.format("%.2f", this.vt);
        holerite += "\nVale Refeição: R$ " + String.format("%.2f", this.vr);
        holerite += "\nVale Alimentação: R$ " + String.format("%.2f", this.va);
        holerite += "\nConvenio Médico: R$ " + String.format("%.2f", this.convenio);
        holerite += "\n------------------------------------------";
        holerite += "\nSalario Liquido: R$ " + String.format("%.2f", this.salarioLiquido);
        holerite +="\n------------------------------------------\n";
        
        
        return holerite;
        
    }
    
    
    
}
