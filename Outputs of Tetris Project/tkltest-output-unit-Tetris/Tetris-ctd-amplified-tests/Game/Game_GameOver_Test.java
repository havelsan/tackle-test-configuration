package Game;

import java.awt.Color;
import Game.GameOver;
import static org.junit.Assert.assertNull;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoRunner;
import java.awt.Graphics;
import org.junit.runner.RunWith;
import static org.evosuite.runtime.EvoAssertions.*;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Game_GameOver_Test {
	@Test
	public void test_getImg_0() throws Throwable {
		Game.GameOver gameOver10 = new Game.GameOver(148, 148, 662, 148, 1019, 1019, 662, (-2041), 662, 148);
assertEquals(128, getFieldValue(gameOver10, "ABORT"));
assertEquals(0.5, (float) getFieldValue(gameOver10, "CENTER_ALIGNMENT"), 0.015);
assertEquals(4, getFieldValue(gameOver10, "PROPERTIES"));
assertEquals(8, getFieldValue(gameOver10, "SOMEBITS"));
assertEquals(1.0, (float) getFieldValue(gameOver10, "BOTTOM_ALIGNMENT"), 0.015);
assertEquals(1, getFieldValue(gameOver10, "WIDTH"));
assertEquals(2, getFieldValue(gameOver10, "HEIGHT"));
assertEquals(-1, getFieldValue(gameOver10, "UNDEFINED_CONDITION"));
assertEquals(16, getFieldValue(gameOver10, "FRAMEBITS"));
assertEquals(0, getFieldValue(gameOver10, "WHEN_FOCUSED"));
assertEquals(1, getFieldValue(gameOver10, "WHEN_ANCESTOR_OF_FOCUSED_COMPONENT"));
assertEquals(0.0, (float) getFieldValue(gameOver10, "LEFT_ALIGNMENT"), 0.015);
assertEquals(32, getFieldValue(gameOver10, "ALLBITS"));
assertEquals("ToolTipText", getFieldValue(gameOver10, "TOOL_TIP_TEXT_KEY"));
assertEquals(1.0, (float) getFieldValue(gameOver10, "RIGHT_ALIGNMENT"), 0.015);
assertEquals(0.0, (float) getFieldValue(gameOver10, "TOP_ALIGNMENT"), 0.015);
assertEquals(64, getFieldValue(gameOver10, "ERROR"));
assertEquals(2, getFieldValue(gameOver10, "WHEN_IN_FOCUSED_WINDOW"));
java.awt.Image image12 = gameOver10.getImg("Game.Score");
assertEquals(128, getFieldValue(gameOver10, "ABORT"));
assertEquals(0.5, (float) getFieldValue(gameOver10, "CENTER_ALIGNMENT"), 0.015);
assertEquals(4, getFieldValue(gameOver10, "PROPERTIES"));
assertEquals(8, getFieldValue(gameOver10, "SOMEBITS"));
assertEquals(1.0, (float) getFieldValue(gameOver10, "BOTTOM_ALIGNMENT"), 0.015);
assertEquals(1, getFieldValue(gameOver10, "WIDTH"));
assertEquals(2, getFieldValue(gameOver10, "HEIGHT"));
assertEquals(-1, getFieldValue(gameOver10, "UNDEFINED_CONDITION"));
assertEquals(16, getFieldValue(gameOver10, "FRAMEBITS"));
assertEquals(0, getFieldValue(gameOver10, "WHEN_FOCUSED"));
assertEquals(1, getFieldValue(gameOver10, "WHEN_ANCESTOR_OF_FOCUSED_COMPONENT"));
assertEquals(0.0, (float) getFieldValue(gameOver10, "LEFT_ALIGNMENT"), 0.015);
assertEquals(32, getFieldValue(gameOver10, "ALLBITS"));
assertEquals("ToolTipText", getFieldValue(gameOver10, "TOOL_TIP_TEXT_KEY"));
assertEquals(1.0, (float) getFieldValue(gameOver10, "RIGHT_ALIGNMENT"), 0.015);
assertEquals(0.0, (float) getFieldValue(gameOver10, "TOP_ALIGNMENT"), 0.015);
assertEquals(64, getFieldValue(gameOver10, "ERROR"));
assertEquals(2, getFieldValue(gameOver10, "WHEN_IN_FOCUSED_WINDOW"));

	}

	@Test
	public void test_GameOver_0() throws Throwable {
		Game.GameOver gameOver10 = new Game.GameOver(148, 148, 662, 148, 1019, 1019, 662, (-2041), 662, 148);
assertEquals(128, getFieldValue(gameOver10, "ABORT"));
assertEquals(0.5, (float) getFieldValue(gameOver10, "CENTER_ALIGNMENT"), 0.015);
assertEquals(4, getFieldValue(gameOver10, "PROPERTIES"));
assertEquals(8, getFieldValue(gameOver10, "SOMEBITS"));
assertEquals(1.0, (float) getFieldValue(gameOver10, "BOTTOM_ALIGNMENT"), 0.015);
assertEquals(1, getFieldValue(gameOver10, "WIDTH"));
assertEquals(2, getFieldValue(gameOver10, "HEIGHT"));
assertEquals(-1, getFieldValue(gameOver10, "UNDEFINED_CONDITION"));
assertEquals(16, getFieldValue(gameOver10, "FRAMEBITS"));
assertEquals(0, getFieldValue(gameOver10, "WHEN_FOCUSED"));
assertEquals(1, getFieldValue(gameOver10, "WHEN_ANCESTOR_OF_FOCUSED_COMPONENT"));
assertEquals(0.0, (float) getFieldValue(gameOver10, "LEFT_ALIGNMENT"), 0.015);
assertEquals(32, getFieldValue(gameOver10, "ALLBITS"));
assertEquals("ToolTipText", getFieldValue(gameOver10, "TOOL_TIP_TEXT_KEY"));
assertEquals(1.0, (float) getFieldValue(gameOver10, "RIGHT_ALIGNMENT"), 0.015);
assertEquals(0.0, (float) getFieldValue(gameOver10, "TOP_ALIGNMENT"), 0.015);
assertEquals(64, getFieldValue(gameOver10, "ERROR"));
assertEquals(2, getFieldValue(gameOver10, "WHEN_IN_FOCUSED_WINDOW"));

	}

	@Test
	public void test_getImg_1() throws Throwable {
		Game.GameOver gameOver10 = new Game.GameOver(148, 148, 662, 148, 1019, 1019, 662, (-2041), 662, 148);
assertEquals(128, getFieldValue(gameOver10, "ABORT"));
assertEquals(0.5, (float) getFieldValue(gameOver10, "CENTER_ALIGNMENT"), 0.015);
assertEquals(4, getFieldValue(gameOver10, "PROPERTIES"));
assertEquals(8, getFieldValue(gameOver10, "SOMEBITS"));
assertEquals(1.0, (float) getFieldValue(gameOver10, "BOTTOM_ALIGNMENT"), 0.015);
assertEquals(1, getFieldValue(gameOver10, "WIDTH"));
assertEquals(2, getFieldValue(gameOver10, "HEIGHT"));
assertEquals(-1, getFieldValue(gameOver10, "UNDEFINED_CONDITION"));
assertEquals(16, getFieldValue(gameOver10, "FRAMEBITS"));
assertEquals(0, getFieldValue(gameOver10, "WHEN_FOCUSED"));
assertEquals(1, getFieldValue(gameOver10, "WHEN_ANCESTOR_OF_FOCUSED_COMPONENT"));
assertEquals(0.0, (float) getFieldValue(gameOver10, "LEFT_ALIGNMENT"), 0.015);
assertEquals(32, getFieldValue(gameOver10, "ALLBITS"));
assertEquals("ToolTipText", getFieldValue(gameOver10, "TOOL_TIP_TEXT_KEY"));
assertEquals(1.0, (float) getFieldValue(gameOver10, "RIGHT_ALIGNMENT"), 0.015);
assertEquals(0.0, (float) getFieldValue(gameOver10, "TOP_ALIGNMENT"), 0.015);
assertEquals(64, getFieldValue(gameOver10, "ERROR"));
assertEquals(2, getFieldValue(gameOver10, "WHEN_IN_FOCUSED_WINDOW"));
javax.swing.ImageIcon imageIcon14 = gameOver10.getImg("Game.Score", 3, 3);
assertEquals(128, getFieldValue(gameOver10, "ABORT"));
assertEquals(0.5, (float) getFieldValue(gameOver10, "CENTER_ALIGNMENT"), 0.015);
assertEquals(4, getFieldValue(gameOver10, "PROPERTIES"));
assertEquals(8, getFieldValue(gameOver10, "SOMEBITS"));
assertEquals(1.0, (float) getFieldValue(gameOver10, "BOTTOM_ALIGNMENT"), 0.015);
assertEquals(1, getFieldValue(gameOver10, "WIDTH"));
assertEquals(2, getFieldValue(gameOver10, "HEIGHT"));
assertEquals(-1, getFieldValue(gameOver10, "UNDEFINED_CONDITION"));
assertEquals(16, getFieldValue(gameOver10, "FRAMEBITS"));
assertEquals(0, getFieldValue(gameOver10, "WHEN_FOCUSED"));
assertEquals(1, getFieldValue(gameOver10, "WHEN_ANCESTOR_OF_FOCUSED_COMPONENT"));
assertEquals(0.0, (float) getFieldValue(gameOver10, "LEFT_ALIGNMENT"), 0.015);
assertEquals(32, getFieldValue(gameOver10, "ALLBITS"));
assertEquals("ToolTipText", getFieldValue(gameOver10, "TOOL_TIP_TEXT_KEY"));
assertEquals(1.0, (float) getFieldValue(gameOver10, "RIGHT_ALIGNMENT"), 0.015);
assertEquals(0.0, (float) getFieldValue(gameOver10, "TOP_ALIGNMENT"), 0.015);
assertEquals(64, getFieldValue(gameOver10, "ERROR"));
assertEquals(2, getFieldValue(gameOver10, "WHEN_IN_FOCUSED_WINDOW"));

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
