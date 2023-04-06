package test;

import JUnit.Junit09_Geometria.dto.*;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GeometriaTest {
	Geometria geo = new Geometria();

	@Test
	void testGeometriaInt() {
		int exp = 4;
		Geometria geo = new Geometria(4);
		int res = geo.getId();
		assertEquals(res, exp);
	}

	@Test
	void testGeometria() {
		int exp = 4;
		Geometria geo = new Geometria(6);
		assertNotNull(geo);
	}

	@Test
	void testAreacuadrado() {
		int val1 = 5;
		int res = 25;
		int val2 = geo.areacuadrado(val1);

		assertEquals(res, val2);
	}

	@SuppressWarnings("deprecation")
	@Test
	void testAreaCirculo() {
		double resdef = 28.2744;
		geo = new Geometria();
		double res = geo.areaCirculo(3);
		assertEquals(resdef, res);
	}

	@SuppressWarnings("deprecation")
	@Test
	void testAreatriangulo() {
		double res = geo.areatriangulo(2, 5);
		int resul = 5;
		assertEquals(res, resul);
	}

	@Test
	void testArearectangulo() {
		int res = geo.arearectangulo(2, 5);
		assertEquals(res, 10);
	}

	@Test
	void testAreapentagono() {
		int ret = geo.areapentagono(5, 10);
		int res = 25;
		assertEquals(ret, res);
	}

	@Test
	void testArearombo() {
		int out = geo.arearombo(5, 2);
		int res = 5;
		assertEquals(out, res);
	}

	@Test
	void testArearomboide() {
		int resu = geo.arearomboide(5, 2);
		int re = 10;
		assertEquals(resu, re);
	}

	@SuppressWarnings("deprecation")
	@Test
	void testAreatrapecio() {
		double out = geo.areatrapecio(10, 5, 3);
		double res = 37.5;
		double delta = 0.001;
		assertEquals(res, out,delta);
	}

	@Test
	void testFigura() {
		String out = geo.figura(4);
		assertEquals(out, "Rectangulo");
	}

	@Test
	void testgetId() {
		int exp = 9;
		geo.getId();
		int id = geo.getId();
		assertEquals(exp, id);
	}

	@Test
	void testSetId() {
		int exp = 9;
		geo.setId(exp);
		int out = geo.getId();
		assertEquals(out, exp);
	}

	@Test
	void testGetNom() {
		String exp = "Tetraedro";
		geo.setNom(exp);
		assertEquals(exp, geo.getNom());
	}

	@Test
	void testSetNom() {

		String nombre = "Tetraedro";
		geo.setNom("Tetraedro");
		assertEquals(geo.getNom(), nombre);

		nombre = "cuadrado";
		geo.setNom("cuadrado");
		assertEquals(geo.getNom(), nombre);

		nombre = "Circulo";
		geo.setNom("Circulo");
		assertEquals(geo.getNom(), nombre);

		nombre = "Triangulo";
		geo.setNom("Triangulo");
		assertEquals(geo.getNom(), nombre);

		nombre = "Pentagono";
		geo.setNom("Pentagono");
		assertEquals(geo.getNom(), nombre);

		nombre = "Rombo";
		geo.setNom("Rombo");
		assertEquals(geo.getNom(), nombre);

		nombre = "Romboide";
		geo.setNom("Romboide");
		assertEquals(geo.getNom(), nombre);

		nombre = "Trapecio";
		geo.setNom("Trapecio");
		assertEquals(geo.getNom(), nombre);

	}

	@SuppressWarnings("deprecation")
	@Test
	void testGetArea() {
		int exp = 23;
		geo.setArea(exp);
		assertEquals(exp, geo.getArea());
	}

	@SuppressWarnings("deprecation")
	@Test
	void testSetArea() {
	
		int exp = 23;
		geo.setArea(exp);
		double out = geo.getArea();
		assertEquals(out, exp);
	}

	@Test
	void testToString() {
		geo.toString();
	}

}
