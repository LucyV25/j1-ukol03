package cz.czechitas.ukol3.model;

import java.util.Objects;

public class Disk {
    private long kapacita;
    private long vyuziteMisto;

    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
//        Objects.requireNonNull(kapacita);
//        if (kapacita.()) {
//            System.err.println("Kapacita musí být nastavena");
//            return;
//        }
        this.kapacita = kapacita;
    }


        public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(long vyuziteMisto) {
        this.vyuziteMisto = vyuziteMisto;
    }

    @Override
    public String toString() {
        return "Disk{" +
                "kapacita=" + kapacita +
                ", vyuziteMisto=" + vyuziteMisto +
                '}';
    }
}


