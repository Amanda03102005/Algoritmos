/*
 inteiro quantidade_frangos
        real custo_total

        escreva("Digite a quantidade de frangos: ")
        leia(quantidade_frangos)

        se (quantidade_frangos < 0) {
            escreva("Erro: A quantidade de frangos não pode ser negativa.\n")
        } senao {
            custo_total = (quantidade_frangos * 4) + (quantidade_frangos * 2 * 3.5)
            escreva("O gasto total da granja é: R$", custo_total, "\n")
        }
    }
}
TESTE DE MESA
| Entrada | Saída Esperada |
| --- | --- |
| 10 | Gasto total é: 120.0 |
| 20 | Gasto total é: 240.0 |
| 5 | Gasto total é: 60.0 |
| 0 | Gasto total é: 0.0 |
| -1 | Erro (não é possível ter frangos negativos) |

Observações:

- O cálculo do gasto é feito multiplicando o número de frangos pelo custo total por frango, que é 4 + 2*3.50 = 11.0.
- Se o usuário digitar um número negativo, o programa deve exibir um erro, pois não é possível ter frangos negativos.
- Se o usuário digitar 0, o programa deve exibir um gasto total de 0.0.
 */
package q19;

import javax.swing.JOptionPane;

public class Q19 {

    public static void main(String[] args) {
        int frangos;
        double gasto;
        String s_frangos;

        s_frangos = JOptionPane.showInputDialog(null, "Quantos frangos tem na granja");
        frangos = Integer.parseInt(s_frangos);

        gasto = frangos * (4 + 2*3.50);

        JOptionPane.showMessageDialog(null, "Gasto total é: " + gasto);
    }
}
    
