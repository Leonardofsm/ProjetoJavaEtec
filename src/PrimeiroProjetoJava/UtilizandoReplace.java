
package PrimeiroProjetoJava;

import javax.swing.*;

public class UtilizandoReplace {
    public static void main(String[] args) {
        double num1, num2, resposta=0.0;
        String aux="";
        
        aux = JOptionPane.showInputDialog(null, "Insira o primeiro número");
        aux = aux.replace(',', '.');
        num1 = Double.parseDouble(aux);
        
        aux = JOptionPane.showInputDialog(null, "Insira o segundo número");
        aux = aux.replace(',', '.');
        num2 = Double.parseDouble(aux);
        
        resposta = num1 * num2;
        
        JOptionPane.showMessageDialog(null, "Resposta é:" + resposta);
        
    }
    
}
