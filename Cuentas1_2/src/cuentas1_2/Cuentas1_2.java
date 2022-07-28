
package cuentas1_2;

import java.util.Scanner;

public class Cuentas1_2 {

    
    public static void main(String[] args) {
       Cuentas2 cta1 = new Cuentas2();
       Cuentas2 cta2 = new Cuentas2();
       
       while (true){
           Scanner sp = new Scanner(System.in);
           System.out.println(" ");
           System.out.println("     Bienvenidos a Banco Tics, seleccione la opcion que desea realizar: ");
           System.out.println(" ");
           System.out.println("=================================");
           System.out.println("|        Menu Banco TICs        |");
           System.out.println("|                               |");
           System.out.println("| 1. Mostrar saldos de cuentas  |");
           System.out.println("| 2. Acreditar                  |");
           System.out.println("| 3. Debitar                    |");
           System.out.println("| 4. Salir                      |");
           System.out.println("=================================");
           int respuesta = sp.nextInt();
           
           switch (respuesta){
               case 1:
                   System.out.println("El saldo de su cuenta 1 es: "+cta1.getSaldo());
                   System.out.println("El saldo de su cuenta 2 es: "+cta2.getSaldo());
               break;
               case 2:
                   Scanner sp1 = new Scanner(System.in);
                   System.out.println("A que cuenta desea acreditar, cuenta 1 o cuenta 2?");
                   int resp_cuenta = sp1.nextInt();
                   
                   if (resp_cuenta == 1) {
                       System.out.println("Ingrese el monto:");
                       cta1.setSaldo(sp1.nextInt());
                   } else {
                   System.out.println("Ingrese el monto:");
                   cta2.setSaldo(sp1.nextInt());
                   }
                   
                    if (resp_cuenta == 1){
                        System.out.println("El nuevo saldo de su cuenta 1 es: "+cta1.getSaldo());
                    } else {                  
                        System.out.println("El nuevo saldo de su cuenta 2 es: "+cta2.getSaldo());
                    }
               break;
               case 3:
                   Scanner sp2 = new Scanner(System.in);
                   System.out.println("A que cuenta desea debitar, cuenta 1 o cuenta 2?");
                   int resp_cuenta2 = sp2.nextInt();
                   
                   if (resp_cuenta2 == 1) {
                       System.out.println("Ingrese el monto:");
                       cta1.setSaldo(cta1.getSaldo() - sp2.nextInt());
                                               
                   } else {
                   System.out.println("Ingrese el monto:");
                   cta2.setSaldo(cta2.getSaldo() - sp2.nextInt());
                   }
                   
                   if (resp_cuenta2 == 1){
                        System.out.println("El nuevo saldo de su cuenta 1 es: "+cta1.getSaldo());
                    } else {                  
                        System.out.println("El nuevo saldo de su cuenta 2 es: "+cta2.getSaldo());
                    }
               break;
               case 4:
                   System.out.println("Muchas gracias por utilizar banco TICS!!");
                   System.exit(0);
               break;
           }
           
       }
                
    }
    
}
