package com.company;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Service {

    public List<Kunde> sortKundeNachAnzMittarneiterFallend(List<Kunde> kunden){
        return kunden.stream().sorted(Kunde::hatKleinerAnzMittarbeiter).collect(Collectors.toList());
    }

    public void writeStatisticTopOrte(List<Kunde> liste) {
        Repository repository = new Repository();

        List<Kunde> kunden = liste.stream().sorted((kunde, otherKunde) -> kunde.mehrEinkommen(otherKunde)).collect(Collectors.toList());
        try {
            repository.writeToFile("statistik.txt", kunden, ",");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
