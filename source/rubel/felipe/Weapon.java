package rubel.felipe;

public class Weapon {

	int sufferLevel;

	public Weapon(int sufferLevel) {
		this.sufferLevel = sufferLevel;
	}

	public void hurt(Character character) {
		character.suffer(sufferLevel);
	}
}
