import java.util.Random;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // Cara ou Coroa - Probabilidade
        // 50% Cara
        // 50% Coroa
        // espaço amostral
        // Variável que receba a interação do jogo
        // Randomm
        // For, do While e While
        String [] espacoAmostral = {"Cara", "Coroa"};
        // objeto Random..
        //sorteio
        Random random = new Random();
         
        //Contadores para verificar a distribuição
        int ContCara = 0;
        int ContCoroa = 0;

        String mensagem = "Espaço amostral: Cara ou Coroa\n"+ "Probabilidade de cara: 50% \n" + "Probabilidade de coroa: 50% \n" + 
                        "Deseja lançar a moeda ?";
        // loop de lançamento
        while(true){
            // interação com usuário
            int opcao = JOptionPane.showConfirmDialog(null,mensagem, "Lançando moedas", JOptionPane.YES_NO_OPTION);
            if(opcao != JOptionPane.YES_NO_OPTION){
                //estatísticas
                String estatisticas = "Jogo finalizado!\n" +
                "Total de lançamentos: " + (ContCara+ContCoroa) + "\n"+
                "Caras: "+ ContCara + "\n" + "Coroas: " + ContCoroa;
                  
                JOptionPane.showMessageDialog(null, estatisticas, "Finalizando Jogo", JOptionPane.INFORMATION_MESSAGE);
                break;
            } 
            int resultado = random.nextInt(2);//0 - cara 1 - coroa
            if(resultado == 0){
                ContCara++;
            }else{
                ContCoroa++;
            }
            String saida = "Resultado do Lançamento:"+ espacoAmostral[resultado] + "\n(Índice gerado:"+ resultado +")";
            JOptionPane.showMessageDialog(null, saida, "Resultado",JOptionPane.INFORMATION_MESSAGE);
        }                 

    }
}
