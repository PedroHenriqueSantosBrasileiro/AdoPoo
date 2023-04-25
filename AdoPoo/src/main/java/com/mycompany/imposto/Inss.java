
package com.mycompany.imposto;

public class Inss implements Imposto {

    @Override
    public double calculaImposto(double Salario) {
        
        if(Salario <= 1302){
            return 0;
        }else if(Salario >= 1302.01 && Salario <= 2571.29){
            return (Salario * 7.5)/100;
        }else if(Salario >= 2571.30 && Salario <= 3856.94 ){
            return (Salario * 9)/100;
        }else if(Salario >= 3856.95 && Salario <= 7507.49){
            
        }
        
    }
    
    
    
}
