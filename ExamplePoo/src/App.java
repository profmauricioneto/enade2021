public class App {
    public static void main(String[] args) throws Exception {
        // conta normal
        ContaCorrente conta_mauricio = new ContaCorrente("Mauricio", 1000);
        conta_mauricio.depositar(100);
        conta_mauricio.sacar(50);
        System.out.println("Valor atual do saldo é de: " + conta_mauricio.saldo());
        // conta especial
        ContaCorrenteEspecial conta_fulano = new ContaCorrenteEspecial("Fulano da Silva");
        conta_fulano.depositar(1100);
        conta_fulano.sacar(50);
        System.out.println("Valor atual do saldo é de: "  + conta_fulano.saldo());
    }
}
