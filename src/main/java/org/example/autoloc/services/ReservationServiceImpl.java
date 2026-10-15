package org.example.autoloc.services;

import lombok.AllArgsConstructor;
import org.example.autoloc.entities.Reservation;
import org.example.autoloc.repositories.ReservationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;

    @Override
    public Reservation ajouterReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation modifierReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> consulterReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation consulterReservationById(Long idreservation) {
        return reservationRepository.findById(idreservation).orElse(null);
    }

    @Override
    public void supprimerReservation(Long idreservation) {
        reservationRepository.deleteById(idreservation);
    }
}