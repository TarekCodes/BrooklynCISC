package com.tareksaidee.android.brooklyncisc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CSMajor extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csmajor);
    }


    public void goTo(View view) {
        Intent intent = new Intent(this, Courses.class);
        intent.putExtra("code", ((Button) view).getText().toString());
        startActivityForResult(intent, 0);
    }
}
