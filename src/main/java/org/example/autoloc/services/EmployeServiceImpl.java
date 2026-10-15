package org.example.autoloc.services;

import lombok.AllArgsConstructor;
import org.example.autoloc.entities.Employe;
import org.example.autoloc.repositories.EmployeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeServiceImpl implements EmployeService {

    private final EmployeRepository employeRepository;

    @Override
    public Employe ajouterEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe modifierEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public List<Employe> consulterEmployes() {
        return employeRepository.findAll();
    }

    @Override
    public Employe consulterEmployeById(Long idemploye) {
        return employeRepository.findById(idemploye).orElse(null);
    }

    @Override
    public void supprimerEmploye(Long idemploye) {
        employeRepository.deleteById(idemploye);
    }
}