import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception {
     //if
     // if else
     // switch
     //ternário ? :
     int op = Integer.parseInt(JOptionPane.showInputDialog("Qual o resultado de uma população ?\n 1-parâmetro\n 2-Estatística"));
     if(op == 1 ){
            JOptionPane.showMessageDialog(null, "Certa resposta", "  JStatistics  ", JOptionPane.INFORMATION_MESSAGE);
     }else{
            JOptionPane.showMessageDialog(null, "Resposta Errada", "  JStatistics  ", JOptionPane.ERROR_MESSAGE);
     }
     //Exercicios(Para cada pergunta crie um if)
     /*Considerando os números 30,50,80,90 Digite o valor da média aritmética simples ? 62,5*/
         //int[] iniciaValores = {30,50,80,90};
         //int tamanho = iniciaValores.length;
         //double resposta = Double.parseDouble(tamanho);
         //int soma = 0;
        //for (int valor : iniciaValores) {
          //  soma += valor;
       // }
         //mediaAritimetica = soma/
         //if (mediaAritimetica == 62.5) {
            
         //}

        float media = Float.parseFloat(JOptionPane.showInputDialog("Considerando os números:\n 30,50,80,90. \nDigite a média aritmética simples ? "));
        if(media == 62.5 ){
            JOptionPane.showMessageDialog(null, "Certa resposta", "  JStatistics  ", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Resposta Errada", "  JStatistics  ", JOptionPane.ERROR_MESSAGE);
        }
     /*Considerando os valores 10,40,50,80,10. Digite qual é a moda ?*/
        int moda = Integer.parseInt(JOptionPane.showInputDialog("Considerando os valores:\n 10,40,50,80,10. \nDigite qual é a moda ? "));
        if(moda == 10 ){
            JOptionPane.showMessageDialog(null, "Certa resposta", "  JStatistics  ", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Resposta Errada", "  JStatistics  ", JOptionPane.ERROR_MESSAGE);
        }
     /*Qual a medida de tendência central que mostra o centro da amostra ?
      // mediana
     */
        String mediana = JOptionPane.showInputDialog("Qual a medida de tendência central que mostra o centro da amostra ?");
        if(mediana.equalsIgnoreCase("mediana")){
            JOptionPane.showMessageDialog(null, "Certa resposta", "  JStatistics  ", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Resposta Errada", "  JStatistics  ", JOptionPane.ERROR_MESSAGE);
        }

     

    }
}
