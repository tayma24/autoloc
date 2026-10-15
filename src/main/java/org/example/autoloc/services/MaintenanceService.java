package org.example.autoloc.services;

import org.example.autoloc.entities.Maintenance;

import java.util.List;

public interface MaintenanceService {
    Maintenance ajouterMaintenance(Maintenance maintenance);
    Maintenance modifierMaintenance(Maintenance maintenance);
    List<Maintenance> consulterMaintenances();
    Maintenance consulterMaintenanceById(Long idmaintenance);
    void supprimerMaintenance(Long idmaintenance);
}