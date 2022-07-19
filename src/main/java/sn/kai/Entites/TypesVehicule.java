package sn.kai.Entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class TypesVehicule {
   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private  String Libelet;
    @OneToMany(mappedBy ="typesVehicule")
    private Collection<Vehicules>vehicules;
}
