package org.example.autoloc.services;

import org.example.autoloc.entities.Employe;

import java.util.List;

public interface EmployeService {
    Employe ajouterEmploye(Employe employe);
    Employe modifierEmploye(Employe employe);
    List<Employe> consulterEmployes();
    Employe consulterEmployeById(Long idemploye);
    void supprimerEmploye(Long idemploye);
}