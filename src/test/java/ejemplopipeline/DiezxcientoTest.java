package ejemplopipeline;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DiezxcientoTest {


	//cesar
	@Test
	public void testDiezxciento() throws Exception {
		Diezxciento diezxciento = new Diezxciento(1000000,1000000);
		assertEquals(1000000, diezxciento.diezxciento());
	}
	@Test
	public void testDiezxcientoAhorroInferiorMinimo() throws Exception {
		Diezxciento diezxciento = new Diezxciento(990000,900000);
		assertEquals(990000, diezxciento.diezxciento());
	}

	@Test
	public void testDiezxcientoAhorroIgualMinimo() throws Exception {
		Diezxciento diezxciento = new Diezxciento(1000000,700000);
		assertEquals(1000000, diezxciento.diezxciento());
	}

	@Test
	public void testDiezxcientoAhorroIgualMaximo() throws Exception {
		Diezxciento diezxciento = new Diezxciento(43000000,1200000);
		assertEquals(4300000, diezxciento.diezxciento());
	}

	@Test
	public void testDiezxcientoAhorroSobreMaximo() throws Exception {
		Diezxciento diezxciento = new Diezxciento(43000001,2200000);
		assertEquals(4300000, diezxciento.diezxciento());
	}


	//andres


@Test
	public void testImpuesto() throws Exception {
		Diezxciento diezxciento = new Diezxciento(1000000,1000000);
		assertEquals(0, diezxciento.impuesto());

	    diezxciento = new Diezxciento(23000000,400000);
		assertEquals(0, diezxciento.impuesto());

		diezxciento = new Diezxciento(23000000,1600000);
		assertEquals(174531, diezxciento.impuesto());

		diezxciento = new Diezxciento(23000000,2600000);
		assertEquals(364086, diezxciento.impuesto());

		diezxciento = new Diezxciento(23000000,3500000);
		assertEquals(612396, diezxciento.impuesto());

		diezxciento = new Diezxciento(23000000,4200000);
		assertEquals(980357, diezxciento.impuesto());

		diezxciento = new Diezxciento(23000000,5400000);
		assertEquals(1294052, diezxciento.impuesto());

		diezxciento = new Diezxciento(23000000,6100000);
		assertEquals(1491042, diezxciento.impuesto());

	}

	//tamara
	@Test
	public void testSaldoAhorro() throws Exception {
		Diezxciento diezxciento = new Diezxciento(1000000,1000000);
		assertEquals(0, diezxciento.saldoAhorro());

	    diezxciento = new Diezxciento(23000000,900000);
		assertEquals(20700000, diezxciento.saldoAhorro());



		diezxciento = new Diezxciento(45000000,2500000);
		assertEquals(40500000, diezxciento.saldoAhorro());

		diezxciento = new Diezxciento(1000000,500000);
		assertEquals(900000, diezxciento.saldoAhorro());

		diezxciento = new Diezxciento(6500000,1500000);
		assertEquals(5850000, diezxciento.saldoAhorro());	
	}

	//hacer mas assert

}
