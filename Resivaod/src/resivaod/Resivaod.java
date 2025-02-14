/*
 Crie um algoritmo que cria a largura e a altura de um retângulo e calcule o perímetro

var
lado1,lado2, perímetro (declaração de variáveis)

ler lado1, ler lado2; (entrada de dados)

escreva "Valor do primeiro lado"
escreva "Valor do segundo lado"

perímetro= (lado1*2)+(lado2*2);

escreva "O perímetro é"+perímetro (saída de dados)

fim
 */
package resivaod;

import javax.swing.JOptionPane;

public class Resivaod {

    public static void main(String[] args) {
        double lado1,lado2,perímetro;
        String slado1,slado2;
        
        slado1= JOptionPane.showInputDialog(null,"Valor do primeiro lado");
        slado2= JOptionPane.showInputDialog(null,"Valor do segundo lado");
        
        // Transformação de String para valores reais
        lado1= Double.parseDouble(slado1);
        lado2= Double.parseDouble(slado2);
        
        perímetro=(lado1*2)+(lado2*2);
        
        JOptionPane.showMessageDialog(null,"O perímetro é:"+ perímetro);
        
    }
    
}
