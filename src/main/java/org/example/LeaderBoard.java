package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeaderBoard {
    private CsvReader reader=new CsvReader();

    public LeaderBoard(CsvReader reader) {
        this.reader=reader;
    }

    public List<Athlete>  getLeaderBoard() throws IOException {
        List<Athlete> leaderBoard = new ArrayList<>();
        leaderBoard = reader.readFile("src/main/resources/Input");
        leaderBoard.sort(new TimeComparator());
        for (int i = 0; i < leaderBoard.size(); i++) {
            if (i == 0) {
                System.out.println(Podium.WINNER.getTitle() + " - " + leaderBoard.get(i).getAthleteName() + " " + leaderBoard.get(i).totalTime() / 60 + ":" + leaderBoard.get(i).totalTime() % 60 + " " + "(" + leaderBoard.get(i).formatTime() + " + " + leaderBoard.get(i).getMissedShots() * 10 + ")");
            }
            if (i == 1) {
                System.out.println(Podium.RUNNER_UP.getTitle() + " - " + leaderBoard.get(i).getAthleteName() + " " + leaderBoard.get(i).totalTime() / 60 + ":" + leaderBoard.get(i).totalTime() % 60 + " " + "(" + leaderBoard.get(i).formatTime() + " + " + leaderBoard.get(i).getMissedShots() * 10 + ")");
            }
            if (i == 2) {
                System.out.println(Podium.THIRD_PLACE.getTitle() + " - " + leaderBoard.get(i).getAthleteName() + " " + leaderBoard.get(i).totalTime() / 60 + ":" + leaderBoard.get(i).totalTime() % 60 + " " + "(" + leaderBoard.get(i).formatTime() + " + " + leaderBoard.get(i).getMissedShots() * 10 + ")");
            }
        }
        return leaderBoard;
    }
}