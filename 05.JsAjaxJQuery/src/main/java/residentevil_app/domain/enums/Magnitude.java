package residentevil_app.domain.enums;

public enum Magnitude {
    LOW, MEDIUM, HIGH;

    @Override
    public String toString() {
        return this.name().substring(0, 1) + this.name().substring(1).toLowerCase();
    }
}
