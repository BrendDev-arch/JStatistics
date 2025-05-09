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
            escreverArquivo.write("Nome do cliente: " + nomeDosClientes  + ", "+"Endereço: " + nomeDoEndereço + ", " + "A área do Jardim: " + areaDoJardim + " " +"metros quadrados" +"\n");
            System.out.println("dados gravados com sucesso");

    

        }catch(IOException e){
            System.out.println("Erro ao gravar os dados"+e.getMessage());
            
        }
    }
}
