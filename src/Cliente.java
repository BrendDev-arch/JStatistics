public class Cliente {

    private String nomeDosClientes;
    private String nomeDoEndereço;  

    public void setExibirDados(String nomeDosclientes, String nomeDoEndereço){
        this.nomeDosClientes = nomeDosclientes;
        this.nomeDoEndereço = nomeDoEndereço;

    }

    public String exibirNomeDosClientes(String Cliente){
        return nomeDosClientes;
    }

    public String exibirNomeDoEndereço(String Endereco){
        return nomeDoEndereço;
    }
   

}
