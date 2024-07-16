package Game;

import Game.Mino;
import static org.junit.Assert.assertNull;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoRunner;
import org.junit.runner.RunWith;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import Game.GameElementPanel;
import static org.junit.Assert.fail;

public class Game_GameElementPanel_Test {
	@Test
	public void test_GameElementPanel_0() throws Throwable {
		Game.GameElementPanel gameElementPanel2 = new Game.GameElementPanel("", 70);
assertEquals(128, getFieldValue(gameElementPanel2, "ABORT"));
assertEquals(0.5, (float) getFieldValue(gameElementPanel2, "CENTER_ALIGNMENT"), 0.015);
assertEquals(4, getFieldValue(gameElementPanel2, "PROPERTIES"));
assertEquals(8, getFieldValue(gameElementPanel2, "SOMEBITS"));
assertEquals(1.0, (float) getFieldValue(gameElementPanel2, "BOTTOM_ALIGNMENT"), 0.015);
assertEquals(1, getFieldValue(gameElementPanel2, "WIDTH"));
assertEquals(2, getFieldValue(gameElementPanel2, "HEIGHT"));
assertEquals(-1, getFieldValue(gameElementPanel2, "UNDEFINED_CONDITION"));
assertEquals(16, getFieldValue(gameElementPanel2, "FRAMEBITS"));
assertEquals(0, getFieldValue(gameElementPanel2, "WHEN_FOCUSED"));
assertEquals(1, getFieldValue(gameElementPanel2, "WHEN_ANCESTOR_OF_FOCUSED_COMPONENT"));
assertEquals(0.0, (float) getFieldValue(gameElementPanel2, "LEFT_ALIGNMENT"), 0.015);
assertEquals(32, getFieldValue(gameElementPanel2, "ALLBITS"));
assertEquals("ToolTipText", getFieldValue(gameElementPanel2, "TOOL_TIP_TEXT_KEY"));
assertEquals(1.0, (float) getFieldValue(gameElementPanel2, "RIGHT_ALIGNMENT"), 0.015);
assertEquals(0.0, (float) getFieldValue(gameElementPanel2, "TOP_ALIGNMENT"), 0.015);
assertEquals(64, getFieldValue(gameElementPanel2, "ERROR"));
assertEquals(2, getFieldValue(gameElementPanel2, "WHEN_IN_FOCUSED_WINDOW"));

	}

	@Test
	public void test_GameElementPanel_1() throws Throwable {
		Game.Mino mino1 = new Game.Mino((-516));
Game.GameElementPanel gameElementPanel2 = new Game.GameElementPanel(mino1);
assertEquals(128, getFieldValue(gameElementPanel2, "ABORT"));
assertEquals(0.5, (float) getFieldValue(gameElementPanel2, "CENTER_ALIGNMENT"), 0.015);
assertEquals(4, getFieldValue(gameElementPanel2, "PROPERTIES"));
assertEquals(8, getFieldValue(gameElementPanel2, "SOMEBITS"));
assertEquals(1.0, (float) getFieldValue(gameElementPanel2, "BOTTOM_ALIGNMENT"), 0.015);
assertEquals(1, getFieldValue(gameElementPanel2, "WIDTH"));
assertEquals(2, getFieldValue(gameElementPanel2, "HEIGHT"));
assertEquals(-1, getFieldValue(gameElementPanel2, "UNDEFINED_CONDITION"));
assertEquals(16, getFieldValue(gameElementPanel2, "FRAMEBITS"));
assertEquals(0, getFieldValue(gameElementPanel2, "WHEN_FOCUSED"));
assertEquals(1, getFieldValue(gameElementPanel2, "WHEN_ANCESTOR_OF_FOCUSED_COMPONENT"));
assertEquals(0.0, (float) getFieldValue(gameElementPanel2, "LEFT_ALIGNMENT"), 0.015);
assertEquals(32, getFieldValue(gameElementPanel2, "ALLBITS"));
assertEquals("ToolTipText", getFieldValue(gameElementPanel2, "TOOL_TIP_TEXT_KEY"));
assertEquals(1.0, (float) getFieldValue(gameElementPanel2, "RIGHT_ALIGNMENT"), 0.015);
assertEquals(0.0, (float) getFieldValue(gameElementPanel2, "TOP_ALIGNMENT"), 0.015);
assertEquals(64, getFieldValue(gameElementPanel2, "ERROR"));
assertEquals(2, getFieldValue(gameElementPanel2, "WHEN_IN_FOCUSED_WINDOW"));

	}

	@Test
	public void test_GameElementPanel_2() throws Throwable {
		Game.Mino mino1 = new Game.Mino((-516));
Game.Mino mino3 = new Game.Mino(4);
Game.Ghost ghost4 = new Game.Ghost(mino3);
Game.GameElementPanel gameElementPanel5 = new Game.GameElementPanel((Game.Mino)ghost4);
assertEquals(128, getFieldValue(gameElementPanel5, "ABORT"));
assertEquals(0.5, (float) getFieldValue(gameElementPanel5, "CENTER_ALIGNMENT"), 0.015);
assertEquals(4, getFieldValue(gameElementPanel5, "PROPERTIES"));
assertEquals(8, getFieldValue(gameElementPanel5, "SOMEBITS"));
assertEquals(1.0, (float) getFieldValue(gameElementPanel5, "BOTTOM_ALIGNMENT"), 0.015);
assertEquals(1, getFieldValue(gameElementPanel5, "WIDTH"));
assertEquals(2, getFieldValue(gameElementPanel5, "HEIGHT"));
assertEquals(-1, getFieldValue(gameElementPanel5, "UNDEFINED_CONDITION"));
assertEquals(16, getFieldValue(gameElementPanel5, "FRAMEBITS"));
assertEquals(0, getFieldValue(gameElementPanel5, "WHEN_FOCUSED"));
assertEquals(1, getFieldValue(gameElementPanel5, "WHEN_ANCESTOR_OF_FOCUSED_COMPONENT"));
assertEquals(0.0, (float) getFieldValue(gameElementPanel5, "LEFT_ALIGNMENT"), 0.015);
assertEquals(32, getFieldValue(gameElementPanel5, "ALLBITS"));
assertEquals("ToolTipText", getFieldValue(gameElementPanel5, "TOOL_TIP_TEXT_KEY"));
assertEquals(1.0, (float) getFieldValue(gameElementPanel5, "RIGHT_ALIGNMENT"), 0.015);
assertEquals(0.0, (float) getFieldValue(gameElementPanel5, "TOP_ALIGNMENT"), 0.015);
assertEquals(64, getFieldValue(gameElementPanel5, "ERROR"));
assertEquals(2, getFieldValue(gameElementPanel5, "WHEN_IN_FOCUSED_WINDOW"));

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
