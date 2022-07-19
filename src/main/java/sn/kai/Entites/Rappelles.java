package sn.kai.Entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Rappelles {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date DateRapelle;
    @OneToMany(mappedBy = "rappelles")
    private Collection<Entretien>entretiens;
}
