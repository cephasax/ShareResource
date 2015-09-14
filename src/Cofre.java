
public class Cofre {

	public float valorGuardado;
	
	public void depositoOuSaque(float valor){
		valorGuardado += valor;
	}

	public float getValorGuardado() {
		return valorGuardado;
	}

	public void setValorGuardado(float valorGuardado) {
		this.valorGuardado = valorGuardado;
	}

}
