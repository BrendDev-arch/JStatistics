import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class App {
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
        int valorDaImplantação = 1350;
        int valorDaManutenção = 2450;
        int valorDoPaisagismo = 3550;
        int valorDoTratamentoDeAreasComCapinaQuímica = 4850;
        int valorDoReflorestamento = 5750;
        int valorDoTransplanteDeArvoresEArbustos = 7000; 
        int serviço = Integer.parseInt(JOptionPane.showInputDialog(null, "Temos essas opções de serviços disponíveis no momento: " + "\n" + "1 - Implantação" + " "+ valorDaImplantação + " R$" + "\n" + "2 - Manutenção" + " " + valorDaManutenção + " R$" + "\n" + "3 - Paisagismo" + " " + valorDoPaisagismo + " R$" + "\n" + " " + "4 - Tratamento de áreas com capina química" + " "+ valorDoTratamentoDeAreasComCapinaQuímica + " R$" + "\n" + "5 - Reflorestamento" + " "+ valorDoReflorestamento + " R$"+ "\n" + "6 - Transplante de árvores e arbustos" + ""+ valorDoTransplanteDeArvoresEArbustos + " R$" , " Jardinagem ", JOptionPane.INFORMATION_MESSAGE));
        switch(serviço){
            case 1:
                JOptionPane.showMessageDialog(null, "Foi escolhido o serviço de implantação", " Jardinagem ", JOptionPane.INFORMATION_MESSAGE);break;
            case 2:
                JOptionPane.showMessageDialog(null, "Foi escolhido o serviço de Manutenção", " Jardinagem ", JOptionPane.INFORMATION_MESSAGE);break;
            case 3:
                JOptionPane.showMessageDialog(null, "Foi escolhido o serviço de Paisagismo", " Jardinagem ", JOptionPane.INFORMATION_MESSAGE);break;
            case 4:
                JOptionPane.showMessageDialog(null, "Foi escolhido o serviço de Tratamento de áreas com capina química", " Jardinagem ", JOptionPane.INFORMATION_MESSAGE);break;
            case 5:
                JOptionPane.showMessageDialog(null, "Foi escolhido o serviço de reflorestamento", " Jardinagem ", JOptionPane.INFORMATION_MESSAGE);break;
            case 6:
                JOptionPane.showMessageDialog(null, "Foi escolhido o serviço de Transplante de árvores e arbustos", " Jardinagem ", JOptionPane.INFORMATION_MESSAGE);break;
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida", " Jardinagem ", JOptionPane.ERROR_MESSAGE);break;  
        }

        if ((serviço == 1) || (serviço == 2) || (serviço == 3) || (serviço == 4) || (serviço == 5) || (serviço == 6)) {
            JOptionPane.showMessageDialog(null, "O desconto será de 10%", " Jardinagem ", JOptionPane.INFORMATION_MESSAGE);
        }
        else if((serviço == 1 && serviço == 2) || (serviço == 2 && serviço == 3) || (serviço == 3 && serviço == 4) || (serviço == 4 && serviço == 5) && (serviço == 5 && serviço == 6)){
            JOptionPane.showMessageDialog(null, "O desconto será de 20%", " Jardinagem ", JOptionPane.INFORMATION_MESSAGE);
        }

     }
    
}
