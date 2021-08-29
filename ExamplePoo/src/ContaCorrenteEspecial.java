public class ContaCorrenteEspecial extends ContaCorrente {
    public ContaCorrenteEspecial(String nome) {
        super(nome);
    }
    public ContaCorrenteEspecial(String nome, double montante) {
        super(nome, montante);
    }
    @Override
    public void sacar(double quantia) {
        double taxa = 0.001*quantia;
        if (quantia + taxa > montante) {
            System.out.println("Não possui dinheiro suficiente");
        } else  {
            montante = montante - quantia - taxa;
        }
    }
}
