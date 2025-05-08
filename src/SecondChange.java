import java.util.Random;

import javax.swing.JOptionPane;

public class SecondChange {
    public static void main(String[] args) throws Exception {
        // Cara ou Coroa - Probabilidade
        // 50% Cara
        // 50% Coroapush
        // espaço amostral
        // Variável que receba a interação do jogo
        // Random
        // For, do While e While
        String [] espacoAmostral = {"1", "2","3","4","5","6"};
        // objeto Random..
        //sorteio
        Random random = new Random();
         
        //Contadores para verificar a distribuição
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        int cont6 = 0;

        


        String mensagem =  "Deseja lançar um dado ?";
        // loop de lançamento
        while(true){
            int Total = cont1+cont2+cont3+cont4+cont5+cont6;
            // interação com usuário
            int opcao = JOptionPane.showConfirmDialog(null,mensagem, "Lançando dados", JOptionPane.YES_NO_OPTION);
            int resultado = random.nextInt(6) + 1;
            if(opcao != JOptionPane.YES_OPTION){
                //estatísticas
                String estatisticas = "Jogo finalizado!\n" +
                "Total de lançamentos: " + (Total) + "\n"+
                " jogador 1: " + cont1 + "\n" + " jogador 2: " + cont2 + "\n" +  " jogador 3: " + cont3 + "\n" + " jogador 4: " + cont4 + "\n" +  " jogador 5: " + cont5 + "\n" +  " jogador 6: " +  cont6;
                JOptionPane.showMessageDialog(null, estatisticas, "Finalizando Jogo", JOptionPane.INFORMATION_MESSAGE);
                if(Total == 0){
                    JOptionPane.showMessageDialog(null,"Nenhuma opção foi escolhida. Jogo encerrado", "ATENÇÃO",JOptionPane.INFORMATION_MESSAGE);
                }
                
                if ((cont1 > cont2) && (cont1 > cont3) && (cont1 > cont4) && (cont1 > cont5) && (cont1 > cont6)) {
                    //  JOptionPane.showMessageDialog(null, "ponto para o jogador 1 ", " jogador ",JOptionPane.INFORMATION_MESSAGE);  
                    String vencedor = "O vencedor que tirou maior pontuação foi o jogador numero 1 " + "\n" +" Probabilidade de ganhar : " + ((cont1/6.0)*100+"%");
                    JOptionPane.showMessageDialog(null, vencedor, "Resultado",JOptionPane.INFORMATION_MESSAGE);    
                             
                  }
                
                else if ((cont2 > cont1) && (cont2 > cont3) && (cont2 > cont4) && (cont2 > cont5) && (cont2 > cont6)) {
                    //    JOptionPane.showMessageDialog(null, "ponto para o jogador 2 ", " jogador ",JOptionPane.INFORMATION_MESSAGE); 
                    String vencedor = "O vencedor que tirou maior pontuação foi: o jogador numero 2 " + "\n" +" Probabilidade de ganhar foi de : " + ((cont2/6.0)*100+"%");
                    JOptionPane.showMessageDialog(null, vencedor, "Resultado",JOptionPane.INFORMATION_MESSAGE);
                            
                }
                else if ((cont3 > cont2) && (cont3 > cont1) && (cont3 > cont4) && (cont3 > cont5) && (cont3 > cont6)) {
                        //JOptionPane.showMessageDialog(null, "ponto para o jogador 3", " jogador ",JOptionPane.INFORMATION_MESSAGE);    
                    String vencedor = "O vencedor que tirou maior pontuação foi: o jogador numero 3 " + "\n" + " Probabilidade de ganhar foi: " + ((cont3/6.0)*100+"%");
                    JOptionPane.showMessageDialog(null, vencedor, "Resultado",JOptionPane.INFORMATION_MESSAGE);
                                
                }
                else if ((cont4 > cont2) && (cont4 > cont1) && (cont4 > cont3) && (cont4 > cont5) && (cont4 > cont6)) {
                    //  JOptionPane.showMessageDialog(null, "ponto para o jogador 4", " jogador ",JOptionPane.INFORMATION_MESSAGE);   
                    String vencedor = "O vencedor que tirou maior pontuação foi: o jogador numero 4" + "\n" +" Probabilidade de ganhar foi : " + ((cont4/6.0)*100+"%");
                    JOptionPane.showMessageDialog(null, vencedor, "Resultado",JOptionPane.INFORMATION_MESSAGE);    
                          
                }
                else if ((cont5 > cont2) && (cont5 > cont1) && (cont5 > cont3) && (cont5 > cont4) && (cont5 > cont6)) {
                    // JOptionPane.showMessageDialog(null, "ponto para o jogador 5", " jogador ",JOptionPane.INFORMATION_MESSAGE);             
                    String vencedor = "O vencedor que tirou maior pontuação foi: o jogador numero 5 " + "\n" +" Probabilidade de ganhar foi: " + ((cont5/6.0)*100+"%") ;
                    JOptionPane.showMessageDialog(null, vencedor, "Resultado",JOptionPane.INFORMATION_MESSAGE);   
                    
                }
                else if ((cont6 > cont2) && (cont6 > cont3) && (cont6 > cont4) && (cont6 > cont1) && (cont6 > cont5)) {
                    //  JOptionPane.showMessageDialog(null, "ponto para o jogador 6", " jogador ",JOptionPane.INFORMATION_MESSAGE);
                    String vencedor = "O vencedor que tirou maior pontuação foi: o jogador numero 6 " + "\n" + " Probabilidade de ganhar foi: " + ((cont6/6.0)*100+"%");
                    JOptionPane.showMessageDialog(null, vencedor, "Resultado",JOptionPane.INFORMATION_MESSAGE);  
                   

         
                }            
                    break;
                
            } 
                
            
                    switch (resultado) {
                        case 0:
                            cont1++; break;
                        case 1:
                            cont1++; break;
                        case 2:
                            cont3++; break;
                        case 3:
                            cont4++; break;
                        case 4:
                            cont5++; break;
                        case 5:
                            cont6++; break;
                    
                    }

        
                    String saida = "Resultado do Lançamento: "+ espacoAmostral[resultado - 1];
                    JOptionPane.showMessageDialog(null, saida, "Resultado",JOptionPane.INFORMATION_MESSAGE);
           
        
            }

        }                 

    }

