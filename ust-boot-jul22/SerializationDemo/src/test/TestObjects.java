package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestObjects {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		PurchaseOrder po = new PurchaseOrder("1234","DEll",100,9000);
		FileOutputStream fos = new FileOutputStream("pofile.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(po);
		
		FileInputStream fis=new FileInputStream("pofile.txt");
		ObjectInputStream iis=new ObjectInputStream(fis);
		Object obj=iis.readObject();
		PurchaseOrder ref=(PurchaseOrder) obj;
		System.out.println(ref);
	}
}
