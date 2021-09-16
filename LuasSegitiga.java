import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args){

        float A,T,luas;

        Scanner nilai = new Scanner(System.in);
        A = nilai.nextFloat();
        T = nilai.nextFloat();

        luas = A*T/2;
        System.out.printf(" %.2f",luas);
        
    }
}