package cz.czechitas.ukol3.model;

public class Pocitac {
    private Procesor procesor;
    private Pamet pamet;
    private Disk disk;

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
        if (jeZapnuty==true){
            System.out.println("Pocitac je zapnutý");
            return true;
        }
        else {
            System.out.println("Počítač je vypnutý");
            return false;
        }
    }
    public void zapniSe(Pamet pamet, Procesor procesor, Disk disk){
        if(jeZapnuty=false){
            if((pamet==null) || (procesor==null) || (disk==null)){
                System.err.println("Paměť nemůže být prázdná.");
            }
        }
           else {
            System.err.println("nemuzes zapnout jiz zapnuty pc");
               return;
        }
        return jeZapnuty==true;


    }
    public void vypniSe(){
        if(jeZapnuty=true){
            return jeZapnuty==false;
        }
        else{
            return;
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
                ", disk=" + disk +
                ", cpu=" + cpu +
                ", ram=" + ram +
                ", pevnyDisk=" + pevnyDisk +
                '}';
    }
}

