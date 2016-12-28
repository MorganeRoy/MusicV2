package com.example.morganeroy.music;

import java.util.ArrayList;

/**
 * Created by Alyss on 09/12/2016.
 */

public class FrequencyTable {
    private int sampling;
    private ArrayList<Frequency> frequencies;

    public FrequencyTable(int sampling) {
        this.sampling = sampling;
        frequencies = new ArrayList<>();
    }

    public void generateRandomFrequencies(int size) {
        Frequency frequency;
        for (int i = 0; i < size; ++i) {
            frequency = new Frequency(sampling);
            frequency.generateRandomFrequency();
            frequencies.add(frequency);
        }
    }
}
