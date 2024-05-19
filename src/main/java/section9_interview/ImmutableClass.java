package section9_interview;

public record ImmutableClass(int intValue, String stringValue) {
    // Konstruktor, um ein unveränderliches Objekt zu erstellen
}

/*
package section9_interview;

public final class ImmutableClass {
    private final int intValue;
    private final String stringValue;

    // Konstruktor, um ein unveränderliches Objekt zu erstellen
    public ImmutableClass(int intValue, String stringValue) {
        this.intValue = intValue;
        this.stringValue = stringValue;
    }

    // Getter-Methoden, um die Werte der Felder abzurufen
    public int getIntValue() {
        return intValue;
    }

    public String getStringValue() {
        return stringValue;
    }
}

 */
