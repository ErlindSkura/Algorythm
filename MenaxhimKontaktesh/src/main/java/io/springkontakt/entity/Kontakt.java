package io.springkontakt.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Kontakt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String emerKontakti;
    @Column
    private String mbiemerKontakti;
    @Column
    private String email;
    @Column
    private int nrTelefoni;
    public Kontakt() {

    }

    public Kontakt(int id, String emerKontakti, String mbiemerKontakti,
                   String email, int nrTelefoni) {
        super();
        this.id = id;
        this.emerKontakti = emerKontakti;
        this.mbiemerKontakti = mbiemerKontakti;
        this.email = email;
        this.nrTelefoni = nrTelefoni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmerKontakti() {
        return emerKontakti;
    }

    public void setEmerKontakti(String emerKontakti) {
        this.emerKontakti = emerKontakti;
    }

    public String getMbiemerKontakti() {
        return mbiemerKontakti;
    }

    public void setMbiemerKontakti(String mbiemerKontakti) {
        this.mbiemerKontakti = mbiemerKontakti;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNrTelefoni() {
        return nrTelefoni;
    }

    public void setNrTelefoni(int nrTelefoni) {
        this.nrTelefoni = nrTelefoni;
    }
}
