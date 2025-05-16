import javax.swing.JOptionPane;

public class Duvida6 {

    // Criando contadores e acumuladores dentro do loops
    // 10 fácil - programador define ...
    // controlado por sentinela (intermediário)
        // jardineiro - definir a quantidade
        // Cliente - que vai comprar 
    
    public static final int Fidelidade = 10; // Constante
    public static final double Desconto = 0.10;
    
    public static void main(String args[]){
        int opcao;
        double acumulador = 0;
        int contador = 0;
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Iniciando compra: " + "\n" + " 1 - Poda (150.00) " + "\n" + "2 - Cortar Grama (250.00)" + "\n" + "3 - Sair"));  
            if(opcao == 1){
                acumulador+=150;
                contador+=1;
            }else if (opcao == 2){
                acumulador+=250;
                contador+=1;
            }
        }while(opcao != 3);
        JOptionPane.showMessageDialog(null, "Total da compra: " + acumulador);
        if(contador >= Fidelidade){
            double ValorComDesconto = acumulador - (acumulador*Desconto);
            JOptionPane.showMessageDialog(null, "Valor com desconto: " + ValorComDesconto);
        }
    }

}
