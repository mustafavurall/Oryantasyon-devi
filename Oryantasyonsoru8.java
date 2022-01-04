/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*Girilen sayinin karesini hesaplayan kod*/
package oryantasyonsoru8;
import java.util.Scanner;
public class Oryantasyonsoru8 {
public static void main(String[] args) {
  
Scanner giris=new Scanner(System.in);
double sayi;
System.out.println("Karesini Hesaplamak İçin Sayı Giriniz");
sayi = giris.nextDouble();
System.out.println(sayi  + "  karesi ;"  +Math.pow(sayi,2) );
 }
}     