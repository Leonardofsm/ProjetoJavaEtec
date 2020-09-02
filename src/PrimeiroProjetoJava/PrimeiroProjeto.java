
package PrimeiroProjetoJava;
import javax.swing.JOptionPane;

public class PrimeiroProjeto {

    public static void main(String[] args) {
        // TODO code application logic here
        double num1, num2, trabalho, resp=0;
        String aux =""; 
        
        try{
                    aux = JOptionPane.showInputDialog(null, 
                "Digite o primeiro número:", 
                "Sistema ABC", 
                JOptionPane.PLAIN_MESSAGE);
        num1 = Double.parseDouble(aux);
        
        aux = JOptionPane.showInputDialog(null, 
                "Digite o segundo número:",
                "Sistema ABC", 
                JOptionPane.PLAIN_MESSAGE);
        num2 = Double.parseDouble(aux);
        
        aux = JOptionPane.showInputDialog(null, 
                "Digite a bita di trabalho:",
                "Sistema ABC", 
                JOptionPane.INFORMATION_MESSAGE);
        trabalho = Double.parseDouble(aux);
        
        resp = Operacoes.multiplicacao(num1, num2);
        
        JOptionPane.showMessageDialog(null, "Multiplicação de: " + num1 + " x " + num2 + " = " + resp);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null,
                    "Favor inserir somente números", 
                    "Sistema ABC", 
                    JOptionPane.ERROR_MESSAGE);
            //Sai ou feicha o sistema 
            System.exit(0);
        }
    }
}


