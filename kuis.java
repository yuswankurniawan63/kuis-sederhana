import java.util.Scanner;

class kuis {
  public static void main(String[] args) {
  // Created by Yuswan kurniawan
  //Anda bisa modifikasi
   Scanner input = new Scanner(System.in);
   String[][] soalPlusjawaban = {
     {"1. Siapakah nama anda ? ... ", "yusuf"},
     {"2. Siapakah tokoh favorit kartun anda ? ...","naruto"},
     {"3. Siapakah founder PimBel ? ...", "gilang"},
     {"4. Siapakah penemu linux ? ...", "linus"},
     {"5. Siapkah Siapkah ? ...", "?"}
   };
   String[][] jawaban = {
     {"A. Yusuf", "B. Yuswan","C. Ferdin","D. Ucup"},
     {"A. One Piece","B. Naruto","C. Fairy Tale","D. Gundala"},
     {"A. Bima","B. Ayu","C. Tian","D. Gilang"},
     {"A. Engga tw","B. Skip","C. Linus","D. Sleep"},
     {"A. ?","B. ?","C. ?","D. ?"}
   };
   int skorBenar = 0, skorSalah = 0;
   for(int i=0; i < soalPlusjawaban.length; i++) {
     System.out.println(soalPlusjawaban[i][0]);
     for(int j=0; j < jawaban[0].length; j++) {
       System.out.println(jawaban[i][j]);
     }
     System.out.print("Masukan jawaban anda : ");
     String jwbn = input.nextLine();
     String jwb = jwbn.toLowerCase();
     if(jwb.equals(soalPlusjawaban[i][1]) == true) {
       System.out.println("Jawaban anda benar :)\n");
       skorBenar++;
     }
     else {
       System.out.println("Jawaban anda salah :(\n");
       skorSalah++;
     }
    }
      System.out.println("Skor anda : " + skorBenar * 20);
      System.out.println("Anda Benar : " + skorBenar);
      System.out.println("Anda Salah : " + skorSalah);
  }
}
