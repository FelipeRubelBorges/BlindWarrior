package rubel.felipe;

public class Game {

	static boolean emJogo = true;

	public static void main(String[] args) {

		atacarInimigo();
		atacarZiska();
		atacarCitizen();

	}

	public static void atacarInimigo() {
		Character enemy = new Character();

		enemy.setHealth(100);
		Weapon weapon = new Weapon(39);
		weapon.hurt(enemy);

		if (enemy.health < 0) {

			System.out.println("Ziska Matou um Inimigo, Você ganhou o jogo");

			emJogo = false;

		}

	}

	public static void atacarZiska() {
		Character ziska = new Character();

		ziska.setHealth(100);
		Weapon weapon = new Weapon(59);
		weapon.hurt(ziska);

		if (ziska.health < 0) {

			System.out.println("Ziska Matou um Inimigo, Você ganhou o jogo");

			emJogo = false;

		}
	}

	public static void atacarCitizen() {
		Character citizen = new Character();

		citizen.setHealth(100);
		Weapon weapon = new Weapon(39);
		weapon.hurt(citizen);

		if (citizen.health < 0) {

			System.out.println("Ziska Matou um Cidadão, o jogo foi perdido");

			emJogo = false;

		}
	}

}
