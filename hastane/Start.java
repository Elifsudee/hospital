package miniproject.hastane;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        start();

    }

    public static void start(){
        LinkedList<Doktor> doktorListe = new LinkedList<>();
        Doktor doktor1 = new Doktor(10, "elif", "sutcu", "norolog");
        Doktor doktor2 = new Doktor(11, "ahmet", "kaya", "fizyolog");
        Doktor doktor3 = new Doktor(12, "kubra", "aydogdu", "kardiyolog");
        Doktor doktor4 = new Doktor(13, "tuba", "koyuncuoglu", "dahiliye");
        Doktor doktor5 = new Doktor(15, "sumeyye", "palanci", "kbb");
        Doktor doktor6 = new Doktor(17,"omer","guldalli","goz");
        doktorListe.add(doktor1);
        doktorListe.add(doktor2);
        doktorListe.add(doktor3);
        doktorListe.add(doktor4);
        doktorListe.add(doktor5);
        doktorListe.add(doktor6);
        //**************************

        List<Hasta> hastaListe = new LinkedList<>();
        Hasta hasta1 = new Hasta("kemal","has",12,PatientStatus.KIRMIZI_ALAN);
        Hasta hasta2 = new Hasta("kemale","hasin",14,PatientStatus.SARI_ALAN);
        Hasta hasta3 = new Hasta("kamil","hasan",16,PatientStatus.YESIL_ALAN);
        Hasta hasta4 = new Hasta("rahime","durdu",18,PatientStatus.MAVI_ALAN);
        Hasta hasta5 = new Hasta("seybe","kilanli",20,PatientStatus.KIRMIZI_ALAN);
        hastaListe.add(hasta1);
        hastaListe.add(hasta2);
        hastaListe.add(hasta3);
        hastaListe.add(hasta4);
        hastaListe.add(hasta5);


        Scanner input = new Scanner(System.in);
        DoktorIslemler doktorIslemler= new DoktorIslemler();
        HastaIslemler hastaIslemler = new HastaIslemler();
        System.out.println("******Q8 Hastanemize Hosgeldiniz******");
        int tercih;
        do {
            System.out.println("1-Doktor menusu gidiniz");
            System.out.println("2-Hasta menusuna gidiniz");
            System.out.println("0-Cikis yapiniz");
            System.out.println("Seciminiz:");
            tercih = input.nextInt();
            switch (tercih){
                case 1:
                    doktorIslemler.doktorMenu(doktorListe);
                    break;
                case 2:
                    hastaIslemler.hastaMenu(hastaListe);
                    break;
                case 0:
                    System.out.println("iyi gunler dileriz");
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz tekrar deneyin");
            }
        }while (tercih!=0);
    }


}
