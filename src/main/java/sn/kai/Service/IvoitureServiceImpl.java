package sn.kai.Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sn.kai.Entites.Pannes;
import sn.kai.Entites.Vehicules;
import sn.kai.Repository.*;

import java.util.UUID;

@Service
@Transactional
public class IvoitureServiceImpl implements IvoitureService {
    private VehiculeRepository vehiculeRepository;
    private AccidentsRepository accidentsRepository;
    private ControleRepository controleRepository;
    private PanneRepository panneRepository;
    private RappelleRepository rappelleRepository;
    private TypesEntretiensRepository typesEntretiensRepository;
    private EntretienRepository entretienRepository;
    private TypeVehiculeRepository typeVehiculeRepository;

    @Override
    public Vehicules addVehicule(Vehicules vehicules) {
        vehicules.setMatricule(UUID.randomUUID().toString());
        return vehiculeRepository.save(vehicules);
    }

    @Override
    public Vehicules findbyModele(String Matricule) {
        return null;
    }

    @Override
    public Pannes addPanne(Pannes pannes) {
        return panneRepository.save(pannes);
    }

    @Override
    public void addpannetoVehicule(Vehicules vehicules, Pannes pannes) {

    }
}
