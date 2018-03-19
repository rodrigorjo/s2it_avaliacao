package avaliacao;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAvaliacao09 {
	
	BinaryTree a = new BinaryTree(2);
	BinaryTree b = new BinaryTree(3);
	BinaryTree c = new BinaryTree(4);
	BinaryTree d = new BinaryTree(5);
	BinaryTree e = new BinaryTree(6);
	BinaryTree f = new BinaryTree(7);
	BinaryTree g = new BinaryTree(8);
	
	public void montaArvore(){
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.left = f;
		c.right = g;
	}
	
	@Test
	public void testSomaNosArvoreA() {
		montaArvore();
		Avaliacao09 avaliacao = new Avaliacao09();
		assertEquals(new Integer(35), avaliacao.somaNosArvore(a, new Integer(0)));
	}
	
	@Test
	public void testSomaNosArvoreB() {
		montaArvore();
		Avaliacao09 avaliacao = new Avaliacao09();
		assertEquals(new Integer(14), avaliacao.somaNosArvore(b, new Integer(0)));
	}
	
	@Test
	public void testSomaNosArvoreG() {
		montaArvore();
		Avaliacao09 avaliacao = new Avaliacao09();
		assertEquals(new Integer(8), avaliacao.somaNosArvore(g, new Integer(0)));
	}
}
