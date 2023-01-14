import java.util.Scanner;
public class SinifGecmeDurumu {
    public static void main(String[] args) {

      int Mat , Kimya , Fizik , Turkce , Bilisim, maks;

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

        if (Mat < 0 || Mat > 100 || Kimya < 0 || Kimya > 100 || Fizik < 0 || Fizik > 100
                || Turkce < 0 || Turkce > 100 || Bilisim < 0 || Bilisim > 100)
        {
            System.out.println("Lütfen 0-100 aralığında sayı giriniz.");
            return;
        }
         double Ortalama = (Mat + Kimya + Fizik + Turkce + Bilisim) / 5;

        if (55 >= Ortalama)
         {
             System.out.println("Sınıfta Kaldınız!!!");
             System.out.println("Ortalamanız: " + Ortalama);
         }
         else if (55<=Ortalama)
         {
             System.out.println("Sınıfı Geçtiniz...");
             System.out.println("Ortalamanız: " + Ortalama);
  }
 }
}
