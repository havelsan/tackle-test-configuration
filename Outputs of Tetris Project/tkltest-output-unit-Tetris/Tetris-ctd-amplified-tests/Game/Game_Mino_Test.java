package Game;

import Game.Mino;
import static org.junit.Assert.assertNull;
import javax.swing.JToggleButton;
import org.junit.runner.RunWith;
import static org.evosuite.runtime.EvoAssertions.*;
import org.junit.Test;
import java.awt.Point;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoRunner;
import javax.swing.DebugGraphics;
import java.awt.Graphics;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Game_Mino_Test {
	@Test
	public void test_rotate_0() throws Throwable {
		Game.Mino mino1 = new Game.Mino(100);
mino1.rotate(100);

	}

	@Test
	public void test_move_0() throws Throwable {
		Game.Mino mino1 = new Game.Mino(4);
javax.swing.JToggleButton jToggleButton3 = new javax.swing.JToggleButton("^)ggS(f/W)T%0?");
assertEquals("rolloverEnabled", getFieldValue(jToggleButton3, "ROLLOVER_ENABLED_CHANGED_PROPERTY"));
assertEquals("rolloverIcon", getFieldValue(jToggleButton3, "ROLLOVER_ICON_CHANGED_PROPERTY"));
assertEquals(4, getFieldValue(jToggleButton3, "PROPERTIES"));
assertEquals("contentAreaFilled", getFieldValue(jToggleButton3, "CONTENT_AREA_FILLED_CHANGED_PROPERTY"));
assertEquals("model", getFieldValue(jToggleButton3, "MODEL_CHANGED_PROPERTY"));
assertEquals(7, getFieldValue(jToggleButton3, "WEST"));
assertEquals("rolloverSelectedIcon", getFieldValue(jToggleButton3, "ROLLOVER_SELECTED_ICON_CHANGED_PROPERTY"));
assertEquals(3, getFieldValue(jToggleButton3, "BOTTOM"));
assertEquals("focusPainted", getFieldValue(jToggleButton3, "FOCUS_PAINTED_CHANGED_PROPERTY"));
assertEquals(0, getFieldValue(jToggleButton3, "CENTER"));
assertEquals(1, getFieldValue(jToggleButton3, "VERTICAL"));
assertEquals(1, getFieldValue(jToggleButton3, "NORTH"));
assertEquals("ToolTipText", getFieldValue(jToggleButton3, "TOOL_TIP_TEXT_KEY"));
assertEquals(64, getFieldValue(jToggleButton3, "ERROR"));
assertEquals(5, getFieldValue(jToggleButton3, "SOUTH"));
assertEquals("disabledSelectedIcon", getFieldValue(jToggleButton3, "DISABLED_SELECTED_ICON_CHANGED_PROPERTY"));
assertEquals("verticalAlignment", getFieldValue(jToggleButton3, "VERTICAL_ALIGNMENT_CHANGED_PROPERTY"));
assertEquals("pressedIcon", getFieldValue(jToggleButton3, "PRESSED_ICON_CHANGED_PROPERTY"));
assertEquals("disabledIcon", getFieldValue(jToggleButton3, "DISABLED_ICON_CHANGED_PROPERTY"));
assertEquals("horizontalTextPosition", getFieldValue(jToggleButton3, "HORIZONTAL_TEXT_POSITION_CHANGED_PROPERTY"));
assertEquals(8, getFieldValue(jToggleButton3, "NORTH_WEST"));
assertEquals(128, getFieldValue(jToggleButton3, "ABORT"));
assertEquals("margin", getFieldValue(jToggleButton3, "MARGIN_CHANGED_PROPERTY"));
assertEquals("borderPainted", getFieldValue(jToggleButton3, "BORDER_PAINTED_CHANGED_PROPERTY"));
assertEquals(2, getFieldValue(jToggleButton3, "LEFT"));
assertEquals(8, getFieldValue(jToggleButton3, "SOMEBITS"));
assertEquals(11, getFieldValue(jToggleButton3, "TRAILING"));
assertEquals("horizontalAlignment", getFieldValue(jToggleButton3, "HORIZONTAL_ALIGNMENT_CHANGED_PROPERTY"));
assertEquals(10, getFieldValue(jToggleButton3, "LEADING"));
assertEquals(1, getFieldValue(jToggleButton3, "WHEN_ANCESTOR_OF_FOCUSED_COMPONENT"));
assertEquals(1, getFieldValue(jToggleButton3, "TOP"));
assertEquals("mnemonic", getFieldValue(jToggleButton3, "MNEMONIC_CHANGED_PROPERTY"));
assertEquals(0.0, (float) getFieldValue(jToggleButton3, "TOP_ALIGNMENT"), 0.015);
assertEquals(4, getFieldValue(jToggleButton3, "SOUTH_EAST"));
assertEquals(0, getFieldValue(jToggleButton3, "HORIZONTAL"));
assertEquals(1.0, (float) getFieldValue(jToggleButton3, "BOTTOM_ALIGNMENT"), 0.015);
assertEquals("selectedIcon", getFieldValue(jToggleButton3, "SELECTED_ICON_CHANGED_PROPERTY"));
assertEquals("icon", getFieldValue(jToggleButton3, "ICON_CHANGED_PROPERTY"));
assertEquals(1, getFieldValue(jToggleButton3, "WIDTH"));
assertEquals(13, getFieldValue(jToggleButton3, "PREVIOUS"));
assertEquals(16, getFieldValue(jToggleButton3, "FRAMEBITS"));
assertEquals(0, getFieldValue(jToggleButton3, "WHEN_FOCUSED"));
assertEquals(12, getFieldValue(jToggleButton3, "NEXT"));
assertEquals(1.0, (float) getFieldValue(jToggleButton3, "RIGHT_ALIGNMENT"), 0.015);
assertEquals("text", getFieldValue(jToggleButton3, "TEXT_CHANGED_PROPERTY"));
assertEquals(4, getFieldValue(jToggleButton3, "RIGHT"));
assertEquals("verticalTextPosition", getFieldValue(jToggleButton3, "VERTICAL_TEXT_POSITION_CHANGED_PROPERTY"));
assertEquals(3, getFieldValue(jToggleButton3, "EAST"));
assertEquals(0.5, (float) getFieldValue(jToggleButton3, "CENTER_ALIGNMENT"), 0.015);
assertEquals(2, getFieldValue(jToggleButton3, "HEIGHT"));
assertEquals(-1, getFieldValue(jToggleButton3, "UNDEFINED_CONDITION"));
assertEquals(0.0, (float) getFieldValue(jToggleButton3, "LEFT_ALIGNMENT"), 0.015);
assertEquals(32, getFieldValue(jToggleButton3, "ALLBITS"));
assertEquals(2, getFieldValue(jToggleButton3, "NORTH_EAST"));
assertEquals(6, getFieldValue(jToggleButton3, "SOUTH_WEST"));
assertEquals(2, getFieldValue(jToggleButton3, "WHEN_IN_FOCUSED_WINDOW"));
assertEquals("ToggleButtonUI", ((javax.swing.JToggleButton) jToggleButton3).getUIClassID());
java.awt.Point point4 = jToggleButton3.getLocation();
assertEquals(0, getFieldValue(point4, "x"));
assertEquals(0, getFieldValue(point4, "y"));
mino1.move(point4);

	}

	@Test
	public void test_Mino_0() throws Throwable {
		Game.Mino mino1 = new Game.Mino(100);

	}

	@Test
	public void test_Mino_1() throws Throwable {
		Game.Mino mino1 = new Game.Mino((-11));
Game.Mino mino3 = new Game.Mino(mino1, true);

	}

	@Test
	public void test_Mino_2() throws Throwable {
		Game.Mino mino1 = new Game.Mino((-11));
Game.Mino mino3 = new Game.Mino(4);
Game.Ghost ghost4 = new Game.Ghost(mino3);
Game.Mino mino6 = new Game.Mino((Game.Mino)ghost4, true);

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
