/*
        real celsius, fahrenheit

        escreva("Digite a temperatura em graus Celsius: ")
        leia(celsius)

            fahrenheit = (celsius * 9/5) + 32
            escreva("A temperatura em Fahrenheit é: ", fahrenheit, "\n")
    }
}
TESTE DE MESA
/*
Variável	Valor Inicial	Após Entrada de Dados	Cálculo Fahrenheit	Valor Final
s_celsius	      -	             "25"	              -	                   "25"
celsius	-	     25.0	       -	              -                    25.0
fahrenheit	       -	       -	           (1.8 * 25.0)            77.0                                                           + 32 = 77.0	               
 */
package q17;

import javax.swing.JOptionPane;

public class Q17 {

    public static void main(String[] args) {
        double celsius, fahrenheit;
        String s_celsius;
        
        s_celsius = JOptionPane.showInputDialog(null, "Graus em celsius:");
        celsius = Double.parseDouble(s_celsius);

        fahrenheit = (1.8 * celsius) + 32;

        JOptionPane.showMessageDialog(null, "" + celsius + "°C são " + fahrenheit + "°F");
    }
}
   