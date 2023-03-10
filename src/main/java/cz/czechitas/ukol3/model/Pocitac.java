package cz.czechitas.ukol3.model;

import javax.lang.model.element.ModuleElement;
import java.util.concurrent.atomic.LongAdder;

import static java.util.Objects.isNull;

public class Pocitac {
    private Procesor procesor;
    private Pamet pamet;
    private Disk disk;

    private boolean jeZapnuty;
    private Procesor cpu;

    private Pamet ram;
    private Disk pevnyDisk;
    private long velikost;
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

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
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
            if ((pamet==null) || (procesor==null) || (disk==null)) {
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
//            System.err.println("Nemuzes vypnout vypnuty pc.");
            return;
        }
    }

    public void vytvorSouborOVelikosti(long velikost){
        if(jeZapnuty==true){
//            Disk disk=new Disk();
//            long vyuziteMisto=disk.getVyuziteMisto();
//            LongAdder num = new LongAdder();
//            num.add(vyuziteMisto+velikost);
            long vyuziteMisto=disk.getVyuziteMisto();
            long updateDisk=vyuziteMisto + velikost;
            vyuziteMisto=updateDisk;
            System.out.println("Zbývající místo na disku: "+vyuziteMisto);
            return;
        }
        else {
            System.err.println("Pc je vypnutý");
        }
    }
    public void vymazSouboryOVelikosti(long velikost){

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
                ", disk=" + disk +
                ", cpu=" + cpu +
                ", ram=" + ram +
                ", pevnyDisk=" + pevnyDisk +
                '}';
    }
}

