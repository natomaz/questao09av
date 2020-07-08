package questao09;

import javax.swing.JOptionPane;

public class Questao09 {
    public static void main(String[] args) {
        // Escreva um algoritmo que leia 10 valores inteiros. 
        //Durante a entrada de dados, conte quantos valores positivos existem. 
        //Ao término mostre o resultado.
        int valor, contador;
        contador = 0;
        
        //dados e processamento
        while (contador<10){
            valor = Integer.parseInt(JOptionPane.showInputDialog("Digitar valor:"));
            if (valor>0) {
                contador++;
            }
            else {
                contador--;
                }
        }
        //saida
        JOptionPane.showMessageDialog(null, "Total de numeros positivos: "+contador);
  }
}
