package io.springkontakt.service;

import io.springkontakt.entity.Kontakt;
import org.springframework.stereotype.Service;

import java.util.List;


public interface KontaktService {
public Kontakt createKontakt(Kontakt kontakt);

public List<Kontakt> getKontaktet();

public Kontakt getKontakt(int id);

public Kontakt updateKontakt(Kontakt kontakt, int id);

public void deleteKontakt(int id);
}
