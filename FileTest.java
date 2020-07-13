package IO;
import java.io.File.*;

public class FileTest {
public static void main(String args[]) throws IOException
{
	File fileToCheck;
	if(args.length>0)
	{
		for(int i = 0; i<args.length;i++)
		{
			fileToCheck = new File(args[i]);
			getPaths(fileToCheck);
			getInfo(fileTOCheck);
			
		}
	}
	else 
		System.out.println("Usage : java file test <filename")
}
}
