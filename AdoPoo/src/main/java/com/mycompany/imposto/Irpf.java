
package com.mycompany.imposto;


public class Irpf implements Imposto {

 
    @Override
    public double calculaImposto(double Salario) {
        
        if(Salario <= 2112.00){
            return 0;
        }else if(Salario >= 2112.01 && Salario <= 2826.65){
            return ((Salario * 7.5)/100) - 158.40;
        }else if(Salario >= 2826.66 && Salario <= 3751.05){
            return ((Salario * 15)/100) - 370.40;
        }else if(Salario >= 3751.06 && Salario <= 4664.68){
            return ((Salario * 22.50)/100) - 651.73;
        }else{
            return ((Salario * 27.50)/100) - 884.96;
        }
        
    }
    
}
