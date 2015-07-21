/**
 * 
 */
package cag.mickmurphy.com;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Mick Murphy & Craig McGarry
 *
 */
public class TheFight {
	private String[] enemyType = new String[]{"Samurai","Templar","Ranger","Outcast"};
	private String[] arenaSet = new String[]{"Swamp", "City", "Forest", "Plains"};
	private String[] fighters = new String[]{"Ori The Swordmaster", "Nahri the Theif", "Rahi the Ranger", "Mahi the brute"};
	
	int fighterChoice = 0;
	Random randomizer =  new Random();
	
	Fighters fight = new Fighters();
	enemyClass enemy = new enemyClass();
	
	public static void main(String[] args) {
		
		TheFight fi = new TheFight();
		fi.pickFighter();
		
		
		fi.randomEnemy();
		fi.randomArena();
		
		
		// TODO Start Fight
		//set Abilities 
		//set fighter names , Gear and styles
		//Set Area 
	}


	private void pickFighter(){
			String nameOfFighter = "";
			System.out.println("Please Pick A Champion\n");
			System.out.println("1.)Ori The Swordmaster\n"
							+ "2.)Nahri the Theif\n"
							+ "3.)Rahi the Ranger\n"
							+ "4.)Mahi the brute\n");
			Scanner scan = new Scanner(System.in);
		fighterChoice = scan.nextInt();
			
			fighterChoice = fighterChoice - 1;
			
		if(fighterChoice == 0){
			enemy.setHealth(100);
			enemy.setStrenght(150);
			enemy.setDefence(75);
			enemy.setAgility(90);
			enemy.setArenaType("Plains");
			nameOfFighter = fighters[0];
		}else if(fighterChoice == 1){
			enemy.setHealth(100);
			enemy.setStrenght(85);
			enemy.setDefence(75);
			enemy.setAgility(175);
			enemy.setArenaType("City");
			nameOfFighter = fighters[1];
		}else if(fighterChoice == 2){
			enemy.setHealth(100);
			enemy.setStrenght(110);
			enemy.setDefence(65);
			enemy.setAgility(175);
			enemy.setArenaType("Forest");
			nameOfFighter = fighters[2];
		}else if(fighterChoice == 3){
			enemy.setHealth(100);
			enemy.setStrenght(100);
			enemy.setDefence(100);
			enemy.setAgility(150);
			enemy.setArenaType("Swamp");
			nameOfFighter = fighters[3];
		}
		System.out.println("your Fighter is : "+ nameOfFighter);
		System.out.println("\nTheir Stats Are"
						+ "\nHealth : " + enemy.getHealth()
						+ "\nStrenght : "+  enemy.getStrenght()
						+ "\nDefence : "+ enemy.getDefence()
						+ "\nAgility : "+ enemy.getAgility()
						+ "\nArena Type : "+ enemy.getArenaType());
	}
	
	private void randomEnemy(){
				String tempEnemy = enemyType[randomizer.nextInt(4)];
				System.out.println("Character is a " + tempEnemy );
				
		if(tempEnemy == "Samurai"){
			enemy.setHealth(100);
			enemy.setStrenght(100);
			enemy.setDefence(50);
			enemy.setAgility(150);
			enemy.setArenaType("Plains");
		}else if(tempEnemy == "templar"){
			enemy.setHealth(100);
			enemy.setStrenght(155);
			enemy.setDefence(150);
			enemy.setAgility(45);
			enemy.setArenaType("City");
		}else if(tempEnemy == "Ranger"){
			enemy.setHealth(100);
			enemy.setStrenght(100);
			enemy.setDefence(65);
			enemy.setAgility(175);
			enemy.setArenaType("Forest");
		}else if(tempEnemy == "Outcast"){
			enemy.setHealth(100);
			enemy.setStrenght(100);
			enemy.setDefence(100);
			enemy.setAgility(150);
			enemy.setArenaType("Forest");
		}

	}

	private void randomArena(){
		String tempArena = arenaSet[randomizer.nextInt(4)];
		System.out.println("The Arena is : " + tempArena);
	}

	private void mFight(){
		
	}

	private void mArmoury(){
		
	}

	private void mShop(){
		
	}
	
	private void mRest(){
		
	}
	
	private void levelUp(){
		
	}
	

}