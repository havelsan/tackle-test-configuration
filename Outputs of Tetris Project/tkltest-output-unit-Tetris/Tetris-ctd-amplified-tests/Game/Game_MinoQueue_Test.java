package Game;

import Game.Mino;
import static org.junit.Assert.assertNull;
import Game.MinoQueue;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoRunner;
import org.junit.runner.RunWith;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Game_MinoQueue_Test {
	@Test
	public void test_setHeld_0() throws Throwable {
		Game.MinoQueue minoQueue0 = new Game.MinoQueue();
Game.Mino mino1 = null;
minoQueue0.setHeld(mino1);

	}

	@Test
	public void test_setHeld_1() throws Throwable {
		Game.MinoQueue minoQueue0 = new Game.MinoQueue();
Game.Mino mino2 = new Game.Mino(4);
Game.Ghost ghost3 = new Game.Ghost(mino2);
minoQueue0.setHeld((Game.Mino)ghost3);

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
