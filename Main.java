public class Main {

	public static void main(String[] args) {
		Cliente Manoel = new Cliente();
		Manoel.setNome("Manoel");
		Cliente Felipe = new Cliente();
		Felipe.setNome("Felipe");

		Conta cc = new ContaCorrente(Manoel);
		Conta poupanca = new ContaPoupanca(Felipe);
		
		cc.depositar(200);
		cc.sacar(300);

	

		System.out.println();

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
