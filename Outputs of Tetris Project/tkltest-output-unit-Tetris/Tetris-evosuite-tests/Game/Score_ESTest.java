/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 12 09:47:01 GMT 2024
 */

package Game;

import org.junit.Test;
import static org.junit.Assert.*;
import Game.Score;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Score_ESTest extends Score_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Score score0 = new Score("", 2516);
      int int0 = score0.getScore();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Score score0 = new Score("", 2194);
      String string0 = score0.getPlayer();
  }
}
