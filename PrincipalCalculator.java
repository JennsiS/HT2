
import java.util.Vector;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Jennifer Sandoval,Andrea Paniagua
 * @Carne 18962,18733
 * @date 25/01/19
 * @name PrincipalCalculator.java
 * <p>Clase principal del programa, lee un archivo de texto en notacion postfix y realiza las operaciones  </p>
 * */
public class PrincipalCalculator {
    
 public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        Pila doc = new Pila();
        Calcu nueva = new Calcu();
    //Se declaran las variables que seran utiles para leer el archivo de tipo texto
     FileReader fr = new FileReader("datos.txt"); //aqui debes de poner tu ruta
     int caract = fr.read();
     
     while(caract != -1) 
        {
            caract = fr.read();
            //caract guarda el numero de caracter, por lo que lo casteamos a char para que nos de
            //el caracter como lo necesitamos
            System.out.println((char)caract);
            String cadena= Integer.toString (caract);
            String[] post;
            post = cadena.split(" ");
            for (int i=0; i<post.length; i++){
                while ((!post.equals("+"))&& (!post.equals("-")) && (!post.equals("*")) && (!post.equals("/")) ){
                    int numero= Integer.parseInt (post[i]);
                    doc.push(numero);
                }
            if (post[i].equals("+-*/%")){
                    int n1= (int) doc.pop();
                    int n2= (int) doc.pop();
                    int r=nueva.Calculate(n1, n2, post[i]);
                    System.out.println(r);
             }
           
           }
        }
    }
 }
    
