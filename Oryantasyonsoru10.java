/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*Girilen 3 sayinin ortalamasini yazdiran kod*/
package oryantasyonsoru10;
import java.util.Scanner;
public class Oryantasyonsoru10 {
public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
 System.out.println("Uc Sayi Giriniz: ");
 double sayi1=input.nextDouble();
 double sayi2=input.nextDouble();
 double sayi3=input.nextDouble();
 double ortalama=((sayi1+ sayi2+ sayi3)/3);
 System.out.println(sayi1+" " + sayi2+" " + sayi3+" "+"Ortalama:"+ ortalama );
    

}
    
}
