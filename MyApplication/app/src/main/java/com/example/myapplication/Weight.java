package com.example.myapplication;

public class Weight {
    static final String METRIC_CONST_US = "lbs";
    static final String METRIC_CONST_EU = "kg";

    static Float convertToUs(Float numEU){
        return numEU * 2.20462262f;
    }

    static Float convertToEU(Float numUS){
        return numUS * 0.45359237f;
    }
}
