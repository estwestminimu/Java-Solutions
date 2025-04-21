public record Skladnik(Produkt produkt, int gramow) {

    // Dodajemy walidację w konstruktorze, aby upewnić się, że ilość gramów jest dodatnia.
    public Skladnik {
        if (gramow < 0) {
            throw new IllegalArgumentException("Ilość gramów nie może być ujemna!");
        }
    }

    // Metoda pomocnicza do prezentacji składnika
    @Override
    public String toString() {
        return produkt + ": " + gramow + "g";
    }
}
