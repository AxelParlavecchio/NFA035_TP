package cnam.nfa035.myclassname;

public class MyHello {

	public static void main(String[] args) {
		String infoPrj = "Hello Projet super world ;-).\n";
		System.out.println(infoPrj);
		
		/* Affichage via une instance de la classe */
		MyClassName test = new MyClassName();
		System.out.println(test.getClassName());
		
		/* Affichage de la taille du nom de la classe */
		System.out.println(test.getNameLength());
		
		/* Affichage en lettres majuscules du nom de la classe */
		System.out.println(test.classNameToUpper());
		
		/* Affichage via la classe */

	}

}
