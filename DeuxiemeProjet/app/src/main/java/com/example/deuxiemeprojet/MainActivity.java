package com.example.deuxiemeprojet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        Log.i("information", "Farida va vous affiche une information géenérale");
        Log.d("debug", "Farida va vous affiche une information pour le debbogage");
        Log.w("warning", "Farida va vous affiche une information de warning");
        Log.e("error", "Farida va vous affiche une erreur");
    }
}