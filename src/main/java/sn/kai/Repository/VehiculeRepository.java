package sn.kai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.kai.Entites.Vehicules;

@Repository
public interface VehiculeRepository extends JpaRepository<Vehicules,Integer> {
}
