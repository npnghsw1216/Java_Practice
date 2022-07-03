package Day08.stream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.SequenceInputStream;
import java.util.Scanner;
import java.net.URL;

public class FileInputStream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. File Input Stream
		System.out.println("1.File Input Stream");
		try {
			FileInputStream fis = new FileInputStream("src/Day08/stream/input1.txt");
			int i = fis.read();
			//System.out.println((char)i);  // A : 0x41 = 16*4 + 1 = 65
			while(i!=-1) {
				System.out.print((char)i);
				i = fis.read();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		// 2. FileReader Stream
		System.out.println("\n2.File Reader");
		FileReader b = null;
		try {
			b = new FileReader("src/Day08/stream/input1.txt");
			int i = b.read();
			
			while(i!=-1) {
				System.out.print((char)i);
				i = b.read();
			}
			b.close();
		}
		catch(Exception e) { e.printStackTrace(); }
		
		// 3. Scanner
		System.out.println("\n3.Scanner");
		
		File f = new File("src/Day08/stream/input1.txt");
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNext()) {
				System.out.print(sc.next());
			}
			sc.close();
		}
		catch(Exception e) { e.printStackTrace(); }
		
		// 4. Image
		String filename = "src/Day08/stream/sample.png";
		try {
			InputStream is = new FileInputStream(filename);
			byte[] buffer = new byte[is.available()];
			System.out.println(is.available());
			
			is.read(buffer);
			
			int i = 0;
			for(byte b2 : buffer) {
				if(i%10==0)
					System.out.println();
				System.out.printf("%02x ", b2);
				i++;
			}
			
		}
		catch(Exception e) { e.printStackTrace(); }
		
		// 5. URL
		String web = "https://music.bugs.co.kr";
		
		try {
			URL url = new URL(web);
			InputStream is = url.openStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			br.lines().forEach(System.out::println);
			
		}
		catch(Exception e) { e.printStackTrace(); }
		
		// 6. SequenceInputStream
		String filename1 = "src/Day08/stream/input1.txt";
		String filename2 = "src/Day08/stream/input1.txt";
		String filename3 = "src/Day08/stream/input1.txt";
		
		try {
			InputStream is1 = new FileInputStream(filename1);
			InputStream is2 = new FileInputStream(filename2);
			InputStream is3 = new FileInputStream(filename3);
			SequenceInputStream sis1 = new SequenceInputStream(is1, is2);
			SequenceInputStream sis2 = new SequenceInputStream(sis1, is3);
			
			int b3 = sis2.read();
			
			while(b3!=-1) {
				System.out.print((char)b3);
				b3 = sis2.read();
			}
		}
		catch(Exception e) { e.printStackTrace(); }
	}

}
