/**
 * @author Jennifer Sandoval,Andrea Paniagua
 * @Carne 18962,18733
 * @date 25/01/19
 * @name PilaTest.java
 * <p>Test de clase Pila  </p>
 * */
import org.junit.Test;

import java.util.Stack;

import static junit.framework.TestCase.assertFalse;

public class PilaTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }
    /**
     *
     */
    @org.junit.Test
    public void push() {
    }
    /**
     *
     */
    @org.junit.Test
    public void pop() {
    }
    /**
     *
     */
    @Test
    public void peek() {
    }
    /**
     *
     */
    @org.junit.Test
    public void empty() {
        Stack noEmptyStack = new Stack();
        noEmptyStack.push(1);
        assertFalse(noEmptyStack.empty());
    }
    /**
     *
     */

    @org.junit.Test
    public void size() {
    }
}