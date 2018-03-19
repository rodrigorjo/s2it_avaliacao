package avaliacao;

public class Avaliacao09 {
	
	public static void main(String[] args) {
		BinaryTree a = new BinaryTree(2);
		BinaryTree b = new BinaryTree(3);
		BinaryTree c = new BinaryTree(4);
		BinaryTree d = new BinaryTree(5);
		BinaryTree e = new BinaryTree(6);
		BinaryTree f = new BinaryTree(7);
		BinaryTree g = new BinaryTree(8);
		
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.left = f;
		c.right = g;
		
		Avaliacao09 avaliacao = new Avaliacao09();
		System.out.println(avaliacao.somaNosArvore(g, new Integer(0)));
	}
	
	public Integer somaNosArvore(BinaryTree x, Integer resultado){
		resultado += x.getValor();
		if(x.left != null){
			resultado = somaNosArvore(x.left, resultado);
		}
		if(x.right != null){
			resultado = somaNosArvore(x.right, resultado);
		}
		return resultado;
	}
}
