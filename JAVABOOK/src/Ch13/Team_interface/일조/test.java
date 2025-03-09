package Ch13.Team_interface.일조;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String result = sc.next(); 
		for(String el : args) {
			
			result += "+"+el;
			
		}
		System.out.println(result);
	
	}

}
