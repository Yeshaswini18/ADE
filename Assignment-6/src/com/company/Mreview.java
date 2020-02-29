package com.company;
import java.util.*;

public class Mreview implements Comparable<Mreview> {
    private String title;
    private ArrayList<Integer> ratings;

    Mreview() {
        this.ratings = new ArrayList<>();
        this.title = "";
    }

    Mreview(String title) {
        this.title = title;
        this.ratings = new ArrayList<>();
    }

    Mreview(String title, int firstRating) {
        this.title = title;
        this.ratings = new ArrayList<>(1);
        this.ratings.add(firstRating);
    }

    public String getTitle() {
        return title;
    }

    public void addRating(int r) {
         ratings.add(r);
    }

    public double aveRating() {
        int sum = 0;
        int aveRating;
        for (Integer rating : ratings) {
            sum += rating;
        }
        aveRating = sum / ratings.size();
        return aveRating;
    }

    public int numRatings(){
        return ratings.size();
    }

    @Override
    public int compareTo(Mreview m) {
        return title.compareTo(m.getTitle());
    }

    @Override
    public boolean equals(Object obj) {
        Mreview mreview = (Mreview) obj;
        return title.equals(mreview.getTitle());
    }

    public String toString(){
        String s = title + ", average " + aveRating() +  " out of " + numRatings();
        return s;
    }
}
