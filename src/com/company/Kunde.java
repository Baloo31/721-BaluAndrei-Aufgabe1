package com.company;

public class Kunde {
    private int id;
    private String unternehmensname;
    private Unternehmengrosse unternehmengrosse;
    private int anzMitarbeiter;
    private int einkommen;
    private String ort;


    public Kunde(int id, String unternehmensname, Unternehmengrosse unternehmengrosse, int anzMitarbeiter, int einkommen, String ort) {
        this.id = id;
        this.unternehmensname = unternehmensname;
        this.unternehmengrosse = unternehmengrosse;
        this.anzMitarbeiter = anzMitarbeiter;
        this.einkommen = einkommen;
        this.ort = ort;
    }

    public int getAnzMitarbeiter() {
        return anzMitarbeiter;
    }

    public int getEinkommen() {
        return einkommen;
    }

    public int getId() {
        return id;
    }

    public String getOrt() {
        return ort;
    }

    public String getUnternehmensname() {
        return unternehmensname;
    }

    public Unternehmengrosse getUnternehmengrosse() {
        return unternehmengrosse;
    }

    public void setAnzMitarbeiter(int anzMitarbeiter) {
        this.anzMitarbeiter = anzMitarbeiter;
    }

    public void setEinkommen(int einkommen) {
        this.einkommen = einkommen;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public void setUnternehmengrosse(Unternehmengrosse unternehmengrosse) {
        this.unternehmengrosse = unternehmengrosse;
    }

    public void setUnternehmensname(String unternehmensname) {
        this.unternehmensname = unternehmensname;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "id=" + id +
                ", unternehmensname='" + unternehmensname + '\'' +
                ", unternehmengrosse=" + unternehmengrosse +
                ", anzMitarbeiter=" + anzMitarbeiter +
                ", einkommen=" + einkommen +
                ", ort='" + ort + '\'' +
                '}';
    }

    public int hatKleinerAnzMittarbeiter(Kunde andereKunde) {
        if (this.getAnzMitarbeiter() < andereKunde.getAnzMitarbeiter()) return 1;
        return 0;
    }

    public int mehrEinkommen(Kunde otherKunde) {
        if (this.getEinkommen() > otherKunde.getEinkommen() ) return 1;
        return 0;
    }
}
