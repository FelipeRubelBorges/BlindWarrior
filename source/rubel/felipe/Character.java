package rubel.felipe;

class Character {

	Weapon weapon;

	int health = 100;

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void suffer(int sufferLevel) {
		health -= sufferLevel;
	}

	public void attach(Character ziska) {
		weapon.hurt(ziska);
	}
}