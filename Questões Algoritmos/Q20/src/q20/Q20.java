/*
  inteiro quantidade_blusas
        real quantidade_novelos_total, novelos_por_blusa

        escreva("Digite a quantidade de blusas produzidas: ")
        leia(quantidade_blusas)
        escreva("Digite a quantidade total de novelos gastos: ")
        leia(quantidade_novelos_total)

        se (quantidade_blusas < 0 ou quantidade_novelos_total < 0) {
            escreva("Erro: A quantidade de blusas ou novelos não pode ser negativa.\n")
        } senao {
            novelos_por_blusa = quantidade_novelos_total / quantidade_blusas
            escreva("A quantidade de novelos gastos por blusa é: ", novelos_por_blusa, "\n")
        }
    }
}
 */
package q20;

import javax.swing.JOptionPane;

public class Q20 {

    public static void main(String[] args) {
        double novelos, blusas, novelos_por_blusa;
        String s_novelos, s_blusas;

        s_blusas = JOptionPane.showInputDialog(null, "Quantas blusas foram fabricadas?");
        s_novelos = JOptionPane.showInputDialog(null, "Quantos novelos foram gastos?");
        blusas = Double.parseDouble(s_blusas);
        novelos = Double.parseDouble(s_novelos);

        novelos_por_blusa = novelos / blusas;

        JOptionPane.showMessageDialog(null, "Você gastou " + novelos_por_blusa + " novelos por blusa.");
    }
}
   
