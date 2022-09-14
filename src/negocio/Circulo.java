package negocio;

public class Circulo extends FormaGeometrica{
	private Ponto centro;
	private float raio;
	
	
	
	
	public Circulo(Ponto centro, float raio) {
		super();
		this.centro = centro;
		this.raio = raio;
	}

	public Circulo() {}

	@Override
	public double calcularArea() {
		return Math.PI * raio * raio;
	}


	public Ponto getCentro() {
		return centro;
	}


	public void setCentro(Ponto centro) {
		this.centro = centro;
	}


	public float getRaio() {
		return raio;
	}


	public void setRaio(float raio) {
		this.raio = raio;
	}
	
	
}
