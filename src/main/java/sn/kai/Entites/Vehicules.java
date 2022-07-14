package sn.kai.Entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Vehicules {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Matricule;
    private String Modele;
    private int NombrePlace;
    private Date DateSortie;
    private Date DateMiseEnMarche;
    private boolean Etats;
    private boolean Statuts;

}
