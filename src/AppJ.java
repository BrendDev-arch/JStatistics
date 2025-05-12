import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class AppJ {
    public static void main(String[] args) throws Exception {
        JOptionPane.showMessageDialog(null, "Alô, Jardim !", "Boas-vindas",JOptionPane.INFORMATION_MESSAGE);
        String nomeDosClientes;
        String nomeDoEndereço;
        nomeDosClientes = JOptionPane.showInputDialog(null,"Qual é o seu nome ?");
        nomeDoEndereço = JOptionPane.showInputDialog(null," Qual é o seu endereço ?");
        double larguraDoJardim = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a largura do seu Jardim ? " ));
        double comprimentoDoJardim = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o comprimento do seu Jardim ? " ));
        double areaDoJardim = larguraDoJardim*comprimentoDoJardim;


        try(FileWriter escreverArquivo = new FileWriter("cadastro.txt", true)){
            escreverArquivo.write(" Nome do cliente: " + nomeDosClientes  + ", " + "Endereço: " + nomeDoEndereço + ", " + "A área do Jardim: " + areaDoJardim + " " + " m²" +"\n");
            System.out.println("dados gravados com sucesso");


        }catch(IOException e){
            System.out.println("Erro ao gravar os dados"+e.getMessage());
            
        }

        ////////////////////////////////////////////////////////
        
        if(areaDoJardim < 300){
            JOptionPane.showMessageDialog(null, "O jardim é pequeno !", " Jardinagem ", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "O jardim é grande !", " Jardinagem ", JOptionPane.INFORMATION_MESSAGE);
        }
        int valorDaImplantação;
        valorDaImplantação = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da implantação"));
        int valorDaManutenção;
        valorDaManutenção =  Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da manutenção"));
        int valorDoPaisagismo;
        valorDoPaisagismo =  Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do paisagismo"));
        boolean continuar = true;
        double contadorDeAreas = 0.0;
        double metrosquadrado [] = {areaDoJardim};
        
        while(continuar){  
            int serviço = Integer.parseInt(JOptionPane.showInputDialog(null, "Temos essas opções de serviços disponíveis no momento: " + "\n" + "1 - Implantação" + " " + valorDaImplantação + " R$" + "\n" + "2 - Manutenção" + " " + valorDaManutenção + " R$" + "\n" + "3 - Paisagismo" + " " + valorDoPaisagismo + " R$" + " \n "+ "4 - sair", JOptionPane.INFORMATION_MESSAGE));

            if(serviço != 4){
                    switch(serviço){
                        case 1:
                            JOptionPane.showMessageDialog(null, "Foi escolhido o serviço de implantação", " Jardinagem ", JOptionPane.INFORMATION_MESSAGE);break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Foi escolhido o serviço de Manutenção", " Jardinagem ", JOptionPane.INFORMATION_MESSAGE);break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "Foi escolhido o serviço de Paisagismo", " Jardinagem ", JOptionPane.INFORMATION_MESSAGE);break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opção Inválida", " Jardinagem ", JOptionPane.ERROR_MESSAGE);break;  
                }

                int resposta = JOptionPane.showConfirmDialog(null, "Deseja escolher outra opção?", "Continuar", JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.NO_OPTION) {
                    continuar = false;   // Se a resposta for "Não", o laço termina
                    JOptionPane.showMessageDialog(null, "Saindo do sistema...");
                    
                    }
            } else {     
                JOptionPane.showMessageDialog(null, "Saindo o sistema..."); 
                continuar = false;
                     
            }
            
        
    
        }            
    }
}
  
