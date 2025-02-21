/*
 portugol

        real valorconta, valorfelipe
        inteiro valorcarlos, valorandre

        escreva("Digite o valor total da conta: ")
        leia(valorconta)

        se (valorconta < 0) {
            escreva("Erro: O valor da conta não pode ser negativo.\n")
        } senao {
            
            valorcarlos = valorconta / 3
            valorandre = valorcarlos

            
            valorfelipe = valorconta - (valorcarlos * 2)

            
            escreva("Carlos deve pagar: R$", valorcarlos, "\n")
            escreva("André deve pagar: R$", valorandre, "\n")
            escreva("Felipe deve pagar: R$", valorfelipe, "\n")

TESTE DE MESA
/*
Variável	Valor Inicial	      Após Entrada de Dados	   Cálculo Conta Rachada	Cálculo Centavos	Cálculo Felipe	         Valor Final
s_conta	-	 "101.53"	             -	                           -	                       -	             -                      "101.53"
conta	-	  101.53	             -	                           -	                       -	             -                      101.53
conta_rachada	    -	                     -	                   101.53 / 3 = 33.8433	               -	             -	                   33.8433
carlos_andré	    -	                     -	                           -	               (int)33.8433 = 33	     -	                      33
centavos	    -	                     -	                           -	             33.8433 - 33 = 0.8433	     -	                    0.8433
felipe	            -	                     -	                           -	                       -	      33 + 3 * 0.8433	           35.5299 (35.53 arredondado)
*/
package q15;

import javax.swing.JOptionPane;

public class Q15 {

    public static void main(String[] args) {
        int carlos_andré;
        double conta, conta_rachada, centavos, felipe;
        String s_conta;

        s_conta = JOptionPane.showInputDialog(null, "Qual o total da conta?");
        conta = Double.parseDouble(s_conta); 

        conta_rachada = conta / 3;
        carlos_andré = (int)conta_rachada;
        centavos = conta_rachada - carlos_andré;
        felipe = carlos_andré + 3 * centavos;
        
        JOptionPane.showMessageDialog(null, "Carlos: " + carlos_andré + ", André: " + carlos_andré + ", Felipe: " + felipe);
    }
}


    
    

