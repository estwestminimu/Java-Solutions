import java.util.Set;

public class Main {


    public static void main(String[] args) {

        Przepisy.grzanie();


    }

    public class Przepisy {
        public static void grzanie() {


       if(true)
       {
           Kuchnia kuchnia = new EKuchnia(); // Przyklad implementacji Kuchni


           for (Produkt produkt : Produkt.values()) {
               kuchnia.dodajDoSpizarni(produkt, 500);
           }


           // Przepis: przepis_Placki_Smazone_Szybko
           Set<Skladnik> skladniki_przepis_Placki_Smazone_Szybko = Set.of(
                   new Skladnik(Produkt.MARGARYNA, 16),
                   new Skladnik(Produkt.DROZDZE, 47),
                   new Skladnik(Produkt.MAKA_PSZENNA, 16),
                   new Skladnik(Produkt.MASLO, 107)
           );

           Przepis przepis_Placki_Smazone_Szybko = () -> skladniki_przepis_Placki_Smazone_Szybko;

           System.out.println("Przepis: " + skladniki_przepis_Placki_Smazone_Szybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Placki_Smazone_Szybko = kuchnia.przeliczPrzepis(przepis_Placki_Smazone_Szybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Placki_Smazone_Szybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Placki_Smazone_Szybko = () -> przeliczonyPrzepis_przepis_Placki_Smazone_Szybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Placki_Smazone_Szybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Placki_Smazone_Wolno
           Set<Skladnik> skladniki_przepis_Placki_Smazone_Wolno = Set.of(
                   new Skladnik(Produkt.MAKA_RAZOWA, 23),
                   new Skladnik(Produkt.RODZYNKI, 11),
                   new Skladnik(Produkt.OLEJ_ROSLINNY, 36),
                   new Skladnik(Produkt.CUKIER, 96)
           );

           Przepis przepis_Placki_Smazone_Wolno = () -> skladniki_przepis_Placki_Smazone_Wolno;

           System.out.println("Przepis: " + skladniki_przepis_Placki_Smazone_Wolno);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Placki_Smazone_Wolno = kuchnia.przeliczPrzepis(przepis_Placki_Smazone_Wolno);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Placki_Smazone_Wolno);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Placki_Smazone_Wolno = () -> przeliczonyPrzepis_przepis_Placki_Smazone_Wolno;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Placki_Smazone_Wolno)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Placki_Smazone_TakSe
           Set<Skladnik> skladniki_przepis_Placki_Smazone_TakSe = Set.of(
                   new Skladnik(Produkt.OLEJ_ROSLINNY, 11),
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 16),
                   new Skladnik(Produkt.MASLO, 28),
                   new Skladnik(Produkt.CUKIER_PUDER, 81)
           );

           Przepis przepis_Placki_Smazone_TakSe = () -> skladniki_przepis_Placki_Smazone_TakSe;

           System.out.println("Przepis: " + skladniki_przepis_Placki_Smazone_TakSe);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Placki_Smazone_TakSe = kuchnia.przeliczPrzepis(przepis_Placki_Smazone_TakSe);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Placki_Smazone_TakSe);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Placki_Smazone_TakSe = () -> przeliczonyPrzepis_przepis_Placki_Smazone_TakSe;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Placki_Smazone_TakSe)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Placki_Smazone_NaSzybko
           Set<Skladnik> skladniki_przepis_Placki_Smazone_NaSzybko = Set.of(
                   new Skladnik(Produkt.WODA, 76),
                   new Skladnik(Produkt.CUKIER_PUDER, 14),
                   new Skladnik(Produkt.MAKA_RAZOWA, 69),
                   new Skladnik(Produkt.DROZDZE, 85)
           );

           Przepis przepis_Placki_Smazone_NaSzybko = () -> skladniki_przepis_Placki_Smazone_NaSzybko;

