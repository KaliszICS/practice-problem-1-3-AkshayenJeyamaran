import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class PracticeProblem {
    public static String readFile(String filename) {
        BufferedReader reader = null;
        String line = null;
        String content = "";

        try {
            reader = new BufferedReader(new FileReader(filename));
            while ((line = reader.readLine()) != null) {
                content += line + "\n";
            }
            reader.close();
        }
        catch (IOException e) {
            System.out.println("Error reading file.");
		}
        return content;
    }
	public static String backwardsReadFile(String filename) {
    	BufferedReader reader = null;
    	String line = null;
    	String content = "";
   		 try {
        	reader = new BufferedReader(new FileReader(filename));
        	while ((line = reader.readLine()) != null) {
            	content += line + "\n";
        	}
        	reader.close();
    		}
    	catch (Exception e) {
        	System.out.println("Error reading file.");
    		}
    	String backwards = "";
   		for (int i = content.length() - 1; i >= 0; i--) {
        	backwards += content.charAt(i);
    	}
    	return backwards;
}
}