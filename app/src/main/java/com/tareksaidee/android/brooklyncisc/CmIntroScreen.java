package com.tareksaidee.android.brooklyncisc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CmIntroScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cm_intro_screen);
    }

    void goToRoute(View view){
        Button button = (Button) view;
        Intent intent = new Intent(this,Routes.class);
        intent.putExtra("ButtonID",button.getId());
        startActivityForResult(intent,0);
    }
}
