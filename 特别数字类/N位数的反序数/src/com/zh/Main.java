package com.zh;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuffer buffer = new StringBuffer(scanner.next());
		scanner.close();
		int rev_num = Integer.parseInt(buffer.reverse().toString());
		System.out.println(rev_num);
		

	}

}
