package org.example.autoloc.services;

import org.example.autoloc.entities.Agence;
import org.example.autoloc.repositories.AgenceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgenceServiceImpl implements AgenceService {

    private final AgenceRepository agenceRepository;

    public AgenceServiceImpl(AgenceRepository agenceRepository) {
        this.agenceRepository = agenceRepository;
    }

    @Override
    public Agence ajouterAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public Agence modifierAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public List<Agence> consulterAgences() {
        return agenceRepository.findAll();
    }

    @Override
    public Agence consulterAgenceById(Long idagence) {
        return agenceRepository.findById(idagence).orElse(null);
    }

    @Override
    public void supprimerAgence(Long idagence) {
        agenceRepository.deleteById(idagence);
    }
}