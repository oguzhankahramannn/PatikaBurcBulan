import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak
        Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart*/
        int gun,ay;
        Scanner scan = new Scanner(System.in);
        System.out.println("Hangi ayda doğdunuz : ");
        ay = scan.nextInt();
        System.out.println("Hangi gün doğdunuz : ");
        gun = scan.nextInt();
        if (ay==1) {
            if (gun<=21) {
                System.out.println("Burcunuz : Oğlak");
            }
            else if (gun>21)
                System.out.println("Burcunuz : Kova");
        }
        if (ay==2) {
            if (gun<=19) {
                System.out.println("Burcunuz : Kova");
            }
            else if (gun>=20)
                System.out.println("Burcunuz : Balık");
        }
        if (ay==3) {
            if (gun<=20) {
                System.out.println("Burcunuz : Balık");
            }
            else if (gun>=21)
                System.out.println("Burcunuz : Koç");
        }
        if (ay==4) {
            if (gun<=20) {
                System.out.println("Burcunuz : Koç");
            }
            else if (gun>21)
                System.out.println("Burcunuz : Boğa");
        }
        if (ay==5) {
            if (gun<=21) {
                System.out.println("Burcunuz : Boğa");
            }
            else if (gun>=22)
                System.out.println("Burcunuz : İkizler");
        }
        if (ay==6) {
            if (gun<=22) {
                System.out.println("Burcunuz : İkizler");
            }
            else if (gun>=23)
                System.out.println("Burcunuz : Yengec");
        }
        if (ay==7) {
            if (gun<=22) {
                System.out.println("Burcunuz : Yengeç");
            }
            else if (gun>=23)
                System.out.println("Burcunuz : Aslan");
        }
        if (ay==8) {
            if (gun<=22) {
                System.out.println("Burcunuz : Aslan");
            }
            else if (gun>=23)
                System.out.println("Burcunuz : Başak");
        }
        if (ay==9) {
            if (gun<=22){
                System.out.println("Burcunuz : Başak");
            }
            else if (gun>=23)
                System.out.println("Burcunuz : Terazi");
        }
        if (ay==10) {
            if(gun<=22)
                System.out.println("Burcunuz : Terzi");
        }
        if (ay==11) {
            if (gun<=21) {
                System.out.println("Burcunuz : Akrep");
            }
            else if (gun>=22) {
                System.out.println("Burcunuz : Yay");
            }
        }
        if (ay==12) {
            if (gun<=21) {
                System.out.println("Burcunuz : Yay");
            }
            else if (gun>=22) {
                System.out.println("Burcunuz : Oğlak ");
            }
        }
    }
}