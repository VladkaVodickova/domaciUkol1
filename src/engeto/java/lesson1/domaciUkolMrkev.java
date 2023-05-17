package engeto.java.lesson1;

import java.time.LocalDate;

public class domaciUkolMrkev {
    public static void main(String[] args) {
        /*
        O každém prodejci potřebujeme evidovat tyto údaje:
            Jméno a příjmení prodejce
        Datum narození prodejce.
        Počet dosud sjednaných smluv.
        Celkové množství prodané mrkve v tunách.
        Název města, kde prodejce sídlí.
        Registrační značka vozidla („SPZ“).
        Spotřeba firemního vozidla v litrech na 100 km.
        IP adresa verze 4 firemního počítače.
        Více o formátu IP adresy verze 4 viz například IP adresa verze 4

        Na základě zadaných údajů vypiš v metodě main na obrazovku průměrné množství prodané mrkve na jednu smlouvu.
         */
        String firstName = "Jan";
        String lastName = "Kozak";
        String name = firstName+" "+lastName;
        LocalDate dateOfBirth = LocalDate.of(1989,6,23);
        int numberOfContracts = 45;
        double totalWeightOfSoldCarrot = 34;
        String townOfOrigin = "Rosice";
        String SPZ = "PR-4567";
        double vehicleFuelConsumption = 3.4;
        String ipV4Address = "192.168.1.1";
        String versionOfIpAddress = "verze 4";

        double averageAmountOfSoldCarrot = totalWeightOfSoldCarrot/numberOfContracts;

        System.out.println("Průměrné množství prodané mrkve na jednu smlouvu je "+averageAmountOfSoldCarrot+" t.");
    }
}
