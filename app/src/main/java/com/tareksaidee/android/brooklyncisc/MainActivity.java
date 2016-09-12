package com.tareksaidee.android.brooklyncisc;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goTo(View view){
        Intent intent = new Intent(this, CSMajor.class);
        startActivityForResult(intent, 0);
    }

    public void mapsGoTo(View view){
        Intent intent =new Intent(this, MapsActivity.class);
        startActivityForResult(intent,0);
    }

    public void fullGuideGoTo(View view){
        String url = "http://www.brooklyn.cuny.edu/web/aca_naturalsciences_cis/Ugrad2015-16reduced.pdf";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}
