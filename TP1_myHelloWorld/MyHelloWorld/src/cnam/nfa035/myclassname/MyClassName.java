package cnam.nfa035.myclassname;

public class MyClassName {

		private String className = getClass().getSimpleName();
		
		/* Méthode d'affichage du nom de classe */
		protected String getClassName(){
			String str = "Je suis la classe "+className+".";
			return str;
		}
		
		/* Méthode d'affichage du nom de classe en lettres majuscules */
		protected String classNameToUpper(){
			String str = "Je suis la classe "+className.toUpperCase()+" en lettres majuscules.";
			return str;
		}
		
		/* Méthode d'affichage de la taille du nom de classe */
		protected String getNameLength(){
			int x = className.length();
			String str = "Mon nom contient "+x+" caractères.";
			return str;
		}
}
