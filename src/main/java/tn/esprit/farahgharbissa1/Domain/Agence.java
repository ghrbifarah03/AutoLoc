package tn.esprit.farahgharbissa1.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idAgence;
    String nom;
    String ville;
    String adresse;
    String telephone;
    @OneToMany(mappedBy = "agence", fetch = FetchType.EAGER) //ici fetch optional=> montrer comment forcer le changement (ToMany par defaut Lazy)
    Set<Vehicule> vehicules;
    @OneToMany(mappedBy = "agence")
    Set<Employee> employees;

}
