package com.company;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Repository{

    public List<Kunde> readFromFile(String fileName, String character) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line =  bufferedReader.readLine();

        String[] attributes;
        Kunde kunde;
        List<Kunde> kunden = new LinkedList<>();

        while (null != line){
            attributes = line.split(character);
            kunde = new Kunde(Integer.parseInt(attributes[0]), attributes[1], Unternehmengrosse.valueOf(attributes[2]), Integer.parseInt(attributes[3]), Integer.parseInt(attributes[4]), attributes[5]);
            kunden.add(kunde);

            line = bufferedReader.readLine();
        }

        bufferedReader.close();
        return kunden;
    }

    public void writeToFile(String fileName, List<Kunde> kunden, String character) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));

        for (Kunde tier : kunden){
            String line = String.format("%s%s%s%s%s%s%s%s%s%s%s", tier.getId(),
                    character, tier.getUnternehmensname(),
                    character, tier.getUnternehmengrosse(),
                    character, tier.getAnzMitarbeiter(),
                    character, tier.getEinkommen(),
                    character, tier.getOrt());
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
