import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat;
        int fizik;
        int turkce;
        int kimya;
        int muzik;
        double avarage;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();


        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();


        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();


        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();


        System.out.println("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();


        if(mat<0 || mat>100 || fizik<0 || fizik>100 || turkce<0 || turkce>100 || kimya<0 || kimya>100 || muzik<0 || muzik>100){
            System.out.println("Hatalı bir değer girdiniz!");
        } else{
            avarage = (mat + fizik + turkce + kimya + muzik)/5.0;
            if(avarage > 55){
                System.out.println("Ortalamanız: " + avarage + ". Sınıfı geçtiniz."  );
            } else{
                System.out.println("Ortalamanız: " + avarage + ". Sınıfta kaldınız. Daha çok çalışmalısınız!");
            }

        }


    }
}