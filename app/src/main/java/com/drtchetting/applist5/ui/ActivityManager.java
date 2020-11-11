package com.drtchetting.applist5.ui;

import android.app.Activity;
import android.content.Intent;

import com.drtchetting.applist5.MainActivity;
import com.drtchetting.applist5.PagePrincipale;

public class ActivityManager {
    private Activity actualActivity;
    private final Class accueil = Accueil.class;
    private final Class pageprincipale = PagePrincipale.class;

    public ActivityManager(Activity activity){
        this.actualActivity=activity;
    }

    private void launchActivity(Class myclass){
        Intent intent = new Intent(actualActivity,myclass);
        actualActivity.finish();
        actualActivity.startActivity(intent);

    }

    public void launchPagePrincipale(){
        launchActivity(pageprincipale);
    }
    public void launchAccueil(){
        launchActivity(accueil);
    }
}
