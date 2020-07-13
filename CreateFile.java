package IO;
import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String rgs[])
	{
		try {
			File myObj = new File("/home/nisha/Desktop/IO_prog//f1.txt");
					
			if(myObj.createNewFile())
			{
				System.out.println("file created : " +myObj.getName());
				
				
			}
			else {
				System.out.println("file already created");
				
			}
		}
		catch(IOException e)
		{
			System.out.println("An error occurred.");
			
		}
	}

}
