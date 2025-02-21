/*
  cadeia nome1, nome2, nome3
        inteiro pontos1, pontos2, pontos3
        real premio_total, premio1, premio2, premio3

        escreva("Digite o nome do primeiro colocado: ")
        leia(nome1)
        escreva("Digite os pontos do primeiro colocado: ")
        leia(pontos1)
        escreva("Digite o nome do segundo colocado: ")
        leia(nome2)
        escreva("Digite os pontos do segundo colocado: ")
        leia(pontos2)
        escreva("Digite o nome do terceiro colocado: ")
        leia(nome3)
        escreva("Digite os pontos do terceiro colocado: ")
        leia(pontos3)

        se (pontos1 < 0 ou pontos2 < 0 ou pontos3 < 0) {
            escreva("Erro: Os pontos não podem ser negativos.\n")
        } senao {
            premio_total = 500000.0
 */
package q26;

import javax.swing.JOptionPane;

public class Q26 {

    public static void main(String[] args) {
        String nome1 = JOptionPane.showInputDialog("Digite o nome do 1º colocado:");
        int pontos1 = Integer.parseInt(JOptionPane.showInputDialog("Digite os pontos do 1º colocado:"));

        String nome2 = JOptionPane.showInputDialog("Digite o nome do 2º colocado:");
        int pontos2 = Integer.parseInt(JOptionPane.showInputDialog("Digite os pontos do 2º colocado:"));

        String nome3 = JOptionPane.showInputDialog("Digite o nome do 3º colocado:");
        int pontos3 = Integer.parseInt(JOptionPane.showInputDialog("Digite os pontos do 3º colocado:"));

        int totalPontos = pontos1 + pontos2 + pontos3;
        double premio1 = (double) pontos1 / totalPontos * 500000;
        double premio2 = (double) pontos2 / totalPontos * 500000;
        double premio3 = (double) pontos3 / totalPontos * 500000;

        JOptionPane.showMessageDialog(null, "Prêmio do 1º colocado (" + nome1 + "): R$" + String.format("%.2f", premio1));
        JOptionPane.showMessageDialog(null, "Prêmio do 2º colocado (" + nome2 + "): R$" + String.format("%.2f", premio2));
        JOptionPane.showMessageDialog(null, "Prêmio do 3º colocado (" + nome3 + "): R$" + String.format("%.2f", premio3));
    }
}

