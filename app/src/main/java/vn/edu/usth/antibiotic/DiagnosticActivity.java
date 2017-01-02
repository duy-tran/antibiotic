package vn.edu.usth.antibiotic;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by duy on 1/2/17.
 */

public class DiagnosticActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getString(R.string.diagnostic));
        setContentView(R.layout.activity_diagnostic);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_diagnostic);
        setSupportActionBar(toolbar);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
    }
}
