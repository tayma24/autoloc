package org.example.autoloc.services;

import lombok.AllArgsConstructor;
import org.example.autoloc.entities.Paiement;
import org.example.autoloc.repositories.PaiementRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PaiementServiceImpl implements PaiementService {

    private final PaiementRepository paiementRepository;

    @Override
    public Paiement ajouterPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public Paiement modifierPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public List<Paiement> consulterPaiements() {
        return paiementRepository.findAll();
    }

    @Override
    public Paiement consulterPaiementById(Long idpaiement) {
        return paiementRepository.findById(idpaiement).orElse(null);
    }

    @Override
    public void supprimerPaiement(Long idpaiement) {
        paiementRepository.deleteById(idpaiement);
    }
}