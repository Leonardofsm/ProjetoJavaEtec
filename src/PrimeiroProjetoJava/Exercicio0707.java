package PrimeiroProjetoJava;

import javax.swing.*;

/**
 * @author Leonardo Mendonca
 */
public class Exercicio0707 {

    public static void main(String args[]) {
        double peso, altura, imc = 0;
        String aux = "", classificacao = "";

        try {

            aux = JOptionPane.showInputDialog(null, "Digite seu peso: ");
            aux = aux.replace(',', '.');
            peso = Double.parseDouble(aux);

            aux = JOptionPane.showInputDialog(null, "Digite sua altura: ");
            aux = aux.replace(',', '.');
            altura = Double.parseDouble(aux);

            if (peso < 0.5 || altura < 0.1) {
                JOptionPane.showMessageDialog(null, "Digite peso ou altura válida!", "Calculo de IMC", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }

            imc = calcIMC(peso, altura);

            if (imc < 0) {
                classificacao = "Favor digitar um número positivo!";
                JOptionPane.showMessageDialog(null, classificacao, "Calculo de IMC", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            } else if (imc >= 0 && imc < 18.5) {
                classificacao = "Excesso de Magreza.";
            } else if (imc >= 18.5 && imc <= 25) {
                classificacao = "Peso Normal";
            } else if (imc > 25 && imc <= 30) {
                classificacao = "Excesso de Peso";
            } else if (imc > 30 && imc <= 35) {
                classificacao = "Ebesidade(Grau I)";
            } else if (imc > 35 && imc <= 40) {
                classificacao = "Ebesidade(Grau II)";
            } else {
                classificacao = "Ebesidade(Grau III)";
            }

            JOptionPane.showMessageDialog(null, "Seu IMC é : " + imc + "\n" + "Você está na categoria: " + classificacao);

        } catch (NumberFormatException errors) {
            JOptionPane.showMessageDialog(null, "Erro: " + errors + "\n" + "Favor digitar apenas números!", "Calculo de IMC", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static Double calcIMC(double peso, double altura) {
        double IMC = peso / (altura * altura);

        return IMC;
    }

}
