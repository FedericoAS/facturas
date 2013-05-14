package edu.unlam.tallerweb;

public class ArticuloDeLujo extends Articulo {

	public ArticuloDeLujo(String descripcion, Double precio) {
		super(descripcion, precio);
	}

	@Override
	public Double getImpuesto() {
		return super.getImpuesto() + 0.15 * this.getPrecio();
	}

}
