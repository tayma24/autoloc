package org.example.autoloc.services;

import lombok.AllArgsConstructor;
import org.example.autoloc.entities.Maintenance;
import org.example.autoloc.repositories.MaintenanceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MaintenanceServiceImpl implements MaintenanceService {

    private final MaintenanceRepository maintenanceRepository;

    @Override
    public Maintenance ajouterMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public Maintenance modifierMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public List<Maintenance> consulterMaintenances() {
        return maintenanceRepository.findAll();
    }

    @Override
    public Maintenance consulterMaintenanceById(Long idmaintenance) {
        return maintenanceRepository.findById(idmaintenance).orElse(null);
    }

    @Override
    public void supprimerMaintenance(Long idmaintenance) {
        maintenanceRepository.deleteById(idmaintenance);
    }
}