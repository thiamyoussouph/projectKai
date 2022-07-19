package sn.kai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.kai.Entites.Controles;

@Repository
public interface ControleRepository extends JpaRepository<Controles,Integer> {
}
