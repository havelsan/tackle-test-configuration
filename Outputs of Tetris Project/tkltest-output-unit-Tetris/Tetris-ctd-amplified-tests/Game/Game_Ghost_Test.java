package Game;

import Game.Mino;
import static org.junit.Assert.assertNull;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoRunner;
import org.junit.runner.RunWith;
import Game.Ghost;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Game_Ghost_Test {
	@Test
	public void test_Ghost_0() throws Throwable {
		Game.Mino mino1 = new Game.Mino(4);
Game.Ghost ghost2 = new Game.Ghost(mino1);

	}

	@Test
	public void test_Ghost_1() throws Throwable {
		Game.Mino mino1 = new Game.Mino(4);
Game.Mino mino3 = new Game.Mino(4);
Game.Ghost ghost4 = new Game.Ghost(mino3);
Game.Ghost ghost5 = new Game.Ghost((Game.Mino)ghost4);

	}

	private java.lang.Object getFieldValue(java.lang.Object obj, String fieldName) throws java.lang.reflect.InvocationTargetException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException {
		try {
			java.lang.reflect.Field field = obj.getClass().getField(fieldName);
			return field.get(obj);
		} catch (java.lang.NoSuchFieldException e) {
			for (java.lang.reflect.Method publicMethod : obj.getClass().getMethods()) {
				if (publicMethod.getName().startsWith("get") && publicMethod.getParameterCount() == 0 && 
					publicMethod.getName().toLowerCase().equals("get"+fieldName.toLowerCase())) {
					return publicMethod.invoke(obj);
				}
			}
		}
		throw new IllegalArgumentException("Could not find field or getter "+fieldName+" for class "+obj.getClass().getName());
	}
}
