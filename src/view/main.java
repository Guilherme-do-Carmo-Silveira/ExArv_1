package view;

import docarmo.ArvoreInt.Arvore;

public class main {

	public static void main(String[] args) {
		
		Arvore a = new Arvore();
		
		int [] vt = {30, 15, 60, 10, 20, 40, 80};
		
		for(int i : vt) {
			a.insert(i);
		}
		
		try {
			System.out.print("=======================\n");
			a.prefixSearch();
			System.out.print("\n=======================\n");
			a.infixSearch();
			System.out.print("\n=======================\n");
			a.postfixSearch();
			System.out.print("\n=======================\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
