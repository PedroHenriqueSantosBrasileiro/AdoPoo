package com.mycompany.beneficios;

public class ValeAlimentacao extends Beneficio {

    public ValeAlimentacao() {
        this.setAliquota(2);
    }

    @Override
    public double calculaDescontoBeneficio(double salario) {
        double desconto;

        if (salario <= this.getSalarioMinimo() * 2) {
            desconto = 0;
        } else {
            desconto = (salario * (double) this.getAliquota()) / 100;
        }

        return desconto;
    }
}
