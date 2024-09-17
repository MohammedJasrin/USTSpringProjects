package serialisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		PurchaseOrder po = new PurchaseOrder("1234","Dell",100,9000);
		PurchaseOrder poo = new PurchaseOrder("4321","Boost",50,2);
		FileOutputStream fos= new FileOutputStream("pofile.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(po);
		FileInputStream fis = new FileInputStream("pofile.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		PurchaseOrder ref = (PurchaseOrder) obj;
		System.out.println(ref);

	}

}
