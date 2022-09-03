import java.util.Scanner;

public class Diskon
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
         int harga, jumlah, hargaUnit,diskon, total;

        //input harga barang
         System.out.print("Harga Barang : ");
         harga = input.nextInt();
         
         //input jumlah barang
         System.out.print("jumlah Barang :");
         jumlah = input.nextInt();

        //kalkulasi harga barang diskon 15%
         hargaUnit = harga*jumlah;
         diskon = hargaUnit*15/100;
         total = hargaUnit-diskon;

         System.out.println("Total Harga  : " +total+"  " );

    }
}