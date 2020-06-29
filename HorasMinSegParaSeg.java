import java.util.*;
 public class HorasMinSegParaSeg {
 public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduza o numero de Horas, minutos: ");
        int horas = entrada.nextInt(); 
        int minutos = entrada.nextInt();
        int segundos = entrada.nextInt();
        int p1 = horas * 3600; 
        int p2 = minutos * 60; 
        int p3 = segundos;
        int p4 = p1 + p2 + p3;
        System.out.print( p4 + " segundos");
		System.out.print("\n");
    }    
 }