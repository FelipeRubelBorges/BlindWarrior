package rubel.felipe;

import lombok.AllArgsConstructor;

/**
 *
 */
@AllArgsConstructor
public class Weapon {

	int sufferLevel;

	public Weapon(int i) {
		// TODO Auto-generated constructor stub
	}

	public void hurt(Character character) {
		character.suffer( sufferLevel );
	}
}
