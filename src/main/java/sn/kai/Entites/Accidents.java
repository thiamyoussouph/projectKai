package sn.kai.Entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Accidents {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String Libelle;
private String Description;
private String Photo;
private String Lieux;
private String Cause;
@OneToMany(mappedBy = "accidents")
private Collection<Vehicules>vehicules;



}
