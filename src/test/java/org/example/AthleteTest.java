package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AthleteTest {
        Athlete a1;
        @BeforeEach
        void setUp(){
                a1 = new Athlete(1,"Jimmy Smiles","UK",1755,"xxoox","xooxo","xxxxo");
        }

        @Test
        public void getMissedShootsTest() {

                int result = a1.getMissedShots();

                assertEquals(6,result);
        }

        @Test
        public void getTotalTimeTest() {
                int result = a1.totalTime();

                assertEquals(1815,result);
        }

        @Test
        public void formatTimeTest() {
                String result = a1.formatTime();

                assertEquals("29:15",result);
        }




}
