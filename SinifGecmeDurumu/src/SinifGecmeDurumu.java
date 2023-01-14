import java.util.Scanner;
public class SinifGecmeDurumu {
    public static void main(String[] args) {

      int Mat , Kimya , Fizik , Turkce , Bilisim;
      Scanner input = new Scanner(System.in);

         System.out.print("Matematik Notunuz: ");
         Mat = input.nextInt();
         System.out.print("Kimya Notunuz: ");
         Kimya = input.nextInt();
         System.out.print("Fizik Notunuz: ");
         Fizik = input.nextInt();
         System.out.print("Türkçe Notunuz: ");
         Turkce = input.nextInt();
         System.out.print("Bilişim Notunuz: ");
         Bilisim = input.nextInt();

         double Ortalama = (Mat + Kimya + Fizik + Turkce + Bilisim) / 5;

         if (55 >= Ortalama)
         {
             System.out.println("Sınıfta Kaldınız!!!");
             System.out.println("Ortalamanız: " + Ortalama);
         }
        else
         {
             System.out.println("Sınıfı Geçtiniz...");
             System.out.println("Ortalamanız: " + Ortalama);
  }
 }
}
