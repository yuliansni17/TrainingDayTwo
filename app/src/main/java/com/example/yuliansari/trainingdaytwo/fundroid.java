package com.example.yuliansari.trainingdaytwo;

/**
 * Created by Yuliansari on 11/1/2016.
 */

public class fundroid {
    private int droidId;
    private String feture;

    public fundroid(int droidId, String feture) {
        this.droidId = droidId;
        this.feture = feture;
    }

    public void setDroidId(int droidId) {

        this.droidId = droidId;
    }

    public void setFeture(String feture) {

        this.feture = feture;
    }

    public int getDroidId() {

        return droidId;
    }

    public String getFeture() {
        return feture;
    }
}
