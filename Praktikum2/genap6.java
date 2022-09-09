public class genap6 {

public static void main(String[] args) {

for (int i=0; i<=20; i=i+2){
if (i%6 ==0) //setiap i habis dibagi 6 dan sisa bagi = 0 maka akan di skip
continue;
System.out.println(i);
}

}
}