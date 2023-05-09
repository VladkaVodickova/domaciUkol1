import java.math.BigDecimal;

public class domaciUkol1 {

    public static void ukol1() {
        System.out.println("Hello world!");
    } //missing "" and ;

    public static void ukol2() {
        String uzivatel = "Karel";
        System.out.println(uzivatel);
    } //missing "" again

    public static void ukol3() {
        int pocetLekci = 10;
        System.out.println(pocetLekci);
    }//wrong data type String

    public static void ukol4() {
        double cena = 10.0;
        System.out.println(cena);
    }//wrong decimal mark ,

    public static void ukol5() {
        BigDecimal cena = new BigDecimal(0); // Nastavíme do proměnné hodnotu 0
        // Desetkrát přičteme hodnotu jedna desetina (0,1):
        for (int i = 0; i < 10; i++) {
            cena = cena.add(BigDecimal.valueOf(0.1));
            // operátor "+=" znamená: přičti ke stávající hodnotě navíc 0.1
        }
        System.out.println(cena);
        // Má vypsat "1.0". Ale vypíše "0.9999" !!!
    }//needs to be set as BigDecimal instead of double

    public static void ukol6() {
        BigDecimal cena = new BigDecimal(0);
        cena = cena.add(BigDecimal.valueOf(0.1));
        System.out.println(cena);
    }

    public static void ukol7() {
       int vykonMotoru = 120;
       System.out.println("Výkon Motoru je: "+vykonMotoru+" kW.");
    }//int datatype is not using ""

    public static void ukol8() {
        int velikostKosile = 37;
        System.out.println("Velikost košile je: "+velikostKosile+".");
    }// , is wrong mark for adding variable to sout

    public static void ukol9() {
        System.out.println("Metoda *skoro* bez chybičky!");
    }//missing static in the naming of the function

    public static void main(String[] args) {

        System.out.println("Oprav chyby a spusť všechny metody!");

        System.out.println("Komentáře odstraníš klávesovou "

                +"zkratkou <Ctrl>+</> - použij lomítko "

                +"na numerické klávesnici.");

        ukol1();

        ukol2();

        ukol3();

        ukol4();

        ukol5();

        ukol6();

        ukol7();

        ukol8();

        ukol9();

    }

}