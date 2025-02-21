/*
  real a, b, x

        escreva("Digite o coeficiente 'a' da reta (y = ax + b): ")
        leia(a)
        escreva("Digite o coeficiente 'b' da reta (y = ax + b): ")
        leia(b)

        se (a == 0) {
            escreva("Erro: O coeficiente 'a' não pode ser zero.\n")
        } senao {
            x = -b / a
            escreva("O ponto onde a reta toca o eixo x é: (", x, ", 0)\n")
        }
    }
}
 */
package q29;

import javax.swing.JOptionPane;

public class Q29 {

    public static void main(String[] args) {
        String inputA = JOptionPane.showInputDialog("Digite o coeficiente a:");
        String inputB = JOptionPane.showInputDialog("Digite o coeficiente b:");
        
        double a = Double.parseDouble(inputA);
        double b = Double.parseDouble(inputB);
        
        if (a == 0) {
            if (b == 0) {
                JOptionPane.showMessageDialog(null, "A reta coincide com o eixo X.");
            } else {
                JOptionPane.showMessageDialog(null, "A reta é paralela ao eixo X e não o toca.");
            }
        } else {
            double x = -b / a;
            JOptionPane.showMessageDialog(null, "A reta toca o eixo X no ponto (" + x + ", 0).");
    }
    
  }
}
