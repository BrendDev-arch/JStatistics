import javax.swing.JOptionPane;

public class Duvida10 {


    public static void mostrarMensagem(){
        JOptionPane.showMessageDialog(null, "Alô mensagem");
    } //Precisa estar fora da assinatuta principal
    public static void main(String args[]){

        double [] areasJardins = {200,300,400};

        System.out.println(areasJardins[0]);
        System.out.println(areasJardins[1]);
        System.out.println(areasJardins[2]);
        double soma = 0;
        for(int i = 0; i < areasJardins.length; i++){
            JOptionPane.showMessageDialog(null, areasJardins[i]);
            soma+=areasJardins[i];
        }
        double media = soma/areasJardins.length;
        JOptionPane.showMessageDialog(null, "A média será: " + media);

        mostrarMensagem();

          //  media = (areasJardins[0] + areasJardins[1] + areasJardins[2])/areasJardins.length;

       // System.out.println("A média será: " + media);

   
    


    }
}
