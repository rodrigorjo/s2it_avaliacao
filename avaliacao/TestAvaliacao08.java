package avaliacao;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAvaliacao08 {

	@Test
	public void testConcatena() {
		Integer x = 8566;
		Integer y = 23;
		Avaliacao08 avaliacao08 = new Avaliacao08();
		Integer resultado = avaliacao08.concatena(x, y);
		assertEquals(new Integer(825366), resultado);
	}
	
	@Test
	public void testRetornaMaiorLength() {
		Avaliacao08 avaliacao08 = new Avaliacao08();
		Integer resultado = avaliacao08.retornaMaiorLength("25", "1");
		assertEquals(new Integer(2), resultado);
	}
	
	@Test
	public void testRetornaMaiorLengthB() {
		Avaliacao08 avaliacao08 = new Avaliacao08();
		Integer resultado = avaliacao08.retornaMaiorLength("2", "156");
		assertEquals(new Integer(3), resultado);
	}
	
	@Test
	public void testIsBiggerThenOneMillion() {
		Avaliacao08 avaliacao08 = new Avaliacao08();
		assertEquals(true, avaliacao08.isBiggerThenOneMillion(1000001));
	}
	
	@Test
	public void testIsNotBiggerThenOneMillion() {
		Avaliacao08 avaliacao08 = new Avaliacao08();
		assertEquals(false, avaliacao08.isBiggerThenOneMillion(1000000));
	}
}
