
public class Student {
	int id=8;
	String name="Nitin";


void display() {
	System.out.println("Id is="+ id+ ","+"Name is="+ name);
}

public static void main(String args[]) {
	Student s1=new Student();
	Student s2=new Student();
	s1.display();
	s2.display();
	
}
}

//concept of parameterised constructor
