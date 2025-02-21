/*
 inteiro horas_normais, horas_extras
        real salario_bruto, salario_liquido

        escreva("Digite o número de horas normais trabalhadas: ")
        leia(horas_normais)
        escreva("Digite o número de horas extras trabalhadas: ")
        leia(horas_extras)

        se (horas_normais < 0 ou horas_extras < 0) {
            escreva("Erro: As horas trabalhadas não podem ser negativas.\n")
        } senao {
            salario_bruto = (horas_normais * 10) + (horas_extras * 15)
            salario_liquido = salario_bruto * 0.9

            escreva("Salário bruto: R$", salario_bruto, "\n")
            escreva("Salário líquido: R$", salario_liquido, "\n")
TESTE DE MESA
/*
Variável	Valor Inicial	       Após Entrada de Dados	          Cálculo Salário Bruto	    Cálculo Salário Líquido	   Valor Final
s_horas_normais      -	                        "40"	                              -	                      -                        "40"
s_horas_extras	-	                        "10"	                              -	                      -	                       "10"
horas_normais	-	                         40	                              -	                      -	                        40
horas_extras	-	                         10	                              -	                      -	                        10
salário	-	                                  -	                   10 * 40 + 15 * 10 = 550    550 * 0.90 = 495	       550 (bruto), 495 (líquido)
*/
package q18;

import javax.swing.JOptionPane;

public class Q18 {

    public static void main(String[] args) {
        int horas_normais, horas_extras;
        double salário;
        String s_horas_normais, s_horas_extras;

        s_horas_normais = JOptionPane.showInputDialog(null, "Quantas horas normais você trabalhou?");
        s_horas_extras = JOptionPane.showInputDialog(null, "Quantas horas extras você trabalhou?");
        horas_normais = Integer.parseInt(s_horas_normais);
        horas_extras = Integer.parseInt(s_horas_extras);

        salário = 10 * horas_normais + 15 * horas_extras;

        JOptionPane.showMessageDialog(null, "Seu salário bruto é: " + salário + ", e o líquido é: " + salário * 0.90);
    }
}
   
