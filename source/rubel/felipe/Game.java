package rubel.felipe;

import org.junit.Assert;

/**
 *
 */
public class Game {

	static boolean emJogo = true;

	public static void main(String[] args) {

		atacarInimigo();
		atacarZiska();
		atacarCitizen();

	}

	public static void atacarInimigo() {
		Character ziska = new Character();

		Weapon weapon = new Weapon(39);
		weapon.hurt(ziska);

		int health = ziska.getHealth();
		Assert.assertEquals(61, health);

		if (ziska.health < 0) {

			System.out.println("Ziska Morreu, o jogo foi perdido");

			emJogo = false;

		}

	}

	public static void atacarZiska() {
		Character enemy = new Character();

		Weapon weapon = new Weapon(59);
		weapon.hurt(enemy);

		int health = enemy.getHealth();
		Assert.assertEquals(41, health);

		if (enemy.health < 0) {

			System.out.println("Ziska Matou um Inimigo, Você ganhou o jogo");

			emJogo = false;

		}
	}

	public static void atacarCitizen() {
		Character citizen = new Character();

		Weapon weapon = new Weapon(39);
		weapon.hurt(citizen);

		int health = citizen.getHealth();
		Assert.assertEquals(41, health);

		if (citizen.health < 0) {

			System.out.println("Ziska Matou um Cidadão, o jogo foi perdido");

			emJogo = false;

		}
	}

}
