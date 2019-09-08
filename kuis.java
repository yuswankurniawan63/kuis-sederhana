import java.util.Scanner;

class kuis {
  public static void main(String[] args) {
  //Created by Yuswan kurniawan
  //Silakan dimodifikasi
   Scanner input = new Scanner(System.in);
   String[][] soalPlusjawaban = {
     {"1. 1 + 1 = ... ", "2"},
     {"2. 2 + 2 = ...","4"},
     {"3. 3 + 3 = ...", "6"},
     {"4. 4 + 4 = ...", "8"},
     {"5. 5 + 5 = ...", "10"}
   };
   String[][] jawaban = {
     {"A. 2", "B. 3","C. 4","D. 5"},
     {"A. 1","B. 0","C. 3","D. 4"},
     {"A. 5","B. 1","C. 6","D. 7"},
     {"A. 8","B. 10","C. 12","D. 25"},
     {"A. 12","B. 13","C. 10","D. 15"}
   };
   
   int skorBenar = 0, skorSalah = 0;
   System.out.println("Contoh cara menjawab = ");
   System.out.println("1. 10 x 5 = ...");
   System.out.println("A. 50");
   System.out.println("B. 20");
   System.out.println("C. 30");
   System.out.println("D. 10");
   System.out.println("Jawaban kamu = 50");
   
   for(int i=0; i < soalPlusjawaban.length; i++) {
     System.out.println(soalPlusjawaban[i][0]);
     for(int j=0; j < jawaban[0].length; j++) {
       System.out.println(jawaban[i][j]);
     }
     System.out.print("Jawaban kamu : ");
     String jwbn = input.nextLine();
     String jwb = jwbn.toLowerCase();
     if(jwb.equals(soalPlusjawaban[i][1]) == true) {
       System.out.println("Jawaban kamu benar :)\n");
       skorBenar++;
     }
     else {
       System.out.println("Jawaban kamu salah :(\n");
       skorSalah++;
     }
    }
      System.out.println("Skor anda : " + skorBenar * 20);
      System.out.println("Anda Benar : " + skorBenar);
      System.out.println("Anda Salah : " + skorSalah);
  }
}
