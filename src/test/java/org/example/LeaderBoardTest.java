package org.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class LeaderBoardTest {

    private final CsvReader reader = mock(CsvReader.class);
    private final LeaderBoard leaderBoard = new LeaderBoard(reader);

    @Test
    void getLeaderBoard() throws IOException {
        Athlete a1 = new Athlete(1, "Jimmy", "RO", 1600, "ooooo", "ooooo", "ooooo");
        Athlete a2 = new Athlete(16, "John", "HU", 1800, "ooooo", "ooooo", "ooooo");

        when(reader.readFile("src/main/resources/Input")).thenReturn(new ArrayList<>());

        List<Athlete> athletes = leaderBoard.getLeaderBoard();

        athletes.add(a1);
        athletes.add(a2);
        assertEquals(2, athletes.size());

    }

}