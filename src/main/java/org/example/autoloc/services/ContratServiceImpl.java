package org.example.autoloc.services;

import lombok.AllArgsConstructor;
import org.example.autoloc.entities.Contrat;
import org.example.autoloc.repositories.ContratRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ContratServiceImpl implements ContratService {

    private final ContratRepository contratRepository;

    @Override
    public Contrat ajouterContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public Contrat modifierContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public List<Contrat> consulterContrats() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat consulterContratById(Long idcontrat) {
        return contratRepository.findById(idcontrat).orElse(null);
    }

    @Override
    public void supprimerContrat(Long idcontrat) {
        contratRepository.deleteById(idcontrat);
    }
}