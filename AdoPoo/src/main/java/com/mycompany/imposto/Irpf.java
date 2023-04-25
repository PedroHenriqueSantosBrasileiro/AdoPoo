
package com.mycompany.imposto;


public class Irpf implements Imposto {

 
    @Override
    public double calculaImposto(double Salario) {
        
        if(Salario <= 1903.98){
            return 0;
        }else if(Salario >= 1903.99 && Salario <= 2826.65){
            return (Salario * 7.5)/100;
        }else if(Salario >= 2826.66 && Salario <= 3751.05){
            return (Salario * 15)/100;
        }else if(Salario >= 3751.06 && Salario <= 4664.68){
            return (Salario * 22.5)/100;
        }else{
            return (Salario * 27.5)/100;
        }
        
    }
    
}
