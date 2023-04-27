
package com.mycompany.imposto;

public class Inss implements Imposto {

    @Override
    public double calculaImposto(double Salario) {
        
        double inss = 0.0;
        
        if(Salario <= 1302.00) {
            inss = Salario * 0.075;
        } else if(Salario <= 2571.29) {
            inss = 97.65 + ((Salario - 1302.00) * 0.09);
        } else if(Salario <= 3856.94) {
            inss = 97.65 + 114.23 + ((Salario - 2571.29) * 0.12);
        } else if(Salario <= 7507.49) {
            inss = 97.65 + 114.23 + 343.42 + ((Salario - 3856.94) * 0.14);
        } else {
            inss = 751.99;
        }
        
        return inss;
        
    }
    
    
    
}
