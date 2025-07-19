package banco_digital_dio;

public class ContaPoupanca extends Conta {
	
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Poupança ===");
		super.imprimirInfoComuns();
	}


}
