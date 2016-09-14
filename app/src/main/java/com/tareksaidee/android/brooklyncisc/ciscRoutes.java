package com.tareksaidee.android.brooklyncisc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ciscRoutes extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(pickLayout(getIntent().getExtras().getInt("buttonID")));
    }


    public void goTo(View view) {
        Intent intent = new Intent(this, Courses.class);
        intent.putExtra("code", ((Button) view).getText().toString());
        startActivityForResult(intent, 0);
    }


    private int pickLayout(int buttonID) {
        switch (buttonID) {
            case R.id.minor_cs:
                return R.layout.csminor;
            case R.id.major_mc:
                return R.layout.mcmajor;
            default:
                return R.layout.csmajor;
        }
    }

}