package PrimeiroProjetoJava;

import javax.swing.*;

/**
 * @author Leonardo Mendonça
 */
public class Exercicio0706 {
    public static void main(String[] args) {
        double salarioLiquido =0, salario=0, aliquota=0, desconto=0;
        String aux ="", resposta ="";
        
        
        try {
        
        aux = JOptionPane.showInputDialog(null, "Digite seu sálario: ", "Exercicio0706", JOptionPane.INFORMATION_MESSAGE);
        aux = aux.replace(',', '.');
        salario = Double.parseDouble(aux);
        
        if (salario <= 465){
            JOptionPane.showMessageDialog(null,"Sálario não passivel de cobrança !" , "Exercicio0706", JOptionPane.ERROR_MESSAGE);
        } else {
                aliquota = calcAliquota(salario);
                
                desconto = (salario * aliquota) / 100;
                
                if(desconto > 354.07){
                    desconto = 354.07;
                }
                
                salarioLiquido = salario - desconto;
                
                JOptionPane.showMessageDialog(null,
                        "Sálario: " +  salario + "\n" 
                        + "Aliquota: " + aliquota + "\n" 
                        + "Desconto: " + desconto + "\n"
                        + "Sálario Liquido: " + salarioLiquido, 
                                "Exercicio0706", JOptionPane.INFORMATION_MESSAGE);
                }
        
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Valor incorreto, Digíte apenas números !!!", "Exercicio0706", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    
    public static double calcAliquota(double num1) {
        double aliquota = 0;
            if(num1 > 0 && num1 <= 965.67) {
                aliquota = 8;
            } else if (num1 <= 1609.45) {
                aliquota = 9;
            } else {
                aliquota = 11;
            }
            return aliquota;
        }
    
}
