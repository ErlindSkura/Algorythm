package io.springkontakt.service;

import io.springkontakt.entity.Kontakt;
import io.springkontakt.repository.KontaktRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service

public class KontaktServiceImp implements KontaktService{

    @Autowired
    KontaktRepository repo;
    public Kontakt createKontakt(Kontakt kontakt){
     return repo.save(kontakt);
    }

    public List<Kontakt> getKontaktet() {
       return repo.findAll();
    }


    public Kontakt getKontakt(int id) {
       return repo.findById(id).orElse(null);
    }


    public Kontakt updateKontakt(Kontakt kontakt, int id) {
        Kontakt oldKontakt= repo.findById(id).orElse(null);
        oldKontakt.setId(kontakt.getId());
        oldKontakt.setEmerKontakti(kontakt.getEmerKontakti());
        oldKontakt.setMbiemerKontakti(kontakt.getMbiemerKontakti());
        oldKontakt.setEmail(kontakt.getEmail());
        oldKontakt.setNrTelefoni(kontakt.getNrTelefoni());
        repo.save(oldKontakt);
        return oldKontakt;
    }

    public void deleteKontakt(int id) {

        repo.deleteById(id);
    }
}
