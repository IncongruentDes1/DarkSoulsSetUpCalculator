package databaseFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Scanner;

public class DataBase {
	

	
	
	public static void Readin(ArrayList<Equipment> curEquip,  ArrayList<Enemy> enemyList) {
			
			// - Physical/Crossbows/ Magic Equipment
			dataProcessing(curEquip, enemyList,  "C:\\Users\\theroldt\\git\\DarkSoulsSetUpCalculator\\DarkSoulsCalculator\\src\\databaseFiles\\textfiles\\physicalWeapons.txt", "gen");
			dataProcessing(curEquip, enemyList, "C:\\Users\\theroldt\\git\\DarkSoulsSetUpCalculator\\DarkSoulsCalculator\\src\\databaseFiles\\textfiles\\BowsAndCrossbows.txt", "gen");
			dataProcessing(curEquip, enemyList,"C:\\Users\\theroldt\\git\\DarkSoulsSetUpCalculator\\DarkSoulsCalculator\\src\\databaseFiles\\textfiles\\MagicEquipment.txt", "gen");
			
			dataProcessing(curEquip, enemyList,"C:\\Users\\theroldt\\git\\DarkSoulsSetUpCalculator\\DarkSoulsCalculator\\src\\databaseFiles\\textfiles\\shields.txt", "shield");
			
			dataProcessing(curEquip, enemyList, "C:\\Users\\theroldt\\git\\DarkSoulsSetUpCalculator\\DarkSoulsCalculator\\src\\databaseFiles\\textfiles\\rings.txt", "ring");
			
			dataProcessing(curEquip, enemyList, "C:\\Users\\theroldt\\git\\DarkSoulsSetUpCalculator\\DarkSoulsCalculator\\src\\databaseFiles\\textfiles\\MagicAndSorceries.txt", "magic");
			
			dataProcessing(curEquip, enemyList, "C:\\Users\\theroldt\\git\\DarkSoulsSetUpCalculator\\DarkSoulsCalculator\\src\\databaseFiles\\textfiles\\armor.txt", "armor");
			
			
			dataProcessing(curEquip, enemyList, "C:\\Users\\theroldt\\git\\DarkSoulsSetUpCalculator\\DarkSoulsCalculator\\src\\databaseFiles\\textfiles\\basicEnemies.txt", "enemy");
			dataProcessing(curEquip, enemyList, "C:\\Users\\theroldt\\git\\DarkSoulsSetUpCalculator\\DarkSoulsCalculator\\src\\databaseFiles\\textfiles\\bossStats.txt", "boss");
			
	}
			
	
		
		
		
		// handling data
		public static void dataProcessing(ArrayList<Equipment> equipList, ArrayList<Enemy> bossList, String filePath, String type){
		        File file = new File(filePath);
	
		        try (Scanner scanner = new Scanner(file)) {
		        	// - pulling first line to avoid reading issue
		        	String firstLine = scanner.nextLine();
		        	
		        	// - scanning in lines, routing to proper reader
		            while (scanner.hasNextLine()) {
		                String line = scanner.nextLine();
		                switch (type) {
		                case "gen":
		                    equipList.add(physicalWeaponReader(line));
		                    break;
		                case "shield":
		                    equipList.add(shieldReader(line));
		                    break;
		                case "ring":
		                    equipList.add(ringReader(line));
		                    break;
		                case "magic":
		                    equipList.add(magicReader(line));
		                    break;
		                case "armor":
		                    equipList.add(armorReader(line));
		                    break;
		                case "enemy":
		                	bossList.add(enemyReader(line));
		                	break;
		                case "boss":
		                	bossList.add(bossReader(line));
		                	break;
		            }
		        }} catch (FileNotFoundException e) {
		            System.err.println("File not found: " + filePath);
		        }
	
		}
	

		
		
		public static Enemy bossReader(String Line) {
			String[] items = Line.split(":");
			//String Type, String Name, String Location, Integer HP, Integer HPNG, Integer Souls, Integer SoulsNG
			Boss newBoss = new Boss(items[0], items[1], Float.parseFloat(items[2]), Float.parseFloat(items[3]), Float.parseFloat(items[4]), Float.parseFloat(items[5]), Float.parseFloat(items[6]),
					items[7], items[8], items[9], items[10], Float.parseFloat(items[11]), Float.parseFloat(items[12]),
					Float.parseFloat(items[13]), Float.parseFloat(items[14]));
			
			return newBoss;
			
		}
		        
		public static Enemy enemyReader(String Line) {
			String[] items = Line.split(":");
			//String Type, String Name, String Location, Integer HP, Integer HPNG, Integer Souls, Integer SoulsNG
			Enemy newEnemy = new Enemy(items[0], items[1], items[2], Float.parseFloat(items[3]), Float.parseFloat(items[4]), Float.parseFloat(items[5]), Float.parseFloat(items[6]));
			
			return newEnemy;
			
		}
		
		public static Armor armorReader(String Line) {
			String[] items = Line.split(":");
			Armor curArmor = new Armor(items[0], Float.parseFloat(items[1]),Float.parseFloat(items[2]), Float.parseFloat(items[3]), Float.parseFloat(items[4]),
					Float.parseFloat(items[5]), Float.parseFloat(items[6]), Float.parseFloat(items[7]), Float.parseFloat(items[8]), Float.parseFloat(items[9]),
					Float.parseFloat(items[10]), Float.parseFloat(items[11]), Float.parseFloat(items[12]));		
			return curArmor;
		}
		
		public static Magic magicReader(String Line) {
			String[] items = Line.split(":");
			Magic curMagic = new Magic(items[1], items[0 ],  Integer.parseInt(items[2]),  Integer.parseInt(items[3]),  Integer.parseInt(items[4]),
					 Integer.parseInt(items[5]), items[6], items[7]);		
			return curMagic;
			
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
