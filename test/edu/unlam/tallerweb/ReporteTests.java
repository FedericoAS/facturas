package edu.unlam.tallerweb;

import junit.framework.Assert;

import org.junit.Test;

public class ReporteTests {

	@Test
	public void testQuePuedaReportarseBasico() {

		Factura factura = new Factura();
		factura.addDetalle(new Detalle(new Articulo("pescado", 10.0), 2));
		factura.addDetalle(new Detalle(new ArticuloDeLujo("perfume", 100.0), 1));

		Reportador reportador = new ReportadorBasico();
		Assert.assertEquals(
				"Reporte de factura - Empresa 'La Perseverancia'\n" +
				"2u. pescado 24.2\n" +
				"1u. perfume 136.0\n" +
				"Total: 160.2",
				reportador.reportar(factura));

	}
	
	@Test
	public void testQuePuedaReportarseHtml() {

		Factura factura = new Factura();
		factura.addDetalle(new Detalle(new Articulo("pescado", 10.0), 2));
		factura.addDetalle(new Detalle(new ArticuloDeLujo("perfume", 100.0), 1));

		Reportador reportador = new ReportadorHtml();
	
//		Assert.assertEquals("<h1>Reporte de factura - Empresa 'La Perseverancia'</h1>" +
//				"\n<ul>" +
//				"\n<li>2u. pescado 24.2</li>" +
//				"\n<li>1u. perfume 136.0</li>" +
//				"\n</ul>" +
//				"\n<b>Total: 160.2</b>", reportador.reportar(factura));

		System.out.println(reportador.reportar(factura));
		
	}

}
