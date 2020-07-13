package IO;
import java.io.FileWriter;
import java.io.IOException;

public class WritetoFile {
	public static void main(String args[])
	{
		try {
			FileWriter myWriter = new FileWriter("/home/nisha/Desktop/IO_prog//f1.txt");
			myWriter.write("Java is the prominent programming language of this millenium");
			myWriter.close();
			System.out.println("Sucessfully wrote a file");
			
		}
		catch (IOException e){
			System.out.println("An error occured");
			e.printStackTrace();
			
		}
	}

}
