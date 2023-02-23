package miniproject.hastane;

import java.util.List;

public abstract class AbstractHastaIslemler {

    public abstract void exitPatientMenu();
    public abstract void printPatientList(List<Hasta> hastaListe);
    public abstract void addPatient(List<Hasta> hastaListe);
    public abstract Hasta findPatientById(List<Hasta> hastaListe);
    public abstract List deletePatientById(List<Hasta> hastaListe);

    public abstract void statusOfPatient(List<Hasta> hastaListe);
}
