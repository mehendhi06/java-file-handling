package filehandling;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
 public class FileHandlingUtility {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw = new FileWriter("test.txt");
			fw.write("this is my first internship in java programming!!!! \n");
			fw.close();
			FileReader fr = new FileReader("test.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while(line!=null)
			{
				System.out.println(line);
				line = br.readLine();
			}
			br.close();
			System.out.println(" sucess");
		}catch (Exception e) {
			 System.out.println("something went wrong");
		}
	}
}
