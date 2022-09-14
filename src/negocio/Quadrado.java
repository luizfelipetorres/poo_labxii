package negocio;

public class Quadrado extends FormaGeometrica{
	private Ponto vertice1;
	private Ponto vertice2;

	public Quadrado(Ponto vertice1, Ponto vertice2) {
		super();
		this.vertice1 = vertice1;
		this.vertice2 = vertice2;
	}

	public Quadrado() {
		super();
	}

	@Override
	public double calcularArea() {
		double dx = vertice2.getX() - vertice1.getX();
		double dy = vertice2.getY() - vertice1.getY();
		double d = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
		return d * d;
	}

	public Ponto getVertice1() {
		return vertice1;
	}

	public void setVertice1(Ponto vertice1) {
		this.vertice1 = vertice1;
	}

	public Ponto getVertice2() {
		return vertice2;
	}

	public void setVertice2(Ponto vertice2) {
		this.vertice2 = vertice2;
	}
}
