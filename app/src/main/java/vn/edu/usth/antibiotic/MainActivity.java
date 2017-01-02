package vn.edu.usth.antibiotic;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by duy on 1/2/17.
 */

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int red = Color.parseColor("#FF0000");
        int white = Color.parseColor("#FFFFFF");
        ((ImageView) findViewById(R.id.cross_icon)).setColorFilter(red);
        ((ImageView) findViewById(R.id.alarm_icon)).setColorFilter(red);
        ((ImageView) findViewById(R.id.user_icon)).setColorFilter(white);
        ((ImageView) findViewById(R.id.search_icon)).setColorFilter(white);
    }
}
