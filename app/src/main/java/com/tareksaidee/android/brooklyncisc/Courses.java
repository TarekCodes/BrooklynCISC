package com.tareksaidee.android.brooklyncisc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Courses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        pickCourse(getIntent().getExtras().getString("code"));
    }

    public void pickCourse(String code) {
        TextView course = (TextView) findViewById(R.id.cisc_summary);
        TextView title = (TextView) findViewById(R.id.cisc_title);
        TextView textbooks = (TextView) findViewById(R.id.cisc_textbooks);
        TextView credits = (TextView) findViewById(R.id.cisc_credits);
        switch (code) {
            case "CISC 1110":
                course.setText(R.string.cisc1110);
                title.setText(R.string.cisc1110title);
                textbooks.setText(R.string.cisc1110texts);
                credits.setText("(4 Credits)");
                break;
            case "CISC 3110":
                course.setText(R.string.cisc3110);
                title.setText(R.string.cisc3110title);
                textbooks.setText(R.string.cisc3110texts);
                credits.setText("(4 Credits)");
                break;
            case "CISC 3120":
                course.setText(R.string.cisc3120);
                title.setText(R.string.cisc3120title);
                textbooks.setText(R.string.cisc3120texts);
                credits.setText("(3 Credits)");
                break;
            case "CISC 3130":
                course.setText(R.string.cisc3130);
                title.setText(R.string.cisc3130title);
                textbooks.setText(R.string.cisc3130texts);
                credits.setText("(4 Credits)");
                break;
            case "CISC 3140":
                course.setText(R.string.cisc3140);
                title.setText(R.string.cisc3140title);
                textbooks.setText(R.string.cisc3140texts);
                credits.setText("(3 Credits)");
                break;
            case "CISC 3150":
                course.setText(R.string.cisc3150);
                title.setText(R.string.cisc3150title);
                textbooks.setText(R.string.cisc3150texts);
                credits.setText("(3 Credits)");
                break;
            case "CISC 2210":
                course.setText(R.string.cisc2210);
                title.setText(R.string.cisc2210title);
                textbooks.setText(R.string.cisc2210texts);
                credits.setText("(3 Credits)");
                break;
            case "CISC 2820W":
                course.setText(R.string.cisc2820w);
                title.setText(R.string.cisc2820wtitle);
                textbooks.setText(R.string.cisc2820wtexts);
                credits.setText("(3 Credits)");
                break;
            case "CISC 3310":
                course.setText(R.string.cisc3310);
                title.setText(R.string.cisc3310title);
                textbooks.setText(R.string.cisc3310texts);
                credits.setText("(4 Credits)");
                break;
            case "CISC 3320":
                course.setText(R.string.cisc3320);
                title.setText(R.string.cisc3320title);
                textbooks.setText(R.string.cisc3320texts);
                credits.setText("(3 Credits)");
                break;
            case "CISC 3220":
                course.setText(R.string.cisc3220);
                title.setText(R.string.cisc3220title);
                textbooks.setText(R.string.cisc3220texts);
                credits.setText("(3 Credits)");
                break;
            case "CISC 4900/4905":
                course.setText(R.string.cisc4900);
                title.setText(R.string.cisc4900title);
                textbooks.setText(R.string.cisc4900texts);
                credits.setText("(3 Credits)");
                break;
        }
    }
}