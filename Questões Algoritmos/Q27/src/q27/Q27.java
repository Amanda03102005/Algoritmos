/*
 real compra1, compra2, compra3, compra4, total_pontos

        escreva("Digite o valor da primeira compra: ")
        leia(compra1)
        escreva("Digite o valor da segunda compra: ")
        leia(compra2)
        escreva("Digite o valor da terceira compra: ")
        leia(compra3)
        escreva("Digite o valor da quarta compra: ")
        leia(compra4)

        se (compra1 < 0 ou compra2 < 0 ou compra3 < 0 ou compra4 < 0) {
            escreva("Erro: Os valores das compras não podem ser negativos.\n")
        } senao {
            total_pontos = (compra1 + compra2 + compra3 + compra4) / 5.0
            escreva("Total de pontos acumulados: ", total_pontos, "\n")
        }
    }
}
 */
package q27;

import javax.swing.JOptionPane;

public class Q27 {

    
    public static void main(String[] args) {
        double[] compras = new double[4];
        double totalGastos = 0;
        
        for (int i = 0; i < 4; i++) {
            compras[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra " + (i+1) + ":"));
            totalGastos += compras[i];
        }
        
        double pontos = totalGastos / 5;
        
        JOptionPane.showMessageDialog(null, "O total de pontos acumulados é: " + pontos);
    }
    
}
