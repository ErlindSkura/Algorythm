package io.springkontakt.repository;

import io.springkontakt.entity.Kontakt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KontaktRepository extends JpaRepository<Kontakt, Integer> {

}
