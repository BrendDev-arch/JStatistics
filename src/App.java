import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        //Classe é conjunto de objetos
        //Nesse objetivo nesse código é entender a diferença 
        //Entre método com tipo void e método com o tipo String.
        Mamifero vaca = new Mamifero();
        vaca.setNomeCientífico("Bos Taurus");
        JOptionPane.showMessageDialog(null,"Nome Científico: "+ vaca.getNomeCientífico());

        Mamifero canguru = new Mamifero();
        canguru.setNomeCientífico("Macropus");
        JOptionPane.showMessageDialog(null,"Nome Científico: "+ canguru.getNomeCientífico());

        Mamifero peixeBoi = new Mamifero();
        peixeBoi.setNomeCientífico("Trichechus");
        JOptionPane.showMessageDialog(null,"Nome Científico: "+ peixeBoi.getNomeCientífico());





    }
}
