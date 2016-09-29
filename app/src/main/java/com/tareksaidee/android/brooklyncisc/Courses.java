package com.tareksaidee.android.brooklyncisc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
            case "MATH 1201":
                course.setText(R.string.math1201);
                title.setText(R.string.math1201title);
                textbooks.setText(R.string.math1201texts);
                credits.setText(R.string.math1201credits);
                break;
            case "MATH 1206":
                course.setText(R.string.math1206);
                title.setText(R.string.math1206title);
                textbooks.setText(R.string.math1206texts);
                credits.setText(R.string.math1206credits);
                break;
            case "MATH 2501":
                course.setText(R.string.math2501);
                title.setText(R.string.math2501title);
                textbooks.setText(R.string.math2501texts);
                credits.setText(R.string.math2501credits);
                break;
            case "MATH 3501":
                course.setText(R.string.math3501);
                title.setText(R.string.math3501title);
                textbooks.setText(R.string.math3501texts);
                credits.setText(R.string.math3501credits);
                break;
            case "CISC 4610":
                course.setText(R.string.cisc4610);
                title.setText(R.string.cisc4610title);
                textbooks.setText(R.string.cisc4610texts);
                credits.setText(R.string.cisc4610credits);
                break;
            case "CISC 1050":
                course.setText(R.string.cisc1050);
                title.setText(R.string.cisc1050title);
                textbooks.setText(R.string.cisc1050texts);
                credits.setText(R.string.cisc1050credits);
                break;
            case "CISC 1180":
                course.setText(R.string.cisc1180);
                title.setText(R.string.cisc1180title);
                textbooks.setText(R.string.cisc1180texts);
                credits.setText(R.string.cisc1180credits);
                break;
            case "CISC 2531":
                course.setText(R.string.cisc2531);
                title.setText(R.string.cisc2531title);
                textbooks.setText(R.string.cisc2531texts);
                credits.setText(R.string.cisc2531credits);
                break;
            case "CISC 3820":
                course.setText(R.string.cisc3820);
                title.setText(R.string.cisc3820title);
                textbooks.setText(R.string.cisc3820texts);
                credits.setText(R.string.cisc3820credits);
                break;
            case "CISC 3810":
                course.setText(R.string.cisc3810);
                title.setText(R.string.cisc3810title);
                textbooks.setText(R.string.cisc3810texts);
                credits.setText(R.string.cisc3810credits);
                break;
            case "CISC 3800":
                course.setText(R.string.cisc3800);
                title.setText(R.string.cisc3800title);
                textbooks.setText(R.string.cisc3800texts);
                credits.setText(R.string.cisc3800credits);
                break;

            case "CISC 3630":
                course.setText(R.string.cisc3630);
                title.setText(R.string.cisc3630title);
                textbooks.setText(R.string.cisc3630texts);
                credits.setText(R.string.cisc3630credits);
                break;

            case "CISC 1150":
                course.setText(R.string.cisc1150);
                title.setText(R.string.cisc1150title);
                textbooks.setText(R.string.cisc1150texts);
                credits.setText(R.string.cisc1150credits);
                break;

            case "CISC 3330":
                course.setText(R.string.cisc3330);
                title.setText(R.string.cisc3330title);
                textbooks.setText(R.string.cisc3330texts);
                credits.setText(R.string.cisc3330credits);
                break;

            case "CISC 3350":
                course.setText(R.string.cisc3350);
                title.setText(R.string.cisc3350title);
                textbooks.setText(R.string.cisc3350texts);
                credits.setText(R.string.cisc3350credits);
                break;

            case "CISC 4331":
                course.setText(R.string.cisc4331);
                title.setText(R.string.cisc4331title);
                textbooks.setText(R.string.cisc4331texts);
                credits.setText(R.string.cisc4331credits);
                break;

            case "CISC 4335":
                course.setText(R.string.cisc4335);
                title.setText(R.string.cisc4335title);
                textbooks.setText(R.string.cisc4335texts);
                credits.setText(R.string.cisc4335credits);
                break;

            case "CISC 3620":
                course.setText(R.string.cisc3620);
                title.setText(R.string.cisc3620title);
                textbooks.setText(R.string.cisc3620texts);
                credits.setText(R.string.cisc3620credits);
                break;
            case "CISC 3415":
                course.setText(R.string.cisc3415);
                title.setText(R.string.cisc3415texts);
                textbooks.setText(R.string.cisc3415texts);
                credits.setText(R.string.cisc3415credits);
                break;
            case "CISC 3410":
                course.setText(R.string.cisc3410);
                title.setText(R.string.cisc3410title);
                textbooks.setText(R.string.cisc3410texts);
                credits.setText(R.string.cisc3410credits);
                break;
            case "CISC 3610":
                course.setText(R.string.cisc3610);
                title.setText(R.string.cisc3610title);
                textbooks.setText(R.string.cisc3610texts);
                credits.setText(R.string.cisc3610credits);
                break;
            case "CISC 3650":
                course.setText(R.string.cisc3650);
                title.setText(R.string.cisc3650title);
                textbooks.setText(R.string.cisc3650texts);
                credits.setText(R.string.cisc3650credits);
                break;

            case "CISC 3660":
                course.setText(R.string.cisc3660);
                title.setText(R.string.cisc3660title);
                textbooks.setText(R.string.cisc3660texts);
                credits.setText(R.string.cisc3660credits);
                break;

            case "CISC 3665":
                course.setText(R.string.cisc3665);
                title.setText(R.string.cisc3665title);
                textbooks.setText(R.string.cisc3665texts);
                credits.setText(R.string.cisc3665credits);
                break;

            case "CISC 1600":
                course.setText(R.string.cisc1600);
                title.setText(R.string.cisc1600title);
                textbooks.setText(R.string.cisc1600texts);
                credits.setText(R.string.cisc1600credits);
                break;

            case "CISC 1110":
                course.setText(R.string.cisc1110);
                title.setText(R.string.cisc1110title);
                textbooks.setText(R.string.cisc1110texts);
                credits.setText(R.string.cisc1110credits);
                break;
            case "CISC 3110":
                course.setText(R.string.cisc3110);
                title.setText(R.string.cisc3110title);
                textbooks.setText(R.string.cisc3110texts);
                credits.setText(R.string.cisc3110credits);
                break;
            case "CISC 3171":
                course.setText(R.string.cisc3171);
                title.setText(R.string.cisc3171title);
                textbooks.setText(R.string.cisc3171texts);
                credits.setText(R.string.cisc3171credits);
                break;
            case "CISC 3120":
                course.setText(R.string.cisc3120);
                title.setText(R.string.cisc3120title);
                textbooks.setText(R.string.cisc3120texts);
                credits.setText(R.string.cisc3120credits);
                break;
            case "CISC 3130":
                course.setText(R.string.cisc3130);
                title.setText(R.string.cisc3130title);
                textbooks.setText(R.string.cisc3130texts);
                credits.setText(R.string.cisc3130credits);
                break;
            case "CISC 3140":
                course.setText(R.string.cisc3140);
                title.setText(R.string.cisc3140title);
                textbooks.setText(R.string.cisc3140texts);
                credits.setText(R.string.cisc3140credits);
                break;
            case "CISC 3150":
                course.setText(R.string.cisc3150);
                title.setText(R.string.cisc3150title);
                textbooks.setText(R.string.cisc3150texts);
                credits.setText(R.string.cisc3150credits);
                break;
            case "CISC 3160":
                course.setText(R.string.cisc3160);
                title.setText(R.string.cisc3160title);
                textbooks.setText(R.string.cisc3160texts);
                credits.setText(R.string.cisc3160credits);
                break;
            case "CISC 2210":
                course.setText(R.string.cisc2210);
                title.setText(R.string.cisc2210title);
                textbooks.setText(R.string.cisc2210texts);
                credits.setText(R.string.cisc2210credits);
                break;
            case "PHIL 3318W":
            case "CISC 2820W":
                course.setText(R.string.cisc2820w);
                title.setText(R.string.cisc2820wtitle);
                textbooks.setText(R.string.cisc2820wtexts);
                credits.setText(R.string.cisc2820wcredits);
                break;
            case "CISC 3310":
                course.setText(R.string.cisc3310);
                title.setText(R.string.cisc3310title);
                textbooks.setText(R.string.cisc3310texts);
                credits.setText(R.string.cisc3310credits);
                break;
            case "CISC 3345":
                course.setText(R.string.cisc3345);
                title.setText(R.string.cisc3345title);
                textbooks.setText(R.string.cisc3345texts);
                credits.setText(R.string.cisc3345credits);
                break;
            case "CISC 3340":
                course.setText(R.string.cisc3340);
                title.setText(R.string.cisc3340title);
                textbooks.setText(R.string.cisc3340texts);
                credits.setText(R.string.cisc3340credits);
                break;
            case "CISC 3343":
                course.setText(R.string.cisc3343);
                title.setText(R.string.cisc3343title);
                textbooks.setText(R.string.cisc3343texts);
                credits.setText(R.string.cisc3343credits);
                break;
            case "CISC 3390":
                course.setText(R.string.cisc3390);
                title.setText(R.string.cisc3390title);
                textbooks.setText(R.string.cisc3390texts);
                credits.setText(R.string.cisc3390credits);
                break;
            case "CISC 3320":
                course.setText(R.string.cisc3320);
                title.setText(R.string.cisc3320title);
                textbooks.setText(R.string.cisc3320texts);
                credits.setText(R.string.cisc3320credits);
                break;
            case "CISC 3315":
                course.setText(R.string.cisc3315);
                title.setText(R.string.cisc3315title);
                textbooks.setText(R.string.cisc3315texts);
                credits.setText(R.string.cisc3315credits);
                break;
            case "CISC 3325":
                course.setText(R.string.cisc3325);
                title.setText(R.string.cisc3325title);
                textbooks.setText(R.string.cisc3325texts);
                credits.setText(R.string.cisc3325credits);
                break;
            case "CISC 3240":
                course.setText(R.string.cisc3240);
                title.setText(R.string.cisc3240title);
                textbooks.setText(R.string.cisc3240texts);
                credits.setText(R.string.cisc3240credits);
                break;
            case "CISC 3220":
                course.setText(R.string.cisc3220);
                title.setText(R.string.cisc3220title);
                textbooks.setText(R.string.cisc3220texts);
                credits.setText(R.string.cisc3220credits);
                break;
            case "CISC 3230":
                course.setText(R.string.cisc3230);
                title.setText(R.string.cisc3230title);
                textbooks.setText(R.string.cisc3230texts);
                credits.setText(R.string.cisc3230credits);
                break;
            case "CISC 4900":
                course.setText(R.string.cisc4900);
                title.setText(R.string.cisc4900title);
                textbooks.setText(R.string.cisc4900texts);
                credits.setText(R.string.cisc4900credits);
                break;
            case "CISC 5001":
                course.setText(R.string.cisc5001);
                title.setText(R.string.cisc5001title);
                textbooks.setText(R.string.cisc5001texts);
                credits.setText(R.string.cisc5001credits);
                break;
        }
    }
}


//TODO add some helpful links
//TODO tabbed screen for majors/minors
//TODO link to a textbook price comparision website for each textbook
//TODO sort the cases based on course number here and in res too
//TODO add a prereq section
//TODO split course' info into different res files
//TODO combine all courses into one class with appropriate functions for ease of use
//TODO keep adding more majors/minors/classes
//TODO figure something out for electives and math classes etc.
//TODO listview for long lists of classes
//TODO name of major/minor on top of list of classes
