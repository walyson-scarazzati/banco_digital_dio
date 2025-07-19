package banco_digital_dio;

public abstract class Conta implements IConta {
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	private int agencia;
	private int numero;
	private double saldo;

	public Conta() {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}	
	
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfoComuns() {
		System.out.printf("Agência: %d%n", this.getAgencia());
		System.out.printf("Número: %d%n", this.getNumero());
		System.out.printf("Saldo: %.2f%n", this.getSaldo());
	}


}
