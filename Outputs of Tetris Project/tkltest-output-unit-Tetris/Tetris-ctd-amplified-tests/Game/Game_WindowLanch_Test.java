package Game;

import static org.junit.Assert.assertNull;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoRunner;
import Game.WindowLanch;
import java.awt.Graphics;
import org.junit.runner.RunWith;
import static org.evosuite.runtime.EvoAssertions.*;
import org.junit.Test;
import java.awt.HeadlessException;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import javax.swing.JFrame;
import static org.junit.Assert.fail;

public class Game_WindowLanch_Test {
	@Test
	public void test_getImg_0() throws Throwable {
		Game.WindowLanch windowLanch1 = new Game.WindowLanch(550);
assertEquals(128, getFieldValue(windowLanch1, "ABORT"));
assertEquals(0.5, (float) getFieldValue(windowLanch1, "CENTER_ALIGNMENT"), 0.015);
assertEquals(4, getFieldValue(windowLanch1, "PROPERTIES"));
assertEquals(8, getFieldValue(windowLanch1, "SOMEBITS"));
assertEquals(1.0, (float) getFieldValue(windowLanch1, "BOTTOM_ALIGNMENT"), 0.015);
assertEquals(1, getFieldValue(windowLanch1, "WIDTH"));
assertEquals(2, getFieldValue(windowLanch1, "HEIGHT"));
assertEquals(-1, getFieldValue(windowLanch1, "UNDEFINED_CONDITION"));
assertEquals(16, getFieldValue(windowLanch1, "FRAMEBITS"));
assertEquals(0, getFieldValue(windowLanch1, "WHEN_FOCUSED"));
assertEquals(1, getFieldValue(windowLanch1, "WHEN_ANCESTOR_OF_FOCUSED_COMPONENT"));
assertEquals(0.0, (float) getFieldValue(windowLanch1, "LEFT_ALIGNMENT"), 0.015);
assertEquals(32, getFieldValue(windowLanch1, "ALLBITS"));
assertEquals("ToolTipText", getFieldValue(windowLanch1, "TOOL_TIP_TEXT_KEY"));
assertEquals(1.0, (float) getFieldValue(windowLanch1, "RIGHT_ALIGNMENT"), 0.015);
assertEquals(0.0, (float) getFieldValue(windowLanch1, "TOP_ALIGNMENT"), 0.015);
assertEquals(64, getFieldValue(windowLanch1, "ERROR"));
assertEquals(2, getFieldValue(windowLanch1, "WHEN_IN_FOCUSED_WINDOW"));
assertEquals(0, ((Game.WindowLanch) windowLanch1).getHeight());
assertEquals(0, ((Game.WindowLanch) windowLanch1).getWidth());
java.awt.Image image3 = windowLanch1.getImg("Game.Score");
assertEquals(128, getFieldValue(windowLanch1, "ABORT"));
assertEquals(0.5, (float) getFieldValue(windowLanch1, "CENTER_ALIGNMENT"), 0.015);
assertEquals(4, getFieldValue(windowLanch1, "PROPERTIES"));
assertEquals(8, getFieldValue(windowLanch1, "SOMEBITS"));
assertEquals(1.0, (float) getFieldValue(windowLanch1, "BOTTOM_ALIGNMENT"), 0.015);
assertEquals(1, getFieldValue(windowLanch1, "WIDTH"));
assertEquals(2, getFieldValue(windowLanch1, "HEIGHT"));
assertEquals(-1, getFieldValue(windowLanch1, "UNDEFINED_CONDITION"));
assertEquals(16, getFieldValue(windowLanch1, "FRAMEBITS"));
assertEquals(0, getFieldValue(windowLanch1, "WHEN_FOCUSED"));
assertEquals(1, getFieldValue(windowLanch1, "WHEN_ANCESTOR_OF_FOCUSED_COMPONENT"));
assertEquals(0.0, (float) getFieldValue(windowLanch1, "LEFT_ALIGNMENT"), 0.015);
assertEquals(32, getFieldValue(windowLanch1, "ALLBITS"));
assertEquals("ToolTipText", getFieldValue(windowLanch1, "TOOL_TIP_TEXT_KEY"));
assertEquals(1.0, (float) getFieldValue(windowLanch1, "RIGHT_ALIGNMENT"), 0.015);
assertEquals(0.0, (float) getFieldValue(windowLanch1, "TOP_ALIGNMENT"), 0.015);
assertEquals(64, getFieldValue(windowLanch1, "ERROR"));
assertEquals(2, getFieldValue(windowLanch1, "WHEN_IN_FOCUSED_WINDOW"));
assertEquals(0, ((Game.WindowLanch) windowLanch1).getHeight());
assertEquals(0, ((Game.WindowLanch) windowLanch1).getWidth());

	}

