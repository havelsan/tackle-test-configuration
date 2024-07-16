package Game;

import java.awt.Color;
import static org.junit.Assert.assertNull;
import org.junit.runner.RunWith;
import static org.evosuite.runtime.EvoAssertions.*;
import org.junit.Test;
import java.awt.Point;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoRunner;
import java.awt.Graphics;
import static org.junit.Assert.assertEquals;
import Game.MatrixElement;
import java.awt.SystemColor;
import static org.junit.Assert.fail;

public class Game_MatrixElement_Test {
	@Test
	public void test_MatrixElement_0() throws Throwable {
		java.awt.SystemColor systemColor0 = java.awt.SystemColor.menuText;
assertEquals(22, getFieldValue(systemColor0, "CONTROL_DK_SHADOW"));
assertEquals(3, getFieldValue(systemColor0, "ACTIVE_CAPTION_BORDER"));
assertEquals(4, getFieldValue(systemColor0, "INACTIVE_CAPTION"));
assertEquals(2, getFieldValue(systemColor0, "ACTIVE_CAPTION_TEXT"));
assertEquals(8, getFieldValue(systemColor0, "WINDOW_BORDER"));
assertEquals(1, getFieldValue(systemColor0, "ACTIVE_CAPTION"));
assertEquals(12, getFieldValue(systemColor0, "TEXT"));
assertEquals(18, getFieldValue(systemColor0, "CONTROL_TEXT"));
assertEquals(24, getFieldValue(systemColor0, "INFO"));
assertEquals(19, getFieldValue(systemColor0, "CONTROL_HIGHLIGHT"));
assertEquals(20, getFieldValue(systemColor0, "CONTROL_LT_HIGHLIGHT"));
assertEquals(3, getFieldValue(systemColor0, "TRANSLUCENT"));
assertEquals(11, getFieldValue(systemColor0, "MENU_TEXT"));
assertEquals(25, getFieldValue(systemColor0, "INFO_TEXT"));
assertEquals(5, getFieldValue(systemColor0, "INACTIVE_CAPTION_TEXT"));
assertEquals(6, getFieldValue(systemColor0, "INACTIVE_CAPTION_BORDER"));
assertEquals(0, getFieldValue(systemColor0, "DESKTOP"));
assertEquals(21, getFieldValue(systemColor0, "CONTROL_SHADOW"));
assertEquals(2, getFieldValue(systemColor0, "BITMASK"));
assertEquals(9, getFieldValue(systemColor0, "WINDOW_TEXT"));
assertEquals(7, getFieldValue(systemColor0, "WINDOW"));
assertEquals(16, getFieldValue(systemColor0, "TEXT_INACTIVE_TEXT"));
assertEquals(15, getFieldValue(systemColor0, "TEXT_HIGHLIGHT_TEXT"));
assertEquals(14, getFieldValue(systemColor0, "TEXT_HIGHLIGHT"));
assertEquals(1, getFieldValue(systemColor0, "OPAQUE"));
assertEquals(23, getFieldValue(systemColor0, "SCROLLBAR"));
assertEquals(10, getFieldValue(systemColor0, "MENU"));
assertEquals(26, getFieldValue(systemColor0, "NUM_COLORS"));
assertEquals(13, getFieldValue(systemColor0, "TEXT_TEXT"));
assertEquals(17, getFieldValue(systemColor0, "CONTROL"));
java.awt.Point point1 = null;
Game.MatrixElement matrixElement2 = new Game.MatrixElement((java.awt.Color)systemColor0, point1);

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
