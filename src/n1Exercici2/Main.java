package n1Exercici2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<String> llistaStrings = Arrays.asList("Barcelona", "Madrid", "Bilbao", "Caceres", "Pamplona", "Valencia",
				"Lugo");

		List<String> paraules = wordsWitho(llistaStrings);
		for (String paraula : paraules) {
			System.out.println(paraula);
		}

	}

	private static List<String> wordsWitho(List<String> llistaStrings) {
		List<String> paraules = llistaStrings.stream().filter(w -> w.contains("o")).collect(Collectors.toList());

		return paraules;

	}

}
