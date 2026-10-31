package org.example;

public enum Podium {

    WINNER("Winner"),
    RUNNER_UP("Runner-up"),
    THIRD_PLACE("Third Place");


    private final String title;

    Podium( String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
