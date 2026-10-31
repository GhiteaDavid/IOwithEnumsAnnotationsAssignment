package org.example;

public class Athlete {

        private int athleteNumber;
        private String athleteName;
        private String countryCode;
        private int skiTime;
        private String firstShootingRange;
        private String secondShooting;
        private String thirdShooting;

    public Athlete(int athleteNumber, String athleteName, String countryCode, int skiTime, String firstShootingRange, String secondShooting, String thirdShooting) {
        this.athleteNumber = athleteNumber;
        this.athleteName = athleteName;
        this.countryCode = countryCode;
        this.skiTime = skiTime;
        this.firstShootingRange = firstShootingRange;
        this.secondShooting = secondShooting;
        this.thirdShooting = thirdShooting;
    }

    public int getMissedShots() {
        String line = getFirstShootingRange() + getSecondShooting() + getThirdShooting();
        int missedShots = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'o') {
                missedShots++;
            }
        }
        return missedShots;
    }

    public int totalTime(){
        int totalTime = 0;
        totalTime = getSkiTime() + getMissedShots()*10;
        return totalTime;
    }
    public String formatTime(){
        int minutes = getSkiTime() / 60;
        int seconds = getSkiTime() % 60;
        return minutes + ":" + seconds;
    }

    public int getAthleteNumber() {
        return athleteNumber;
    }

    public String getAthleteName() {
        return athleteName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public int getSkiTime() {
        return skiTime;
    }

    public String getFirstShootingRange() {
        return firstShootingRange;
    }

    public String getSecondShooting() {
        return secondShooting;
    }

    public String getThirdShooting() {
        return thirdShooting;
    }

    @Override
    public String toString() {
        return  athleteNumber + " " + athleteName + " " +  countryCode + " ";
    }
}
