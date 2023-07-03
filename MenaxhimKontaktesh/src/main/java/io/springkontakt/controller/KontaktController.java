package io.springkontakt.controller;

import io.springkontakt.entity.Kontakt;
import io.springkontakt.service.KontaktService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/kontakt")
public class KontaktController {
    @Autowired
    KontaktService service;
    @PostMapping("/save")
public Kontakt saveKontakt(@RequestBody Kontakt kontakt){
        /*private List<Kontakt> kontaktet = new ArrayList<>(Arrays.asList(

                new Kontakt("1", "Erlind", "Skura", "erlind@gmail.com","62642822674"),
                new Kontakt("2", "Era", "Hoxha", "era@gmail.com","626428224"),
                new Kontakt("3", "Ana", "Kodra", "anad@gmail.com","62642822674")
        ));*/
        return service.createKontakt(kontakt);
}

@GetMapping("/getkontaktet")
public List<Kontakt> getKontatet(){

        return service.getKontaktet();
}

@GetMapping("/getkontakt/{id}")
public Kontakt getKontakt(@PathVariable int id){
        return service.getKontakt(id);
}

@PutMapping("/{id}")
public Kontakt updateKontakt(@PathVariable int id, @RequestBody Kontakt kontakt){
        return service.updateKontakt(kontakt, id);
}

@DeleteMapping("/delete/{id}")
public ResponseEntity<String> deleteKontakt(@PathVariable int id){
        service.deleteKontakt(id);
        return new ResponseEntity<String>("Kontakti i fshire me sukses", HttpStatus.OK);
}
}
