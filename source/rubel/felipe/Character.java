package rubel.felipe;

import lombok.*;

@Getter
@Setter
class Character {

	Weapon weapon;

	int health = 100;

	public void suffer( int sufferLevel ) {
		health -= sufferLevel;
	}

	public void attach(Character ziska) {
		weapon.hurt( ziska );
	}
}