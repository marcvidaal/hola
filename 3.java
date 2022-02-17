//Marc Vidal Ardevol
import java.util.Scanner;

public class EstructuresSeleccio { // importem scanner

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // creem nou Scanner

    // ENTRADA

        System.out.println("Introdueix un numero entre 0 i 9999"); // demenem la entrada
        int numero = input.nextInt(); // inroduim la entrada

        while ((numero < 0) || (numero > 9999)){ // si no compleix els requisits
            System.out.println("El numero introduit no cumpleix els requisits demanats");
            System.out.println("Introdueix un numero entre 0 i 9999"); // demenem la entrada
            numero = input.nextInt(); // inroduim la entrada
        }

        input.close(); // tanquem el scanner

    // OPERACIONS 

        int length = String.valueOf(numero).length(); // convertim el int en una string i li fem el .lenght per saver la llargada

        int reversed = 0; // creem la variable del numero del reves

        int variable = numero; // denominem una variable per no alterar el numero del valor original, ja que el nescesitarem mes endevant

        while(variable != 0) {
    
            // get last digit from num
            int valor = variable % 10; // denominem la variable valor que gruardara els valors no colocats
            reversed = reversed * 10 + valor; // el numero del reves sera el s valor del reves mes la resta de valor no oposats
      
            variable /= 10; // eliminem el ultim valor de numero
        }

    // IMPRESIO DE RESULTATS

        System.out.println("El valor " + numero + " te " + length + " numeros"); // imprimim longitud

        System.out.println("El valor " + numero + " del revés es " + reversed); // imprimim el valor al reves

        if (reversed == numero){System.out.println("El valor " + numero + " és capicua");}
    } 
}