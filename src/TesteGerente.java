public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();

        g1.setCpf("123465798798");
        g1.setNome("Wirland");
        g1.setSalario(9000.00);
        g1.setSenha(123131);

        System.out.println(g1.getNome());
        System.out.println(g1.autentica(123131));

        System.out.println("Salario " + g1.getSalario());
        System.out.println("Bonificacao " + g1.getBonificacao());
    }
}
