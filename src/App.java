import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\t#-------------\t#------------\tJStatistics\t#-------------\t#------------\t");
        //Aplicando Lógica de Programação (Aristóteles e George Boolean)
        Scanner leia = new Scanner(System.in);
        // Variável: É um espaço reservado na memória do computador
        // Variável: Serve para guardar valores
        // Variável: Ela tem um tipo(texto, número, lógico ...)
        /*
         * Ex - 1: Crie um algoritmo para o JStatistics que leia 
         * a opção desejada:
         * "Qual o conjunto de dados utilizado: 1 - populacional 2 - Amostral"
         * O valor recebido deve ser um valor inteiro.*/
        int opcao;
        //System.out.println("\t # \t # \t Qual o conjunto de dados utilizado: 1 - populacional 2 - Amostral \t # \t # \t ");
        //opcao = leia.nextInt();
        JOptionPane.showMessageDialog(null,"O Jogo da Estatística: Jstatistics");
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Vamos começar o jogo ? \n Escolha a estratégia: \n 1- Populacional \n 2- Amostral"));
        JOptionPane.showMessageDialog(null,"você escolheu :  "+ opcao, "JStatistics", JOptionPane.INFORMATION_MESSAGE);

        /* 
         * 
         * Ex - 2
         * Você deve criar um pequeno menu perguntando para o usuário: 
         * Que tipo de variável ele deseja cadastrar:
         * 1- Quantitativo
         * 2- Qualitativo
         * 
         * 
         */

        
        String opcaovariavel = JOptionPane.showInputDialog(null,"Que tipo de variável ele deseja cadastrar:\n 1- Quantitativo\n 2- Qualitativo");
        int opvariavel = Integer.parseInt(opcaovariavel);
        JOptionPane.showMessageDialog(null, "Você escolheu :  "+opvariavel, "JStatistics", JOptionPane.INFORMATION_MESSAGE);
        //int segundaopcao;    
        //System.out.println("Que tipo de variável ele deseja cadastrar:\n 1- Quantitativo\n 2- Qualitativo");
        //segundaopcao = leia.nextInt();
    









    }
}
