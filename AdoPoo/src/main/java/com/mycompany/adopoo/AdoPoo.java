/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adopoo;

import com.mycompany.beneficios.ValeRefeicao;
import com.mycompany.beneficios.ValeTransporte;
import com.mycompany.funcionario.Funcionario;

/**
 *
 * @author Drac
 */
public class AdoPoo {

    public static void main(String[] args) {
        
        
        ValeRefeicao vt = new ValeRefeicao();
        
        
        Funcionario funcionario = new Funcionario("Pedro",2000,30,100);
        
        System.out.println(funcionario);
        
    }
}
