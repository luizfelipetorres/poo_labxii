package negocio;

public abstract class FormaGeometrica {
	String corDaLinha;
	String corDoFundo;
	
	
	
	public FormaGeometrica(String corDaLinha, String corDoFundo) {
		super();
		this.corDaLinha = corDaLinha;
		this.corDoFundo = corDoFundo;
	}
	
	public FormaGeometrica() {}

	abstract public double calcularArea();
	
	public void imprimeTipo() {
		System.out.println(this.getClass().getSimpleName());
	}
}
