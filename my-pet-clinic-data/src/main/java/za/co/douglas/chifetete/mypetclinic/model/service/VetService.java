package za.co.douglas.chifetete.mypetclinic.model.service;

import za.co.douglas.chifetete.mypetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long vetId);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
