package databaseFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaveFile {
	String name;
	String covenant;
	
	Integer level;
	Integer souls;
	
	
	Integer vitality; // - Calculated
	Integer attunement; // - Calculated
	Integer endurance; // = Calculated
	Integer strength;
	Integer dexterity;
	Integer resistance;
	Integer intelligence;
	Integer faith;
	
	Integer Humanity;
	
	// - calculated within
	Integer hp; // - Calculations set
	Integer stamina; // - Calculations set 
	Integer equipLoad; // - Calculations set
	
	Integer rWeapon1;
	Integer rWeapon2;
	Integer lWeapon1;
	Integer lWeapons2;
	
	Integer physicalDefense; //TODO this may have different values
	Integer vsStrike;
	Integer vsSlash;
	Integer vsThrust;
	Integer magicDef;
	Integer flameDef;
	Integer lightningDef;
	
	Integer poise;
	Integer bleedRes;  // - Calculations set.
	Integer poisonRes;
	Integer curseRes;
	
	Integer itemDiscovery;
	Integer attunementSlots; // - Calculations set
	
	//- DataCollection
	 HashMap<Integer, Integer> hpDictionary = new HashMap<>();
	 HashMap<Integer, Integer[]> enduranceDictionary = new HashMap<Integer, Integer[]>();
	
	
	// - read in initial information. This should only take Stats.
	public SaveFile(String Name, String Covenant, Integer Vitality, Integer Attunement, Integer Endurance, Integer Strength, Integer Dexterity,
			Integer Resistance, Integer Intelligence, Integer Faith) {
		
		name = Name;
		covenant = Covenant;
		vitality = Vitality;
		attunement = Attunement;
		endurance = Endurance;
		strength = Strength;
		dexterity = Dexterity;
		resistance = Resistance;
		intelligence = Intelligence;
		faith = Faith;
		
		hpDatabase();
		enduranceDatabase();
		runBaseCalculations();
	}
	
	
	
// - STAT CALCULATIONS -------------------------------------------------------------------------------------------------------------	
	
	// - run/reset stats - these are not based on any external values. Just based on skill inputs.
	public void runBaseCalculations(){
		hp = hpDictionary.get(vitality);
		stamina = enduranceDictionary.get(endurance)[0];
		equipLoad = enduranceDictionary.get(endurance)[2];
		bleedRes = enduranceDictionary.get(endurance)[1];
		attunementSlots = enduranceDictionary.get(endurance)[3];
	}
	

	
	public void hpDatabase() {
		 File file = new File("C:\\Users\\theroldt\\git\\DarkSoulsSetUpCalculator\\DarkSoulsCalculator\\src\\databaseFiles\\textfiles\\hp.txt");
	     try (Scanner scanner = new Scanner(file)) {    	 
	    	 while(scanner.hasNextLine()) {
		    	 String curLine = scanner.nextLine();
		    	 String[] items = curLine.split(":");
		    	 hpDictionary.put(Integer.parseInt(items[0]), Integer.parseInt(items[1]));
	    	 }
	        } catch (FileNotFoundException e) {}
	}
	
	public void enduranceDatabase() {
		 File file = new File("C:\\Users\\theroldt\\git\\DarkSoulsSetUpCalculator\\DarkSoulsCalculator\\src\\databaseFiles\\textfiles\\stamina.txt");
	     try (Scanner scanner = new Scanner(file)) {    
	    	 scanner.nextLine();
	    	 while(scanner.hasNextLine()) {
		    	String curLine = scanner.nextLine();
		    	String[] items = curLine.split(":");
		    	Integer[] vals = new Integer[4];
		    	vals[0] = Integer.parseInt(items[1]);
		    	vals[1] = Integer.parseInt(items[2]); 
		    	vals[2] = Integer.parseInt(items[3]); 
		    	vals[3] = Integer.parseInt(items[4]);
		    	
		    	System.out.println("vals are " + vals[0] + "," + vals[1] + ","+ vals[2]);
		    	 
		    	enduranceDictionary.put(Integer.parseInt(items[0]), vals);
	    	 }
	        } catch (FileNotFoundException e) {}
	}

}
