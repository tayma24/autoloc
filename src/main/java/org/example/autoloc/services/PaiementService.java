package org.example.autoloc.services;

import org.example.autoloc.entities.Paiement;

import java.util.List;

public interface PaiementService {
    Paiement ajouterPaiement(Paiement paiement);
    Paiement modifierPaiement(Paiement paiement);
    List<Paiement> consulterPaiements();
    Paiement consulterPaiementById(Long idpaiement);
    void supprimerPaiement(Long idpaiement);
}