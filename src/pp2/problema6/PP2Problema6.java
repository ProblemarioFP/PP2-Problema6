/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema6;
import java.util.*;
/**
 *
 * @author Miguel
 */
public class PP2Problema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int totalHoras,horas;    // Declaracion de variables
    final int pago=100;
    
    totalHoras=pedirHoras();        //Metodos que se utilizaran
    horas= calculoHoras(totalHoras,pago);
    mostrarResultado(totalHoras,horas);
    }
    public static int pedirHoras() {    //Metodo para pedir numero de horas trabajadas
        int horas;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introducir numero de horas");
        horas = entrada.nextInt();
        return horas;
    }
    public static int calculoHoras(int x, int p) { //Metodo que usando ifs anidados calcula el monto de pago por las hroas trabajadas
        int costoHorasBase=0;
            if (x>0 && x<=40){
                 costoHorasBase=x*p;
                 System.out.println("Por "+x+ " horas base trabajadas,");
                     }else{
                        if(x>40 && x<=48){
                            costoHorasBase=40*p+(x-40)*2*p;
                            System.out.println("Por "+40+ " horas base trabajadas el pago es de "
                                    + 40*p+" pesos, y por las primeras "+(x-40)+" horas dobles el pago es de "+ (x-40)*2*p+ "pesos.");
                               }else{
                                  if(x>48){
                                       costoHorasBase= 40*p+8*2*p+(x-48)*3*p;
                                       System.out.println("Por "+40+ " horas base trabajadas el pago es de "
                                    + 40*p+" pesos, más las primeras "+8+" horas dobles cuyo pago es de "+ 8*2*p
                                              +" pesos, más el pago por "+ (x-48)+ " horas triples que es de "+ (x-48)*3*p+" pesos.");
                }
            }
        }
        return costoHorasBase;
    }
    
    public static void mostrarResultado(int x, int y) { //Metodo que muestra la cantidad total de pago por una cantidad de horas trabajadas
        System.out.println("El pago total es de " +y+ " pesos." );   
    }
    
}
