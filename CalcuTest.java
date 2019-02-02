/**
 * @author Jennifer Sandoval,Andrea Paniagua
 * @Carne 18962,18733
 * @date 25/01/19
 * @name CalcuTest.java
 * <p>Test de clase Calcu  </p>
 * */

import org.junit.Test;

import static org.junit.Assert.*;

public class CalcuTest {
    /**
     *
     */
    @Test
    public void calculate() {
        int num1=1;
        assertNotNull(num1);
    }
    /**
     *
     */
    @Test
    public void num2notzero(){
        int num2=3;
        assertNotNull(num2);
    }
    /**
     *
     */
    @Test
    public void resultadonotzero(){
        int resultado=15;
        assertNotNull(resultado);
    }
    /**
     *
     */
    //comprueba que sumen bien
    @Test
    public void sumafine(){
        Calcu CalcuTest=new Calcu();
        int a=3;
        int b=6;
        int c=9;
        assertEquals(CalcuTest.Calculate(a,b,"+"),c);
    }
    }

