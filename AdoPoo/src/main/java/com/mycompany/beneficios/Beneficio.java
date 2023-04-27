
package com.mycompany.beneficios;


public abstract class Beneficio {
    
    private final double salarioMinimo = 1320;
    private int aliquota;
    
    public double calculaDescontoBeneficio(double salario){
        
        double desconto;
        
        if(salario <= this.salarioMinimo){
            desconto = 0;
        }else{
            desconto = (salario *(double) this.aliquota)/100;
        }
        
        return desconto;
    }

    public int getAliquota() {
        return aliquota;
    }

    public void setAliquota(int aliquota) {
        this.aliquota = aliquota;
    }
    
    
    
}
