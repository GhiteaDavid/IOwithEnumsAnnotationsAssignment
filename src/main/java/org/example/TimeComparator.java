package org.example;

import java.util.Comparator;

public class TimeComparator implements Comparator<Athlete> {
    @Override
    public int compare(Athlete o1, Athlete o2) {
        return o1.totalTime()-o2.totalTime();
    }
}
