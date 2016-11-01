package com.example.yuliansari.trainingdaytwo;

import java.util.ArrayList;

/**
 * Created by Yuliansari on 11/1/2016.
 */

public class fundroidlist {

    private ArrayList<fundroid> fundroids;

    public void addFundroid(){
        fundroids = new ArrayList<fundroid>();
        fundroids.add(new fundroid(R.drawable.ic_cupcake_icon, "Cupcake Android Features"));
        fundroids.add(new fundroid(R.drawable.ic_donut_icon, "Donut Android Features"));
        fundroids.add(new fundroid(R.drawable.ic_honeycomb_icon, "HoneyComb Android Features"));
        fundroids.add(new fundroid(R.drawable.ic_ice_cream_sandwich_icon, "Ice Cream Sandwitch Android Features"));
        fundroids.add(new fundroid(R.drawable.ic_jellybean_icon, "Jellybean Android Features"));
        fundroids.add(new fundroid(R.drawable.ic_lollipop_icon, "Lollipop Android Features"));
    }

    public void bgColor(){

    }

    public fundroidlist(){
        addFundroid();
    }

    public int getLogo(int a){
        return fundroids.get(a).getDroidId();
    }

    public String getFeature(int a){
        return fundroids.get(a).getFeture();
    }

    public int getSize(){
        return fundroids.size();
    }
}

