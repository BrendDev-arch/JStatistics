import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String msg = "Alô Jardim";
        byte numFerramentas = 127;
        short agendamentosMes = 32767;
        int idAgendamento = 2147483647;
        long dataAgendamento = System.currentTimeMillis();
        float precoServico = 99.90f;
        double areaJardim = 120.80;
        char tipoServiço = 'p';
        String cliente = "João Silva";
        boolean concluido = true;

        JOptionPane.showMessageDialog(null, msg);
        JOptionPane.showMessageDialog(null,"Numero de ferramentas: " + numFerramentas);
        JOptionPane.showMessageDialog(null,"Quantidade de agendamentos no mês: " + agendamentosMes);
        JOptionPane.showMessageDialog(null," ID " + idAgendamento);    
        JOptionPane.showMessageDialog(null," Data atual em milisegundos: " + dataAgendamento);
        JOptionPane.showMessageDialog(null," Preço do Serviço: " + precoServico);
        JOptionPane.showMessageDialog(null, "Area do Jardim: " + areaJardim);
        JOptionPane.showMessageDialog(null," Tipo de Serviço: " + (tipoServiço == 'p'? "Poda":"Corte da Grama") );

        if(concluido){
            JOptionPane.showMessageDialog(null,"Faz o pix agora: " + cliente +  " você sabia que seu nome tem: " + cliente.length() + " letras" );
        }else{
            JOptionPane.showMessageDialog(null," O serviço em andamento ");
        }
    }
}
