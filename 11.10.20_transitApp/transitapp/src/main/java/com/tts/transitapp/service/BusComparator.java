package com.tts.transitapp.service;

import java.util.Comparator;

import com.tts.transitapp.model.Bus;

public class BusComparator implements Comparator<Bus> {
    @Override
    public int compare(Bus o1, Bus o2) {
        if (o1.distance < o2.distance) return -1;
        if (o1.distance > o2.distance) return 1;
        return 0;
    }



}