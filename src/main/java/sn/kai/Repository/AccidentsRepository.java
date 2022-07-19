package sn.kai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.kai.Entites.Accidents;

@Repository
public interface AccidentsRepository extends JpaRepository<Accidents,Integer> {
}
