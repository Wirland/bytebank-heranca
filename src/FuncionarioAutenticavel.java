public class FuncionarioAutenticavel extends Funcionario {

    private int senha;

    @Override
    public double getBonificacao() {
        return 0;
    }

    public void setSenha(int Senha){
        this.senha = senha;
    }

    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        } else {
            return false;
        }
    }
}
