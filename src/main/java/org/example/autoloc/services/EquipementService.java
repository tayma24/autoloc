package org.example.autoloc.services;

import org.example.autoloc.entities.Equipement;

import java.util.List;

public interface EquipementService {
    Equipement ajouterEquipement(Equipement equipement);
    Equipement modifierEquipement(Equipement equipement);
    List<Equipement> consulterEquipements();
    Equipement consulterEquipementById(Long idequipement);
    void supprimerEquipement(Long idequipement);
}