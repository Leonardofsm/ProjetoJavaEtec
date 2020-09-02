
package PrimeiroProjetoJava;

import javax.swing.*;

public class Escolha {
    
    public static void main(String[] args) {
        int valor;
        String resposta="", aux="";
        
        aux = JOptionPane.showInputDialog(null, "Entre com o valor de 1-3");
        valor = Integer.parseInt(aux);
        
        switch(valor) {
            case 1: resposta = "Você escolheu o 1";
                break;
            case 2: resposta = "Você escolheu o 2";
                break;
            case 3: resposta = "Você escolheu o 3";
                break;
            default:
                resposta = "Você escolheu nada !!!";
            break;
        }
        JOptionPane.showMessageDialog(null, resposta);
    }
}
