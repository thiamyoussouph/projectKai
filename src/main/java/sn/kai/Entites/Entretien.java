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
public class Entretien {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String Libeelle;
private Date DateEnregistrement;
@ManyToOne
 private Vehicules vehicules;
@OneToMany(mappedBy = "entretien")
private Collection<TypesEntretien>typesEntretiens;
@ManyToOne
private Rappelles rappelles;
}
