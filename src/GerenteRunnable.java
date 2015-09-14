
public class GerenteRunnable implements Runnable{
	
	private int numeroDoGerente;
	private Cofre cofre;
	private float valor;
	private int DELAY = 1000;
	
	public GerenteRunnable(Cofre cof, float val, int numGerente){
		cofre = cof;
		valor = val;
		numeroDoGerente = numGerente; 
	}
	
	public void run(){
		try{
			while (true){
				cofre.depositoOuSaque(valor);
				System.out.println("Gerente numero: " + numeroDoGerente +
									" - Deposito: " + valor +
									" - Total no cofre: " + cofre.getValorGuardado());
				Thread.sleep(DELAY);
			}
		}catch (InterruptedException e){
		}
	}
}
