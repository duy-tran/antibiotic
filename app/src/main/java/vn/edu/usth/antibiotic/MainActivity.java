package vn.edu.usth.antibiotic;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by duy on 1/2/17.
 */

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Set color
        int red = Color.parseColor("#FF0000");
        int white = Color.parseColor("#FFFFFF");
        ((ImageView) findViewById(R.id.cross_icon)).setColorFilter(red);
        ((ImageView) findViewById(R.id.alarm_icon)).setColorFilter(red);
        ((ImageView) findViewById(R.id.user_icon)).setColorFilter(white);
        ((ImageView) findViewById(R.id.search_icon)).setColorFilter(white);

        findViewById(R.id.search).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMenu("search");
            }
        });
        findViewById(R.id.cross).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMenu("functions");
            }
        });
    }

    private void openMenu(String name){
        Class cl = null;
        if (name.equals("search")) {
            cl = DrugSearchActivity.class;
        } else if (name.equals("functions")) {
            cl = FunctionsActivity.class;
        }
        Intent myIntent = new Intent(getApplicationContext(),cl);
        getApplicationContext().startActivity(myIntent);
    }
}
