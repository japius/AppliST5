package com.drtchetting.applist5;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;

import com.drtchetting.applist5.ui.Accueil;
import com.drtchetting.applist5.ui.ActivityManager;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityManager activityManager = new ActivityManager(this);
        activityManager.launchAccueil();
    }
}