package negocio;

public abstract class FormaGeometrica {
	String corDaLinha;
	String corDoFundo;
	
	abstract public double calcularArea();
	
	public void imprimeTipo() {
		System.out.println(this.getClass().getSimpleName());
	}
}
