package n1Exercici4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> mesos = new ArrayList<String>();

		mesos.add("Gener");
		mesos.add("Febrer");
		mesos.add("Marc");
		mesos.add("Abril");
		mesos.add("Maig");
		mesos.add("Juny");
		mesos.add("Juliol");
		mesos.add("Agost");
		mesos.add("Septembre");
		mesos.add("Octubre");
		mesos.add("Novembre");
		mesos.add("Decembre");
		mesos.stream().forEach(System.out::println);

//		mesos.sort((s1,s2)->s1.compareTo(s2)); 
//		mesos.sort((fdfbv,asdf)->fdfbv.compareTo(asdf)); 
//		mesos.sort(String::compareTo);

	}

}
