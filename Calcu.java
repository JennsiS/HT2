/**
 * @author Jennifer Sandoval,Andrea Paniagua
 * @Carne 18962,18733
 * @date 25/01/19
 * @name Calcu.java
 * <p>  </p>
 * */

public class Calcu implements Calculator {

    @Override
    public int Calculate(int num1, int num2, String op) {
       int resultado =0;
       if (op.equals ("+")){
           resultado= num1+num2;
       }
       if (op.equals ("-")){
           resultado= num1-num2;
       }
       if (op.equals ("*")){
           resultado = num1*num2;
       }
       if (op.equals ("/")){
           resultado = num1/num2;
       }
       return resultado;
    }
    
}
