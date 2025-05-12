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
            escreverArquivo.write("Nome do cliente: " + nomeDosClientes  + ", "+"Endereço: " + nomeDoEndereço + ", " + "A área do Jardim: " + areaDoJardim + " " + " m²" +"\n");
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
        valorDaImplantação = Integer.parseInt(JOptionPane.showInputDialog("Qual é o valor da implantação"));
        int valorDaManutenção;
        valorDaManutenção =  Integer.parseInt(JOptionPane.showInputDialog("Qual é o valor da manutenção"));
        int valorDoPaisagismo;
        valorDoPaisagismo =  Integer.parseInt(JOptionPane.showInputDialog("Qual é o valor do paisagismo"));
        String serviço = JOptionPane.showInputDialog(null, "Temos essas opções de serviços disponíveis no momento: " + "\n" + "1 - Implantação" + " " + valorDaImplantação + " R$" + "\n" + "2 - Manutenção" + " " + valorDaManutenção + " R$" + "\n" + "3 - Paisagismo" + " " + valorDoPaisagismo + " R$", JOptionPane.INFORMATION_MESSAGE);
        List<Integer> inputserviço = Arrays.stream(serviço.split("[ ,]+"))
                                      .map(String::trim)
                                      .map(Integer::parseInt)
                                      .toList();

            
        
        for (int serviços : inputserviço) {
            switch(serviços){
                case 1:
                    JOptionPane.showMessageDialog(null, "Foi escolhido o serviço de implantação", " Jardinagem ", JOptionPane.INFORMATION_MESSAGE);break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Foi escolhido o serviço de Manutenção", " Jardinagem ", JOptionPane.INFORMATION_MESSAGE);break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Foi escolhido o serviço de Paisagismo", " Jardinagem ", JOptionPane.INFORMATION_MESSAGE);break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida", " Jardinagem ", JOptionPane.ERROR_MESSAGE);break;  
            }
        }
            
        if (inputserviço.size() == 1) {
            JOptionPane.showMessageDialog(null, "O desconto será de 10%", " Jardinagem ", JOptionPane.INFORMATION_MESSAGE);
        } 
        if(inputserviço.size() == 2) {
    
            if ((inputserviço.contains(1) && inputserviço.contains(2)) ||
                    ((inputserviço.contains(2) && inputserviço.contains(3))) ||
                    ((inputserviço.contains(1) && inputserviço.contains(3))) ||
                    ((inputserviço.contains(2) && inputserviço.contains(1)))||
                    (inputserviço.contains(3) && inputserviço.contains(1)) ||
                    (inputserviço.contains(3) && inputserviço.contains(2))){
                        JOptionPane.showMessageDialog(null, "Como o numero de serviços foram 2, o desconto será de 20% !", "Jardinagem", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if(inputserviço.size() == 3){
                
            if ((inputserviço.contains(1) && inputserviço.contains(2) && inputserviço.contains(3)) ||
                (inputserviço.contains(1) && inputserviço.contains(3) && inputserviço.contains(2)) ||
                (inputserviço.contains(2) && inputserviço.contains(1) && inputserviço.contains(3)) ||
                (inputserviço.contains(2) && inputserviço.contains(3) && inputserviço.contains(1))||
                (inputserviço.contains(3) && inputserviço.contains(1) && inputserviço.contains(2)) ||
                (inputserviço.contains(3) && inputserviço.contains(2) && inputserviço.contains(1))) {
                    JOptionPane.showMessageDialog(null, "Como o numero de serviços foram 3, o desconto será de 30% !", "Jardinagem", JOptionPane.INFORMATION_MESSAGE);  
                }
            }
    }
}