package com.drtchetting.applist5.ui;

import android.net.CaptivePortal;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.drtchetting.applist5.R;

public class Accueil extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accueil);
        Button patient = (Button) findViewById(R.id.patient);
        AppCompatActivity appCompatActivity = this;
        patient.setOnClickListener(v -> {
            Connexion connexion= new Connexion(appCompatActivity);
            connexion.init(false);
        });
        Button doctor = (Button) findViewById(R.id.doctor);
        doctor.setOnClickListener(v -> {
            Connexion connexion= new Connexion(appCompatActivity);
            connexion.init(true);
        });
    }
}
