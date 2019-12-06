 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fileexample {

	public static void main(String[] args) {
		BufferedReader ereader,dreader,sreader;
		try {
			ereader = new BufferedReader(new FileReader("emp.txt"));
			dreader = new BufferedReader(new FileReader("dept.txt"));
			sreader = new BufferedReader(new FileReader("sales.txt"));
			String eline = ereader.readLine();
			while (eline != null) {
				String[] depttokens = eline.split(",");
				System.out.println(depttokens[0]+"\t"+depttokens[1]);
				// read next line
				eline = ereader.readLine();
			}
			ereader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
