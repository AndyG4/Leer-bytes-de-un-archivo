import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try(Scanner sc = new Scanner(System.in);
        FileInputStream fis = new FileInputStream(sc.nextLine())){
            int mayor_byte=0;
            int menor_byte=Integer.MAX_VALUE;

            while (fis.available() > 0) { 
                byte leer = (byte) fis.read();
                System.out.print((char)leer);

                if(mayor_byte<leer){
                    mayor_byte=leer;
                }
                if(menor_byte>0 && menor_byte>leer){
                    menor_byte=leer;
                }
               
            }
            System.out.println();
            System.out.println("el byte mayor es de: "+mayor_byte+" que es el caracter: "+(char)mayor_byte);
            System.out.println("menor byte: "+menor_byte+" que es el caracter: "+(char)menor_byte);
        }   
    }
}
