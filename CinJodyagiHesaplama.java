package Odev4;
import java.util.Scanner;
public class CinJodyagiHesaplama {
    public static void main(String[] args) {
        int year;
        double remainder;
        Scanner input=new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz:");
        year =input.nextInt();

        remainder=year%12;

        if (remainder==0){
            System.out.println("Çin Zodyağı Burcunuz Maymun");
        }
        else if(remainder==1){
            System.out.println("Çin Zodyağı Burcunuz Horoz");
        }
        else if(remainder==2){
            System.out.println("Çin Zodyağı Burcunuz Köpek");
        }
        else if(remainder==3){
            System.out.println("Çin Zodyağı Burcunuz Domuz");
        }
        else if(remainder==4){
            System.out.println("Çin Zodyağı Burcunuz Fare");
        }
        else if(remainder==5){
            System.out.println("Çin Zodyağı Burcunuz Öküz");
        }
        else if(remainder==6){
            System.out.println("Çin Zodyağı Burcunuz Kaplan");
        }
        else if(remainder==7){
            System.out.println("Çin Zodyağı Burcunuz Tavşan");
        }
        else if(remainder==8){
            System.out.println("Çin Zodyağı Burcunuz Ejderha");
        }
        else if(remainder==9){
            System.out.println("Çin Zodyağı Burcunuz Yılan");
        }
        else if(remainder==10){
            System.out.println("Çin Zodyağı Burcunuz At");
        }
        else if(remainder==11){
            System.out.println("Çin Zodyağı Burcunuz Koyun");
        }
        else {
            System.out.println("Yanlış Değer Girdiniz. ");
        }

    }
}
