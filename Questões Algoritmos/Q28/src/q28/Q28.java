/*
  real valor_cheque, imposto_cpmf

        escreva("Digite o valor do cheque: ")
        leia(valor_cheque)

        // Verificação de erro para valor negativo
        se (valor_cheque < 0) {
            escreva("Erro: O valor do cheque não pode ser negativo.\n")
        } senao {
            imposto_cpmf = valor_cheque * 0.0038
            escreva("Valor a ser recolhido de CPMF: R$", imposto_cpmf, "\n")
        }
    }
}
 */
package q28;

import javax.swing.JOptionPane;

public class Q28 {

    public static void main(String[] args) {
        String valorChequeStr = JOptionPane.showInputDialog("Insira o valor do cheque:");
        
        double valorCheque = Double.parseDouble(valorChequeStr);
        
        double valorCPMF = valorCheque * 0.0038;
        
        String valorCPMFStr = String.format("%.2f", valorCPMF);
       
        JOptionPane.showMessageDialog(null, "O valor recolhido de CPMF será: R$ " + valorCPMFStr);
    }
    
}
