package tn.esprit.farahgharbissa1.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
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

public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idVehicule;
    String immatriculation;
    String marque;
    String model;
    @Enumerated(value = EnumType.STRING)
    CategorieVehicule categorie;
    BigDecimal tarifJournalier;
    @Enumerated(value = EnumType.STRING)
    StatutVehicule statut;
    @ManyToOne
    Agence agence;
    @ManyToMany
    Set<Equipement> equipements;
    @OneToMany(mappedBy = "vehicule")
    Set<Reservation> reservations;

}
