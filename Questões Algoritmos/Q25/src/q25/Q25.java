/*
 real raio, altura, volume

        escreva("Digite o raio da caixa d'água (em metros): ")
        leia(raio)
        escreva("Digite a altura da caixa d'água (em metros): ")
        leia(altura)

        se (raio < 0 ou altura < 0) {
            escreva("Erro: O raio ou a altura não podem ser negativos.\n")
        } senao {
            volume = 3.14159 * raio * raio * altura
            escreva("O volume da caixa d'água é: ", volume, " metros cúbicos\n")
        }
    }
}
 */
package q25;

import javax.swing.JOptionPane;

public class Q25 {

    public static void main(String[] args) {
        double volume, raio, altura;
        String s_raio, s_altura;

        s_raio = JOptionPane.showInputDialog(null, "Qual o raio da circunferência da caixa d'água?");
        s_altura = JOptionPane.showInputDialog(null, "Qual a altura da caixa d'água?");
        raio = Double.parseDouble(s_raio);
        altura = Double.parseDouble(s_altura);

        volume = Math.PI * (raio * raio) * altura;

        JOptionPane.showMessageDialog(null, "O volume é: " + volume);
    }
}  
    
