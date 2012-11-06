import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class exercise2 {
	public static void cat(File file) {
	    RandomAccessFile input = null;
	    String line = null;

	    try {
	        input = new RandomAccessFile(file, "r");
	        while ((line = input.readLine()) != null) {
	            System.out.println(line);
	        }
	        return;
	    } catch (FileNotFoundException e) {
			System.out.println("File not found.");
			
		} catch (IOException e) {
			System.out.println(e.toString());
			
		} finally {
	        if (input != null) {
	            try {
					input.close();
				} catch (IOException e) {
					
				}
	        }
	    }
	}
}
