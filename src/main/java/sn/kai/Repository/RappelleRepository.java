package sn.kai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.kai.Entites.Rappelles;

@Repository
public interface RappelleRepository extends JpaRepository<Rappelles,Integer> {
}
