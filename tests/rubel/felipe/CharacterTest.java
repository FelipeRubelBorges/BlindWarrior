package rubel.felipe;

import org.junit.*;

/**
 *
 */
public class CharacterTest {

	@Test
	public void newCitizenWillAlwaysHave100OfHealth() {
		Character character = new Character();
		Assert.assertEquals(100, character.getHealth());
	}

	@Test
	public void isAbleToHurtACharacter() {
		Character ziska = new Character();

		Character enemy = new Character();
		enemy.setWeapon(new Weapon(59));
		enemy.attach(ziska);

		Assert.assertEquals(41, ziska.getHealth());
	}
}
