package com.example.tryno4.Entity;

import jakarta.persistence.*;


import java.util.Objects;

@Entity
@Table(name = "adresses", schema = "adress")
public class AdressesEntity {
    private int idAdresses;
    private String name;
    private String adress;

    @Id
    @Column(name = "id_adresses", nullable = false)
    public int getIdAdresses() {
        return idAdresses;
    }

    public void setIdAdresses(int idAdresses) {
        this.idAdresses = idAdresses;
    }

    @Basic
    @Column(name = "Name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "adress", nullable = false, length = 100)
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdressesEntity that = (AdressesEntity) o;
        return idAdresses == that.idAdresses && Objects.equals(name, that.name) && Objects.equals(adress, that.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAdresses, name, adress);
    }
}
