package vn.edu.usth.antibiotic;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import vn.edu.usth.antibiotic.Fragment.AdvancedRecordFragment;

public class ParametricTest extends AppCompatActivity{
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parametric_test);
    
        setTitle(getString(R.string.parametric));
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_parametric_test);
        setSupportActionBar(toolbar);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
    
        getSupportFragmentManager().beginTransaction().add(R.id.parametricForm, new AdvancedRecordFragment()).commit();
    }
}
