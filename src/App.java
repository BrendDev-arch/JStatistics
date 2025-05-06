import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula3- Switch e Loops");

        // Variável para controlar se o programa deve continuar
        boolean continuar = true;

        // Laço de repetição que vai continuar até o usuário decidir sair
        while (continuar) {
            // Exibe o menu para o usuário
            int op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção:\n 1- Estatística Descritiva\n 2- Probabilidade\n 3- Modelos Probabilísticos\n 4- Sair"));

            // Trata a escolha do usuário
            if (op != 4) {
                switch (op) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Estatística Descritiva", "Aula3- Switch e Loops", JOptionPane.INFORMATION_MESSAGE);break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Probabilidade", "Aula3- Switch e Loops", JOptionPane.INFORMATION_MESSAGE);break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Modelos Probabilísticos", "Aula3- Switch e Loops", JOptionPane.INFORMATION_MESSAGE);break; 
                    default:
                        JOptionPane.showMessageDialog(null, "Opção Inválida", "Aula3- Switch e Loops", JOptionPane.ERROR_MESSAGE);break;  
                }

                // Pergunta ao usuário se deseja escolher outra opção
                int resposta = JOptionPane.showConfirmDialog(null, "Deseja escolher outra opção?", "Continuar", JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.NO_OPTION) {
                    continuar = false;  // Se a resposta for "Não", o laço termina
                    JOptionPane.showMessageDialog(null, "Encerrando o sistema...");
                }
            } else {
                
                JOptionPane.showMessageDialog(null, "Encerrando o sistema...");
                continuar = false;  
            }
        }
    }
}

    
    

    
                 
        
        



        /* Como funciona os loops */
        // While - teste no inicio
        // for - While compacto
        // do while - teste no final
        /*
         * Inicio = 1
         * Condição <= 5 
         * incremento/decremento i=i+1
         * for(int cont = 1; cont<=10;cont++){
            System.out.println(cont);
            
        } 
        String sair;
        do{
            //System.out.println("Sair: s ou n");
            sair = JOptionPane.showInputDialog("Digite:\n s-sim  \n n-não");
        
        }while(!sair.equalsIgnoreCase("sim"));
         */
        

    

       /* 
       try {
            
        } catch (Exception e) {
            
        }
       */