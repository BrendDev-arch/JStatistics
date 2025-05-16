import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class AppJ {

            public static void main(String[] args) throws Exception {
                JOptionPane.showMessageDialog(null, "Alô, Jardim !", "Boas-vindas",JOptionPane.INFORMATION_MESSAGE);
                boolean continuar = true;
                List<Double> areas = new ArrayList<>();
                Area area = new Area();
                int contarArea = 1;
                List<Integer> servicos = new ArrayList<>();
                Cliente cliente = new Cliente();
                while(continuar){  
                    String nomeDosClientes = JOptionPane.showInputDialog(null,"Qual é o seu nome ?");
                    String nomeDoEndereco = JOptionPane.showInputDialog(null," Qual é o seu endereço ?");                    
                    double larguraDoJardim = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a largura do seu Jardim ? " ));
                    double comprimentoDoJardim = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o comprimento do seu Jardim ? " ));
                    double areaDoJardim = area.calcularArea(larguraDoJardim, comprimentoDoJardim) ;
                    areas.add(areaDoJardim);
        
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
                            
                            servicos.add(valorDaImplantação);
                            servicos.add(valorDaManutenção);
                            servicos.add(valorDoPaisagismo);

                            servicos.sort(Integer::compareTo);

                            for (Integer valor : servicos) {
                                JOptionPane.showMessageDialog(null, "Serviço: " + valor + " R$", "Jardinagem", JOptionPane.INFORMATION_MESSAGE);
                            }       


                    if (!areas.isEmpty()) {
                        double soma = 0;
                        for (double  metroquadrado  : areas) {
                            soma += metroquadrado;
                        }
                        double media = soma / areas.size();
                        JOptionPane.showMessageDialog(null, "A média da área cadastrada é: " + media + " m²", " Jardinagem", JOptionPane.INFORMATION_MESSAGE);
                    } 
            
                    else {
                        JOptionPane.showMessageDialog(null, "Nenhuma área cadastrada para calcular a média.", " Jardinagem ", JOptionPane.ERROR_MESSAGE);
                    }
                    if(areaDoJardim > 100){
                        JOptionPane.showMessageDialog(null, contarArea + " grande " ," Jardinagem " , JOptionPane.INFORMATION_MESSAGE);
                        contarArea++;
                    }else{
                        JOptionPane.showMessageDialog(null, contarArea + " pequena " ," Jardinagem " , JOptionPane.INFORMATION_MESSAGE);
                    }

                    double[] vetorArea = areas.stream().mapToDouble(Double::doubleValue).toArray();

                    for(double metroquadrado : vetorArea){
                        JOptionPane.showMessageDialog(null, metroquadrado + " foi armazenada", " Jardinagem " , JOptionPane.INFORMATION_MESSAGE);
                    }
                
                    Map<Double, Integer> frequencias = new HashMap<>();
                    for (double metroquadrado : areas) {
                        frequencias.put(metroquadrado, frequencias.getOrDefault(metroquadrado, 0) + 1);
                    }

                    double moda = -1;
                    int maxFrequencia = 0;
                    for (Map.Entry<Double, Integer> entry : frequencias.entrySet()) {
                        if (entry.getValue() > maxFrequencia) {
                            moda = entry.getKey();
                            maxFrequencia = entry.getValue();
                        }
                    }
                    if (moda != -1) {
                        JOptionPane.showMessageDialog(null, moda + " é a moda encontrada", " Jardinagem ", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Não há moda", " Jardinagem " , JOptionPane.INFORMATION_MESSAGE);
                    }



                    int resposta = JOptionPane.showConfirmDialog(null, "Deseja escolher outra opção?", " Jardinagem ", JOptionPane.YES_NO_OPTION);
                    if (resposta == JOptionPane.NO_OPTION) {
                        continuar = false;   // Se a resposta for "Não", o laço termina
                        JOptionPane.showMessageDialog(null, "Saindo do sistema...");
                    }
                    } else {     
                        JOptionPane.showMessageDialog(null, "Saindo o sistema..."); 
                        continuar = false;
                            
                    }

                    try(FileWriter escreverArquivo = new FileWriter("cadastro.txt", true)){
                        escreverArquivo.write(" Nome do cliente: " + cliente.exibirNomeDosClientes(nomeDosClientes)  + ", " + "Endereço: " + cliente.exibirNomeDoEndereço(nomeDoEndereco)
                        + ", " + "A área do Jardim: " + areaDoJardim + " " + " m²" +"\n");
                        System.out.println("dados gravados com sucesso");
                    
                    
                    }catch(IOException e){
                    System.out.println("Erro ao gravar os dados"+e.getMessage());
                    
                    }
        
            
        
        }
                   
    }
}

  



// try(FileWriter escreverArquivo = new FileWriter("cadastro.txt", true)){
  //  escreverArquivo.write(" Nome do cliente: " + nomeDosClientes  + ", " + "Endereço: " + nomeDoEndereço + ", " + "A área do Jardim: " + areaDoJardim + " " + " m²" +"\n");
    //System.out.println("dados gravados com sucesso");


//}catch(IOException e){
  //  System.out.println("Erro ao gravar os dados"+e.getMessage());

//}
   