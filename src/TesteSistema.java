public class TesteSistema {
    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        gerente.setSenha(2222);

        Autenticavel cliente = new Cliente();
        cliente.setSenha(258);

        Autenticavel adminstrador = new Administrador();
        adminstrador.setSenha(2222);

        SistemaInterno si = new SistemaInterno();
        si.autentica(gerente);
        si.autentica(cliente);
        si.autentica(adminstrador);
    }
}
