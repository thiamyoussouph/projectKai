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
public class Vehicules {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Matricule",unique = true,length = 20)
    private String Matricule;
    private String Modele;
    private int NombrePlace;
    private Date DateSortie;
    private Date DateMiseEnMarche;
    private boolean Etats;
    private boolean Statuts;
    @ManyToOne
    private  TypesVehicule typesVehicule;
     @ManyToMany(fetch = FetchType.EAGER)
     @JoinTable(name = "Controle-Voiture")
    private Collection<Controles>controles;
     @ManyToOne
   private Accidents accidents;
     @OneToMany(mappedBy = "vehicules")
     private Collection<Entretien> entretiens;
     @ManyToMany(mappedBy = "vehicules",fetch = FetchType.LAZY)
     private Collection<Pannes>panne;

}
