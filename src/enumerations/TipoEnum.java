package enumerations;


/**
 * Classe enum che gestisce il tipo di cibo presente nel menu
 */
public enum TipoEnum {
    CARNE("Menù di Carne"),
    PESCE("Menù di Pesce"),
    ONNIVORO("Menù Onnivoro"),
    VEGANO("Menù Vegano"),
    VEGETARIANO("Menù Vegetariano");

    private String descrizione;

    TipoEnum(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
