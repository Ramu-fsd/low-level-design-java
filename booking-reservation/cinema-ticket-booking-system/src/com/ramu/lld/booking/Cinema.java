package com.ramu.lld.booking;

import java.util.*;

public class Cinema {
    private final Map<Integer, Show> shows = new HashMap<>();

    public Cinema() {
        // Add some shows
        shows.put(1, new Show(1, "Interstellar", 10));
        shows.put(2, new Show(2, "Inception", 8));
        shows.put(3, new Show(3, "Oppenheimer", 12));
    }

    public void listShows() {
        System.out.println("\n--- Available Shows ---");
        for (Show show : shows.values()) {
            System.out.println("com.ramu.lld.booking.Show ID: " + show.getShowId() + " | Movie: " + show.getMovieName());
        }
    }

    public Show getShow(int showId) {
        return shows.get(showId);
    }
}
