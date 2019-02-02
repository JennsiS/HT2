
import java.io.BufferedReader;
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
     BufferedReader br = new BufferedReader (fr);

   
     String linea;
     while((linea=br.readLine())!=null) 
        {
            
            //caract guarda el numero de caracter, por lo que lo casteamos a char para que nos de
            //el caracter como lo necesitamos
            //System.out.println((char)caract);
            String cadena=linea;
            
            String[] post;
            post = cadena.split(" ");
            int largo= post.length;
            
              for(int i=0; i< largo; i++)
              {
                if ((!post[i].equals("+"))&& (!post[i].equals("-")) && (!post[i].equals("*")) && (!post[i].equals("/")) ){
                    int numero= Integer.parseInt (post[i]);
                    doc.push(numero);
                    System.out.println();
                }
                else if ((post[i].equals("+")) || (post[i].equals("-")) || (post[i].equals("*")) || (post[i].equals("/")) ){
                    String operando= post[i];
                    int n1= (int) doc.pop();
                    int n2= (int) doc.pop();
                    int r= nueva.Calculate(n1, n2,operando);
                    System.out.println("El resultado de la operacion de "+n2+ " "+ operando+ " "+n1+ " es: "+r);
                 
                 
                            
                }
                    
             }
           
           }
        }
    }
 
    
