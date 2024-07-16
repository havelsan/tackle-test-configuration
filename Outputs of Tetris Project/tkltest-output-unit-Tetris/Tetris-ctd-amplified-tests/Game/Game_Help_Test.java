package Game;

import static org.junit.Assert.assertNull;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoRunner;
import org.junit.runner.RunWith;
import org.junit.Test;
import Game.Help;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Game_Help_Test {
	@Test
	public void test_getImg_0() throws Throwable {
		Game.Help help0 = new Game.Help();
java.awt.Image image2 = help0.getImg("Game.Score");
assertEquals(128, getFieldValue(help0, "ABORT"));
assertEquals(0.5, (float) getFieldValue(help0, "CENTER_ALIGNMENT"), 0.015);
assertEquals(4, getFieldValue(help0, "PROPERTIES"));
assertEquals(8, getFieldValue(help0, "SOMEBITS"));
assertEquals(1.0, (float) getFieldValue(help0, "BOTTOM_ALIGNMENT"), 0.015);
assertEquals(1, getFieldValue(help0, "WIDTH"));
assertEquals(2, getFieldValue(help0, "HEIGHT"));
assertEquals(-1, getFieldValue(help0, "UNDEFINED_CONDITION"));
assertEquals(16, getFieldValue(help0, "FRAMEBITS"));
assertEquals(0, getFieldValue(help0, "WHEN_FOCUSED"));
assertEquals(1, getFieldValue(help0, "WHEN_ANCESTOR_OF_FOCUSED_COMPONENT"));
assertEquals(0.0, (float) getFieldValue(help0, "LEFT_ALIGNMENT"), 0.015);
assertEquals(32, getFieldValue(help0, "ALLBITS"));
assertEquals("ToolTipText", getFieldValue(help0, "TOOL_TIP_TEXT_KEY"));
assertEquals(1.0, (float) getFieldValue(help0, "RIGHT_ALIGNMENT"), 0.015);
assertEquals(0.0, (float) getFieldValue(help0, "TOP_ALIGNMENT"), 0.015);
assertEquals(64, getFieldValue(help0, "ERROR"));
assertEquals(2, getFieldValue(help0, "WHEN_IN_FOCUSED_WINDOW"));
assertEquals(0, ((Game.Help) help0).getX());

	}

	@Test
	public void test_getImg_1() throws Throwable {
		Game.Help help0 = new Game.Help();
javax.swing.ImageIcon imageIcon4 = help0.getImg("Game.Score", 3, 3);
assertEquals(128, getFieldValue(help0, "ABORT"));
assertEquals(0.5, (float) getFieldValue(help0, "CENTER_ALIGNMENT"), 0.015);
assertEquals(4, getFieldValue(help0, "PROPERTIES"));
assertEquals(8, getFieldValue(help0, "SOMEBITS"));
assertEquals(1.0, (float) getFieldValue(help0, "BOTTOM_ALIGNMENT"), 0.015);
assertEquals(1, getFieldValue(help0, "WIDTH"));
assertEquals(2, getFieldValue(help0, "HEIGHT"));
assertEquals(-1, getFieldValue(help0, "UNDEFINED_CONDITION"));
assertEquals(16, getFieldValue(help0, "FRAMEBITS"));
assertEquals(0, getFieldValue(help0, "WHEN_FOCUSED"));
assertEquals(1, getFieldValue(help0, "WHEN_ANCESTOR_OF_FOCUSED_COMPONENT"));
assertEquals(0.0, (float) getFieldValue(help0, "LEFT_ALIGNMENT"), 0.015);
assertEquals(32, getFieldValue(help0, "ALLBITS"));
assertEquals("ToolTipText", getFieldValue(help0, "TOOL_TIP_TEXT_KEY"));
assertEquals(1.0, (float) getFieldValue(help0, "RIGHT_ALIGNMENT"), 0.015);
assertEquals(0.0, (float) getFieldValue(help0, "TOP_ALIGNMENT"), 0.015);
assertEquals(64, getFieldValue(help0, "ERROR"));
assertEquals(2, getFieldValue(help0, "WHEN_IN_FOCUSED_WINDOW"));
assertEquals(0, ((Game.Help) help0).getX());

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
