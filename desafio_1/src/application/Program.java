package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Set<Integer> numbers = new TreeSet<>(); //Utilizando TreeSet pois armazena os valores ordenados
		
		for (int i = 0; i <n; i++) {
			numbers.add(sc.nextInt());
		}

		List<Integer> list = new ArrayList<>();
		list.addAll(numbers);
		Collections.reverse(list);
		
		for (int i : list) {
			System.out.println(i);
		}
		
		sc.close();
	}
}

