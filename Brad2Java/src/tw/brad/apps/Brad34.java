package tw.brad.apps;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Brad34 {
	public static void main(String[] args) {
		try {
			ObjectInputStream oin = 
				new ObjectInputStream(new FileInputStream("dir1/brad.object"));
			Object obj = oin.readObject();
			Student s1 = (Student)obj;
			oin.close();
			
			System.out.println(s1.sum());
			System.out.println(s1.avg());
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
