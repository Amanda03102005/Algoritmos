/*
  real litros_refresco, litros_agua, litros_suco

        escreva("Digite a quantidade de litros de refresco desejada: ")
        leia(litros_refresco)

        se (litros_refresco < 0) {
            escreva("Erro: A quantidade de refresco não pode ser negativa.\n")
        } senao {
            litros_agua = litros_refresco * 0.8
            litros_suco = litros_refresco * 0.2
            escreva("Serão necessários ", litros_agua, " litros de água e ", litros_suco, " litros de suco.\n")
        }
    }
 */
package q24;

import javax.swing.JOptionPane;

public class Q24 {

    public static void main(String[] args) {
       double refresco, água, suco;
        String s_refresco, s_água, s_suco;
        
        s_refresco = JOptionPane.showInputDialog(null, "Quantidade de litros de refresco: ");
        refresco = Double.parseDouble(s_refresco);
        
        água = refresco * 0.8;
        suco = refresco * 0.2;
        
        JOptionPane.showMessageDialog(null, "Serão necessários "+ água +"L de água e "+ suco +"L de suco.");
    }
}
   
