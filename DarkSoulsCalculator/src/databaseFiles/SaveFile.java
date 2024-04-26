package databaseFiles;

import java.io.File;

// - Two handing weapons gives a +50% strength bonus

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaveFile {
	String name;
	String covenant;
	
	Integer level;
	Integer souls;
	
	
	Integer vitality;
	Integer attunement; 
	Integer endurance; 
	Integer strength; 
	Integer dexterity;
	Integer resistance;
	Integer intelligence;
	Integer faith;
	
	Integer Humanity;
	
	// - calculated within
	Integer hp;
	Integer stamina; 
	Integer equipLoad; 
	
	Integer rWeapon1;
	Integer rWeapon2;
	Integer lWeapon1;
	Integer lWeapons2;
	
	Integer physicalDefense;
	Integer vsStrike;
	Integer vsSlash;
	Integer vsThrust;
	Integer magicDef;
	Integer flameDef;
	Integer lightningDef;
	
	Integer poise;
	Integer bleedRes;
	Integer poisonRes;
	Integer curseRes;
	
	Integer itemDiscovery;
	Integer attunementSlots; 
	

	
	
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
		
		dataProcessing("C:\\Users\\theroldt\\git\\DarkSoulsSetUpCalculator\\DarkSoulsCalculator\\src\\databaseFiles\\textfiles\\test.txt");
		
		
	}
	
	

// - STAT CALCULATIONS -------------------------------------------------------------------------------------------------------------	
	

	public Integer attackCalculations(String Scaling, physicalWeapon weapon) {
		
		
		
		
		
		
		return 0;
	}

	public static void dataProcessing(String filePath){
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(file)) {
        	// - pulling first line to avoid reading issue
        	String firstLine = scanner.nextLine();
        	String secondLine = scanner.nextLine();
        	
        	String[] firstLineStats = firstLine.split(",-");
        	String[] secondLineStats = secondLine.split(",-");
        	for (int x = 0; x < firstLineStats.length; x++) {
        		String[] smallSectionOne = firstLineStats[x].split(",");
        		String[] smallSectionTwo = secondLineStats[x].split(",");
        		for (int y = 0; y < smallSectionOne.length; y++) {
        			System.out.print(smallSectionOne[0].replace("[", "").replace("\"","") + ",");
        			System.out.print(secondLineStats[x]);
        			System.out.println();
 
        		}
        	}
        	
//        	for (String section: firstLineStats) {
//        		System.out.println(section);
//        		String[] smallSection = section.split(",");
//        		System.out.println(smallSection[0]);
//        	}
        	
        	// - scanning in lines, routing to proper reader
          } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filePath);
            
          
            
            
        }

}




}
