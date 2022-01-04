/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*Girilen sayinin karakokunu bulan kod*/
package oryantasyonsoru7;
import java.util.Scanner;
public class Oryantasyonsoru7 {
public static void main(String[] args) {
Scanner giris=new Scanner(System.in);
double sayi;
System.out.println("Karekodunu bulmak için bir sayi giriniz");
 sayi = giris.nextDouble();
 if(sayi<0){
     System.out.println("Olmadı pozitif sayi girmeliydiniz");
 }
 else{
     System.out.println(sayi +"nin karekodu;" +Math.sqrt(sayi)  );
 }
 
 
 
 
 }
    
}