	@Test
	public void test_WindowLanch_0() throws Throwable {
		Game.WindowLanch windowLanch1 = new Game.WindowLanch(550);
assertEquals(128, getFieldValue(windowLanch1, "ABORT"));
assertEquals(0.5, (float) getFieldValue(windowLanch1, "CENTER_ALIGNMENT"), 0.015);
assertEquals(4, getFieldValue(windowLanch1, "PROPERTIES"));
assertEquals(8, getFieldValue(windowLanch1, "SOMEBITS"));
assertEquals(1.0, (float) getFieldValue(windowLanch1, "BOTTOM_ALIGNMENT"), 0.015);
assertEquals(1, getFieldValue(windowLanch1, "WIDTH"));
assertEquals(2, getFieldValue(windowLanch1, "HEIGHT"));
assertEquals(-1, getFieldValue(windowLanch1, "UNDEFINED_CONDITION"));
assertEquals(16, getFieldValue(windowLanch1, "FRAMEBITS"));
assertEquals(0, getFieldValue(windowLanch1, "WHEN_FOCUSED"));
assertEquals(1, getFieldValue(windowLanch1, "WHEN_ANCESTOR_OF_FOCUSED_COMPONENT"));
assertEquals(0.0, (float) getFieldValue(windowLanch1, "LEFT_ALIGNMENT"), 0.015);
assertEquals(32, getFieldValue(windowLanch1, "ALLBITS"));
assertEquals("ToolTipText", getFieldValue(windowLanch1, "TOOL_TIP_TEXT_KEY"));
assertEquals(1.0, (float) getFieldValue(windowLanch1, "RIGHT_ALIGNMENT"), 0.015);
assertEquals(0.0, (float) getFieldValue(windowLanch1, "TOP_ALIGNMENT"), 0.015);
assertEquals(64, getFieldValue(windowLanch1, "ERROR"));
assertEquals(2, getFieldValue(windowLanch1, "WHEN_IN_FOCUSED_WINDOW"));
assertEquals(0, ((Game.WindowLanch) windowLanch1).getHeight());
assertEquals(0, ((Game.WindowLanch) windowLanch1).getWidth());

	}

	@Test
	public void test_getImg_1() throws Throwable {
		Game.WindowLanch windowLanch1 = new Game.WindowLanch(550);
assertEquals(128, getFieldValue(windowLanch1, "ABORT"));
assertEquals(0.5, (float) getFieldValue(windowLanch1, "CENTER_ALIGNMENT"), 0.015);
assertEquals(4, getFieldValue(windowLanch1, "PROPERTIES"));
assertEquals(8, getFieldValue(windowLanch1, "SOMEBITS"));
assertEquals(1.0, (float) getFieldValue(windowLanch1, "BOTTOM_ALIGNMENT"), 0.015);
assertEquals(1, getFieldValue(windowLanch1, "WIDTH"));
assertEquals(2, getFieldValue(windowLanch1, "HEIGHT"));
assertEquals(-1, getFieldValue(windowLanch1, "UNDEFINED_CONDITION"));
assertEquals(16, getFieldValue(windowLanch1, "FRAMEBITS"));
assertEquals(0, getFieldValue(windowLanch1, "WHEN_FOCUSED"));
assertEquals(1, getFieldValue(windowLanch1, "WHEN_ANCESTOR_OF_FOCUSED_COMPONENT"));
assertEquals(0.0, (float) getFieldValue(windowLanch1, "LEFT_ALIGNMENT"), 0.015);
assertEquals(32, getFieldValue(windowLanch1, "ALLBITS"));
assertEquals("ToolTipText", getFieldValue(windowLanch1, "TOOL_TIP_TEXT_KEY"));
assertEquals(1.0, (float) getFieldValue(windowLanch1, "RIGHT_ALIGNMENT"), 0.015);
assertEquals(0.0, (float) getFieldValue(windowLanch1, "TOP_ALIGNMENT"), 0.015);
assertEquals(64, getFieldValue(windowLanch1, "ERROR"));
assertEquals(2, getFieldValue(windowLanch1, "WHEN_IN_FOCUSED_WINDOW"));
assertEquals(0, ((Game.WindowLanch) windowLanch1).getHeight());
assertEquals(0, ((Game.WindowLanch) windowLanch1).getWidth());
javax.swing.ImageIcon imageIcon5 = windowLanch1.getImg("Game.Score", 3, 3);
assertEquals(128, getFieldValue(windowLanch1, "ABORT"));
assertEquals(0.5, (float) getFieldValue(windowLanch1, "CENTER_ALIGNMENT"), 0.015);
assertEquals(4, getFieldValue(windowLanch1, "PROPERTIES"));
assertEquals(8, getFieldValue(windowLanch1, "SOMEBITS"));
assertEquals(1.0, (float) getFieldValue(windowLanch1, "BOTTOM_ALIGNMENT"), 0.015);
assertEquals(1, getFieldValue(windowLanch1, "WIDTH"));
assertEquals(2, getFieldValue(windowLanch1, "HEIGHT"));
assertEquals(-1, getFieldValue(windowLanch1, "UNDEFINED_CONDITION"));
assertEquals(16, getFieldValue(windowLanch1, "FRAMEBITS"));
assertEquals(0, getFieldValue(windowLanch1, "WHEN_FOCUSED"));
assertEquals(1, getFieldValue(windowLanch1, "WHEN_ANCESTOR_OF_FOCUSED_COMPONENT"));
assertEquals(0.0, (float) getFieldValue(windowLanch1, "LEFT_ALIGNMENT"), 0.015);
assertEquals(32, getFieldValue(windowLanch1, "ALLBITS"));
assertEquals("ToolTipText", getFieldValue(windowLanch1, "TOOL_TIP_TEXT_KEY"));
assertEquals(1.0, (float) getFieldValue(windowLanch1, "RIGHT_ALIGNMENT"), 0.015);
assertEquals(0.0, (float) getFieldValue(windowLanch1, "TOP_ALIGNMENT"), 0.015);
assertEquals(64, getFieldValue(windowLanch1, "ERROR"));
assertEquals(2, getFieldValue(windowLanch1, "WHEN_IN_FOCUSED_WINDOW"));
assertEquals(0, ((Game.WindowLanch) windowLanch1).getHeight());
assertEquals(0, ((Game.WindowLanch) windowLanch1).getWidth());

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