           System.out.println("Przepis: " + skladniki_przepis_Placki_Smazone_NaSzybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Placki_Smazone_NaSzybko = kuchnia.przeliczPrzepis(przepis_Placki_Smazone_NaSzybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Placki_Smazone_NaSzybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Placki_Smazone_NaSzybko = () -> przeliczonyPrzepis_przepis_Placki_Smazone_NaSzybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Placki_Smazone_NaSzybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Placki_Gotowane_Szybko
           Set<Skladnik> skladniki_przepis_Placki_Gotowane_Szybko = Set.of(
                   new Skladnik(Produkt.MASLO, 56),
                   new Skladnik(Produkt.WODA, 23),
                   new Skladnik(Produkt.WODA, 31),
                   new Skladnik(Produkt.CUKIER_PUDER, 12)
           );

           Przepis przepis_Placki_Gotowane_Szybko = () -> skladniki_przepis_Placki_Gotowane_Szybko;

           System.out.println("Przepis: " + skladniki_przepis_Placki_Gotowane_Szybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Placki_Gotowane_Szybko = kuchnia.przeliczPrzepis(przepis_Placki_Gotowane_Szybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Placki_Gotowane_Szybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Placki_Gotowane_Szybko = () -> przeliczonyPrzepis_przepis_Placki_Gotowane_Szybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Placki_Gotowane_Szybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Placki_Gotowane_Wolno
           Set<Skladnik> skladniki_przepis_Placki_Gotowane_Wolno = Set.of(
                   new Skladnik(Produkt.PROSZEK_DO_PIECZENIA, 64),
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 66),
                   new Skladnik(Produkt.MLEKO, 88),
                   new Skladnik(Produkt.RODZYNKI, 27)
           );

           Przepis przepis_Placki_Gotowane_Wolno = () -> skladniki_przepis_Placki_Gotowane_Wolno;

           System.out.println("Przepis: " + skladniki_przepis_Placki_Gotowane_Wolno);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Placki_Gotowane_Wolno = kuchnia.przeliczPrzepis(przepis_Placki_Gotowane_Wolno);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Placki_Gotowane_Wolno);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Placki_Gotowane_Wolno = () -> przeliczonyPrzepis_przepis_Placki_Gotowane_Wolno;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Placki_Gotowane_Wolno)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Placki_Gotowane_TakSe
           Set<Skladnik> skladniki_przepis_Placki_Gotowane_TakSe = Set.of(
                   new Skladnik(Produkt.MAKA_RAZOWA, 13),
                   new Skladnik(Produkt.OLEJ_ROSLINNY, 57),
                   new Skladnik(Produkt.MASLO, 55),
                   new Skladnik(Produkt.CUKIER_PUDER, 38)
           );

           Przepis przepis_Placki_Gotowane_TakSe = () -> skladniki_przepis_Placki_Gotowane_TakSe;

           System.out.println("Przepis: " + skladniki_przepis_Placki_Gotowane_TakSe);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Placki_Gotowane_TakSe = kuchnia.przeliczPrzepis(przepis_Placki_Gotowane_TakSe);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Placki_Gotowane_TakSe);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Placki_Gotowane_TakSe = () -> przeliczonyPrzepis_przepis_Placki_Gotowane_TakSe;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Placki_Gotowane_TakSe)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Placki_Gotowane_NaSzybko
           Set<Skladnik> skladniki_przepis_Placki_Gotowane_NaSzybko = Set.of(
                   new Skladnik(Produkt.MAKA_PSZENNA, 11),
                   new Skladnik(Produkt.CUKIER, 64),
                   new Skladnik(Produkt.MAKA_RAZOWA, 18),
                   new Skladnik(Produkt.TWAROG, 52)
           );

           Przepis przepis_Placki_Gotowane_NaSzybko = () -> skladniki_przepis_Placki_Gotowane_NaSzybko;

           System.out.println("Przepis: " + skladniki_przepis_Placki_Gotowane_NaSzybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Placki_Gotowane_NaSzybko = kuchnia.przeliczPrzepis(przepis_Placki_Gotowane_NaSzybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Placki_Gotowane_NaSzybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Placki_Gotowane_NaSzybko = () -> przeliczonyPrzepis_przepis_Placki_Gotowane_NaSzybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Placki_Gotowane_NaSzybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Placki_Grzane_Szybko
           Set<Skladnik> skladniki_przepis_Placki_Grzane_Szybko = Set.of(
                   new Skladnik(Produkt.WODA, 63),
                   new Skladnik(Produkt.WODA, 14),
                   new Skladnik(Produkt.CUKIER_PUDER, 94),
                   new Skladnik(Produkt.TWAROG, 28)
           );

           Przepis przepis_Placki_Grzane_Szybko = () -> skladniki_przepis_Placki_Grzane_Szybko;

           System.out.println("Przepis: " + skladniki_przepis_Placki_Grzane_Szybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Placki_Grzane_Szybko = kuchnia.przeliczPrzepis(przepis_Placki_Grzane_Szybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Placki_Grzane_Szybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Placki_Grzane_Szybko = () -> przeliczonyPrzepis_przepis_Placki_Grzane_Szybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Placki_Grzane_Szybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Placki_Grzane_Wolno
           Set<Skladnik> skladniki_przepis_Placki_Grzane_Wolno = Set.of(
                   new Skladnik(Produkt.CUKIER, 35),
                   new Skladnik(Produkt.PROSZEK_DO_PIECZENIA, 56),
                   new Skladnik(Produkt.MAKA_PSZENNA, 93),
                   new Skladnik(Produkt.MASLO, 75)
           );

           Przepis przepis_Placki_Grzane_Wolno = () -> skladniki_przepis_Placki_Grzane_Wolno;

           System.out.println("Przepis: " + skladniki_przepis_Placki_Grzane_Wolno);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Placki_Grzane_Wolno = kuchnia.przeliczPrzepis(przepis_Placki_Grzane_Wolno);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Placki_Grzane_Wolno);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Placki_Grzane_Wolno = () -> przeliczonyPrzepis_przepis_Placki_Grzane_Wolno;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Placki_Grzane_Wolno)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Placki_Grzane_TakSe
           Set<Skladnik> skladniki_przepis_Placki_Grzane_TakSe = Set.of(
                   new Skladnik(Produkt.CUKIER_PUDER, 24),
                   new Skladnik(Produkt.MLEKO, 92),
                   new Skladnik(Produkt.OLEJ_ROSLINNY, 62),
                   new Skladnik(Produkt.MARGARYNA, 81)
           );

           Przepis przepis_Placki_Grzane_TakSe = () -> skladniki_przepis_Placki_Grzane_TakSe;

           System.out.println("Przepis: " + skladniki_przepis_Placki_Grzane_TakSe);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Placki_Grzane_TakSe = kuchnia.przeliczPrzepis(przepis_Placki_Grzane_TakSe);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Placki_Grzane_TakSe);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Placki_Grzane_TakSe = () -> przeliczonyPrzepis_przepis_Placki_Grzane_TakSe;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Placki_Grzane_TakSe)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Placki_Grzane_NaSzybko
           Set<Skladnik> skladniki_przepis_Placki_Grzane_NaSzybko = Set.of(
                   new Skladnik(Produkt.MLEKO, 51),
                   new Skladnik(Produkt.MARGARYNA, 13),
                   new Skladnik(Produkt.MARGARYNA, 66),
                   new Skladnik(Produkt.TWAROG, 13)
           );

           Przepis przepis_Placki_Grzane_NaSzybko = () -> skladniki_przepis_Placki_Grzane_NaSzybko;

           System.out.println("Przepis: " + skladniki_przepis_Placki_Grzane_NaSzybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Placki_Grzane_NaSzybko = kuchnia.przeliczPrzepis(przepis_Placki_Grzane_NaSzybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Placki_Grzane_NaSzybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Placki_Grzane_NaSzybko = () -> przeliczonyPrzepis_przepis_Placki_Grzane_NaSzybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Placki_Grzane_NaSzybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Placki_Wedzone_Szybko
           Set<Skladnik> skladniki_przepis_Placki_Wedzone_Szybko = Set.of(
                   new Skladnik(Produkt.MLEKO, 101),
                   new Skladnik(Produkt.SOL, 58),
                   new Skladnik(Produkt.MAKA_PSZENNA, 30),
                   new Skladnik(Produkt.MAKA_PSZENNA, 81)
           );

           Przepis przepis_Placki_Wedzone_Szybko = () -> skladniki_przepis_Placki_Wedzone_Szybko;

           System.out.println("Przepis: " + skladniki_przepis_Placki_Wedzone_Szybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Placki_Wedzone_Szybko = kuchnia.przeliczPrzepis(przepis_Placki_Wedzone_Szybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Placki_Wedzone_Szybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Placki_Wedzone_Szybko = () -> przeliczonyPrzepis_przepis_Placki_Wedzone_Szybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Placki_Wedzone_Szybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Placki_Wedzone_Wolno
           Set<Skladnik> skladniki_przepis_Placki_Wedzone_Wolno = Set.of(
                   new Skladnik(Produkt.WODA, 106),
                   new Skladnik(Produkt.RODZYNKI, 98),
                   new Skladnik(Produkt.PROSZEK_DO_PIECZENIA, 100),
                   new Skladnik(Produkt.MLEKO, 65)
           );

           Przepis przepis_Placki_Wedzone_Wolno = () -> skladniki_przepis_Placki_Wedzone_Wolno;

           System.out.println("Przepis: " + skladniki_przepis_Placki_Wedzone_Wolno);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Placki_Wedzone_Wolno = kuchnia.przeliczPrzepis(przepis_Placki_Wedzone_Wolno);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Placki_Wedzone_Wolno);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Placki_Wedzone_Wolno = () -> przeliczonyPrzepis_przepis_Placki_Wedzone_Wolno;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Placki_Wedzone_Wolno)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Placki_Wedzone_TakSe
           Set<Skladnik> skladniki_przepis_Placki_Wedzone_TakSe = Set.of(
                   new Skladnik(Produkt.SOL, 20),
                   new Skladnik(Produkt.MAKA_PSZENNA, 21),
                   new Skladnik(Produkt.MAKA_PSZENNA, 56),
                   new Skladnik(Produkt.CUKIER_PUDER, 87)
           );

           Przepis przepis_Placki_Wedzone_TakSe = () -> skladniki_przepis_Placki_Wedzone_TakSe;

           System.out.println("Przepis: " + skladniki_przepis_Placki_Wedzone_TakSe);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Placki_Wedzone_TakSe = kuchnia.przeliczPrzepis(przepis_Placki_Wedzone_TakSe);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Placki_Wedzone_TakSe);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Placki_Wedzone_TakSe = () -> przeliczonyPrzepis_przepis_Placki_Wedzone_TakSe;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Placki_Wedzone_TakSe)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Placki_Wedzone_NaSzybko
           Set<Skladnik> skladniki_przepis_Placki_Wedzone_NaSzybko = Set.of(
                   new Skladnik(Produkt.DROZDZE, 30),
                   new Skladnik(Produkt.MAKA_PSZENNA, 21),
                   new Skladnik(Produkt.DROZDZE, 56),
                   new Skladnik(Produkt.RODZYNKI, 106)
           );

           Przepis przepis_Placki_Wedzone_NaSzybko = () -> skladniki_przepis_Placki_Wedzone_NaSzybko;

           System.out.println("Przepis: " + skladniki_przepis_Placki_Wedzone_NaSzybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Placki_Wedzone_NaSzybko = kuchnia.przeliczPrzepis(przepis_Placki_Wedzone_NaSzybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Placki_Wedzone_NaSzybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Placki_Wedzone_NaSzybko = () -> przeliczonyPrzepis_przepis_Placki_Wedzone_NaSzybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Placki_Wedzone_NaSzybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Placki_Zalewane_Szybko
           Set<Skladnik> skladniki_przepis_Placki_Zalewane_Szybko = Set.of(
                   new Skladnik(Produkt.TWAROG, 52),
                   new Skladnik(Produkt.MLEKO, 95),
                   new Skladnik(Produkt.OLEJ_ROSLINNY, 54),
                   new Skladnik(Produkt.MLEKO, 14)
           );

           Przepis przepis_Placki_Zalewane_Szybko = () -> skladniki_przepis_Placki_Zalewane_Szybko;

           System.out.println("Przepis: " + skladniki_przepis_Placki_Zalewane_Szybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Placki_Zalewane_Szybko = kuchnia.przeliczPrzepis(przepis_Placki_Zalewane_Szybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Placki_Zalewane_Szybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Placki_Zalewane_Szybko = () -> przeliczonyPrzepis_przepis_Placki_Zalewane_Szybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Placki_Zalewane_Szybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Placki_Zalewane_Wolno
           Set<Skladnik> skladniki_przepis_Placki_Zalewane_Wolno = Set.of(
                   new Skladnik(Produkt.CUKIER, 58),
                   new Skladnik(Produkt.MAKA_PSZENNA, 42),
                   new Skladnik(Produkt.MAKA_RAZOWA, 96),
                   new Skladnik(Produkt.SOL, 38)
           );

           Przepis przepis_Placki_Zalewane_Wolno = () -> skladniki_przepis_Placki_Zalewane_Wolno;

           System.out.println("Przepis: " + skladniki_przepis_Placki_Zalewane_Wolno);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Placki_Zalewane_Wolno = kuchnia.przeliczPrzepis(przepis_Placki_Zalewane_Wolno);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Placki_Zalewane_Wolno);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Placki_Zalewane_Wolno = () -> przeliczonyPrzepis_przepis_Placki_Zalewane_Wolno;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Placki_Zalewane_Wolno)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Placki_Zalewane_TakSe
           Set<Skladnik> skladniki_przepis_Placki_Zalewane_TakSe = Set.of(
                   new Skladnik(Produkt.SOL, 106),
                   new Skladnik(Produkt.SOL, 83),
                   new Skladnik(Produkt.WODA, 26),
                   new Skladnik(Produkt.MAKA_PSZENNA, 60)
           );

           Przepis przepis_Placki_Zalewane_TakSe = () -> skladniki_przepis_Placki_Zalewane_TakSe;

           System.out.println("Przepis: " + skladniki_przepis_Placki_Zalewane_TakSe);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Placki_Zalewane_TakSe = kuchnia.przeliczPrzepis(przepis_Placki_Zalewane_TakSe);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Placki_Zalewane_TakSe);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Placki_Zalewane_TakSe = () -> przeliczonyPrzepis_przepis_Placki_Zalewane_TakSe;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Placki_Zalewane_TakSe)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Placki_Zalewane_NaSzybko
           Set<Skladnik> skladniki_przepis_Placki_Zalewane_NaSzybko = Set.of(
                   new Skladnik(Produkt.TWAROG, 16),
                   new Skladnik(Produkt.WODA, 95),
                   new Skladnik(Produkt.MAKA_PSZENNA, 33),
                   new Skladnik(Produkt.SOL, 47)
           );

           Przepis przepis_Placki_Zalewane_NaSzybko = () -> skladniki_przepis_Placki_Zalewane_NaSzybko;

           System.out.println("Przepis: " + skladniki_przepis_Placki_Zalewane_NaSzybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Placki_Zalewane_NaSzybko = kuchnia.przeliczPrzepis(przepis_Placki_Zalewane_NaSzybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Placki_Zalewane_NaSzybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Placki_Zalewane_NaSzybko = () -> przeliczonyPrzepis_przepis_Placki_Zalewane_NaSzybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Placki_Zalewane_NaSzybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Placki_Kiszone_Szybko
           Set<Skladnik> skladniki_przepis_Placki_Kiszone_Szybko = Set.of(
                   new Skladnik(Produkt.WODA, 59),
                   new Skladnik(Produkt.CUKIER, 32),
                   new Skladnik(Produkt.DROZDZE, 94),
                   new Skladnik(Produkt.PROSZEK_DO_PIECZENIA, 12)
           );

           Przepis przepis_Placki_Kiszone_Szybko = () -> skladniki_przepis_Placki_Kiszone_Szybko;

           System.out.println("Przepis: " + skladniki_przepis_Placki_Kiszone_Szybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Placki_Kiszone_Szybko = kuchnia.przeliczPrzepis(przepis_Placki_Kiszone_Szybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Placki_Kiszone_Szybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Placki_Kiszone_Szybko = () -> przeliczonyPrzepis_przepis_Placki_Kiszone_Szybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Placki_Kiszone_Szybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Placki_Kiszone_Wolno
           Set<Skladnik> skladniki_przepis_Placki_Kiszone_Wolno = Set.of(
                   new Skladnik(Produkt.SOL, 49),
                   new Skladnik(Produkt.CUKIER_PUDER, 18),
                   new Skladnik(Produkt.MAKA_RAZOWA, 34),
                   new Skladnik(Produkt.OLEJ_ROSLINNY, 83)
           );

           Przepis przepis_Placki_Kiszone_Wolno = () -> skladniki_przepis_Placki_Kiszone_Wolno;

           System.out.println("Przepis: " + skladniki_przepis_Placki_Kiszone_Wolno);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Placki_Kiszone_Wolno = kuchnia.przeliczPrzepis(przepis_Placki_Kiszone_Wolno);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Placki_Kiszone_Wolno);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Placki_Kiszone_Wolno = () -> przeliczonyPrzepis_przepis_Placki_Kiszone_Wolno;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Placki_Kiszone_Wolno)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Placki_Kiszone_TakSe
           Set<Skladnik> skladniki_przepis_Placki_Kiszone_TakSe = Set.of(
                   new Skladnik(Produkt.SOL, 25),
                   new Skladnik(Produkt.WODA, 93),
                   new Skladnik(Produkt.SOL, 45),
                   new Skladnik(Produkt.TWAROG, 81)
           );

           Przepis przepis_Placki_Kiszone_TakSe = () -> skladniki_przepis_Placki_Kiszone_TakSe;

           System.out.println("Przepis: " + skladniki_przepis_Placki_Kiszone_TakSe);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Placki_Kiszone_TakSe = kuchnia.przeliczPrzepis(przepis_Placki_Kiszone_TakSe);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Placki_Kiszone_TakSe);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Placki_Kiszone_TakSe = () -> przeliczonyPrzepis_przepis_Placki_Kiszone_TakSe;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Placki_Kiszone_TakSe)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Placki_Kiszone_NaSzybko
           Set<Skladnik> skladniki_przepis_Placki_Kiszone_NaSzybko = Set.of(
                   new Skladnik(Produkt.MLEKO, 68),
                   new Skladnik(Produkt.MLEKO, 14),
                   new Skladnik(Produkt.MARGARYNA, 56),
                   new Skladnik(Produkt.MAKA_PSZENNA, 102)
           );

           Przepis przepis_Placki_Kiszone_NaSzybko = () -> skladniki_przepis_Placki_Kiszone_NaSzybko;

           System.out.println("Przepis: " + skladniki_przepis_Placki_Kiszone_NaSzybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Placki_Kiszone_NaSzybko = kuchnia.przeliczPrzepis(przepis_Placki_Kiszone_NaSzybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Placki_Kiszone_NaSzybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Placki_Kiszone_NaSzybko = () -> przeliczonyPrzepis_przepis_Placki_Kiszone_NaSzybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Placki_Kiszone_NaSzybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Ciastka_Smazone_Szybko
           Set<Skladnik> skladniki_przepis_Ciastka_Smazone_Szybko = Set.of(
                   new Skladnik(Produkt.DROZDZE, 73),
                   new Skladnik(Produkt.MLEKO, 41),
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 40),
                   new Skladnik(Produkt.PROSZEK_DO_PIECZENIA, 50)
           );

           Przepis przepis_Ciastka_Smazone_Szybko = () -> skladniki_przepis_Ciastka_Smazone_Szybko;

           System.out.println("Przepis: " + skladniki_przepis_Ciastka_Smazone_Szybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Ciastka_Smazone_Szybko = kuchnia.przeliczPrzepis(przepis_Ciastka_Smazone_Szybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Ciastka_Smazone_Szybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Ciastka_Smazone_Szybko = () -> przeliczonyPrzepis_przepis_Ciastka_Smazone_Szybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Ciastka_Smazone_Szybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Ciastka_Smazone_Wolno
           Set<Skladnik> skladniki_przepis_Ciastka_Smazone_Wolno = Set.of(
                   new Skladnik(Produkt.MAKA_PSZENNA, 95),
                   new Skladnik(Produkt.DROZDZE, 108),
                   new Skladnik(Produkt.MAKA_RAZOWA, 26),
                   new Skladnik(Produkt.CUKIER_PUDER, 54)
           );

           Przepis przepis_Ciastka_Smazone_Wolno = () -> skladniki_przepis_Ciastka_Smazone_Wolno;

           System.out.println("Przepis: " + skladniki_przepis_Ciastka_Smazone_Wolno);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Ciastka_Smazone_Wolno = kuchnia.przeliczPrzepis(przepis_Ciastka_Smazone_Wolno);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Ciastka_Smazone_Wolno);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Ciastka_Smazone_Wolno = () -> przeliczonyPrzepis_przepis_Ciastka_Smazone_Wolno;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Ciastka_Smazone_Wolno)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Ciastka_Smazone_TakSe
           Set<Skladnik> skladniki_przepis_Ciastka_Smazone_TakSe = Set.of(
                   new Skladnik(Produkt.MAKA_RAZOWA, 22),
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 22),
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 72),
                   new Skladnik(Produkt.MAKA_PSZENNA, 19)
           );

           Przepis przepis_Ciastka_Smazone_TakSe = () -> skladniki_przepis_Ciastka_Smazone_TakSe;

           System.out.println("Przepis: " + skladniki_przepis_Ciastka_Smazone_TakSe);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Ciastka_Smazone_TakSe = kuchnia.przeliczPrzepis(przepis_Ciastka_Smazone_TakSe);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Ciastka_Smazone_TakSe);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Ciastka_Smazone_TakSe = () -> przeliczonyPrzepis_przepis_Ciastka_Smazone_TakSe;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Ciastka_Smazone_TakSe)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Ciastka_Smazone_NaSzybko
           Set<Skladnik> skladniki_przepis_Ciastka_Smazone_NaSzybko = Set.of(
                   new Skladnik(Produkt.PROSZEK_DO_PIECZENIA, 79),
                   new Skladnik(Produkt.OLEJ_ROSLINNY, 86),
                   new Skladnik(Produkt.RODZYNKI, 54),
                   new Skladnik(Produkt.OLEJ_ROSLINNY, 85)
           );

           Przepis przepis_Ciastka_Smazone_NaSzybko = () -> skladniki_przepis_Ciastka_Smazone_NaSzybko;

           System.out.println("Przepis: " + skladniki_przepis_Ciastka_Smazone_NaSzybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Ciastka_Smazone_NaSzybko = kuchnia.przeliczPrzepis(przepis_Ciastka_Smazone_NaSzybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Ciastka_Smazone_NaSzybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Ciastka_Smazone_NaSzybko = () -> przeliczonyPrzepis_przepis_Ciastka_Smazone_NaSzybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Ciastka_Smazone_NaSzybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Ciastka_Gotowane_Szybko
           Set<Skladnik> skladniki_przepis_Ciastka_Gotowane_Szybko = Set.of(
                   new Skladnik(Produkt.OLEJ_ROSLINNY, 98),
                   new Skladnik(Produkt.DROZDZE, 22),
                   new Skladnik(Produkt.DROZDZE, 81),
                   new Skladnik(Produkt.MAKA_RAZOWA, 93)
           );

           Przepis przepis_Ciastka_Gotowane_Szybko = () -> skladniki_przepis_Ciastka_Gotowane_Szybko;

           System.out.println("Przepis: " + skladniki_przepis_Ciastka_Gotowane_Szybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Ciastka_Gotowane_Szybko = kuchnia.przeliczPrzepis(przepis_Ciastka_Gotowane_Szybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Ciastka_Gotowane_Szybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Ciastka_Gotowane_Szybko = () -> przeliczonyPrzepis_przepis_Ciastka_Gotowane_Szybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Ciastka_Gotowane_Szybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Ciastka_Gotowane_Wolno
           Set<Skladnik> skladniki_przepis_Ciastka_Gotowane_Wolno = Set.of(
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 102),
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 24),
                   new Skladnik(Produkt.MLEKO, 18),
                   new Skladnik(Produkt.CUKIER_PUDER, 42)
           );

           Przepis przepis_Ciastka_Gotowane_Wolno = () -> skladniki_przepis_Ciastka_Gotowane_Wolno;

           System.out.println("Przepis: " + skladniki_przepis_Ciastka_Gotowane_Wolno);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Ciastka_Gotowane_Wolno = kuchnia.przeliczPrzepis(przepis_Ciastka_Gotowane_Wolno);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Ciastka_Gotowane_Wolno);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Ciastka_Gotowane_Wolno = () -> przeliczonyPrzepis_przepis_Ciastka_Gotowane_Wolno;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Ciastka_Gotowane_Wolno)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Ciastka_Gotowane_TakSe
           Set<Skladnik> skladniki_przepis_Ciastka_Gotowane_TakSe = Set.of(
                   new Skladnik(Produkt.SOL, 36),
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 17),
                   new Skladnik(Produkt.CUKIER, 30),
                   new Skladnik(Produkt.MAKA_ZIEMNIACZANA, 79)
           );

           Przepis przepis_Ciastka_Gotowane_TakSe = () -> skladniki_przepis_Ciastka_Gotowane_TakSe;

           System.out.println("Przepis: " + skladniki_przepis_Ciastka_Gotowane_TakSe);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Ciastka_Gotowane_TakSe = kuchnia.przeliczPrzepis(przepis_Ciastka_Gotowane_TakSe);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Ciastka_Gotowane_TakSe);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Ciastka_Gotowane_TakSe = () -> przeliczonyPrzepis_przepis_Ciastka_Gotowane_TakSe;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Ciastka_Gotowane_TakSe)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Ciastka_Gotowane_NaSzybko
           Set<Skladnik> skladniki_przepis_Ciastka_Gotowane_NaSzybko = Set.of(
                   new Skladnik(Produkt.MASLO, 32),
                   new Skladnik(Produkt.MAKA_RAZOWA, 13),
                   new Skladnik(Produkt.WODA, 52),
                   new Skladnik(Produkt.MAKA_RAZOWA, 50)
           );

           Przepis przepis_Ciastka_Gotowane_NaSzybko = () -> skladniki_przepis_Ciastka_Gotowane_NaSzybko;

           System.out.println("Przepis: " + skladniki_przepis_Ciastka_Gotowane_NaSzybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Ciastka_Gotowane_NaSzybko = kuchnia.przeliczPrzepis(przepis_Ciastka_Gotowane_NaSzybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Ciastka_Gotowane_NaSzybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Ciastka_Gotowane_NaSzybko = () -> przeliczonyPrzepis_przepis_Ciastka_Gotowane_NaSzybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Ciastka_Gotowane_NaSzybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Ciastka_Grzane_Szybko
           Set<Skladnik> skladniki_przepis_Ciastka_Grzane_Szybko = Set.of(
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 94),
                   new Skladnik(Produkt.MASLO, 102),
                   new Skladnik(Produkt.RODZYNKI, 14),
                   new Skladnik(Produkt.MLEKO, 46)
           );

           Przepis przepis_Ciastka_Grzane_Szybko = () -> skladniki_przepis_Ciastka_Grzane_Szybko;

           System.out.println("Przepis: " + skladniki_przepis_Ciastka_Grzane_Szybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Ciastka_Grzane_Szybko = kuchnia.przeliczPrzepis(przepis_Ciastka_Grzane_Szybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Ciastka_Grzane_Szybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Ciastka_Grzane_Szybko = () -> przeliczonyPrzepis_przepis_Ciastka_Grzane_Szybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Ciastka_Grzane_Szybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Ciastka_Grzane_Wolno
           Set<Skladnik> skladniki_przepis_Ciastka_Grzane_Wolno = Set.of(
                   new Skladnik(Produkt.MAKA_PSZENNA, 78),
                   new Skladnik(Produkt.CUKIER_PUDER, 64),
                   new Skladnik(Produkt.MAKA_PSZENNA, 60),
                   new Skladnik(Produkt.MARGARYNA, 78)
           );

           Przepis przepis_Ciastka_Grzane_Wolno = () -> skladniki_przepis_Ciastka_Grzane_Wolno;

           System.out.println("Przepis: " + skladniki_przepis_Ciastka_Grzane_Wolno);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Ciastka_Grzane_Wolno = kuchnia.przeliczPrzepis(przepis_Ciastka_Grzane_Wolno);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Ciastka_Grzane_Wolno);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Ciastka_Grzane_Wolno = () -> przeliczonyPrzepis_przepis_Ciastka_Grzane_Wolno;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Ciastka_Grzane_Wolno)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Ciastka_Grzane_TakSe
           Set<Skladnik> skladniki_przepis_Ciastka_Grzane_TakSe = Set.of(
                   new Skladnik(Produkt.MAKA_ZIEMNIACZANA, 31),
                   new Skladnik(Produkt.CUKIER_PUDER, 47),
                   new Skladnik(Produkt.MAKA_RAZOWA, 43),
                   new Skladnik(Produkt.DROZDZE, 49)
           );

           Przepis przepis_Ciastka_Grzane_TakSe = () -> skladniki_przepis_Ciastka_Grzane_TakSe;

           System.out.println("Przepis: " + skladniki_przepis_Ciastka_Grzane_TakSe);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Ciastka_Grzane_TakSe = kuchnia.przeliczPrzepis(przepis_Ciastka_Grzane_TakSe);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Ciastka_Grzane_TakSe);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Ciastka_Grzane_TakSe = () -> przeliczonyPrzepis_przepis_Ciastka_Grzane_TakSe;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Ciastka_Grzane_TakSe)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Ciastka_Grzane_NaSzybko
           Set<Skladnik> skladniki_przepis_Ciastka_Grzane_NaSzybko = Set.of(
                   new Skladnik(Produkt.MARGARYNA, 39),
                   new Skladnik(Produkt.DROZDZE, 68),
                   new Skladnik(Produkt.OLEJ_ROSLINNY, 27),
                   new Skladnik(Produkt.SOL, 32)
           );

           Przepis przepis_Ciastka_Grzane_NaSzybko = () -> skladniki_przepis_Ciastka_Grzane_NaSzybko;

           System.out.println("Przepis: " + skladniki_przepis_Ciastka_Grzane_NaSzybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Ciastka_Grzane_NaSzybko = kuchnia.przeliczPrzepis(przepis_Ciastka_Grzane_NaSzybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Ciastka_Grzane_NaSzybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Ciastka_Grzane_NaSzybko = () -> przeliczonyPrzepis_przepis_Ciastka_Grzane_NaSzybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Ciastka_Grzane_NaSzybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Ciastka_Wedzone_Szybko
           Set<Skladnik> skladniki_przepis_Ciastka_Wedzone_Szybko = Set.of(
                   new Skladnik(Produkt.MAKA_PSZENNA, 32),
                   new Skladnik(Produkt.MAKA_PSZENNA, 85),
                   new Skladnik(Produkt.CUKIER, 31),
                   new Skladnik(Produkt.PROSZEK_DO_PIECZENIA, 63)
           );

           Przepis przepis_Ciastka_Wedzone_Szybko = () -> skladniki_przepis_Ciastka_Wedzone_Szybko;

           System.out.println("Przepis: " + skladniki_przepis_Ciastka_Wedzone_Szybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Ciastka_Wedzone_Szybko = kuchnia.przeliczPrzepis(przepis_Ciastka_Wedzone_Szybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Ciastka_Wedzone_Szybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Ciastka_Wedzone_Szybko = () -> przeliczonyPrzepis_przepis_Ciastka_Wedzone_Szybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Ciastka_Wedzone_Szybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Ciastka_Wedzone_Wolno
           Set<Skladnik> skladniki_przepis_Ciastka_Wedzone_Wolno = Set.of(
                   new Skladnik(Produkt.MASLO, 64),
                   new Skladnik(Produkt.DROZDZE, 27),
                   new Skladnik(Produkt.RODZYNKI, 71),
                   new Skladnik(Produkt.SOL, 78)
           );

           Przepis przepis_Ciastka_Wedzone_Wolno = () -> skladniki_przepis_Ciastka_Wedzone_Wolno;

           System.out.println("Przepis: " + skladniki_przepis_Ciastka_Wedzone_Wolno);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Ciastka_Wedzone_Wolno = kuchnia.przeliczPrzepis(przepis_Ciastka_Wedzone_Wolno);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Ciastka_Wedzone_Wolno);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Ciastka_Wedzone_Wolno = () -> przeliczonyPrzepis_przepis_Ciastka_Wedzone_Wolno;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Ciastka_Wedzone_Wolno)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Ciastka_Wedzone_TakSe
           Set<Skladnik> skladniki_przepis_Ciastka_Wedzone_TakSe = Set.of(
                   new Skladnik(Produkt.MARGARYNA, 90),
                   new Skladnik(Produkt.OLEJ_ROSLINNY, 39),
                   new Skladnik(Produkt.RODZYNKI, 16),
                   new Skladnik(Produkt.RODZYNKI, 62)
           );

           Przepis przepis_Ciastka_Wedzone_TakSe = () -> skladniki_przepis_Ciastka_Wedzone_TakSe;

           System.out.println("Przepis: " + skladniki_przepis_Ciastka_Wedzone_TakSe);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Ciastka_Wedzone_TakSe = kuchnia.przeliczPrzepis(przepis_Ciastka_Wedzone_TakSe);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Ciastka_Wedzone_TakSe);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Ciastka_Wedzone_TakSe = () -> przeliczonyPrzepis_przepis_Ciastka_Wedzone_TakSe;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Ciastka_Wedzone_TakSe)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Ciastka_Wedzone_NaSzybko
           Set<Skladnik> skladniki_przepis_Ciastka_Wedzone_NaSzybko = Set.of(
                   new Skladnik(Produkt.PROSZEK_DO_PIECZENIA, 32),
                   new Skladnik(Produkt.OLEJ_ROSLINNY, 49),
                   new Skladnik(Produkt.DROZDZE, 50),
                   new Skladnik(Produkt.PROSZEK_DO_PIECZENIA, 92)
           );

           Przepis przepis_Ciastka_Wedzone_NaSzybko = () -> skladniki_przepis_Ciastka_Wedzone_NaSzybko;

           System.out.println("Przepis: " + skladniki_przepis_Ciastka_Wedzone_NaSzybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Ciastka_Wedzone_NaSzybko = kuchnia.przeliczPrzepis(przepis_Ciastka_Wedzone_NaSzybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Ciastka_Wedzone_NaSzybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Ciastka_Wedzone_NaSzybko = () -> przeliczonyPrzepis_przepis_Ciastka_Wedzone_NaSzybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Ciastka_Wedzone_NaSzybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Ciastka_Zalewane_Szybko
           Set<Skladnik> skladniki_przepis_Ciastka_Zalewane_Szybko = Set.of(
                   new Skladnik(Produkt.MARGARYNA, 32),
                   new Skladnik(Produkt.MARGARYNA, 67),
                   new Skladnik(Produkt.MAKA_ZIEMNIACZANA, 13),
                   new Skladnik(Produkt.MAKA_PSZENNA, 37)
           );

           Przepis przepis_Ciastka_Zalewane_Szybko = () -> skladniki_przepis_Ciastka_Zalewane_Szybko;

           System.out.println("Przepis: " + skladniki_przepis_Ciastka_Zalewane_Szybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Ciastka_Zalewane_Szybko = kuchnia.przeliczPrzepis(przepis_Ciastka_Zalewane_Szybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Ciastka_Zalewane_Szybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Ciastka_Zalewane_Szybko = () -> przeliczonyPrzepis_przepis_Ciastka_Zalewane_Szybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Ciastka_Zalewane_Szybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Ciastka_Zalewane_Wolno
           Set<Skladnik> skladniki_przepis_Ciastka_Zalewane_Wolno = Set.of(
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 102),
                   new Skladnik(Produkt.DROZDZE, 109),
                   new Skladnik(Produkt.DROZDZE, 58),
                   new Skladnik(Produkt.WODA, 107)
           );

           Przepis przepis_Ciastka_Zalewane_Wolno = () -> skladniki_przepis_Ciastka_Zalewane_Wolno;

           System.out.println("Przepis: " + skladniki_przepis_Ciastka_Zalewane_Wolno);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Ciastka_Zalewane_Wolno = kuchnia.przeliczPrzepis(przepis_Ciastka_Zalewane_Wolno);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Ciastka_Zalewane_Wolno);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Ciastka_Zalewane_Wolno = () -> przeliczonyPrzepis_przepis_Ciastka_Zalewane_Wolno;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Ciastka_Zalewane_Wolno)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Ciastka_Zalewane_TakSe
           Set<Skladnik> skladniki_przepis_Ciastka_Zalewane_TakSe = Set.of(
                   new Skladnik(Produkt.CUKIER_PUDER, 97),
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 10),
                   new Skladnik(Produkt.MASLO, 105),
                   new Skladnik(Produkt.MLEKO, 96)
           );

           Przepis przepis_Ciastka_Zalewane_TakSe = () -> skladniki_przepis_Ciastka_Zalewane_TakSe;

           System.out.println("Przepis: " + skladniki_przepis_Ciastka_Zalewane_TakSe);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Ciastka_Zalewane_TakSe = kuchnia.przeliczPrzepis(przepis_Ciastka_Zalewane_TakSe);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Ciastka_Zalewane_TakSe);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Ciastka_Zalewane_TakSe = () -> przeliczonyPrzepis_przepis_Ciastka_Zalewane_TakSe;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Ciastka_Zalewane_TakSe)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Ciastka_Zalewane_NaSzybko
           Set<Skladnik> skladniki_przepis_Ciastka_Zalewane_NaSzybko = Set.of(
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 22),
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 48),
                   new Skladnik(Produkt.WODA, 63),
                   new Skladnik(Produkt.DROZDZE, 78)
           );

           Przepis przepis_Ciastka_Zalewane_NaSzybko = () -> skladniki_przepis_Ciastka_Zalewane_NaSzybko;

           System.out.println("Przepis: " + skladniki_przepis_Ciastka_Zalewane_NaSzybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Ciastka_Zalewane_NaSzybko = kuchnia.przeliczPrzepis(przepis_Ciastka_Zalewane_NaSzybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Ciastka_Zalewane_NaSzybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Ciastka_Zalewane_NaSzybko = () -> przeliczonyPrzepis_przepis_Ciastka_Zalewane_NaSzybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Ciastka_Zalewane_NaSzybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Ciastka_Kiszone_Szybko
           Set<Skladnik> skladniki_przepis_Ciastka_Kiszone_Szybko = Set.of(
                   new Skladnik(Produkt.MASLO, 94),
                   new Skladnik(Produkt.MAKA_RAZOWA, 75),
                   new Skladnik(Produkt.MAKA_ZIEMNIACZANA, 71),
                   new Skladnik(Produkt.RODZYNKI, 83)
           );

           Przepis przepis_Ciastka_Kiszone_Szybko = () -> skladniki_przepis_Ciastka_Kiszone_Szybko;

           System.out.println("Przepis: " + skladniki_przepis_Ciastka_Kiszone_Szybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Ciastka_Kiszone_Szybko = kuchnia.przeliczPrzepis(przepis_Ciastka_Kiszone_Szybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Ciastka_Kiszone_Szybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Ciastka_Kiszone_Szybko = () -> przeliczonyPrzepis_przepis_Ciastka_Kiszone_Szybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Ciastka_Kiszone_Szybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Ciastka_Kiszone_Wolno
           Set<Skladnik> skladniki_przepis_Ciastka_Kiszone_Wolno = Set.of(
                   new Skladnik(Produkt.MAKA_RAZOWA, 48),
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 14),
                   new Skladnik(Produkt.MLEKO, 99),
                   new Skladnik(Produkt.SOL, 17)
           );

           Przepis przepis_Ciastka_Kiszone_Wolno = () -> skladniki_przepis_Ciastka_Kiszone_Wolno;

           System.out.println("Przepis: " + skladniki_przepis_Ciastka_Kiszone_Wolno);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Ciastka_Kiszone_Wolno = kuchnia.przeliczPrzepis(przepis_Ciastka_Kiszone_Wolno);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Ciastka_Kiszone_Wolno);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Ciastka_Kiszone_Wolno = () -> przeliczonyPrzepis_przepis_Ciastka_Kiszone_Wolno;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Ciastka_Kiszone_Wolno)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Ciastka_Kiszone_TakSe
           Set<Skladnik> skladniki_przepis_Ciastka_Kiszone_TakSe = Set.of(
                   new Skladnik(Produkt.WODA, 47),
                   new Skladnik(Produkt.PROSZEK_DO_PIECZENIA, 38),
                   new Skladnik(Produkt.MLEKO, 57),
                   new Skladnik(Produkt.DROZDZE, 68)
           );

           Przepis przepis_Ciastka_Kiszone_TakSe = () -> skladniki_przepis_Ciastka_Kiszone_TakSe;

           System.out.println("Przepis: " + skladniki_przepis_Ciastka_Kiszone_TakSe);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Ciastka_Kiszone_TakSe = kuchnia.przeliczPrzepis(przepis_Ciastka_Kiszone_TakSe);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Ciastka_Kiszone_TakSe);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Ciastka_Kiszone_TakSe = () -> przeliczonyPrzepis_przepis_Ciastka_Kiszone_TakSe;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Ciastka_Kiszone_TakSe)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Ciastka_Kiszone_NaSzybko
           Set<Skladnik> skladniki_przepis_Ciastka_Kiszone_NaSzybko = Set.of(
                   new Skladnik(Produkt.CUKIER, 22),
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 36),
                   new Skladnik(Produkt.DROZDZE, 56),
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 64)
           );

           Przepis przepis_Ciastka_Kiszone_NaSzybko = () -> skladniki_przepis_Ciastka_Kiszone_NaSzybko;

           System.out.println("Przepis: " + skladniki_przepis_Ciastka_Kiszone_NaSzybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Ciastka_Kiszone_NaSzybko = kuchnia.przeliczPrzepis(przepis_Ciastka_Kiszone_NaSzybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Ciastka_Kiszone_NaSzybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Ciastka_Kiszone_NaSzybko = () -> przeliczonyPrzepis_przepis_Ciastka_Kiszone_NaSzybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Ciastka_Kiszone_NaSzybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Mandarynki_Smazone_Szybko
           Set<Skladnik> skladniki_przepis_Mandarynki_Smazone_Szybko = Set.of(
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 47),
                   new Skladnik(Produkt.WODA, 84),
                   new Skladnik(Produkt.MAKA_ZIEMNIACZANA, 97),
                   new Skladnik(Produkt.MAKA_PSZENNA, 14)
           );

           Przepis przepis_Mandarynki_Smazone_Szybko = () -> skladniki_przepis_Mandarynki_Smazone_Szybko;

           System.out.println("Przepis: " + skladniki_przepis_Mandarynki_Smazone_Szybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Mandarynki_Smazone_Szybko = kuchnia.przeliczPrzepis(przepis_Mandarynki_Smazone_Szybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Mandarynki_Smazone_Szybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Mandarynki_Smazone_Szybko = () -> przeliczonyPrzepis_przepis_Mandarynki_Smazone_Szybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Mandarynki_Smazone_Szybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Mandarynki_Smazone_Wolno
           Set<Skladnik> skladniki_przepis_Mandarynki_Smazone_Wolno = Set.of(
                   new Skladnik(Produkt.TWAROG, 34),
                   new Skladnik(Produkt.CUKIER, 83),
                   new Skladnik(Produkt.PROSZEK_DO_PIECZENIA, 53),
                   new Skladnik(Produkt.MARGARYNA, 85)
           );

           Przepis przepis_Mandarynki_Smazone_Wolno = () -> skladniki_przepis_Mandarynki_Smazone_Wolno;

           System.out.println("Przepis: " + skladniki_przepis_Mandarynki_Smazone_Wolno);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Mandarynki_Smazone_Wolno = kuchnia.przeliczPrzepis(przepis_Mandarynki_Smazone_Wolno);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Mandarynki_Smazone_Wolno);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Mandarynki_Smazone_Wolno = () -> przeliczonyPrzepis_przepis_Mandarynki_Smazone_Wolno;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Mandarynki_Smazone_Wolno)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Mandarynki_Smazone_TakSe
           Set<Skladnik> skladniki_przepis_Mandarynki_Smazone_TakSe = Set.of(
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 78),
                   new Skladnik(Produkt.MLEKO, 24),
                   new Skladnik(Produkt.MARGARYNA, 56),
                   new Skladnik(Produkt.MAKA_RAZOWA, 109)
           );

           Przepis przepis_Mandarynki_Smazone_TakSe = () -> skladniki_przepis_Mandarynki_Smazone_TakSe;

           System.out.println("Przepis: " + skladniki_przepis_Mandarynki_Smazone_TakSe);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Mandarynki_Smazone_TakSe = kuchnia.przeliczPrzepis(przepis_Mandarynki_Smazone_TakSe);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Mandarynki_Smazone_TakSe);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Mandarynki_Smazone_TakSe = () -> przeliczonyPrzepis_przepis_Mandarynki_Smazone_TakSe;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Mandarynki_Smazone_TakSe)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Mandarynki_Smazone_NaSzybko
           Set<Skladnik> skladniki_przepis_Mandarynki_Smazone_NaSzybko = Set.of(
                   new Skladnik(Produkt.MARGARYNA, 42),
                   new Skladnik(Produkt.TWAROG, 12),
                   new Skladnik(Produkt.MAKA_RAZOWA, 41),
                   new Skladnik(Produkt.SOL, 69)
           );

           Przepis przepis_Mandarynki_Smazone_NaSzybko = () -> skladniki_przepis_Mandarynki_Smazone_NaSzybko;

           System.out.println("Przepis: " + skladniki_przepis_Mandarynki_Smazone_NaSzybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Mandarynki_Smazone_NaSzybko = kuchnia.przeliczPrzepis(przepis_Mandarynki_Smazone_NaSzybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Mandarynki_Smazone_NaSzybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Mandarynki_Smazone_NaSzybko = () -> przeliczonyPrzepis_przepis_Mandarynki_Smazone_NaSzybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Mandarynki_Smazone_NaSzybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Mandarynki_Gotowane_Szybko
           Set<Skladnik> skladniki_przepis_Mandarynki_Gotowane_Szybko = Set.of(
                   new Skladnik(Produkt.MARGARYNA, 105),
                   new Skladnik(Produkt.CUKIER_PUDER, 40),
                   new Skladnik(Produkt.MAKA_RAZOWA, 55),
                   new Skladnik(Produkt.MARGARYNA, 51)
           );

           Przepis przepis_Mandarynki_Gotowane_Szybko = () -> skladniki_przepis_Mandarynki_Gotowane_Szybko;

           System.out.println("Przepis: " + skladniki_przepis_Mandarynki_Gotowane_Szybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Mandarynki_Gotowane_Szybko = kuchnia.przeliczPrzepis(przepis_Mandarynki_Gotowane_Szybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Mandarynki_Gotowane_Szybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Mandarynki_Gotowane_Szybko = () -> przeliczonyPrzepis_przepis_Mandarynki_Gotowane_Szybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Mandarynki_Gotowane_Szybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Mandarynki_Gotowane_Wolno
           Set<Skladnik> skladniki_przepis_Mandarynki_Gotowane_Wolno = Set.of(
                   new Skladnik(Produkt.MAKA_ZIEMNIACZANA, 31),
                   new Skladnik(Produkt.MAKA_RAZOWA, 57),
                   new Skladnik(Produkt.SOL, 48),
                   new Skladnik(Produkt.DROZDZE, 49)
           );

           Przepis przepis_Mandarynki_Gotowane_Wolno = () -> skladniki_przepis_Mandarynki_Gotowane_Wolno;

           System.out.println("Przepis: " + skladniki_przepis_Mandarynki_Gotowane_Wolno);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Mandarynki_Gotowane_Wolno = kuchnia.przeliczPrzepis(przepis_Mandarynki_Gotowane_Wolno);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Mandarynki_Gotowane_Wolno);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Mandarynki_Gotowane_Wolno = () -> przeliczonyPrzepis_przepis_Mandarynki_Gotowane_Wolno;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Mandarynki_Gotowane_Wolno)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Mandarynki_Gotowane_TakSe
           Set<Skladnik> skladniki_przepis_Mandarynki_Gotowane_TakSe = Set.of(
                   new Skladnik(Produkt.MLEKO, 94),
                   new Skladnik(Produkt.SOL, 107),
                   new Skladnik(Produkt.MAKA_PSZENNA, 56),
                   new Skladnik(Produkt.MLEKO, 105)
           );

           Przepis przepis_Mandarynki_Gotowane_TakSe = () -> skladniki_przepis_Mandarynki_Gotowane_TakSe;

           System.out.println("Przepis: " + skladniki_przepis_Mandarynki_Gotowane_TakSe);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Mandarynki_Gotowane_TakSe = kuchnia.przeliczPrzepis(przepis_Mandarynki_Gotowane_TakSe);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Mandarynki_Gotowane_TakSe);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Mandarynki_Gotowane_TakSe = () -> przeliczonyPrzepis_przepis_Mandarynki_Gotowane_TakSe;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Mandarynki_Gotowane_TakSe)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Mandarynki_Gotowane_NaSzybko
           Set<Skladnik> skladniki_przepis_Mandarynki_Gotowane_NaSzybko = Set.of(
                   new Skladnik(Produkt.MASLO, 37),
                   new Skladnik(Produkt.MARGARYNA, 65),
                   new Skladnik(Produkt.RODZYNKI, 56),
                   new Skladnik(Produkt.OLEJ_ROSLINNY, 77)
           );

           Przepis przepis_Mandarynki_Gotowane_NaSzybko = () -> skladniki_przepis_Mandarynki_Gotowane_NaSzybko;

           System.out.println("Przepis: " + skladniki_przepis_Mandarynki_Gotowane_NaSzybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Mandarynki_Gotowane_NaSzybko = kuchnia.przeliczPrzepis(przepis_Mandarynki_Gotowane_NaSzybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Mandarynki_Gotowane_NaSzybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Mandarynki_Gotowane_NaSzybko = () -> przeliczonyPrzepis_przepis_Mandarynki_Gotowane_NaSzybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Mandarynki_Gotowane_NaSzybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Mandarynki_Grzane_Szybko
           Set<Skladnik> skladniki_przepis_Mandarynki_Grzane_Szybko = Set.of(
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 59),
                   new Skladnik(Produkt.CUKIER, 10),
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 79),
                   new Skladnik(Produkt.DROZDZE, 93)
           );

           Przepis przepis_Mandarynki_Grzane_Szybko = () -> skladniki_przepis_Mandarynki_Grzane_Szybko;

           System.out.println("Przepis: " + skladniki_przepis_Mandarynki_Grzane_Szybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Mandarynki_Grzane_Szybko = kuchnia.przeliczPrzepis(przepis_Mandarynki_Grzane_Szybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Mandarynki_Grzane_Szybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Mandarynki_Grzane_Szybko = () -> przeliczonyPrzepis_przepis_Mandarynki_Grzane_Szybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Mandarynki_Grzane_Szybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Mandarynki_Grzane_Wolno
           Set<Skladnik> skladniki_przepis_Mandarynki_Grzane_Wolno = Set.of(
                   new Skladnik(Produkt.MAKA_ZIEMNIACZANA, 67),
                   new Skladnik(Produkt.TWAROG, 11),
                   new Skladnik(Produkt.TWAROG, 93),
                   new Skladnik(Produkt.MAKA_RAZOWA, 105)
           );

           Przepis przepis_Mandarynki_Grzane_Wolno = () -> skladniki_przepis_Mandarynki_Grzane_Wolno;

           System.out.println("Przepis: " + skladniki_przepis_Mandarynki_Grzane_Wolno);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Mandarynki_Grzane_Wolno = kuchnia.przeliczPrzepis(przepis_Mandarynki_Grzane_Wolno);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Mandarynki_Grzane_Wolno);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Mandarynki_Grzane_Wolno = () -> przeliczonyPrzepis_przepis_Mandarynki_Grzane_Wolno;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Mandarynki_Grzane_Wolno)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Mandarynki_Grzane_TakSe
           Set<Skladnik> skladniki_przepis_Mandarynki_Grzane_TakSe = Set.of(
                   new Skladnik(Produkt.OLEJ_ROSLINNY, 16),
                   new Skladnik(Produkt.MAKA_PSZENNA, 44),
                   new Skladnik(Produkt.MLEKO, 22),
                   new Skladnik(Produkt.MLEKO, 108)
           );

           Przepis przepis_Mandarynki_Grzane_TakSe = () -> skladniki_przepis_Mandarynki_Grzane_TakSe;

           System.out.println("Przepis: " + skladniki_przepis_Mandarynki_Grzane_TakSe);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Mandarynki_Grzane_TakSe = kuchnia.przeliczPrzepis(przepis_Mandarynki_Grzane_TakSe);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Mandarynki_Grzane_TakSe);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Mandarynki_Grzane_TakSe = () -> przeliczonyPrzepis_przepis_Mandarynki_Grzane_TakSe;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Mandarynki_Grzane_TakSe)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Mandarynki_Grzane_NaSzybko
           Set<Skladnik> skladniki_przepis_Mandarynki_Grzane_NaSzybko = Set.of(
                   new Skladnik(Produkt.OLEJ_ROSLINNY, 70),
                   new Skladnik(Produkt.MAKA_ZIEMNIACZANA, 58),
                   new Skladnik(Produkt.CUKIER, 26),
                   new Skladnik(Produkt.MARGARYNA, 98)
           );

           Przepis przepis_Mandarynki_Grzane_NaSzybko = () -> skladniki_przepis_Mandarynki_Grzane_NaSzybko;

           System.out.println("Przepis: " + skladniki_przepis_Mandarynki_Grzane_NaSzybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Mandarynki_Grzane_NaSzybko = kuchnia.przeliczPrzepis(przepis_Mandarynki_Grzane_NaSzybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Mandarynki_Grzane_NaSzybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Mandarynki_Grzane_NaSzybko = () -> przeliczonyPrzepis_przepis_Mandarynki_Grzane_NaSzybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Mandarynki_Grzane_NaSzybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Mandarynki_Wedzone_Szybko
           Set<Skladnik> skladniki_przepis_Mandarynki_Wedzone_Szybko = Set.of(
                   new Skladnik(Produkt.WODA, 91),
                   new Skladnik(Produkt.MAKA_ZIEMNIACZANA, 61),
                   new Skladnik(Produkt.SOL, 17),
                   new Skladnik(Produkt.MLEKO, 39)
           );

           Przepis przepis_Mandarynki_Wedzone_Szybko = () -> skladniki_przepis_Mandarynki_Wedzone_Szybko;

           System.out.println("Przepis: " + skladniki_przepis_Mandarynki_Wedzone_Szybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Mandarynki_Wedzone_Szybko = kuchnia.przeliczPrzepis(przepis_Mandarynki_Wedzone_Szybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Mandarynki_Wedzone_Szybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Mandarynki_Wedzone_Szybko = () -> przeliczonyPrzepis_przepis_Mandarynki_Wedzone_Szybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Mandarynki_Wedzone_Szybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Mandarynki_Wedzone_Wolno
           Set<Skladnik> skladniki_przepis_Mandarynki_Wedzone_Wolno = Set.of(
                   new Skladnik(Produkt.CUKIER, 36),
                   new Skladnik(Produkt.TWAROG, 47),
                   new Skladnik(Produkt.MLEKO, 51),
                   new Skladnik(Produkt.MARGARYNA, 29)
           );

           Przepis przepis_Mandarynki_Wedzone_Wolno = () -> skladniki_przepis_Mandarynki_Wedzone_Wolno;

           System.out.println("Przepis: " + skladniki_przepis_Mandarynki_Wedzone_Wolno);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Mandarynki_Wedzone_Wolno = kuchnia.przeliczPrzepis(przepis_Mandarynki_Wedzone_Wolno);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Mandarynki_Wedzone_Wolno);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Mandarynki_Wedzone_Wolno = () -> przeliczonyPrzepis_przepis_Mandarynki_Wedzone_Wolno;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Mandarynki_Wedzone_Wolno)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Mandarynki_Wedzone_TakSe
           Set<Skladnik> skladniki_przepis_Mandarynki_Wedzone_TakSe = Set.of(
                   new Skladnik(Produkt.MARGARYNA, 14),
                   new Skladnik(Produkt.RODZYNKI, 88),
                   new Skladnik(Produkt.DROZDZE, 56),
                   new Skladnik(Produkt.MLEKO, 23)
           );

           Przepis przepis_Mandarynki_Wedzone_TakSe = () -> skladniki_przepis_Mandarynki_Wedzone_TakSe;

           System.out.println("Przepis: " + skladniki_przepis_Mandarynki_Wedzone_TakSe);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Mandarynki_Wedzone_TakSe = kuchnia.przeliczPrzepis(przepis_Mandarynki_Wedzone_TakSe);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Mandarynki_Wedzone_TakSe);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Mandarynki_Wedzone_TakSe = () -> przeliczonyPrzepis_przepis_Mandarynki_Wedzone_TakSe;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Mandarynki_Wedzone_TakSe)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Mandarynki_Wedzone_NaSzybko
           Set<Skladnik> skladniki_przepis_Mandarynki_Wedzone_NaSzybko = Set.of(
                   new Skladnik(Produkt.MARGARYNA, 20),
                   new Skladnik(Produkt.PROSZEK_DO_PIECZENIA, 15),
                   new Skladnik(Produkt.RODZYNKI, 17),
                   new Skladnik(Produkt.MASLO, 89)
           );

           Przepis przepis_Mandarynki_Wedzone_NaSzybko = () -> skladniki_przepis_Mandarynki_Wedzone_NaSzybko;

           System.out.println("Przepis: " + skladniki_przepis_Mandarynki_Wedzone_NaSzybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Mandarynki_Wedzone_NaSzybko = kuchnia.przeliczPrzepis(przepis_Mandarynki_Wedzone_NaSzybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Mandarynki_Wedzone_NaSzybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Mandarynki_Wedzone_NaSzybko = () -> przeliczonyPrzepis_przepis_Mandarynki_Wedzone_NaSzybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Mandarynki_Wedzone_NaSzybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Mandarynki_Zalewane_Szybko
           Set<Skladnik> skladniki_przepis_Mandarynki_Zalewane_Szybko = Set.of(
                   new Skladnik(Produkt.CUKIER, 68),
                   new Skladnik(Produkt.MAKA_PSZENNA, 61),
                   new Skladnik(Produkt.RODZYNKI, 35),
                   new Skladnik(Produkt.WODA, 18)
           );

           Przepis przepis_Mandarynki_Zalewane_Szybko = () -> skladniki_przepis_Mandarynki_Zalewane_Szybko;

           System.out.println("Przepis: " + skladniki_przepis_Mandarynki_Zalewane_Szybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Mandarynki_Zalewane_Szybko = kuchnia.przeliczPrzepis(przepis_Mandarynki_Zalewane_Szybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Mandarynki_Zalewane_Szybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Mandarynki_Zalewane_Szybko = () -> przeliczonyPrzepis_przepis_Mandarynki_Zalewane_Szybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Mandarynki_Zalewane_Szybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Mandarynki_Zalewane_Wolno
           Set<Skladnik> skladniki_przepis_Mandarynki_Zalewane_Wolno = Set.of(
                   new Skladnik(Produkt.OLEJ_ROSLINNY, 65),
                   new Skladnik(Produkt.DROZDZE, 95),
                   new Skladnik(Produkt.MARGARYNA, 57),
                   new Skladnik(Produkt.OLEJ_ROSLINNY, 47)
           );

           Przepis przepis_Mandarynki_Zalewane_Wolno = () -> skladniki_przepis_Mandarynki_Zalewane_Wolno;

           System.out.println("Przepis: " + skladniki_przepis_Mandarynki_Zalewane_Wolno);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Mandarynki_Zalewane_Wolno = kuchnia.przeliczPrzepis(przepis_Mandarynki_Zalewane_Wolno);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Mandarynki_Zalewane_Wolno);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Mandarynki_Zalewane_Wolno = () -> przeliczonyPrzepis_przepis_Mandarynki_Zalewane_Wolno;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Mandarynki_Zalewane_Wolno)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Mandarynki_Zalewane_TakSe
           Set<Skladnik> skladniki_przepis_Mandarynki_Zalewane_TakSe = Set.of(
                   new Skladnik(Produkt.MARGARYNA, 100),
                   new Skladnik(Produkt.MAKA_RAZOWA, 65),
                   new Skladnik(Produkt.MLEKO, 30),
                   new Skladnik(Produkt.MAKA_PSZENNA, 90)
           );

           Przepis przepis_Mandarynki_Zalewane_TakSe = () -> skladniki_przepis_Mandarynki_Zalewane_TakSe;

           System.out.println("Przepis: " + skladniki_przepis_Mandarynki_Zalewane_TakSe);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Mandarynki_Zalewane_TakSe = kuchnia.przeliczPrzepis(przepis_Mandarynki_Zalewane_TakSe);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Mandarynki_Zalewane_TakSe);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Mandarynki_Zalewane_TakSe = () -> przeliczonyPrzepis_przepis_Mandarynki_Zalewane_TakSe;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Mandarynki_Zalewane_TakSe)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Mandarynki_Zalewane_NaSzybko
           Set<Skladnik> skladniki_przepis_Mandarynki_Zalewane_NaSzybko = Set.of(
                   new Skladnik(Produkt.RODZYNKI, 99),
                   new Skladnik(Produkt.MASLO, 10),
                   new Skladnik(Produkt.CUKIER_PUDER, 90),
                   new Skladnik(Produkt.MAKA_RAZOWA, 80)
           );

           Przepis przepis_Mandarynki_Zalewane_NaSzybko = () -> skladniki_przepis_Mandarynki_Zalewane_NaSzybko;

           System.out.println("Przepis: " + skladniki_przepis_Mandarynki_Zalewane_NaSzybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Mandarynki_Zalewane_NaSzybko = kuchnia.przeliczPrzepis(przepis_Mandarynki_Zalewane_NaSzybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Mandarynki_Zalewane_NaSzybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Mandarynki_Zalewane_NaSzybko = () -> przeliczonyPrzepis_przepis_Mandarynki_Zalewane_NaSzybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Mandarynki_Zalewane_NaSzybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Mandarynki_Kiszone_Szybko
           Set<Skladnik> skladniki_przepis_Mandarynki_Kiszone_Szybko = Set.of(
                   new Skladnik(Produkt.MLEKO, 76),
                   new Skladnik(Produkt.PROSZEK_DO_PIECZENIA, 20),
                   new Skladnik(Produkt.MAKA_RAZOWA, 68),
                   new Skladnik(Produkt.MAKA_RAZOWA, 101)
           );

           Przepis przepis_Mandarynki_Kiszone_Szybko = () -> skladniki_przepis_Mandarynki_Kiszone_Szybko;

           System.out.println("Przepis: " + skladniki_przepis_Mandarynki_Kiszone_Szybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Mandarynki_Kiszone_Szybko = kuchnia.przeliczPrzepis(przepis_Mandarynki_Kiszone_Szybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Mandarynki_Kiszone_Szybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Mandarynki_Kiszone_Szybko = () -> przeliczonyPrzepis_przepis_Mandarynki_Kiszone_Szybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Mandarynki_Kiszone_Szybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Mandarynki_Kiszone_Wolno
           Set<Skladnik> skladniki_przepis_Mandarynki_Kiszone_Wolno = Set.of(
                   new Skladnik(Produkt.CUKIER, 13),
                   new Skladnik(Produkt.WODA, 83),
                   new Skladnik(Produkt.PROSZEK_DO_PIECZENIA, 20),
                   new Skladnik(Produkt.MARGARYNA, 89)
           );

           Przepis przepis_Mandarynki_Kiszone_Wolno = () -> skladniki_przepis_Mandarynki_Kiszone_Wolno;

           System.out.println("Przepis: " + skladniki_przepis_Mandarynki_Kiszone_Wolno);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Mandarynki_Kiszone_Wolno = kuchnia.przeliczPrzepis(przepis_Mandarynki_Kiszone_Wolno);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Mandarynki_Kiszone_Wolno);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Mandarynki_Kiszone_Wolno = () -> przeliczonyPrzepis_przepis_Mandarynki_Kiszone_Wolno;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Mandarynki_Kiszone_Wolno)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Mandarynki_Kiszone_TakSe
           Set<Skladnik> skladniki_przepis_Mandarynki_Kiszone_TakSe = Set.of(
                   new Skladnik(Produkt.MARGARYNA, 75),
                   new Skladnik(Produkt.MARGARYNA, 71),
                   new Skladnik(Produkt.MAKA_ZIEMNIACZANA, 55),
                   new Skladnik(Produkt.PROSZEK_DO_PIECZENIA, 103)
           );

           Przepis przepis_Mandarynki_Kiszone_TakSe = () -> skladniki_przepis_Mandarynki_Kiszone_TakSe;

           System.out.println("Przepis: " + skladniki_przepis_Mandarynki_Kiszone_TakSe);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Mandarynki_Kiszone_TakSe = kuchnia.przeliczPrzepis(przepis_Mandarynki_Kiszone_TakSe);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Mandarynki_Kiszone_TakSe);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Mandarynki_Kiszone_TakSe = () -> przeliczonyPrzepis_przepis_Mandarynki_Kiszone_TakSe;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Mandarynki_Kiszone_TakSe)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Mandarynki_Kiszone_NaSzybko
           Set<Skladnik> skladniki_przepis_Mandarynki_Kiszone_NaSzybko = Set.of(
                   new Skladnik(Produkt.MAKA_ZIEMNIACZANA, 36),
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 80),
                   new Skladnik(Produkt.CUKIER_PUDER, 75),
                   new Skladnik(Produkt.SOL, 77)
           );

           Przepis przepis_Mandarynki_Kiszone_NaSzybko = () -> skladniki_przepis_Mandarynki_Kiszone_NaSzybko;

           System.out.println("Przepis: " + skladniki_przepis_Mandarynki_Kiszone_NaSzybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Mandarynki_Kiszone_NaSzybko = kuchnia.przeliczPrzepis(przepis_Mandarynki_Kiszone_NaSzybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Mandarynki_Kiszone_NaSzybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Mandarynki_Kiszone_NaSzybko = () -> przeliczonyPrzepis_przepis_Mandarynki_Kiszone_NaSzybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Mandarynki_Kiszone_NaSzybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Paprykarze_Smazone_Szybko
           Set<Skladnik> skladniki_przepis_Paprykarze_Smazone_Szybko = Set.of(
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 55),
                   new Skladnik(Produkt.PROSZEK_DO_PIECZENIA, 72),
                   new Skladnik(Produkt.SOL, 50),
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 26)
           );

           Przepis przepis_Paprykarze_Smazone_Szybko = () -> skladniki_przepis_Paprykarze_Smazone_Szybko;

           System.out.println("Przepis: " + skladniki_przepis_Paprykarze_Smazone_Szybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Paprykarze_Smazone_Szybko = kuchnia.przeliczPrzepis(przepis_Paprykarze_Smazone_Szybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Paprykarze_Smazone_Szybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Paprykarze_Smazone_Szybko = () -> przeliczonyPrzepis_przepis_Paprykarze_Smazone_Szybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Paprykarze_Smazone_Szybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Paprykarze_Smazone_Wolno
           Set<Skladnik> skladniki_przepis_Paprykarze_Smazone_Wolno = Set.of(
                   new Skladnik(Produkt.MARGARYNA, 56),
                   new Skladnik(Produkt.CUKIER_PUDER, 74),
                   new Skladnik(Produkt.CUKIER_PUDER, 47),
                   new Skladnik(Produkt.OLEJ_ROSLINNY, 99)
           );

           Przepis przepis_Paprykarze_Smazone_Wolno = () -> skladniki_przepis_Paprykarze_Smazone_Wolno;

           System.out.println("Przepis: " + skladniki_przepis_Paprykarze_Smazone_Wolno);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Paprykarze_Smazone_Wolno = kuchnia.przeliczPrzepis(przepis_Paprykarze_Smazone_Wolno);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Paprykarze_Smazone_Wolno);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Paprykarze_Smazone_Wolno = () -> przeliczonyPrzepis_przepis_Paprykarze_Smazone_Wolno;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Paprykarze_Smazone_Wolno)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Paprykarze_Smazone_TakSe
           Set<Skladnik> skladniki_przepis_Paprykarze_Smazone_TakSe = Set.of(
                   new Skladnik(Produkt.SOL, 104),
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 103),
                   new Skladnik(Produkt.DROZDZE, 72),
                   new Skladnik(Produkt.WODA, 95)
           );

           Przepis przepis_Paprykarze_Smazone_TakSe = () -> skladniki_przepis_Paprykarze_Smazone_TakSe;

           System.out.println("Przepis: " + skladniki_przepis_Paprykarze_Smazone_TakSe);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Paprykarze_Smazone_TakSe = kuchnia.przeliczPrzepis(przepis_Paprykarze_Smazone_TakSe);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Paprykarze_Smazone_TakSe);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Paprykarze_Smazone_TakSe = () -> przeliczonyPrzepis_przepis_Paprykarze_Smazone_TakSe;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Paprykarze_Smazone_TakSe)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Paprykarze_Smazone_NaSzybko
           Set<Skladnik> skladniki_przepis_Paprykarze_Smazone_NaSzybko = Set.of(
                   new Skladnik(Produkt.MLEKO, 93),
                   new Skladnik(Produkt.PROSZEK_DO_PIECZENIA, 41),
                   new Skladnik(Produkt.OLEJ_ROSLINNY, 48),
                   new Skladnik(Produkt.SOL, 63)
           );

           Przepis przepis_Paprykarze_Smazone_NaSzybko = () -> skladniki_przepis_Paprykarze_Smazone_NaSzybko;

           System.out.println("Przepis: " + skladniki_przepis_Paprykarze_Smazone_NaSzybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Paprykarze_Smazone_NaSzybko = kuchnia.przeliczPrzepis(przepis_Paprykarze_Smazone_NaSzybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Paprykarze_Smazone_NaSzybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Paprykarze_Smazone_NaSzybko = () -> przeliczonyPrzepis_przepis_Paprykarze_Smazone_NaSzybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Paprykarze_Smazone_NaSzybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Paprykarze_Gotowane_Szybko
           Set<Skladnik> skladniki_przepis_Paprykarze_Gotowane_Szybko = Set.of(
                   new Skladnik(Produkt.MLEKO, 24),
                   new Skladnik(Produkt.WODA, 101),
                   new Skladnik(Produkt.MASLO, 67),
                   new Skladnik(Produkt.MAKA_RAZOWA, 106)
           );

           Przepis przepis_Paprykarze_Gotowane_Szybko = () -> skladniki_przepis_Paprykarze_Gotowane_Szybko;

           System.out.println("Przepis: " + skladniki_przepis_Paprykarze_Gotowane_Szybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Paprykarze_Gotowane_Szybko = kuchnia.przeliczPrzepis(przepis_Paprykarze_Gotowane_Szybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Paprykarze_Gotowane_Szybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Paprykarze_Gotowane_Szybko = () -> przeliczonyPrzepis_przepis_Paprykarze_Gotowane_Szybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Paprykarze_Gotowane_Szybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Paprykarze_Gotowane_Wolno
           Set<Skladnik> skladniki_przepis_Paprykarze_Gotowane_Wolno = Set.of(
                   new Skladnik(Produkt.DROZDZE, 55),
                   new Skladnik(Produkt.OLEJ_ROSLINNY, 23),
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 62),
                   new Skladnik(Produkt.MAKA_RAZOWA, 63)
           );

           Przepis przepis_Paprykarze_Gotowane_Wolno = () -> skladniki_przepis_Paprykarze_Gotowane_Wolno;

           System.out.println("Przepis: " + skladniki_przepis_Paprykarze_Gotowane_Wolno);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Paprykarze_Gotowane_Wolno = kuchnia.przeliczPrzepis(przepis_Paprykarze_Gotowane_Wolno);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Paprykarze_Gotowane_Wolno);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Paprykarze_Gotowane_Wolno = () -> przeliczonyPrzepis_przepis_Paprykarze_Gotowane_Wolno;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Paprykarze_Gotowane_Wolno)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Paprykarze_Gotowane_TakSe
           Set<Skladnik> skladniki_przepis_Paprykarze_Gotowane_TakSe = Set.of(
                   new Skladnik(Produkt.MAKA_RAZOWA, 78),
                   new Skladnik(Produkt.MAKA_ZIEMNIACZANA, 35),
                   new Skladnik(Produkt.MASLO, 62),
                   new Skladnik(Produkt.WODA, 74)
           );

           Przepis przepis_Paprykarze_Gotowane_TakSe = () -> skladniki_przepis_Paprykarze_Gotowane_TakSe;

           System.out.println("Przepis: " + skladniki_przepis_Paprykarze_Gotowane_TakSe);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Paprykarze_Gotowane_TakSe = kuchnia.przeliczPrzepis(przepis_Paprykarze_Gotowane_TakSe);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Paprykarze_Gotowane_TakSe);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Paprykarze_Gotowane_TakSe = () -> przeliczonyPrzepis_przepis_Paprykarze_Gotowane_TakSe;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Paprykarze_Gotowane_TakSe)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Paprykarze_Gotowane_NaSzybko
           Set<Skladnik> skladniki_przepis_Paprykarze_Gotowane_NaSzybko = Set.of(
                   new Skladnik(Produkt.MAKA_ZIEMNIACZANA, 63),
                   new Skladnik(Produkt.MAKA_PSZENNA, 12),
                   new Skladnik(Produkt.CUKIER_PUDER, 60),
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 12)
           );

           Przepis przepis_Paprykarze_Gotowane_NaSzybko = () -> skladniki_przepis_Paprykarze_Gotowane_NaSzybko;

           System.out.println("Przepis: " + skladniki_przepis_Paprykarze_Gotowane_NaSzybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Paprykarze_Gotowane_NaSzybko = kuchnia.przeliczPrzepis(przepis_Paprykarze_Gotowane_NaSzybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Paprykarze_Gotowane_NaSzybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Paprykarze_Gotowane_NaSzybko = () -> przeliczonyPrzepis_przepis_Paprykarze_Gotowane_NaSzybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Paprykarze_Gotowane_NaSzybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Paprykarze_Grzane_Szybko
           Set<Skladnik> skladniki_przepis_Paprykarze_Grzane_Szybko = Set.of(
                   new Skladnik(Produkt.MARGARYNA, 64),
                   new Skladnik(Produkt.PROSZEK_DO_PIECZENIA, 92),
                   new Skladnik(Produkt.CUKIER_PUDER, 46),
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 47)
           );

           Przepis przepis_Paprykarze_Grzane_Szybko = () -> skladniki_przepis_Paprykarze_Grzane_Szybko;

           System.out.println("Przepis: " + skladniki_przepis_Paprykarze_Grzane_Szybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Paprykarze_Grzane_Szybko = kuchnia.przeliczPrzepis(przepis_Paprykarze_Grzane_Szybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Paprykarze_Grzane_Szybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Paprykarze_Grzane_Szybko = () -> przeliczonyPrzepis_przepis_Paprykarze_Grzane_Szybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Paprykarze_Grzane_Szybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Paprykarze_Grzane_Wolno
           Set<Skladnik> skladniki_przepis_Paprykarze_Grzane_Wolno = Set.of(
                   new Skladnik(Produkt.MASLO, 99),
                   new Skladnik(Produkt.CUKIER_PUDER, 72),
                   new Skladnik(Produkt.DROZDZE, 30),
                   new Skladnik(Produkt.PROSZEK_DO_PIECZENIA, 96)
           );

           Przepis przepis_Paprykarze_Grzane_Wolno = () -> skladniki_przepis_Paprykarze_Grzane_Wolno;

           System.out.println("Przepis: " + skladniki_przepis_Paprykarze_Grzane_Wolno);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Paprykarze_Grzane_Wolno = kuchnia.przeliczPrzepis(przepis_Paprykarze_Grzane_Wolno);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Paprykarze_Grzane_Wolno);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Paprykarze_Grzane_Wolno = () -> przeliczonyPrzepis_przepis_Paprykarze_Grzane_Wolno;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Paprykarze_Grzane_Wolno)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Paprykarze_Grzane_TakSe
           Set<Skladnik> skladniki_przepis_Paprykarze_Grzane_TakSe = Set.of(
                   new Skladnik(Produkt.DROZDZE, 46),
                   new Skladnik(Produkt.SOL, 81),
                   new Skladnik(Produkt.PROSZEK_DO_PIECZENIA, 90),
                   new Skladnik(Produkt.MASLO, 26)
           );

           Przepis przepis_Paprykarze_Grzane_TakSe = () -> skladniki_przepis_Paprykarze_Grzane_TakSe;

           System.out.println("Przepis: " + skladniki_przepis_Paprykarze_Grzane_TakSe);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Paprykarze_Grzane_TakSe = kuchnia.przeliczPrzepis(przepis_Paprykarze_Grzane_TakSe);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Paprykarze_Grzane_TakSe);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Paprykarze_Grzane_TakSe = () -> przeliczonyPrzepis_przepis_Paprykarze_Grzane_TakSe;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Paprykarze_Grzane_TakSe)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Paprykarze_Grzane_NaSzybko
           Set<Skladnik> skladniki_przepis_Paprykarze_Grzane_NaSzybko = Set.of(
                   new Skladnik(Produkt.RODZYNKI, 22),
                   new Skladnik(Produkt.CUKIER_PUDER, 72),
                   new Skladnik(Produkt.SOL, 46),
                   new Skladnik(Produkt.MAKA_ZIEMNIACZANA, 67)
           );

           Przepis przepis_Paprykarze_Grzane_NaSzybko = () -> skladniki_przepis_Paprykarze_Grzane_NaSzybko;

           System.out.println("Przepis: " + skladniki_przepis_Paprykarze_Grzane_NaSzybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Paprykarze_Grzane_NaSzybko = kuchnia.przeliczPrzepis(przepis_Paprykarze_Grzane_NaSzybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Paprykarze_Grzane_NaSzybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Paprykarze_Grzane_NaSzybko = () -> przeliczonyPrzepis_przepis_Paprykarze_Grzane_NaSzybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Paprykarze_Grzane_NaSzybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Paprykarze_Wedzone_Szybko
           Set<Skladnik> skladniki_przepis_Paprykarze_Wedzone_Szybko = Set.of(
                   new Skladnik(Produkt.CUKIER, 42),
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 102),
                   new Skladnik(Produkt.MARGARYNA, 53),
                   new Skladnik(Produkt.CUKIER, 91)
           );

           Przepis przepis_Paprykarze_Wedzone_Szybko = () -> skladniki_przepis_Paprykarze_Wedzone_Szybko;

           System.out.println("Przepis: " + skladniki_przepis_Paprykarze_Wedzone_Szybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Paprykarze_Wedzone_Szybko = kuchnia.przeliczPrzepis(przepis_Paprykarze_Wedzone_Szybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Paprykarze_Wedzone_Szybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Paprykarze_Wedzone_Szybko = () -> przeliczonyPrzepis_przepis_Paprykarze_Wedzone_Szybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Paprykarze_Wedzone_Szybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Paprykarze_Wedzone_Wolno
           Set<Skladnik> skladniki_przepis_Paprykarze_Wedzone_Wolno = Set.of(
                   new Skladnik(Produkt.RODZYNKI, 54),
                   new Skladnik(Produkt.PROSZEK_DO_PIECZENIA, 89),
                   new Skladnik(Produkt.CUKIER_PUDER, 75),
                   new Skladnik(Produkt.OLEJ_ROSLINNY, 59)
           );

           Przepis przepis_Paprykarze_Wedzone_Wolno = () -> skladniki_przepis_Paprykarze_Wedzone_Wolno;

           System.out.println("Przepis: " + skladniki_przepis_Paprykarze_Wedzone_Wolno);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Paprykarze_Wedzone_Wolno = kuchnia.przeliczPrzepis(przepis_Paprykarze_Wedzone_Wolno);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Paprykarze_Wedzone_Wolno);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Paprykarze_Wedzone_Wolno = () -> przeliczonyPrzepis_przepis_Paprykarze_Wedzone_Wolno;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Paprykarze_Wedzone_Wolno)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Paprykarze_Wedzone_TakSe
           Set<Skladnik> skladniki_przepis_Paprykarze_Wedzone_TakSe = Set.of(
                   new Skladnik(Produkt.MAKA_RAZOWA, 21),
                   new Skladnik(Produkt.TWAROG, 77),
                   new Skladnik(Produkt.MASLO, 30),
                   new Skladnik(Produkt.WODA, 39)
           );

           Przepis przepis_Paprykarze_Wedzone_TakSe = () -> skladniki_przepis_Paprykarze_Wedzone_TakSe;

           System.out.println("Przepis: " + skladniki_przepis_Paprykarze_Wedzone_TakSe);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Paprykarze_Wedzone_TakSe = kuchnia.przeliczPrzepis(przepis_Paprykarze_Wedzone_TakSe);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Paprykarze_Wedzone_TakSe);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Paprykarze_Wedzone_TakSe = () -> przeliczonyPrzepis_przepis_Paprykarze_Wedzone_TakSe;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Paprykarze_Wedzone_TakSe)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Paprykarze_Wedzone_NaSzybko
           Set<Skladnik> skladniki_przepis_Paprykarze_Wedzone_NaSzybko = Set.of(
                   new Skladnik(Produkt.MAKA_RAZOWA, 35),
                   new Skladnik(Produkt.OLEJ_ROSLINNY, 97),
                   new Skladnik(Produkt.OLEJ_ROSLINNY, 49),
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 64)
           );

           Przepis przepis_Paprykarze_Wedzone_NaSzybko = () -> skladniki_przepis_Paprykarze_Wedzone_NaSzybko;

           System.out.println("Przepis: " + skladniki_przepis_Paprykarze_Wedzone_NaSzybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Paprykarze_Wedzone_NaSzybko = kuchnia.przeliczPrzepis(przepis_Paprykarze_Wedzone_NaSzybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Paprykarze_Wedzone_NaSzybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Paprykarze_Wedzone_NaSzybko = () -> przeliczonyPrzepis_przepis_Paprykarze_Wedzone_NaSzybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Paprykarze_Wedzone_NaSzybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Paprykarze_Zalewane_Szybko
           Set<Skladnik> skladniki_przepis_Paprykarze_Zalewane_Szybko = Set.of(
                   new Skladnik(Produkt.MARGARYNA, 12),
                   new Skladnik(Produkt.DROZDZE, 108),
                   new Skladnik(Produkt.CUKIER_PUDER, 11),
                   new Skladnik(Produkt.MASLO, 37)
           );

           Przepis przepis_Paprykarze_Zalewane_Szybko = () -> skladniki_przepis_Paprykarze_Zalewane_Szybko;

           System.out.println("Przepis: " + skladniki_przepis_Paprykarze_Zalewane_Szybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Paprykarze_Zalewane_Szybko = kuchnia.przeliczPrzepis(przepis_Paprykarze_Zalewane_Szybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Paprykarze_Zalewane_Szybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Paprykarze_Zalewane_Szybko = () -> przeliczonyPrzepis_przepis_Paprykarze_Zalewane_Szybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Paprykarze_Zalewane_Szybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Paprykarze_Zalewane_Wolno
           Set<Skladnik> skladniki_przepis_Paprykarze_Zalewane_Wolno = Set.of(
                   new Skladnik(Produkt.MAKA_RAZOWA, 101),
                   new Skladnik(Produkt.CUKIER, 34),
                   new Skladnik(Produkt.MAKA_PSZENNA, 75),
                   new Skladnik(Produkt.MASLO, 34)
           );

           Przepis przepis_Paprykarze_Zalewane_Wolno = () -> skladniki_przepis_Paprykarze_Zalewane_Wolno;

           System.out.println("Przepis: " + skladniki_przepis_Paprykarze_Zalewane_Wolno);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Paprykarze_Zalewane_Wolno = kuchnia.przeliczPrzepis(przepis_Paprykarze_Zalewane_Wolno);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Paprykarze_Zalewane_Wolno);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Paprykarze_Zalewane_Wolno = () -> przeliczonyPrzepis_przepis_Paprykarze_Zalewane_Wolno;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Paprykarze_Zalewane_Wolno)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Paprykarze_Zalewane_TakSe
           Set<Skladnik> skladniki_przepis_Paprykarze_Zalewane_TakSe = Set.of(
                   new Skladnik(Produkt.MAKA_RAZOWA, 84),
                   new Skladnik(Produkt.WODA, 108),
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 69),
                   new Skladnik(Produkt.CUKIER_PUDER, 96)
           );

           Przepis przepis_Paprykarze_Zalewane_TakSe = () -> skladniki_przepis_Paprykarze_Zalewane_TakSe;

           System.out.println("Przepis: " + skladniki_przepis_Paprykarze_Zalewane_TakSe);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Paprykarze_Zalewane_TakSe = kuchnia.przeliczPrzepis(przepis_Paprykarze_Zalewane_TakSe);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Paprykarze_Zalewane_TakSe);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Paprykarze_Zalewane_TakSe = () -> przeliczonyPrzepis_przepis_Paprykarze_Zalewane_TakSe;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Paprykarze_Zalewane_TakSe)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Paprykarze_Zalewane_NaSzybko
           Set<Skladnik> skladniki_przepis_Paprykarze_Zalewane_NaSzybko = Set.of(
                   new Skladnik(Produkt.RODZYNKI, 84),
                   new Skladnik(Produkt.MARGARYNA, 15),
                   new Skladnik(Produkt.CUKIER, 16),
                   new Skladnik(Produkt.MAKA_PSZENNA, 77)
           );

           Przepis przepis_Paprykarze_Zalewane_NaSzybko = () -> skladniki_przepis_Paprykarze_Zalewane_NaSzybko;

           System.out.println("Przepis: " + skladniki_przepis_Paprykarze_Zalewane_NaSzybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Paprykarze_Zalewane_NaSzybko = kuchnia.przeliczPrzepis(przepis_Paprykarze_Zalewane_NaSzybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Paprykarze_Zalewane_NaSzybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Paprykarze_Zalewane_NaSzybko = () -> przeliczonyPrzepis_przepis_Paprykarze_Zalewane_NaSzybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Paprykarze_Zalewane_NaSzybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Paprykarze_Kiszone_Szybko
           Set<Skladnik> skladniki_przepis_Paprykarze_Kiszone_Szybko = Set.of(
                   new Skladnik(Produkt.MLEKO, 10),
                   new Skladnik(Produkt.CUKIER, 56),
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 41),
                   new Skladnik(Produkt.RODZYNKI, 68)
           );

           Przepis przepis_Paprykarze_Kiszone_Szybko = () -> skladniki_przepis_Paprykarze_Kiszone_Szybko;

           System.out.println("Przepis: " + skladniki_przepis_Paprykarze_Kiszone_Szybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Paprykarze_Kiszone_Szybko = kuchnia.przeliczPrzepis(przepis_Paprykarze_Kiszone_Szybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Paprykarze_Kiszone_Szybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Paprykarze_Kiszone_Szybko = () -> przeliczonyPrzepis_przepis_Paprykarze_Kiszone_Szybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Paprykarze_Kiszone_Szybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Paprykarze_Kiszone_Wolno
           Set<Skladnik> skladniki_przepis_Paprykarze_Kiszone_Wolno = Set.of(
                   new Skladnik(Produkt.CUKIER_PUDER, 105),
                   new Skladnik(Produkt.MAKA_PSZENNA, 98),
                   new Skladnik(Produkt.SOL, 108),
                   new Skladnik(Produkt.TWAROG, 33)
           );

           Przepis przepis_Paprykarze_Kiszone_Wolno = () -> skladniki_przepis_Paprykarze_Kiszone_Wolno;

           System.out.println("Przepis: " + skladniki_przepis_Paprykarze_Kiszone_Wolno);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Paprykarze_Kiszone_Wolno = kuchnia.przeliczPrzepis(przepis_Paprykarze_Kiszone_Wolno);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Paprykarze_Kiszone_Wolno);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Paprykarze_Kiszone_Wolno = () -> przeliczonyPrzepis_przepis_Paprykarze_Kiszone_Wolno;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Paprykarze_Kiszone_Wolno)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Paprykarze_Kiszone_TakSe
           Set<Skladnik> skladniki_przepis_Paprykarze_Kiszone_TakSe = Set.of(
                   new Skladnik(Produkt.MARGARYNA, 95),
                   new Skladnik(Produkt.CUKIER_PUDER, 59),
                   new Skladnik(Produkt.MLEKO, 22),
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 54)
           );

           Przepis przepis_Paprykarze_Kiszone_TakSe = () -> skladniki_przepis_Paprykarze_Kiszone_TakSe;

           System.out.println("Przepis: " + skladniki_przepis_Paprykarze_Kiszone_TakSe);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Paprykarze_Kiszone_TakSe = kuchnia.przeliczPrzepis(przepis_Paprykarze_Kiszone_TakSe);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Paprykarze_Kiszone_TakSe);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Paprykarze_Kiszone_TakSe = () -> przeliczonyPrzepis_przepis_Paprykarze_Kiszone_TakSe;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Paprykarze_Kiszone_TakSe)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Paprykarze_Kiszone_NaSzybko
           Set<Skladnik> skladniki_przepis_Paprykarze_Kiszone_NaSzybko = Set.of(
                   new Skladnik(Produkt.MAKA_RAZOWA, 101),
                   new Skladnik(Produkt.OLEJ_ROSLINNY, 86),
                   new Skladnik(Produkt.CUKIER_PUDER, 22),
                   new Skladnik(Produkt.PROSZEK_DO_PIECZENIA, 27)
           );

           Przepis przepis_Paprykarze_Kiszone_NaSzybko = () -> skladniki_przepis_Paprykarze_Kiszone_NaSzybko;

           System.out.println("Przepis: " + skladniki_przepis_Paprykarze_Kiszone_NaSzybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Paprykarze_Kiszone_NaSzybko = kuchnia.przeliczPrzepis(przepis_Paprykarze_Kiszone_NaSzybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Paprykarze_Kiszone_NaSzybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Paprykarze_Kiszone_NaSzybko = () -> przeliczonyPrzepis_przepis_Paprykarze_Kiszone_NaSzybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Paprykarze_Kiszone_NaSzybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Zupki_Smazone_Szybko
           Set<Skladnik> skladniki_przepis_Zupki_Smazone_Szybko = Set.of(
                   new Skladnik(Produkt.SOL, 62),
                   new Skladnik(Produkt.SOL, 55),
                   new Skladnik(Produkt.MASLO, 94),
                   new Skladnik(Produkt.MAKA_RAZOWA, 56)
           );

           Przepis przepis_Zupki_Smazone_Szybko = () -> skladniki_przepis_Zupki_Smazone_Szybko;

           System.out.println("Przepis: " + skladniki_przepis_Zupki_Smazone_Szybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Zupki_Smazone_Szybko = kuchnia.przeliczPrzepis(przepis_Zupki_Smazone_Szybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Zupki_Smazone_Szybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Zupki_Smazone_Szybko = () -> przeliczonyPrzepis_przepis_Zupki_Smazone_Szybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Zupki_Smazone_Szybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Zupki_Smazone_Wolno
           Set<Skladnik> skladniki_przepis_Zupki_Smazone_Wolno = Set.of(
                   new Skladnik(Produkt.MARGARYNA, 35),
                   new Skladnik(Produkt.PROSZEK_DO_PIECZENIA, 75),
                   new Skladnik(Produkt.RODZYNKI, 88),
                   new Skladnik(Produkt.MAKA_ZIEMNIACZANA, 90)
           );

           Przepis przepis_Zupki_Smazone_Wolno = () -> skladniki_przepis_Zupki_Smazone_Wolno;

           System.out.println("Przepis: " + skladniki_przepis_Zupki_Smazone_Wolno);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Zupki_Smazone_Wolno = kuchnia.przeliczPrzepis(przepis_Zupki_Smazone_Wolno);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Zupki_Smazone_Wolno);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Zupki_Smazone_Wolno = () -> przeliczonyPrzepis_przepis_Zupki_Smazone_Wolno;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Zupki_Smazone_Wolno)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Zupki_Smazone_TakSe
           Set<Skladnik> skladniki_przepis_Zupki_Smazone_TakSe = Set.of(
                   new Skladnik(Produkt.WODA, 84),
                   new Skladnik(Produkt.MARGARYNA, 48),
                   new Skladnik(Produkt.MAKA_PSZENNA, 106),
                   new Skladnik(Produkt.MARGARYNA, 24)
           );

           Przepis przepis_Zupki_Smazone_TakSe = () -> skladniki_przepis_Zupki_Smazone_TakSe;

           System.out.println("Przepis: " + skladniki_przepis_Zupki_Smazone_TakSe);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Zupki_Smazone_TakSe = kuchnia.przeliczPrzepis(przepis_Zupki_Smazone_TakSe);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Zupki_Smazone_TakSe);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Zupki_Smazone_TakSe = () -> przeliczonyPrzepis_przepis_Zupki_Smazone_TakSe;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Zupki_Smazone_TakSe)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Zupki_Smazone_NaSzybko
           Set<Skladnik> skladniki_przepis_Zupki_Smazone_NaSzybko = Set.of(
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 15),
                   new Skladnik(Produkt.MAKA_RAZOWA, 30),
                   new Skladnik(Produkt.PROSZEK_DO_PIECZENIA, 61),
                   new Skladnik(Produkt.RODZYNKI, 57)
           );

           Przepis przepis_Zupki_Smazone_NaSzybko = () -> skladniki_przepis_Zupki_Smazone_NaSzybko;

           System.out.println("Przepis: " + skladniki_przepis_Zupki_Smazone_NaSzybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Zupki_Smazone_NaSzybko = kuchnia.przeliczPrzepis(przepis_Zupki_Smazone_NaSzybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Zupki_Smazone_NaSzybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Zupki_Smazone_NaSzybko = () -> przeliczonyPrzepis_przepis_Zupki_Smazone_NaSzybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Zupki_Smazone_NaSzybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Zupki_Gotowane_Szybko
           Set<Skladnik> skladniki_przepis_Zupki_Gotowane_Szybko = Set.of(
                   new Skladnik(Produkt.DROZDZE, 61),
                   new Skladnik(Produkt.MAKA_RAZOWA, 41),
                   new Skladnik(Produkt.MARGARYNA, 86),
                   new Skladnik(Produkt.WODA, 106)
           );

           Przepis przepis_Zupki_Gotowane_Szybko = () -> skladniki_przepis_Zupki_Gotowane_Szybko;

           System.out.println("Przepis: " + skladniki_przepis_Zupki_Gotowane_Szybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Zupki_Gotowane_Szybko = kuchnia.przeliczPrzepis(przepis_Zupki_Gotowane_Szybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Zupki_Gotowane_Szybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Zupki_Gotowane_Szybko = () -> przeliczonyPrzepis_przepis_Zupki_Gotowane_Szybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Zupki_Gotowane_Szybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Zupki_Gotowane_Wolno
           Set<Skladnik> skladniki_przepis_Zupki_Gotowane_Wolno = Set.of(
                   new Skladnik(Produkt.CUKIER_PUDER, 25),
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 47),
                   new Skladnik(Produkt.CUKIER_PUDER, 79),
                   new Skladnik(Produkt.MLEKO, 18)
           );

           Przepis przepis_Zupki_Gotowane_Wolno = () -> skladniki_przepis_Zupki_Gotowane_Wolno;

           System.out.println("Przepis: " + skladniki_przepis_Zupki_Gotowane_Wolno);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Zupki_Gotowane_Wolno = kuchnia.przeliczPrzepis(przepis_Zupki_Gotowane_Wolno);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Zupki_Gotowane_Wolno);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Zupki_Gotowane_Wolno = () -> przeliczonyPrzepis_przepis_Zupki_Gotowane_Wolno;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Zupki_Gotowane_Wolno)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Zupki_Gotowane_TakSe
           Set<Skladnik> skladniki_przepis_Zupki_Gotowane_TakSe = Set.of(
                   new Skladnik(Produkt.MLEKO, 38),
                   new Skladnik(Produkt.RODZYNKI, 36),
                   new Skladnik(Produkt.DROZDZE, 13),
                   new Skladnik(Produkt.MAKA_RAZOWA, 26)
           );

           Przepis przepis_Zupki_Gotowane_TakSe = () -> skladniki_przepis_Zupki_Gotowane_TakSe;

           System.out.println("Przepis: " + skladniki_przepis_Zupki_Gotowane_TakSe);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Zupki_Gotowane_TakSe = kuchnia.przeliczPrzepis(przepis_Zupki_Gotowane_TakSe);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Zupki_Gotowane_TakSe);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Zupki_Gotowane_TakSe = () -> przeliczonyPrzepis_przepis_Zupki_Gotowane_TakSe;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Zupki_Gotowane_TakSe)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Zupki_Gotowane_NaSzybko
           Set<Skladnik> skladniki_przepis_Zupki_Gotowane_NaSzybko = Set.of(
                   new Skladnik(Produkt.MASLO, 87),
                   new Skladnik(Produkt.MLEKO, 38),
                   new Skladnik(Produkt.CUKIER, 58),
                   new Skladnik(Produkt.MASLO, 99)
           );

           Przepis przepis_Zupki_Gotowane_NaSzybko = () -> skladniki_przepis_Zupki_Gotowane_NaSzybko;

           System.out.println("Przepis: " + skladniki_przepis_Zupki_Gotowane_NaSzybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Zupki_Gotowane_NaSzybko = kuchnia.przeliczPrzepis(przepis_Zupki_Gotowane_NaSzybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Zupki_Gotowane_NaSzybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Zupki_Gotowane_NaSzybko = () -> przeliczonyPrzepis_przepis_Zupki_Gotowane_NaSzybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Zupki_Gotowane_NaSzybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Zupki_Grzane_Szybko
           Set<Skladnik> skladniki_przepis_Zupki_Grzane_Szybko = Set.of(
                   new Skladnik(Produkt.CUKIER_PUDER, 58),
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 57),
                   new Skladnik(Produkt.PROSZEK_DO_PIECZENIA, 50),
                   new Skladnik(Produkt.MARGARYNA, 13)
           );

           Przepis przepis_Zupki_Grzane_Szybko = () -> skladniki_przepis_Zupki_Grzane_Szybko;

           System.out.println("Przepis: " + skladniki_przepis_Zupki_Grzane_Szybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Zupki_Grzane_Szybko = kuchnia.przeliczPrzepis(przepis_Zupki_Grzane_Szybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Zupki_Grzane_Szybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Zupki_Grzane_Szybko = () -> przeliczonyPrzepis_przepis_Zupki_Grzane_Szybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Zupki_Grzane_Szybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Zupki_Grzane_Wolno
           Set<Skladnik> skladniki_przepis_Zupki_Grzane_Wolno = Set.of(
                   new Skladnik(Produkt.CUKIER, 91),
                   new Skladnik(Produkt.TWAROG, 10),
                   new Skladnik(Produkt.MASLO, 67),
                   new Skladnik(Produkt.MASLO, 94)
           );

           Przepis przepis_Zupki_Grzane_Wolno = () -> skladniki_przepis_Zupki_Grzane_Wolno;

           System.out.println("Przepis: " + skladniki_przepis_Zupki_Grzane_Wolno);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Zupki_Grzane_Wolno = kuchnia.przeliczPrzepis(przepis_Zupki_Grzane_Wolno);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Zupki_Grzane_Wolno);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Zupki_Grzane_Wolno = () -> przeliczonyPrzepis_przepis_Zupki_Grzane_Wolno;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Zupki_Grzane_Wolno)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Zupki_Grzane_TakSe
           Set<Skladnik> skladniki_przepis_Zupki_Grzane_TakSe = Set.of(
                   new Skladnik(Produkt.MASLO, 95),
                   new Skladnik(Produkt.RODZYNKI, 62),
                   new Skladnik(Produkt.CUKIER_PUDER, 67),
                   new Skladnik(Produkt.MASLO, 109)
           );

           Przepis przepis_Zupki_Grzane_TakSe = () -> skladniki_przepis_Zupki_Grzane_TakSe;

           System.out.println("Przepis: " + skladniki_przepis_Zupki_Grzane_TakSe);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Zupki_Grzane_TakSe = kuchnia.przeliczPrzepis(przepis_Zupki_Grzane_TakSe);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Zupki_Grzane_TakSe);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Zupki_Grzane_TakSe = () -> przeliczonyPrzepis_przepis_Zupki_Grzane_TakSe;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Zupki_Grzane_TakSe)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Zupki_Grzane_NaSzybko
           Set<Skladnik> skladniki_przepis_Zupki_Grzane_NaSzybko = Set.of(
                   new Skladnik(Produkt.DROZDZE, 33),
                   new Skladnik(Produkt.CUKIER, 45),
                   new Skladnik(Produkt.RODZYNKI, 41),
                   new Skladnik(Produkt.MAKA_PSZENNA, 38)
           );

           Przepis przepis_Zupki_Grzane_NaSzybko = () -> skladniki_przepis_Zupki_Grzane_NaSzybko;

           System.out.println("Przepis: " + skladniki_przepis_Zupki_Grzane_NaSzybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Zupki_Grzane_NaSzybko = kuchnia.przeliczPrzepis(przepis_Zupki_Grzane_NaSzybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Zupki_Grzane_NaSzybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Zupki_Grzane_NaSzybko = () -> przeliczonyPrzepis_przepis_Zupki_Grzane_NaSzybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Zupki_Grzane_NaSzybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Zupki_Wedzone_Szybko
           Set<Skladnik> skladniki_przepis_Zupki_Wedzone_Szybko = Set.of(
                   new Skladnik(Produkt.PROSZEK_DO_PIECZENIA, 104),
                   new Skladnik(Produkt.MLEKO, 32),
                   new Skladnik(Produkt.MAKA_ZIEMNIACZANA, 62),
                   new Skladnik(Produkt.MAKA_ZIEMNIACZANA, 27)
           );

           Przepis przepis_Zupki_Wedzone_Szybko = () -> skladniki_przepis_Zupki_Wedzone_Szybko;

           System.out.println("Przepis: " + skladniki_przepis_Zupki_Wedzone_Szybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Zupki_Wedzone_Szybko = kuchnia.przeliczPrzepis(przepis_Zupki_Wedzone_Szybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Zupki_Wedzone_Szybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Zupki_Wedzone_Szybko = () -> przeliczonyPrzepis_przepis_Zupki_Wedzone_Szybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Zupki_Wedzone_Szybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Zupki_Wedzone_Wolno
           Set<Skladnik> skladniki_przepis_Zupki_Wedzone_Wolno = Set.of(
                   new Skladnik(Produkt.TWAROG, 48),
                   new Skladnik(Produkt.PROSZEK_DO_PIECZENIA, 17),
                   new Skladnik(Produkt.WODA, 68),
                   new Skladnik(Produkt.CUKIER, 23)
           );

           Przepis przepis_Zupki_Wedzone_Wolno = () -> skladniki_przepis_Zupki_Wedzone_Wolno;

           System.out.println("Przepis: " + skladniki_przepis_Zupki_Wedzone_Wolno);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Zupki_Wedzone_Wolno = kuchnia.przeliczPrzepis(przepis_Zupki_Wedzone_Wolno);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Zupki_Wedzone_Wolno);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Zupki_Wedzone_Wolno = () -> przeliczonyPrzepis_przepis_Zupki_Wedzone_Wolno;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Zupki_Wedzone_Wolno)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Zupki_Wedzone_TakSe
           Set<Skladnik> skladniki_przepis_Zupki_Wedzone_TakSe = Set.of(
                   new Skladnik(Produkt.CUKIER, 86),
                   new Skladnik(Produkt.PROSZEK_DO_PIECZENIA, 88),
                   new Skladnik(Produkt.MAKA_ZIEMNIACZANA, 96),
                   new Skladnik(Produkt.DROZDZE, 19)
           );

           Przepis przepis_Zupki_Wedzone_TakSe = () -> skladniki_przepis_Zupki_Wedzone_TakSe;

           System.out.println("Przepis: " + skladniki_przepis_Zupki_Wedzone_TakSe);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Zupki_Wedzone_TakSe = kuchnia.przeliczPrzepis(przepis_Zupki_Wedzone_TakSe);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Zupki_Wedzone_TakSe);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Zupki_Wedzone_TakSe = () -> przeliczonyPrzepis_przepis_Zupki_Wedzone_TakSe;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Zupki_Wedzone_TakSe)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Zupki_Wedzone_NaSzybko
           Set<Skladnik> skladniki_przepis_Zupki_Wedzone_NaSzybko = Set.of(
                   new Skladnik(Produkt.MAKA_ZIEMNIACZANA, 66),
                   new Skladnik(Produkt.CUKIER, 55),
                   new Skladnik(Produkt.CUKIER_PUDER, 67),
                   new Skladnik(Produkt.DROZDZE, 89)
           );

           Przepis przepis_Zupki_Wedzone_NaSzybko = () -> skladniki_przepis_Zupki_Wedzone_NaSzybko;

           System.out.println("Przepis: " + skladniki_przepis_Zupki_Wedzone_NaSzybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Zupki_Wedzone_NaSzybko = kuchnia.przeliczPrzepis(przepis_Zupki_Wedzone_NaSzybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Zupki_Wedzone_NaSzybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Zupki_Wedzone_NaSzybko = () -> przeliczonyPrzepis_przepis_Zupki_Wedzone_NaSzybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Zupki_Wedzone_NaSzybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Zupki_Zalewane_Szybko
           Set<Skladnik> skladniki_przepis_Zupki_Zalewane_Szybko = Set.of(
                   new Skladnik(Produkt.MAKA_PSZENNA, 109),
                   new Skladnik(Produkt.CUKIER, 58),
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 89),
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 87)
           );

           Przepis przepis_Zupki_Zalewane_Szybko = () -> skladniki_przepis_Zupki_Zalewane_Szybko;

           System.out.println("Przepis: " + skladniki_przepis_Zupki_Zalewane_Szybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Zupki_Zalewane_Szybko = kuchnia.przeliczPrzepis(przepis_Zupki_Zalewane_Szybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Zupki_Zalewane_Szybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Zupki_Zalewane_Szybko = () -> przeliczonyPrzepis_przepis_Zupki_Zalewane_Szybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Zupki_Zalewane_Szybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Zupki_Zalewane_Wolno
           Set<Skladnik> skladniki_przepis_Zupki_Zalewane_Wolno = Set.of(
                   new Skladnik(Produkt.MAKA_RAZOWA, 93),
                   new Skladnik(Produkt.MASLO, 63),
                   new Skladnik(Produkt.CUKIER_PUDER, 47),
                   new Skladnik(Produkt.RODZYNKI, 44)
           );

           Przepis przepis_Zupki_Zalewane_Wolno = () -> skladniki_przepis_Zupki_Zalewane_Wolno;

           System.out.println("Przepis: " + skladniki_przepis_Zupki_Zalewane_Wolno);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Zupki_Zalewane_Wolno = kuchnia.przeliczPrzepis(przepis_Zupki_Zalewane_Wolno);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Zupki_Zalewane_Wolno);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Zupki_Zalewane_Wolno = () -> przeliczonyPrzepis_przepis_Zupki_Zalewane_Wolno;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Zupki_Zalewane_Wolno)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Zupki_Zalewane_TakSe
           Set<Skladnik> skladniki_przepis_Zupki_Zalewane_TakSe = Set.of(
                   new Skladnik(Produkt.MASLO, 94),
                   new Skladnik(Produkt.MARGARYNA, 76),
                   new Skladnik(Produkt.MAKA_PSZENNA, 56),
                   new Skladnik(Produkt.CUKIER, 40)
           );

           Przepis przepis_Zupki_Zalewane_TakSe = () -> skladniki_przepis_Zupki_Zalewane_TakSe;

           System.out.println("Przepis: " + skladniki_przepis_Zupki_Zalewane_TakSe);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Zupki_Zalewane_TakSe = kuchnia.przeliczPrzepis(przepis_Zupki_Zalewane_TakSe);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Zupki_Zalewane_TakSe);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Zupki_Zalewane_TakSe = () -> przeliczonyPrzepis_przepis_Zupki_Zalewane_TakSe;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Zupki_Zalewane_TakSe)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Zupki_Zalewane_NaSzybko
           Set<Skladnik> skladniki_przepis_Zupki_Zalewane_NaSzybko = Set.of(
                   new Skladnik(Produkt.MARGARYNA, 35),
                   new Skladnik(Produkt.MAKA_ZIEMNIACZANA, 48),
                   new Skladnik(Produkt.RODZYNKI, 38),
                   new Skladnik(Produkt.RODZYNKI, 100)
           );

           Przepis przepis_Zupki_Zalewane_NaSzybko = () -> skladniki_przepis_Zupki_Zalewane_NaSzybko;

           System.out.println("Przepis: " + skladniki_przepis_Zupki_Zalewane_NaSzybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Zupki_Zalewane_NaSzybko = kuchnia.przeliczPrzepis(przepis_Zupki_Zalewane_NaSzybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Zupki_Zalewane_NaSzybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Zupki_Zalewane_NaSzybko = () -> przeliczonyPrzepis_przepis_Zupki_Zalewane_NaSzybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Zupki_Zalewane_NaSzybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Zupki_Kiszone_Szybko
           Set<Skladnik> skladniki_przepis_Zupki_Kiszone_Szybko = Set.of(
                   new Skladnik(Produkt.MAKA_PSZENNA, 102),
                   new Skladnik(Produkt.MAKA_ZIEMNIACZANA, 46),
                   new Skladnik(Produkt.CUKIER, 52),
                   new Skladnik(Produkt.MAKA_PSZENNA, 104)
           );

           Przepis przepis_Zupki_Kiszone_Szybko = () -> skladniki_przepis_Zupki_Kiszone_Szybko;

           System.out.println("Przepis: " + skladniki_przepis_Zupki_Kiszone_Szybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Zupki_Kiszone_Szybko = kuchnia.przeliczPrzepis(przepis_Zupki_Kiszone_Szybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Zupki_Kiszone_Szybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Zupki_Kiszone_Szybko = () -> przeliczonyPrzepis_przepis_Zupki_Kiszone_Szybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Zupki_Kiszone_Szybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Zupki_Kiszone_Wolno
           Set<Skladnik> skladniki_przepis_Zupki_Kiszone_Wolno = Set.of(
                   new Skladnik(Produkt.MAKA_PSZENNA, 81),
                   new Skladnik(Produkt.MLEKO, 80),
                   new Skladnik(Produkt.CUKIER_WANILIOWY, 65),
                   new Skladnik(Produkt.WODA, 78)
           );

           Przepis przepis_Zupki_Kiszone_Wolno = () -> skladniki_przepis_Zupki_Kiszone_Wolno;

           System.out.println("Przepis: " + skladniki_przepis_Zupki_Kiszone_Wolno);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Zupki_Kiszone_Wolno = kuchnia.przeliczPrzepis(przepis_Zupki_Kiszone_Wolno);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Zupki_Kiszone_Wolno);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Zupki_Kiszone_Wolno = () -> przeliczonyPrzepis_przepis_Zupki_Kiszone_Wolno;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Zupki_Kiszone_Wolno)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Zupki_Kiszone_TakSe
           Set<Skladnik> skladniki_przepis_Zupki_Kiszone_TakSe = Set.of(
                   new Skladnik(Produkt.MAKA_PSZENNA, 86),
                   new Skladnik(Produkt.MASLO, 19),
                   new Skladnik(Produkt.TWAROG, 97),
                   new Skladnik(Produkt.MAKA_ZIEMNIACZANA, 98)
           );

           Przepis przepis_Zupki_Kiszone_TakSe = () -> skladniki_przepis_Zupki_Kiszone_TakSe;

           System.out.println("Przepis: " + skladniki_przepis_Zupki_Kiszone_TakSe);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Zupki_Kiszone_TakSe = kuchnia.przeliczPrzepis(przepis_Zupki_Kiszone_TakSe);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Zupki_Kiszone_TakSe);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Zupki_Kiszone_TakSe = () -> przeliczonyPrzepis_przepis_Zupki_Kiszone_TakSe;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Zupki_Kiszone_TakSe)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
           // Przepis: przepis_Zupki_Kiszone_NaSzybko
           Set<Skladnik> skladniki_przepis_Zupki_Kiszone_NaSzybko = Set.of(
                   new Skladnik(Produkt.SOL, 47),
                   new Skladnik(Produkt.CUKIER_PUDER, 11),
                   new Skladnik(Produkt.CUKIER_PUDER, 27),
                   new Skladnik(Produkt.MLEKO, 102)
           );

           Przepis przepis_Zupki_Kiszone_NaSzybko = () -> skladniki_przepis_Zupki_Kiszone_NaSzybko;

           System.out.println("Przepis: " + skladniki_przepis_Zupki_Kiszone_NaSzybko);

           // Przeliczanie przepisu
           Set<Skladnik> przeliczonyPrzepis_przepis_Zupki_Kiszone_NaSzybko = kuchnia.przeliczPrzepis(przepis_Zupki_Kiszone_NaSzybko);
           System.out.println("Optymalny przepis: " + przeliczonyPrzepis_przepis_Zupki_Kiszone_NaSzybko);

           // Tworzenie obiektu Przepis z przeliczonego zbioru składników
           Przepis nowyPrzepis_przepis_Zupki_Kiszone_NaSzybko = () -> przeliczonyPrzepis_przepis_Zupki_Kiszone_NaSzybko;

           // Przygotowanie potrawy na podstawie przeliczonego przepisu
           if (kuchnia.wykonaj(przepis_Zupki_Kiszone_NaSzybko)) {
               System.out.println("Potrawa została przygotowana!");
           } else {
               System.out.println("Nie można przygotować potrawy.");
           }

           // Stan spiżarni po przygotowaniu potrawy
           System.out.println("Stan spiżarni: " + kuchnia.stanSpizarni());
       }
        }



    }






}
