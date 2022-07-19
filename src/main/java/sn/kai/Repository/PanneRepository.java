package sn.kai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.kai.Entites.Pannes;

@Repository
public interface PanneRepository extends JpaRepository<Pannes,Integer> {
}
