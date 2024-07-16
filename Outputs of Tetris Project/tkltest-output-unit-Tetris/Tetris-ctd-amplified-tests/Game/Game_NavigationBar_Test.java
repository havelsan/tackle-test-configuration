package Game;

import javax.swing.JButton;
import static org.junit.Assert.assertNull;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoRunner;
import org.junit.runner.RunWith;
import static org.evosuite.runtime.EvoAssertions.*;
import org.junit.Test;
import static org.junit.Assert.*;
import Game.NavigationBar;
import static org.junit.Assert.assertEquals;
import java.awt.event.ActionEvent;
import static org.junit.Assert.fail;

public class Game_NavigationBar_Test {
	@Test
	public void test_getImg_0() throws Throwable {
		Game.NavigationBar navigationBar0 = new Game.NavigationBar();
java.awt.Image image2 = navigationBar0.getImg("Game.Score");
assertEquals(128, getFieldValue(navigationBar0, "ABORT"));
assertEquals(0.5, (float) getFieldValue(navigationBar0, "CENTER_ALIGNMENT"), 0.015);
assertEquals(4, getFieldValue(navigationBar0, "PROPERTIES"));
assertEquals(8, getFieldValue(navigationBar0, "SOMEBITS"));
assertEquals(1.0, (float) getFieldValue(navigationBar0, "BOTTOM_ALIGNMENT"), 0.015);
assertEquals(1, getFieldValue(navigationBar0, "WIDTH"));
assertEquals(2, getFieldValue(navigationBar0, "HEIGHT"));
assertEquals(-1, getFieldValue(navigationBar0, "UNDEFINED_CONDITION"));
assertEquals(16, getFieldValue(navigationBar0, "FRAMEBITS"));
assertEquals(false, getFieldValue(navigationBar0, "musicIsOn"));
assertEquals(0, getFieldValue(navigationBar0, "WHEN_FOCUSED"));
assertEquals(1, getFieldValue(navigationBar0, "WHEN_ANCESTOR_OF_FOCUSED_COMPONENT"));
assertEquals(0.0, (float) getFieldValue(navigationBar0, "LEFT_ALIGNMENT"), 0.015);
assertEquals(32, getFieldValue(navigationBar0, "ALLBITS"));
assertEquals("ToolTipText", getFieldValue(navigationBar0, "TOOL_TIP_TEXT_KEY"));
assertEquals(1.0, (float) getFieldValue(navigationBar0, "RIGHT_ALIGNMENT"), 0.015);
assertEquals(0.0, (float) getFieldValue(navigationBar0, "TOP_ALIGNMENT"), 0.015);
assertEquals(64, getFieldValue(navigationBar0, "ERROR"));
assertEquals(2, getFieldValue(navigationBar0, "WHEN_IN_FOCUSED_WINDOW"));

	}

