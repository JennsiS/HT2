

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
 * @name Pila.java
 * <p></p>
 * */



public abstract class Pila implements Stack {
    
    
    public Vector leer () throws FileNotFoundException{
        File f = new File( "C:\\datos.txt" );
        BufferedReader entrada;
        Vector texto = new Vector();
        entrada = new BufferedReader( new FileReader( f ) );
        try {
            entrada = new BufferedReader( new FileReader( f ) );
            String linea;
        while(entrada.ready()){
            linea = entrada.readLine();
            texto.add(linea);
        }
        }catch (IOException e) {
        e.printStackTrace();
        }finally {
        try{
        entrada.close();
        }catch(IOException e1){}
}
        return texto;
}
        



   
   
    
}

