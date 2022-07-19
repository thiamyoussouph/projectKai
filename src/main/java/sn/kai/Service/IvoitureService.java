package sn.kai.Service;

import sn.kai.Entites.Pannes;
import sn.kai.Entites.Vehicules;

public interface IvoitureService {
    Vehicules addVehicule(Vehicules vehicules);
    Vehicules findbyModele(String Matricule);
    Pannes addPanne(Pannes pannes);
    void addpannetoVehicule(Vehicules vehicules,Pannes pannes);
}
