/**
 * @author Jennifer Sandoval,Andrea Paniagua
 * @Carne 18962,18733
 * @date 25/01/19
 * @name Calcu.java
 * <p>Esta clase es la implementacion de la interfaz calculadora donde se realizan las operaciones  </p>
 * */

public class Calcu implements Calculator {

    /**
     *
     * @param num1
     * @param num2
     * @param op
     * @return retorna el resultado de cualquiera de las operaciones que realice segun sea el caso
     */
    @Override
    public int Calculate(int num1, int num2, String op) {
        int resultado =0;
        if (op.equals ("+")){
            resultado= num1+num2;
        }
        if (op.equals ("-")){
            resultado= num2-num1;
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