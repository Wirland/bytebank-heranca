public class Gerente extends FuncionarioAutenticavel implements Autenticavel{

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha){
        if(this.senha == senha)
            return true;
        else
            return false;
    }

    public double getBonificacao(){
        System.out.println("Entrou na bonificacao do Gerente");
        return 200;
    }
}
