package miniproject.hastane;

import java.util.LinkedList;
import java.util.Scanner;

public class DoktorIslemler extends AbstractDoktorIslemler1{

    static Scanner input = new Scanner(System.in);

    public void doktorMenu( LinkedList<Doktor> doktorList) {


        int tercih = 1;
        System.out.println("***********DOKTOR MENUSU******"+"\n" +
                "\t  1=Doktor Ekleme\n" +
                "\t  2=Doktor Listesini Yazdir\n" +
                "\t  3=Unvandan Doktor Bulma\n" +
                "\t  4=IdDoktor Silme\n" +
                "\t  5=DoktorMenusuCikis\n");
        tercih = input.nextInt();
        switch (tercih) {
            case 1:
                addDoctor(doktorList);

                break;
            case 2:
                printDoctorList(doktorList);

                break;
            case 3:
                findDoctorTitle(doktorList);

                break;
            case 4:
                deleteDoctorId(doktorList);

                break;
            case 5:
                exitDoctorMenu();
                break;
            default:
                System.out.println("lutfen gecerli tercih yapiniz");
        }
    }
    @Override
    public void exitDoctorMenu() {
        System.out.println("Ana menuye donmek icin 1' e basiniz" + "\nCikis icin 0' basiniz");
        int secim = input.nextInt();
        if (secim == 1) {
            Start.start();
        } else if (secim == 0) {
            System.out.println("Cikisiniz gerceklesti");

        } else {
            System.out.println("Gecerli bir sayi giriniz");
            exitDoctorMenu();
        }
    }
    @Override
    public void printDoctorList( LinkedList<Doktor> doktorListe) {
        System.out.println("======DoktorMenu======");
        System.out.printf("%-13s  %-15s  %-15s  %-17s \n","Doktor id","Doktor ismi","Doktor Soyisim","unvan");
        System.out.printf("%-13s  %-15s  %-15s  %-17s \n", "---------", "--------","----------", "-----");
        LinkedList<Doktor> liste = doktorListe;
        for (Doktor w : liste) {
            System.out.println(w.getId() + "                " + w.getIsim() + "               " + w.getSoyisim() + "              " + w.getUnvan());

        }
        System.out.println("------------------");
    }
    @Override
    public void addDoctor( LinkedList<Doktor> doktorListe) {
        System.out.println("Eklemek istediginiz doktor idyi giriniz");
        int doktorid = input.nextInt();
        System.out.println("Eklemek istediginiz doktor ismi giriniz");
        String isim = input.next();
        System.out.println("Eklemek istediginiz doktor soyismi giriniz");
        String soyisim = input.next();
        System.out.println("Eklemek istediginiz doktor unvani giriniz");
        String unvan =input.next();
        Doktor doktor = new Doktor(doktorid, isim, soyisim, unvan);
        doktorListe.add(doktor);

    }

    @Override
    public Doktor findDoctorTitle( LinkedList<Doktor> doktorListe) {

        System.out.println("Aradıgınız unvani giriniz");
        String doktorUnvan = input.next();
        for (Doktor dr : doktorListe) {
            if (dr.getUnvan().equals(doktorUnvan)) {
                System.out.println("Aradıgınız doktor " + dr);
                return dr;
            }
        }
        return null;
    }



    @Override
    public void deleteDoctorId( LinkedList<Doktor> doktorListe) {
        System.out.println("Sileceginiz id'yi giriniz");
        int doktorId = input.nextInt();
        for (Doktor m : doktorListe) {
            if (m.getId() == doktorId) {
                doktorListe.remove(m);
                break;
            }
            System.out.println(m);
        }
    }
}
