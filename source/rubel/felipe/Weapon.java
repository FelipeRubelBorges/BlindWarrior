package rubel.felipe;

import lombok.AllArgsConstructor;

/**
 *
 */
@AllArgsConstructor
public class Weapon {

	int sufferLevel;

	public void hurt(Character character) {
		character.suffer( sufferLevel );
	}
}
