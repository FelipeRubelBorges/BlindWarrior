package rubel.felipe;

import org.junit.*;

/**
 *
 */
public class WeaponTest {

	@Test
	public void canHutACitizenOn50Percent()
	{
		Character character = new Character();

		Weapon weapon = new Weapon( 50 );
		weapon.hurt(character);

		int health = character.getHealth();
		Assert.assertEquals(50, health);
	}

	@Test
	public void canHutACitizenOn30Percent() {
		Character character = new Character();

		Weapon weapon = new Weapon( 30 );
		weapon.hurt(character);

		int health = character.getHealth();
		Assert.assertEquals(70, health);
	}
}
