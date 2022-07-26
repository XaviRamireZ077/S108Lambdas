package n1Exercici5;

public class Main {

	/*
	 * Crea una Functional Interface amb un mètode anomenat getPiValue() que ha de
	 * retornar un double. Des del main() de la classe principal, instància la
	 * interfície i assigna-li el valor 3.1415. Invoca el mètode getPiValue() i
	 * imprimeix el resultat.
	 */

	public static void main(String[] args) {

		FunctionalInterface functionalInt = () -> 3.1415;

		System.out.println(functionalInt.getPiValue());

	}

}
