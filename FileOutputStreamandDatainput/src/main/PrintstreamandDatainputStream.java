package main;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class PrintstreamandDatainputStream {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\test.txt");
		PrintStream pout = new PrintStream(file);
		pout.println("Azerbaijan");
		pout.println("Turkish");
		pout.println("Russia");
		pout.println("Jermany");
		pout.println("Iran");
		pout.println("Georgia");
		pout.println("Europa");
		pout.println("U.S.A");
		pout.println("France");
		pout.println("Italy");
		inputStream();
	}

	static void inputStream() throws IOException {
		InputStream input = new FileInputStream("D:\\test.txt");
		DataInputStream inst = new DataInputStream(input);
		int count = input.available();
		byte[] ary = new byte[count - 0];
		inst.read(ary);
		for(byte bt: ary) {
			if(bt!=0) {
				char v = (char) bt;
				System.out.print(v);
			}
		}
		
	}

}
