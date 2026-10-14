package tn.esprit.farahgharbissa1.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idContrat;
    LocalDate dateSignature;
    BigDecimal montantTotal;
    boolean valide;
    @OneToMany(mappedBy = "contrat", cascade = CascadeType.ALL)
    Set<Paiement> paiements;
    @OneToOne(mappedBy = "contrat")
    Reservation reservation;

}
