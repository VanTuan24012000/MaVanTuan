package javacore.Methods;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nhap();
	}
	static void chuanHoa(String s) {
		s = s.toLowerCase();//viet thuong tat ca
		String ss[];
		String s2 = "";
		ss = s.split(" ");
		for(int i = 0; i < ss.length; i++) {
			String s1 = "";
			if(ss[i].length() != 0) {
				s1 += Character.toUpperCase(ss[i].charAt(0));
				if(ss[i].length() > 1) {
					s1 += ss[i].substring(1);
				}
				s2 += s1;
				if(i < ss.length) {
					s2 += " ";
				}
			}
		}
		if(s2.charAt(s2.length() - 1) == ' ') {
			s2 += "\b";
		}
		System.out.print("\nchuoi sau khi chuan hoa: " + s2);
	}
	static void nhap() {
		String str;
		Scanner scanner = new Scanner(System.in);
		System.out.print("chap chuoi: ");
		str = scanner.nextLine();
		System.out.print("chuoi truoc khi chuan hoa: " + str);
		chuanHoa(str);
		System.out.print("");
	}

}
