package com.example.myapplication;

public class Height {
    static final String METRIC_CONST_US = "in";
    static final String METRIC_CONST_EU = "cm";

    static Float convertToUs(Float numEU){
        return numEU * 0.393700787f;
    }

    static Float convertToEU(Float numUS){
        return numUS * 2.54f;
    }

}
