package cz.czechitas.ukol3.model;

public class Pocitac {
    private Procesor procesor;
    private Pamet pamet;

    private boolean jeZapnuty;
    private Procesor cpu;

    private Pamet ram;
    private Disk pevnyDisk;
    private boolean isJeZapnuty;

    public Procesor getProcesor() {
        return procesor;
    }

    public void setProcesor(Procesor procesor) {
        this.procesor = procesor;
    }

    public Pamet getPamet() {
        return pamet;
    }

    public void setPamet(Pamet pamet) {
        this.pamet = pamet;
    }

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }


    public boolean jeZapnuty() {
        if (jeZapnuty) {
            System.out.println("Pocitac je zapnutý");
            return true;
        } else {
            System.out.println("Počítač je vypnutý");
            return false;
        }
    }

    public void zapniSe(Pamet pamet, Procesor procesor, Disk disk) {
        if (!jeZapnuty) {
            if ((pamet == null) || (procesor == null) || (disk == null)) {
                System.err.println("Paměť, procesor ani disk nesmí být prázdné.");
            } else {
                setJeZapnuty(true); // nebo jeZapnuty = true
            }
        } else {
            System.err.println("nemuzes zapnout jiz zapnuty pc");
        }
    }

    public void vypniSe() {
        if (jeZapnuty) {
            setJeZapnuty(false); // nebo jeZapnuty = false;
        } else {
            System.err.println("Nemuzes vypnout vypnuty pc.");
        }
    }

    public void vytvorSouborOVelikosti(long velikost) {
        if (jeZapnuty) {
            long vyuziteMisto = pevnyDisk.getVyuziteMisto();
            long kapacita = pevnyDisk.getKapacita();
            long zbyvajiciMisto=kapacita-vyuziteMisto-velikost;
            if ((vyuziteMisto + velikost) > kapacita) {
                System.err.println("Kapacita disku nedostacuje.");
            } else {
                pevnyDisk.setVyuziteMisto(vyuziteMisto + velikost);
                System.out.println("Zbývající místo na disku: " + (zbyvajiciMisto));
            }

        } else {
            System.err.println("Pc je vypnutý");
        }
    }

    public void vymazSouboryOVelikosti(long velikost) {
        if (jeZapnuty) {
            long vyuziteMisto = pevnyDisk.getVyuziteMisto();
            long kapacita = pevnyDisk.getKapacita();
            long zbyvajiciMisto=kapacita-vyuziteMisto+velikost;
            if (velikost < vyuziteMisto) {
                pevnyDisk.setVyuziteMisto(vyuziteMisto + velikost);
            } else {
                pevnyDisk.setVyuziteMisto(0);
            }

            System.out.println("Zbývající místo na disku: " + (zbyvajiciMisto));
        } else {
            System.err.println("Pc je vypnutý");
        }
    }

    public boolean isJeZapnuty() {
        return jeZapnuty;
    }

    public void setJeZapnuty(boolean jeZapnuty) {
        this.jeZapnuty = jeZapnuty;
    }

    @Override
    public String toString() {
        return "Pocitac{" +
                "procesor=" + procesor +
                ", pamet=" + pamet +
                ", disk=" + pevnyDisk +
                ", cpu=" + cpu +
                ", ram=" + ram +
                ", pevnyDisk=" + pevnyDisk +
                '}';
    }
}