	@Test
	public void test_actionPerformed_0() throws Throwable {
		Game.NavigationBar navigationBar0 = new Game.NavigationBar();
java.awt.event.ActionEvent actionEvent4 = new java.awt.event.ActionEvent((java.lang.Object)navigationBar0, 0, "x.#Dbfq~}_jJ8w2S#", 0);
assertEquals(256L, getFieldValue(actionEvent4, "ADJUSTMENT_EVENT_MASK"));
assertEquals(16L, getFieldValue(actionEvent4, "MOUSE_EVENT_MASK"));
assertEquals(1L, getFieldValue(actionEvent4, "COMPONENT_EVENT_MASK"));
assertEquals(8192L, getFieldValue(actionEvent4, "PAINT_EVENT_MASK"));
assertEquals(1, getFieldValue(actionEvent4, "SHIFT_MASK"));
assertEquals(1001, getFieldValue(actionEvent4, "ACTION_LAST"));
assertEquals(2048L, getFieldValue(actionEvent4, "INPUT_METHOD_EVENT_MASK"));
assertEquals(65536L, getFieldValue(actionEvent4, "HIERARCHY_BOUNDS_EVENT_MASK"));
assertEquals(1001, getFieldValue(actionEvent4, "ACTION_FIRST"));
assertEquals(4L, getFieldValue(actionEvent4, "FOCUS_EVENT_MASK"));
assertEquals(16384L, getFieldValue(actionEvent4, "INVOCATION_EVENT_MASK"));
assertEquals(8L, getFieldValue(actionEvent4, "KEY_EVENT_MASK"));
assertEquals(1999, getFieldValue(actionEvent4, "RESERVED_ID_MAX"));
assertEquals(2L, getFieldValue(actionEvent4, "CONTAINER_EVENT_MASK"));
assertEquals(64L, getFieldValue(actionEvent4, "WINDOW_EVENT_MASK"));
assertEquals(2, getFieldValue(actionEvent4, "CTRL_MASK"));
assertEquals(8, getFieldValue(actionEvent4, "ALT_MASK"));
assertEquals(131072L, getFieldValue(actionEvent4, "MOUSE_WHEEL_EVENT_MASK"));
assertEquals(32L, getFieldValue(actionEvent4, "MOUSE_MOTION_EVENT_MASK"));
assertEquals(524288L, getFieldValue(actionEvent4, "WINDOW_FOCUS_EVENT_MASK"));
assertEquals(1024L, getFieldValue(actionEvent4, "TEXT_EVENT_MASK"));
assertEquals(128L, getFieldValue(actionEvent4, "ACTION_EVENT_MASK"));
assertEquals(512L, getFieldValue(actionEvent4, "ITEM_EVENT_MASK"));
assertEquals(1001, getFieldValue(actionEvent4, "ACTION_PERFORMED"));
assertEquals(32768L, getFieldValue(actionEvent4, "HIERARCHY_EVENT_MASK"));
assertEquals(262144L, getFieldValue(actionEvent4, "WINDOW_STATE_EVENT_MASK"));
assertEquals(4, getFieldValue(actionEvent4, "META_MASK"));
assertEquals(0L, ((java.awt.event.ActionEvent) actionEvent4).getWhen());
assertEquals("x.#Dbfq~}_jJ8w2S#", ((java.awt.event.ActionEvent) actionEvent4).getActionCommand());
assertEquals(0, ((java.awt.event.ActionEvent) actionEvent4).getModifiers());
navigationBar0.actionPerformed(actionEvent4);
assertEquals(128, getFieldValue(navigationBar0, "ABORT"));
assertEquals(0.5, (float) getFieldValue(navigationBar0, "CENTER_ALIGNMENT"), 0.015);
assertEquals(4, getFieldValue(navigationBar0, "PROPERTIES"));
assertEquals(8, getFieldValue(navigationBar0, "SOMEBITS"));
assertEquals(1.0, (float) getFieldValue(navigationBar0, "BOTTOM_ALIGNMENT"), 0.015);
assertEquals(1, getFieldValue(navigationBar0, "WIDTH"));
assertEquals(2, getFieldValue(navigationBar0, "HEIGHT"));
assertEquals(-1, getFieldValue(navigationBar0, "UNDEFINED_CONDITION"));
assertEquals(16, getFieldValue(navigationBar0, "FRAMEBITS"));
assertEquals(false, getFieldValue(navigationBar0, "musicIsOn"));
assertEquals(0, getFieldValue(navigationBar0, "WHEN_FOCUSED"));
assertEquals(1, getFieldValue(navigationBar0, "WHEN_ANCESTOR_OF_FOCUSED_COMPONENT"));
assertEquals(0.0, (float) getFieldValue(navigationBar0, "LEFT_ALIGNMENT"), 0.015);
assertEquals(32, getFieldValue(navigationBar0, "ALLBITS"));
assertEquals("ToolTipText", getFieldValue(navigationBar0, "TOOL_TIP_TEXT_KEY"));
assertEquals(1.0, (float) getFieldValue(navigationBar0, "RIGHT_ALIGNMENT"), 0.015);
assertEquals(0.0, (float) getFieldValue(navigationBar0, "TOP_ALIGNMENT"), 0.015);
assertEquals(64, getFieldValue(navigationBar0, "ERROR"));
assertEquals(2, getFieldValue(navigationBar0, "WHEN_IN_FOCUSED_WINDOW"));

	}

	@Test
	public void test_getImg_1() throws Throwable {
		Game.NavigationBar navigationBar0 = new Game.NavigationBar();
javax.swing.ImageIcon imageIcon4 = navigationBar0.getImg("Game.Score", 3, 3);
assertEquals(128, getFieldValue(navigationBar0, "ABORT"));
assertEquals(0.5, (float) getFieldValue(navigationBar0, "CENTER_ALIGNMENT"), 0.015);
assertEquals(4, getFieldValue(navigationBar0, "PROPERTIES"));
assertEquals(8, getFieldValue(navigationBar0, "SOMEBITS"));
assertEquals(1.0, (float) getFieldValue(navigationBar0, "BOTTOM_ALIGNMENT"), 0.015);
assertEquals(1, getFieldValue(navigationBar0, "WIDTH"));
assertEquals(2, getFieldValue(navigationBar0, "HEIGHT"));
assertEquals(-1, getFieldValue(navigationBar0, "UNDEFINED_CONDITION"));
assertEquals(16, getFieldValue(navigationBar0, "FRAMEBITS"));
assertEquals(false, getFieldValue(navigationBar0, "musicIsOn"));
assertEquals(0, getFieldValue(navigationBar0, "WHEN_FOCUSED"));
assertEquals(1, getFieldValue(navigationBar0, "WHEN_ANCESTOR_OF_FOCUSED_COMPONENT"));
assertEquals(0.0, (float) getFieldValue(navigationBar0, "LEFT_ALIGNMENT"), 0.015);
assertEquals(32, getFieldValue(navigationBar0, "ALLBITS"));
assertEquals("ToolTipText", getFieldValue(navigationBar0, "TOOL_TIP_TEXT_KEY"));
assertEquals(1.0, (float) getFieldValue(navigationBar0, "RIGHT_ALIGNMENT"), 0.015);
assertEquals(0.0, (float) getFieldValue(navigationBar0, "TOP_ALIGNMENT"), 0.015);
assertEquals(64, getFieldValue(navigationBar0, "ERROR"));
assertEquals(2, getFieldValue(navigationBar0, "WHEN_IN_FOCUSED_WINDOW"));

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
