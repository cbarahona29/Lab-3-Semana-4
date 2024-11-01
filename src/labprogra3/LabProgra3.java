
package labprogra3;

import java.util.Random;
import java.util.Scanner;

public class LabProgra3 {

   
    public static void main(String[] args) {
        int menu;
          Scanner entrada= new Scanner(System.in);
          int alreves=0, primos=0,perfectos=0,votaciones=0;
         //Esto es el menu 
         while(true){
                while(true){
       System.out.println("Favor seleccione lo que desea ejecutar:\n"
        +"1. Palabra alreves\n"
        +"2. Numero Perfecto\n"
        +"3. Primos\n"
        +"4. Votaciones\n"
        +"5. Salir");
            menu=entrada.nextInt();
            if(menu<6 && menu>0)
                break;
            else 
                System.out.println("Favor ingrese unicamente las opciones sugeridas en el menu.");
        }
        switch (menu){
            
        //Palabra
        case 1:
            String palabra;
            System.out.println("Ingrese una palabra");
             palabra=entrada.next();
            String palabraa=new StringBuilder(palabra).reverse().toString();
            System.out.println("La palabra alreves es: "+palabraa);
           alreves++;
          break;
          
           //Numero Perfecto
          case 2:
              System.out.println("Ingrese un Numero");
              int numero=entrada.nextInt();
              int perfecto =0;
              
               for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                perfecto += i;
                  }
              }
              if (numero==perfecto){
                  System.out.println("Es un numero perfecto");}
              else {
                  System.out.println("No es un numero perfecto");}
              perfectos++;
          break;
          
          //Numero Primo
          case 3:
       Random random = new Random();
        int primo = 0;
        int aleatorio = random.nextInt(100)+1;
        
        System.out.println("El número es " + aleatorio);
        
        for (int i = 1; i <= aleatorio; i++) {
            if (aleatorio % i == 0) {
                primo++;
            }
        }
        
        if (aleatorio > 1 && primo == 2) {
            System.out.println("El número es primo porque solo tiene dos divisores.");
        } else {
            System.out.println("El número no es primo.");
        }
        primos++;
      break;
      
      //Votaciones
          case 4:
              int votantes;
              int Vazul=0, Vrojo =0,Vamarrillo=0,Vnegro=0, Vnulo=0;
              System.out.println("Ingrese la cantidad de votantes");
               votantes=entrada.nextInt();
              
               for (int i = 1; i <= votantes; i++) {
         System.out.print("Eliga uno de la Planilla, Voto #" + i + "(AZUL, ROJO, NEGRO, AMARRILLO): ");
                String Voto = entrada.next().toUpperCase();
            switch (Voto) {
                case "AZUL":
                    Vazul++;
                    break;
                case "ROJO":
                    Vrojo++;
                    break;
                case "AMARRILLO":
                    Vamarrillo++;
                    break;
                case "NEGRO":
                    Vnegro++;
                    break;
                default:
                    Vnulo++;
                    System.out.println("Voto nulo.");
            }
        }
          int VotoValidos = Vazul + Vrojo + Vamarrillo + Vnegro;  
             if (VotoValidos >= votantes * 0.6) {
            String ganador;
            if (Vazul > Vrojo && Vazul > Vnegro && Vazul > Vamarrillo) {
                ganador = "Azul";
            } else if (Vrojo > Vazul && Vrojo > Vnegro && Vrojo > Vamarrillo) {
                ganador = "Rojo";
            } else if (Vnegro > Vazul && Vnegro > Vrojo && Vnegro > Vamarrillo) {
                ganador = "Negro";
            } else {
                ganador = "Amarrillo";
            }
            System.out.println("El ganador es: " + ganador);
        } else {
            System.out.println("Votacion Fallida");
        }        votaciones++;

              break;
              
          //Salida 
          case 5:
              System.out.println("Has escogido Salida");
              System.out.println("Cuantas veces usaste cada programa?");
              System.out.println("Palabras alreves: "+alreves+" veces");
              System.out.println("Numeros Perfectos: "+perfectos+" veces");
              System.out.println("Primos: "+primos+" veces");
              System.out.println("Votaciones: "+votaciones+" veces");
           
             
          System.exit(0);
        }
    }
    
} }