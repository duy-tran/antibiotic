package vn.edu.usth.antibiotic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class AddPrescriptionActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_prescription);
    
        final EditText newMedicineTextbox = (EditText) findViewById(R.id.new_medicine_textbox);
    
        final ArrayList<String> medicineNames = new ArrayList<>();
        final ArrayAdapter<String> medicineListAdapter = new ArrayAdapter<>(this, R.layout.medicine_item, R.id.medicine_name, medicineNames);
    
        ListView medicineList = (ListView) findViewById(R.id.medicine_list);
        medicineList.setAdapter(medicineListAdapter);
        
        Button addMedicineButton = (Button) findViewById(R.id.add_medicine_button);
        addMedicineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newItem = newMedicineTextbox.getText().toString();
                medicineNames.add(newItem);
                medicineListAdapter.notifyDataSetChanged();
        
            }
        });
    }
}
