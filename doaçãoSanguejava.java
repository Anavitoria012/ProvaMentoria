import java.util.Scanner;
public class doaçãoSanguejava {
   public static void main(String[]args){
  Scanner temp=new Scanner(System.in);
       double temperatura,kelvin,fahrenheit;
       
       
  System.out.println("Conversor de Temperatura");
 System.out.println("Digite a Temperatura em Celsius(C_°):");
temperatura=temp.nextDouble();
       
 fahrenheit =(temperatura*9/5)+32;
 kelvin =temperatura+ 273.15;
       
       System.out.println(temperatura+"Graus celsius convertido em Fahrenheit:+fahrenheit");
 System.out.println(temperatura+"Graus celsius convertido em kelvin:+ kelvin");      
   }
}