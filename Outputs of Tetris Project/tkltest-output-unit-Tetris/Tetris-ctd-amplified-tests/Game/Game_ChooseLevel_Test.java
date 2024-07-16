package Game;

import javax.swing.JButton;
import static org.junit.Assert.assertNull;
import org.evosuite.runtime.EvoRunnerParameters;
import java.awt.Image;
import Game.ChooseLevel;
import org.evosuite.runtime.EvoRunner;
import javax.swing.DebugGraphics;
import org.junit.runner.RunWith;
import static org.evosuite.runtime.EvoAssertions.*;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Game_ChooseLevel_Test {
	@Test
	public void test_getImg_0() throws Throwable {
		Game.ChooseLevel chooseLevel0 = new Game.ChooseLevel();
java.awt.Image image2 = chooseLevel0.getImg("Game.Score");
assertEquals(128, getFieldValue(chooseLevel0, "ABORT"));
assertEquals(0.5, (float) getFieldValue(chooseLevel0, "CENTER_ALIGNMENT"), 0.015);
assertEquals(4, getFieldValue(chooseLevel0, "PROPERTIES"));
assertEquals(8, getFieldValue(chooseLevel0, "SOMEBITS"));
assertEquals(1.0, (float) getFieldValue(chooseLevel0, "BOTTOM_ALIGNMENT"), 0.015);
assertEquals(1, getFieldValue(chooseLevel0, "WIDTH"));
assertEquals(2, getFieldValue(chooseLevel0, "HEIGHT"));
assertEquals(-1, getFieldValue(chooseLevel0, "UNDEFINED_CONDITION"));
assertEquals(16, getFieldValue(chooseLevel0, "FRAMEBITS"));
assertEquals(0, getFieldValue(chooseLevel0, "WHEN_FOCUSED"));
assertEquals(1, getFieldValue(chooseLevel0, "WHEN_ANCESTOR_OF_FOCUSED_COMPONENT"));
assertEquals(0.0, (float) getFieldValue(chooseLevel0, "LEFT_ALIGNMENT"), 0.015);
assertEquals(32, getFieldValue(chooseLevel0, "ALLBITS"));
assertEquals("ToolTipText", getFieldValue(chooseLevel0, "TOOL_TIP_TEXT_KEY"));
assertEquals(1.0, (float) getFieldValue(chooseLevel0, "RIGHT_ALIGNMENT"), 0.015);
assertEquals(0.0, (float) getFieldValue(chooseLevel0, "TOP_ALIGNMENT"), 0.015);
assertEquals(64, getFieldValue(chooseLevel0, "ERROR"));
assertEquals(2, getFieldValue(chooseLevel0, "WHEN_IN_FOCUSED_WINDOW"));
assertEquals(0, ((Game.ChooseLevel) chooseLevel0).getId());

	}

	@Test
	public void test_getPanel_0() throws Throwable {
		Game.ChooseLevel chooseLevel0 = new Game.ChooseLevel();
chooseLevel0.getPanel(3);
assertEquals(128, getFieldValue(chooseLevel0, "ABORT"));
assertEquals(0.5, (float) getFieldValue(chooseLevel0, "CENTER_ALIGNMENT"), 0.015);
assertEquals(4, getFieldValue(chooseLevel0, "PROPERTIES"));
assertEquals(8, getFieldValue(chooseLevel0, "SOMEBITS"));
assertEquals(1.0, (float) getFieldValue(chooseLevel0, "BOTTOM_ALIGNMENT"), 0.015);
assertEquals(1, getFieldValue(chooseLevel0, "WIDTH"));
assertEquals(2, getFieldValue(chooseLevel0, "HEIGHT"));
assertEquals(-1, getFieldValue(chooseLevel0, "UNDEFINED_CONDITION"));
assertEquals(16, getFieldValue(chooseLevel0, "FRAMEBITS"));
assertEquals(0, getFieldValue(chooseLevel0, "WHEN_FOCUSED"));
assertEquals(1, getFieldValue(chooseLevel0, "WHEN_ANCESTOR_OF_FOCUSED_COMPONENT"));
assertEquals(0.0, (float) getFieldValue(chooseLevel0, "LEFT_ALIGNMENT"), 0.015);
assertEquals(32, getFieldValue(chooseLevel0, "ALLBITS"));
assertEquals("ToolTipText", getFieldValue(chooseLevel0, "TOOL_TIP_TEXT_KEY"));
assertEquals(1.0, (float) getFieldValue(chooseLevel0, "RIGHT_ALIGNMENT"), 0.015);
assertEquals(0.0, (float) getFieldValue(chooseLevel0, "TOP_ALIGNMENT"), 0.015);
assertEquals(64, getFieldValue(chooseLevel0, "ERROR"));
assertEquals(2, getFieldValue(chooseLevel0, "WHEN_IN_FOCUSED_WINDOW"));
assertEquals(0, ((Game.ChooseLevel) chooseLevel0).getId());

	}

	@Test
	public void test_setBackImage_0() throws Throwable {
		Game.ChooseLevel chooseLevel0 = new Game.ChooseLevel();
java.awt.image.BufferedImage bufferedImage4 = new java.awt.image.BufferedImage(3, 3, 3);
assertEquals(5, getFieldValue(bufferedImage4, "TYPE_3BYTE_BGR"));
assertEquals(8, getFieldValue(bufferedImage4, "TYPE_USHORT_565_RGB"));
assertEquals(3, getFieldValue(bufferedImage4, "TYPE_INT_ARGB_PRE"));
assertEquals(9, getFieldValue(bufferedImage4, "TYPE_USHORT_555_RGB"));
assertEquals(11, getFieldValue(bufferedImage4, "TYPE_USHORT_GRAY"));
assertEquals(2, getFieldValue(bufferedImage4, "BITMASK"));
assertEquals(2, getFieldValue(bufferedImage4, "SCALE_FAST"));
assertEquals(16, getFieldValue(bufferedImage4, "SCALE_AREA_AVERAGING"));
assertEquals(13, getFieldValue(bufferedImage4, "TYPE_BYTE_INDEXED"));
assertEquals(4, getFieldValue(bufferedImage4, "SCALE_SMOOTH"));
assertEquals(8, getFieldValue(bufferedImage4, "SCALE_REPLICATE"));
assertEquals(6, getFieldValue(bufferedImage4, "TYPE_4BYTE_ABGR"));
assertEquals(2, getFieldValue(bufferedImage4, "TYPE_INT_ARGB"));
assertEquals(1, getFieldValue(bufferedImage4, "OPAQUE"));
assertEquals(1, getFieldValue(bufferedImage4, "SCALE_DEFAULT"));
assertEquals(0, getFieldValue(bufferedImage4, "TYPE_CUSTOM"));
assertEquals(1, getFieldValue(bufferedImage4, "TYPE_INT_RGB"));
assertEquals(4, getFieldValue(bufferedImage4, "TYPE_INT_BGR"));
assertEquals(3, getFieldValue(bufferedImage4, "TRANSLUCENT"));
assertEquals(10, getFieldValue(bufferedImage4, "TYPE_BYTE_GRAY"));
assertEquals(7, getFieldValue(bufferedImage4, "TYPE_4BYTE_ABGR_PRE"));
assertEquals(12, getFieldValue(bufferedImage4, "TYPE_BYTE_BINARY"));
chooseLevel0.setBackImage((java.awt.Image)bufferedImage4);
assertEquals(128, getFieldValue(chooseLevel0, "ABORT"));
assertEquals(0.5, (float) getFieldValue(chooseLevel0, "CENTER_ALIGNMENT"), 0.015);
assertEquals(4, getFieldValue(chooseLevel0, "PROPERTIES"));
assertEquals(8, getFieldValue(chooseLevel0, "SOMEBITS"));
assertEquals(1.0, (float) getFieldValue(chooseLevel0, "BOTTOM_ALIGNMENT"), 0.015);
assertEquals(1, getFieldValue(chooseLevel0, "WIDTH"));
assertEquals(2, getFieldValue(chooseLevel0, "HEIGHT"));
assertEquals(-1, getFieldValue(chooseLevel0, "UNDEFINED_CONDITION"));
assertEquals(16, getFieldValue(chooseLevel0, "FRAMEBITS"));
assertEquals(0, getFieldValue(chooseLevel0, "WHEN_FOCUSED"));
assertEquals(1, getFieldValue(chooseLevel0, "WHEN_ANCESTOR_OF_FOCUSED_COMPONENT"));
assertEquals(0.0, (float) getFieldValue(chooseLevel0, "LEFT_ALIGNMENT"), 0.015);
assertEquals(32, getFieldValue(chooseLevel0, "ALLBITS"));
assertEquals("ToolTipText", getFieldValue(chooseLevel0, "TOOL_TIP_TEXT_KEY"));
assertEquals(1.0, (float) getFieldValue(chooseLevel0, "RIGHT_ALIGNMENT"), 0.015);
assertEquals(0.0, (float) getFieldValue(chooseLevel0, "TOP_ALIGNMENT"), 0.015);
assertEquals(64, getFieldValue(chooseLevel0, "ERROR"));
assertEquals(2, getFieldValue(chooseLevel0, "WHEN_IN_FOCUSED_WINDOW"));
assertEquals(0, ((Game.ChooseLevel) chooseLevel0).getId());

	}

	@Test
	public void test_getImg_1() throws Throwable {
		Game.ChooseLevel chooseLevel0 = new Game.ChooseLevel();
javax.swing.ImageIcon imageIcon4 = chooseLevel0.getImg("Game.Score", 3, 3);
assertEquals(128, getFieldValue(chooseLevel0, "ABORT"));
assertEquals(0.5, (float) getFieldValue(chooseLevel0, "CENTER_ALIGNMENT"), 0.015);
assertEquals(4, getFieldValue(chooseLevel0, "PROPERTIES"));
assertEquals(8, getFieldValue(chooseLevel0, "SOMEBITS"));
assertEquals(1.0, (float) getFieldValue(chooseLevel0, "BOTTOM_ALIGNMENT"), 0.015);
assertEquals(1, getFieldValue(chooseLevel0, "WIDTH"));
assertEquals(2, getFieldValue(chooseLevel0, "HEIGHT"));
assertEquals(-1, getFieldValue(chooseLevel0, "UNDEFINED_CONDITION"));
assertEquals(16, getFieldValue(chooseLevel0, "FRAMEBITS"));
assertEquals(0, getFieldValue(chooseLevel0, "WHEN_FOCUSED"));
assertEquals(1, getFieldValue(chooseLevel0, "WHEN_ANCESTOR_OF_FOCUSED_COMPONENT"));
assertEquals(0.0, (float) getFieldValue(chooseLevel0, "LEFT_ALIGNMENT"), 0.015);
assertEquals(32, getFieldValue(chooseLevel0, "ALLBITS"));
assertEquals("ToolTipText", getFieldValue(chooseLevel0, "TOOL_TIP_TEXT_KEY"));
assertEquals(1.0, (float) getFieldValue(chooseLevel0, "RIGHT_ALIGNMENT"), 0.015);
assertEquals(0.0, (float) getFieldValue(chooseLevel0, "TOP_ALIGNMENT"), 0.015);
assertEquals(64, getFieldValue(chooseLevel0, "ERROR"));
assertEquals(2, getFieldValue(chooseLevel0, "WHEN_IN_FOCUSED_WINDOW"));
assertEquals(0, ((Game.ChooseLevel) chooseLevel0).getId());

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
