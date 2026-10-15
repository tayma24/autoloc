package org.example.autoloc.services;

import lombok.AllArgsConstructor;
import org.example.autoloc.entities.Equipement;
import org.example.autoloc.repositories.EquipementRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipementServiceImpl implements EquipementService {

    private final EquipementRepository equipementRepository;

    @Override
    public Equipement ajouterEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public Equipement modifierEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public List<Equipement> consulterEquipements() {
        return equipementRepository.findAll();
    }

    @Override
    public Equipement consulterEquipementById(Long idequipement) {
        return equipementRepository.findById(idequipement).orElse(null);
    }

    @Override
    public void supprimerEquipement(Long idequipement) {
        equipementRepository.deleteById(idequipement);
    }
}