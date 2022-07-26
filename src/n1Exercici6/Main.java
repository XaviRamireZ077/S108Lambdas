package n1Exercici6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	// Crea una llista amb nombres i cadenes de text i ordena la llista amb les
	// cadenes de més curta a més llarga.

	public static void main(String[] args) {

		List<String> nombres = new ArrayList<String>(
				List.of("aasdasdsad", "b", "c", "d", "e", "f", "g", "h", "i", "13414"));

		nombres.stream().sorted(Comparator.comparingInt((x) -> x.length())).forEach(System.out::println);
		

	}

}
