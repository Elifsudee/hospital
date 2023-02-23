package miniproject.hastane;

import java.util.List;
import java.util.Scanner;

public class HastaIslemler extends AbstractHastaIslemler{

    static Scanner input = new Scanner(System.in);
    public void hastaMenu(List<Hasta> hastaListe ){
        int tercih = 1;
        System.err.println("***********HASTA MENUSU******\n" +
                "\t  1=Hasta Ekleme\n" +
                "\t  2=Hasta Listesini Yazdir\n" +
                "\t  3=Id'den Hasta Bulma\n" +
                "\t  4=Hasta Silme\n" +
                "\t  5=Hasta durumu\n"+
                "\t  6=HastaMenusuCikis\n");
        tercih = input.nextInt();
        switch (tercih) {
            case 1:
                addPatient( hastaListe);
                break;
            case 2:
                printPatientList(hastaListe);
                break;
            case 3:
                findPatientById(hastaListe);
                break;
            case 4:
                deletePatientById(hastaListe);
                break;
            case 5:
                statusOfPatient(hastaListe);
                break;
            case 6:
                exitPatientMenu();
                break;
            default:
                System.err.println("lutfen gecerli tercih yapiniz");
        }
    }
    @Override
    public void exitPatientMenu() {
        System.out.println("=======Cikis Menusu======");
        System.out.println("Ana menuye donmek icin 1' e basiniz" + "\nCikis icin 0' basiniz");
        int secim = input.nextInt();
        if (secim == 1) {
            Start.start();
        } else if (secim == 0) {
            System.out.println("Cikisiniz gerceklesti");
        } else {
            System.out.println("Gecerli bir sayi giriniz");
            exitPatientMenu();
        }
    }
    @Override
    public void printPatientList(List<Hasta> hastaListe) {
        System.out.println("======HastaMenu======");
        List<Hasta> liste = hastaListe;
        for (Hasta w : liste) {
            System.out.println( w.getIsim() + "  " + w.getSoyisim() + " " + w.getIdNo()+" "+w.getHastaDurum());
        }
        System.out.println("-----------");
    }
    @Override
    public void addPatient(List<Hasta> hastaListe) {
        System.out.println("Eklemek istediginiz hastanin ismini giriniz");
        String hastaIsmi = input.next();
        System.out.println("Eklemek istediginiz hasta soyismini giriniz");
        String soyIsim = input.next();
        System.out.println("Eklemek istediginiz hastanin idsini giriniz");
        int idNo = input.nextInt();
        System.out.println("Eklemek istediginiz hastanin durumunu giriniz");
        PatientStatus  durum= PatientStatus.valueOf(input.next());
        Hasta hasta = new Hasta(hastaIsmi,soyIsim,idNo,durum);
        hastaListe.add(hasta);
    }
    @Override
    public Hasta findPatientById(List<Hasta> hastaListe) {
        System.out.println("Aradıgınız hasta idyi giriniz");
        int hastaId = input.nextInt();
        for (Hasta ht : hastaListe) {
            if (ht.getIdNo()==hastaId) {
                System.out.println("Aradiginiz Hasta : "+ht.getIsim()+" "+  ht.getSoyisim()+" "+  ht.getHastaDurum());
                // return ht.getIsim() + " "+ ht.getSoyisim()+ " "+ ht.getHastaDurum();
            }
        }
        System.out.println("Aradiginiz hasta bulundu");
        return null;
    }
    @Override
    public List deletePatientById(List<Hasta> hastaListe) {
        System.out.println("Sileceginiz hastanin id'sini giriniz");
        int hastaId = input.nextInt();
        for (Hasta m : hastaListe) {
            if (m.getIdNo() == hastaId) {
                hastaListe.remove(m);
                return hastaListe;
            }
            System.out.println(m);
        }
        return null;

    }
    @Override
    public void statusOfPatient(List<Hasta> hastaListe) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hasta durumu giriniz"+"\n Kritik icin 1'e"+"\n Acil icin 2'e"+"\n Ayakta tedavi 3'e basiniz");
        int hastaDurum = input.nextInt();
        for (Hasta k :hastaListe){
            if (k.getHastaDurum().getVal()==hastaDurum){
                System.out.println("Hasta durumu :" + k.getIsim()+ " isimli hasta " + k.getHastaDurum().getDesc());
            }else if (k.getHastaDurum().getVal()==hastaDurum){
                System.out.println("Hasta durumu :"+k.getIsim()+" isimli hasta "+k.getHastaDurum().getDesc());
            }else if (k.getHastaDurum().getVal()==hastaDurum){
                System.out.println("Hasta durumu :"+k.getIsim()+" isimli hasta "+k.getHastaDurum().getDesc());
            }
        }

}
}