package javacore.Methods;

public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] st = new Student[1];
		st[0].name = "name";
		st[0].age = 7;
		st[0].subject = "subject";
		st[0].school = "school";
		for(int i = 0; i < st.length; i++) {
			System.out.println(st[i].name);
			System.out.println(st[i].age);
			System.out.println(st[i].subject);
			System.out.println(st[i].school);
		}
	}

}
