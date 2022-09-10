/* program menampilkan bilangan genap
dari angka 1 sampai 20 */

public class genap{
    public static void main(String[] args){

    for(int i=1; i <= 20; i++){
        if(i % 2 == 1){ //jika i habis dibagi 2 dan sisa baginya 1 maka akan di skip. jadi yang ditampilkan hanya angka genap.
            continue; 
        }
    System.out.println(i);
    }

}
    }
