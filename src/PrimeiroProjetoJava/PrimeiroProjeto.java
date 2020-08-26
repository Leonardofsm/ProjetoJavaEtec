
package PrimeiroProjetoJava;
import javax.swing.JOptionPane;

public class PrimeiroProjeto {

    public static void main(String[] args) {
        // TODO code application logic here
        double num1, num2, resp=0;
        String aux =""; 
        
        aux = JOptionPane.showInputDialog(null, "Digite o primeiro número:");
        num1 = Double.parseDouble(aux);
        
        aux = JOptionPane.showInputDialog(null, "Digite o segundo número:");
        num2 = Double.parseDouble(aux);
        
        resp = Operacoes.multiplicacao(num1, num2);
        
        JOptionPane.showMessageDialog(null, "Multiplicação de: " + num1 + " x " + num2 + " = " + resp);
        
    }
    
    
}


