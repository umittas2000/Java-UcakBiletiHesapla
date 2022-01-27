import java.util.Scanner;

public class UcakBiletiHesapla {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int mesafe,yas,gidisDonus;
        double ucret;

        System.out.print("Gideceginiz mesafe(Km)?: ");
        mesafe = input.nextInt();

        System.out.print("Yasiniz?: ");
        yas = input.nextInt();

        System.out.print("1-Tek yon , 2- Gidis donus?[1 yada 2]:");
        gidisDonus=input.nextInt();

        if(mesafe>0 && yas>0 && (gidisDonus>=1 && gidisDonus<=2))
        {
            ucret = mesafe * 0.10;

            if(yas<12) {
                ucret = ucret -(ucret * 0.5);
            }else if(yas>=12 && yas<=24){
                ucret = ucret-(ucret *0.10);
            }else if(yas>=65){
                ucret = ucret -(ucret*0.3);
            }

            if(gidisDonus==2){
                ucret=(ucret-(ucret*0.20))*2;
            }

            System.out.println("Ucak biletiniz: " + ucret +" TL. Tutarindadir.");

        }else{
            System.out.println("Girilen veride sorun var, Lutfen tekrar deneyin...");
        }

    }
}
