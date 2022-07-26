package n1Exercici7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> nombres = new ArrayList<String>(
				List.of("aasdasdsad", "b", "c", "d", "e", "f", "g", "h", "i", "13414"));

		nombres.stream().sorted(Comparator.comparingInt((x) -> ((String) x).length()).reversed()).forEach(System.out::println);
				
	}

}
