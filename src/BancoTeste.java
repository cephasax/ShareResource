
public class BancoTeste {

	public static void main(String[] args) {
		Cofre c = new Cofre();
		
		int valorDoGerente = 10;
		
		System.out.println("Banco e Cofre criados. Valor no cofre = " + c.getValorGuardado() + "\n" );
		for(int i = 0; i < 3; i++){
			GerenteRunnable gerente= new GerenteRunnable(c, valorDoGerente, i);
			
			System.out.println("Bom dia, Sou o gerente numero: " + i + " e tenho permissão para movimentar " + valorDoGerente + " por vez. \n");
			valorDoGerente *= 10;
			Thread thread = new Thread(gerente);
			thread.start();
		}

	}

}
