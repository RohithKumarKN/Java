package Strings;

import java.util.Scanner;

public class CheckWeatherAnagramOrNot4 {

	public CheckWeatherAnagramOrNot4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {                                                                         
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		boolean isAnagram = true;
		int al[] = new int[256];
		for(char c:a.toCharArray()) {
			int index=(int) c;
			al[index]++;
		}
		for(char c:b.toCharArray()) {
			int index=(int) c;
			al[index]--;
		}
		for(int i=0;i<256;i++) {
			if(al[i]!=0) {
				isAnagram=false;
				break;
			}
		}
		if(isAnagram) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
	}

}