/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 12 09:49:06 GMT 2024
 */

package Game;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Game.NavigationBar;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NavigationBar_ESTest extends NavigationBar_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NavigationBar navigationBar0 = new NavigationBar();
      ActionEvent actionEvent0 = new ActionEvent(navigationBar0, 0, "x.#Dbfq~}_jJ8w2S#", 0);
      navigationBar0.actionPerformed(actionEvent0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NavigationBar navigationBar0 = new NavigationBar();
      JButton jButton0 = navigationBar0.soundToggle;
      ActionEvent actionEvent0 = new ActionEvent("x.#Dbfq~}_jJ8w2S#", 0, "KVDt4&C&&Ay>a", 0);
      actionEvent0.setSource(jButton0);
      // Undeclared exception!
      try { 
        navigationBar0.actionPerformed(actionEvent0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Game.NavigationBar", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NavigationBar navigationBar0 = new NavigationBar();
      JButton jButton0 = navigationBar0.getMenuButton();
      ActionEvent actionEvent0 = new ActionEvent(jButton0, (-1962), "   Help    ", (-1962));
      // Undeclared exception!
      try { 
        navigationBar0.actionPerformed(actionEvent0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Game.NavigationBar", e);
      }
  }
}
