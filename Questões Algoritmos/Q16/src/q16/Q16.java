/*
  inteiro quantidade_sanduiches
        real queijo, presunto, carne

        escreva("Digite a quantidade de sanduíches a fazer: ")
        leia(quantidade_sanduiches)

        se (quantidade_sanduiches < 0) {
            escreva("Erro: A quantidade de sanduíches não pode ser negativa.\n")
        } senao {
            queijo = (quantidade_sanduiches * 2 * 50) / 1000.0
            presunto = (quantidade_sanduiches * 1 * 50) / 1000.0
            carne = (quantidade_sanduiches * 1 * 100) / 1000.0

            escreva("Quantidade de queijo necessária: ", queijo, " kg\n")
            escreva("Quantidade de presunto necessária: ", presunto, " kg\n")
            escreva("Quantidade de carne necessária: ", carne, " kg\n")
        }
    }
}
TESTE DE MESA
/*
Variável	Valor Inicial	Após Entrada de Dados	Cálculo Hambúrguer	Cálculo Queijo	  Cálculo Presunto	  Valor Final
 s_quantidade	       -	      "10"	               -	               -	         -	             "10"
quantidade	       -	       10	               -	               -	         -	              10
hambúrguer	      100	       -	        100 * 10 / 1000	               -	         -	             1.0 (kg)
queijo	50	       -	       -	       50 * 10 * 2 / 1000	       -	         -                   1.0 (kg)
presunto	      50	       -	               -	               -	     50 * 10 / 1000	     0.5 (kg)
*/

package q16;

import javax.swing.JOptionPane;

public class Q16 {
    
    public static void main(String[] args) {
        double hambúrguer = 100;
        double presunto = 50;
        double queijo = 50;
        int quantidade;
        String s_quantidade;

        s_quantidade = JOptionPane.showInputDialog(null, "Quantos sanduíches você irá fazer?");
        quantidade = Integer.parseInt(s_quantidade);

        hambúrguer = hambúrguer * quantidade / 1000;
        queijo = queijo * quantidade * 2 / 1000;
        presunto = presunto * quantidade/ 1000;

        JOptionPane.showMessageDialog(null, "Hambúguer: " + hambúrguer + ", Queijo: " + queijo + ", Presunto: " + presunto);
    }
}
    
    

