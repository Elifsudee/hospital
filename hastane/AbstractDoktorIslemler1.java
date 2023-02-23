package miniproject.hastane;

import java.util.LinkedList;

public abstract class AbstractDoktorIslemler1 {

    public abstract   void exitDoctorMenu();
    public abstract void printDoctorList( LinkedList<Doktor> doktorList);
    public abstract void addDoctor( LinkedList<Doktor> doktorList);
    public abstract Doktor findDoctorTitle( LinkedList<Doktor> doktorList);
    public abstract void deleteDoctorId( LinkedList<Doktor> doktorList);

}
