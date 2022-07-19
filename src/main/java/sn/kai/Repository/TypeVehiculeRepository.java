package sn.kai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.kai.Entites.TypesVehicule;

@Repository
public interface TypeVehiculeRepository extends JpaRepository<TypesVehicule,Integer> {
}
