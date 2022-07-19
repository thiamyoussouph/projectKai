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
public class Pannes {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String Libelle;
    private Date DeteEnregistrement;
    @ManyToMany
    private Collection<Vehicules>vehicules;
}
