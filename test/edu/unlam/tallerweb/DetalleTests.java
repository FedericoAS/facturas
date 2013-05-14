package edu.unlam.tallerweb;

import org.junit.Assert;
import org.junit.Test;

public class DetalleTests {

	@Test
	public void queSePuedeCalcularElTotalPorDetalle() {
		
		Articulo articulo = new Articulo("pescado", 10.0);
		
		Detalle d = new Detalle(articulo, 2);
		
		Assert.assertEquals("El precio total con impuesto", 24.2, d.getPrecioTotal(), 0.0);
		
	}
	
}
