package task2;

import java.util.*;

public class main {

	public static void main(String[] args) {
		Map<String, Set<String>> mapa = new HashMap<>();
		Set<String> febo = new HashSet<>();
		febo.add("Ivan");
		febo.add("Jovan");
		//febo.add("Pero");
		//febo.add("Klosar");
		
		Set<String> jovan = new HashSet<>();
		jovan.add("Ivan");
		
		Set<String> pero = new HashSet<>();
		pero.add("Pero");
		pero.add("Klosar");
		
		mapa.put("Febo", febo);
		mapa.put("Jovan", jovan);
		mapa.put("Pero", pero);
		System.out.println(labTask.theMostInformed(mapa));
	}

}
