package tw.brad.apps;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Brad33 {

	public static void main(String[] args) {
		Student s1 = new Student(90, 79, 87);
		System.out.println(s1.sum());
		System.out.println(s1.avg());
		try {
			FileOutputStream fout = new FileOutputStream("dir1/brad.object");
			ObjectOutputStream oout = new ObjectOutputStream(fout);
			oout.writeObject(s1);
			oout.flush();
			oout.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
class Student implements Serializable {
	int ch, math, eng;
	Student(int ch, int math, int eng){this.ch=ch;this.math=math;this.eng=eng;}
	int sum() {return ch+math+eng;}
	double avg() {return sum()/3.0;}
}
