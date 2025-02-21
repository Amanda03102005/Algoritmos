/*
 inteiro latas, garrafas_600, garrafas_2l
        real total_litros

        escreva("Digite a quantidade de latas de 350 ml: ")
        leia(latas)
        escreva("Digite a quantidade de garrafas de 600 ml: ")
        leia(garrafas_600)
        escreva("Digite a quantidade de garrafas de 2 litros: ")
        leia(garrafas_2l)

        se (latas < 0 ou garrafas_600 < 0 ou garrafas_2l < 0) {
            escreva("Erro: A quantidade de embalagens não pode ser negativa.\n")
        } senao {
            total_litros = (latas * 0.350) + (garrafas_600 * 0.600) + (garrafas_2l * 2.0)
            escreva("Total de litros de refrigerante comprados: ", total_litros, " litros\n")
        }
    }
}
 */
package q21;

import javax.swing.JOptionPane;

public class Q21 {

    public static void main(String[] args) {
        int qtd_lata, qtd_garrafa_p, qtd_garrafa_g;
        double litros;
        String s_qtd_lata, s_qtd_garrafa_p, s_qtd_garrafa_g;

        s_qtd_lata = JOptionPane.showInputDialog(null, "Quantas latas de 350 ml você comprou?");
        s_qtd_garrafa_p = JOptionPane.showInputDialog(null, "Quantas garrafas de 600 ml você comprou?");
        s_qtd_garrafa_g = JOptionPane.showInputDialog(null, "Quantas garrafas de 2L você comprou?");
        qtd_lata = Integer.parseInt(s_qtd_lata);
        qtd_garrafa_p = Integer.parseInt(s_qtd_garrafa_p);
        qtd_garrafa_g = Integer.parseInt(s_qtd_garrafa_g);

        litros = (qtd_lata * 350 + qtd_garrafa_p * 600 + qtd_garrafa_g * 2000);
        litros = litros / 1000;

        JOptionPane.showMessageDialog(null, "Litros no total: " + litros);
    }
}
    
