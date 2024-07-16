package Game;

import java.util.Vector;
import static org.junit.Assert.assertNull;
import Game.HighScoreManager;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.EvoRunner;
import Game.Score;
import org.junit.runner.RunWith;
import static org.evosuite.runtime.EvoAssertions.*;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Game_HighScoreManager_Test {
	@Test
	public void test_HighScoreManager_0() throws Throwable {
		Game.HighScoreManager highScoreManager1 = new Game.HighScoreManager("");

	}

	@Test
	public void test_HighScoreManager_1() throws Throwable {
		Game.HighScoreManager highScoreManager1 = new Game.HighScoreManager(0);

	}

	@Test
	public void test_updateScoreFile_0() throws Throwable {
		Game.HighScoreManager highScoreManager1 = new Game.HighScoreManager("");
java.lang.Boolean boolean2 = java.lang.Boolean.TRUE;
assertEquals(true, ((java.lang.Boolean) boolean2).booleanValue());
highScoreManager1.updateScoreFile(boolean2);

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
