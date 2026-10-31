package org.example;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CsvReader {


    public List<Athlete> readFile(String inputFile) throws IOException {

        try (BufferedReader in = new BufferedReader(new FileReader(inputFile))) {
            List<Athlete> athletes = new ArrayList<>();
            String line;
            line = in.readLine();

            while ((line = in.readLine()) != null) {
                String[] fields = line.split(",");
                int athleteNumber = Integer.parseInt(fields[0]);
                String athleteName = fields[1];
                String countryCode = fields[2];
                String[] timeParts = fields[3].split(":");
                int skiTime = Integer.parseInt(timeParts[0]) * 60 + Integer.parseInt(timeParts[1]);
                String firstShootingRange = fields[4];
                String secondShooting = fields[5];
                String thirdShooting = fields[6];
                athletes.add(new Athlete(athleteNumber, athleteName, countryCode, skiTime, firstShootingRange, secondShooting, thirdShooting));

            }
            return athletes;
        }



    }
}
