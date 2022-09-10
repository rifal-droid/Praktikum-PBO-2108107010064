/**
* Program berikut untuk menentukan nilai huruf 
*/
import java.util.Scanner;

public class Nilai
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in); //scanner inputan nilai
            int nilai;
            
        System.out.print("Masukkan Nilai :"); //inputan nilai
         nilai = input.nextInt();

/* proses looping untuk menemukan kondisi yang cocok dengan nilai inputan user*/
    if(nilai<41){
            System.out.println("Nilai huruf : E");
        }
        else if(nilai>=41 && nilai<51){
            System.out.println("Nilai huruf : D");
        }
        else if(nilai>=51 && nilai<60){
            System.out.println("Nilai huruf : C");
        }
        else if(nilai>=60 && nilai<69){
            System.out.println("Nilai huruf : BC");
        }
        else if(nilai>=69 && nilai<78){
            System.out.println("Nilai huruf : B");
        }
        else if(nilai>=78 && nilai<87){
            System.out.println("Nilai huruf : AB"); 
        }else if(nilai>=87){
            System.out.println("Nilai huruf : A");
        }else{
            System.out.println("data yang dimasukkan tidak valid!"); //output bila inputannya tidak berupa angka dalam range nilai if -else
        }
    }
}
