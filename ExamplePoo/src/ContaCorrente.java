public class ContaCorrente implements OperacoesBancarias{
    public double montante;
    public String nome;
    public int id;

    public ContaCorrente(String nome) {
        this.nome = nome;
        this.montante = 0;
    }
    public ContaCorrente(String nome, double montante) {
        this.nome = nome;
        this.montante = montante;
    }
    @Override
    public void depositar(double quantia) {
        montante = montante + quantia;
    }
    @Override
    public void sacar(double quantia) {
        double taxa = 0.005*quantia;
        if (quantia + taxa > montante) {
            System.out.println("Não possui dinheiro suficiente");
        } else  {
            montante = montante - quantia - taxa;
        }
    }
    @Override
    public double saldo(){
        return montante;
    }
}
