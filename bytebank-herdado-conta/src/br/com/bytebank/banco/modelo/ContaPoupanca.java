package br.com.bytebank.banco.modelo;
public class ContaPoupanca extends Conta implements Tributavel {
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		 super.saldo = super.saldo + valor;
	}

	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Conta Poupanca, " + super.toString();
	}

}
