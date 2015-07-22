package cag.mickmurphy.com;

public class BuffDeBuff extends TheFight {


	public static void main(String[] args) {
		String tempEnemy = enemyType[randomizer.nextInt(4)];

		if(tempEnemy == "Samurai" && arenaSet == "City"){
			enemy.setHealth(100);
			enemy.setStrenght(100);
			enemy.setDefence(50);
			enemy.setAgility(150);

		}

	}
}


