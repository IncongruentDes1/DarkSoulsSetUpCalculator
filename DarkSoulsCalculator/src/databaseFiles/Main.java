package databaseFiles;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("test");
		ArrayList<Equipment> curEquip = new ArrayList<Equipment>();
		dataReadin(curEquip);

	}
	
	
	

	
	public static void dataReadin(ArrayList<Equipment> curEquip) {
		
		// - Physical/Crossbows/ Magic Equipment
		equipmentData(curEquip, "C:\\Users\\theroldt\\git\\DarkSoulsSetUpCalculator\\DarkSoulsCalculator\\src\\databaseFiles\\physicalWeapons.txt", "gen");
		equipmentData(curEquip, "C:\\Users\\theroldt\\git\\DarkSoulsSetUpCalculator\\DarkSoulsCalculator\\src\\databaseFiles\\BowsAndCrossbows.txt", "gen");
		equipmentData(curEquip, "C:\\Users\\theroldt\\git\\DarkSoulsSetUpCalculator\\DarkSoulsCalculator\\src\\databaseFiles\\MagicEquipment.txt", "gen");
		
		equipmentData(curEquip, "C:\\Users\\theroldt\\git\\DarkSoulsSetUpCalculator\\DarkSoulsCalculator\\src\\databaseFiles\\shields.txt", "shield");
		
		equipmentData(curEquip, "C:\\Users\\theroldt\\git\\DarkSoulsSetUpCalculator\\DarkSoulsCalculator\\src\\databaseFiles\\rings.txt", "ring");

		
		for(Equipment x: curEquip){
			System.out.println(x);
		}

	}
	
	
	// handling data
	public static void equipmentData(ArrayList<Equipment> equipList, String filePath, String type){
	        File file = new File(filePath);

	        try (Scanner scanner = new Scanner(file)) {
	        	// - pulling first line to avoid reading issue
	        	String firstLine = scanner.nextLine();
	        	
	        	// - scanning in lines, routing to proper reader
	            while (scanner.hasNextLine()) {
	                String line = scanner.nextLine();
	                if (type == "gen") {
		                equipList.add(physicalWeaponReader(line));
	                }
	                else if (type == "shield") {
	                	equipList.add(shieldReader(line));
	                }
	                else if (type == "ring") {
	                	equipList.add(ringReader(line));
	                }
	                	
	            }
	        } catch (FileNotFoundException e) {
	            System.err.println("File not found: " + filePath);
	        }

	}

	
	public static Ring ringReader(String Line) {
		String[] items = Line.split(":");
		Ring curRing = new Ring(items[0], items[1], items[2]);
		
		return curRing;
	}
	
	
	public static Shield shieldReader (String Line) {
		String[] items = Line.split(":");		
		Shield curShield = new Shield(items[0], items[1], Integer.parseInt(items[2]), Integer.parseInt(items[3]), Integer.parseInt(items[4]), Integer.parseInt(items[5]),
				Integer.parseInt(items[6]), Integer.parseInt(items[7]) , Integer.parseInt(items[8]), Integer.parseInt(items[9]), Integer.parseInt(items[10]),
				Integer.parseInt(items[11]), Integer.parseInt(items[12]), Integer.parseInt(items[13]), Integer.parseInt(items[14]), Integer.parseInt(items[15]),
				items[16], items[17], items[18], items[19], Float.parseFloat(items[20]), Float.parseFloat(items[21]), items[22], items[23], items[24]);
		
		
		return curShield;
	}
	
	public static physicalWeapon physicalWeaponReader(String Line) {
		String[] items = Line.split(":");
		physicalWeapon curWeapon = new physicalWeapon(items[0], items[1], Integer.parseInt(items[2]), Integer.parseInt(items[3]),
				Integer.parseInt(items[4]),Integer.parseInt(items[5]), Integer.parseInt(items[6]), Integer.parseInt(items[7]), 
				Integer.parseInt(items[8]), Integer.parseInt(items[9]), Integer.parseInt(items[10]), Integer.parseInt(items[11]),
				Integer.parseInt(items[12]), Integer.parseInt(items[13]), Integer.parseInt(items[14]), Integer.parseInt(items[15]),
				Integer.parseInt(items[16]), Integer.parseInt(items[17]), Integer.parseInt(items[18]),Integer.parseInt(items[19]),
				items[20], items[21], items[22],items[23], Float.parseFloat(items[24]), Float.parseFloat(items[25]), items[26], items[27]);
		
		return curWeapon;
	}

}
