package org.example.autoloc.services;

import org.example.autoloc.entities.Agence;

import java.util.List;

public interface AgenceService {
    Agence ajouterAgence(Agence agence);
    Agence modifierAgence(Agence agence);
    List<Agence> consulterAgences();
    Agence consulterAgenceById(Long idagence);
    void supprimerAgence(Long idagence);
}