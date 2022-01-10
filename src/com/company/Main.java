package com.company;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Repository repository = new Repository();

        List<Kunde> kunden = new LinkedList<>();

        try {
            kunden = repository.readFromFile("kundendaten.txt", ",");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(kunden);

        Service service = new Service();
        List<Kunde> kundenSortiert = service.sortKundeNachAnzMittarneiterFallend(kunden);
        System.out.println(kundenSortiert);

        try {
            repository.writeToFile("kundensortiet.txt", kundenSortiert, ",");
        } catch (IOException e) {
            e.printStackTrace();
        }

        service.writeStatisticTopOrte(kunden);

    }
}
