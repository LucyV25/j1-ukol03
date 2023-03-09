package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Pocitac;
import cz.czechitas.ukol3.model.Procesor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {

        System.out.println("Program spuštěn.");
        Pocitac luckyPocitac;
        luckyPocitac = new Pocitac();
        System.out.println(luckyPocitac.toString());
        luckyPocitac.zapniSe(null, null, null); // vypise chybu do konzole

        Procesor luckyProcesor = new Procesor();
        luckyProcesor.setRychlost(2_400_000_000L);
        luckyProcesor.setVyrobce("Intel");

        Pamet luckyPamet = new Pamet();
        luckyPamet.setKapacita(8_000_000_000L);

        Disk luckyDisk = new Disk();
        luckyDisk.setKapacita(232_000_000_000L);

        luckyPocitac.setCpu(luckyProcesor);
        luckyPocitac.setRam(luckyPamet);
        luckyPocitac.setPevnyDisk(luckyDisk);

        System.out.println(luckyPocitac.toString());

        luckyPocitac.zapniSe(luckyPamet, luckyProcesor, luckyDisk);
//        System.out.println("Zapnul se počítač? "+luckyPocitac.jeZapnuty());
        luckyPocitac.zapniSe(luckyPamet, luckyProcesor, luckyDisk);
        System.out.println(luckyPocitac.toString());
        luckyPocitac.vypniSe();
//        System.out.println("Vypnul se počítač? "+luckyPocitac.jeZapnuty());

        luckyPocitac.vypniSe();
        luckyPocitac.vypniSe();

    }

}
