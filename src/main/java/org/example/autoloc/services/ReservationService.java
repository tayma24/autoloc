package org.example.autoloc.services;

import org.example.autoloc.entities.Reservation;

import java.util.List;

public interface ReservationService {
    Reservation ajouterReservation(Reservation reservation);
    Reservation modifierReservation(Reservation reservation);
    List<Reservation> consulterReservations();
    Reservation consulterReservationById(Long idreservation);
    void supprimerReservation(Long idreservation);
}