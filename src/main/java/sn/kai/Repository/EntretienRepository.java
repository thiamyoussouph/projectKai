package sn.kai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.kai.Entites.Entretien;

@Repository
public interface EntretienRepository extends JpaRepository<Entretien, Integer> {
}
