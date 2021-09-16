import java.util.Scanner;

public class TransposMatriks {
    public static void main(String[] args) {
        int a,b,c,d;
        a = b = 3;

        int matriks [][] = new int[3][3];
        int transpose [][] = new int[3][3];
        Scanner isi = new Scanner(System.in);

        for(c = 0; c < a; c++){
            for(d = 0; d< b; d++){
              matriks[c][d] = isi.nextInt();
            }
          }
          for(c = 0; c < a; c++){
            for(d = 0; d< b; d++){
              transpose[d][c] = matriks[c][d];
            }
          }
          
          for(c = 0; c < b; c++){
            for(d = 0; d< a; d++){
              System.out.print(transpose[c] [d] + " ");
              System.out.println(" ");

            }
            System.out.println();
        }
    }
}