package databaseFiles;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("test");
		equipmentData();

	}
	
	public static ArrayList<Equipment> equipmentData(){
		
	        String filePath = "C:\\Users\\theroldt\\git\\DarkSoulsSetUpCalculator\\DarkSoulsCalculator\\src\\databaseFiles\\physicalWeapons.txt";
	        File file = new File(filePath);

	        try (Scanner scanner = new Scanner(file)) {
	            while (scanner.hasNextLine()) {
	                String line = scanner.nextLine();
	                System.out.println(line);
	            }
	        } catch (FileNotFoundException e) {
	            System.err.println("File not found: " + filePath);
	        }
	
        return null;
	}

}
