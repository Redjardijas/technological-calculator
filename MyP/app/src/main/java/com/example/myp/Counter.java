package com.example.myp;

import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Counter extends AppCompatActivity implements View.OnClickListener {

    public String name;
    public double pril1;
    public double pril2;
    public double pril3;
    public double[] pech1 = new double[15];
    public double[] pech2;
    public double[] pech3;

    public Counter(String name, double pril1, double pril2, double pril3, double[] pech1, double[] pech2, double[] pech3) {
        this.name = name;
        this.pril1 = pril1;
        this.pech1 = pech1;
        this.pril2 = pril2;
        this.pech2 = pech2;
        this.pril3 = pril3;
        this.pech3 = pech3;

    }


    public static double CountPril() {
        return 0;
    }
    public static double CountPech() {

        return 0;
    }

    @Override
    public void onClick(View v) {

    }
}
