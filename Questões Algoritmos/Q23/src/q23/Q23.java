/*
 real altura_pessoa, sombra_pessoa, sombra_predio, altura_predio

        escreva("Digite sua altura (em metros): ")
        leia(altura_pessoa)
        escreva("Digite o comprimento da sua sombra (em metros): ")
        leia(sombra_pessoa)
        escreva("Digite o comprimento da sombra do prédio (em metros): ")
        leia(sombra_predio)

        se (altura_pessoa < 0 ou sombra_pessoa < 0 ou sombra_predio < 0) {
            escreva("Erro: Valores de altura ou sombra não podem ser negativos.\n")
        } senao {
            altura_predio = (altura_pessoa * sombra_predio) / sombra_pessoa
            escreva("A altura do prédio é: ", altura_predio, " metros\n")
        }
    }
}
 */
package q23;

import javax.swing.JOptionPane;

public class Q23 {

    public static void main(String[] args) {
        double alt_pessoa, som_pessoa, alt_predio, som_predio;
        String s_alt_pessoa, s_som_pessoa, s_som_predio;
        
        s_alt_pessoa = JOptionPane.showInputDialog(null, "Sua altura (em metros): ");
        s_som_pessoa = JOptionPane.showInputDialog(null, "Sua sombra (em metros): ");
        s_som_predio = JOptionPane.showInputDialog(null, "Sombra do prédio (em metros): ");
        alt_pessoa = Double.parseDouble(s_alt_pessoa);
        som_pessoa = Double.parseDouble(s_som_pessoa);
        som_predio = Double.parseDouble(s_som_predio);
        
        alt_predio = (alt_pessoa * som_predio) / som_pessoa;

        JOptionPane.showMessageDialog(null, "A altura do prédio é: "+ alt_predio +" metros");
    }
}
    
