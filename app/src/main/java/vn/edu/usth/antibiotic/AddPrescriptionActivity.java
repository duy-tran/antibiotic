package vn.edu.usth.antibiotic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class AddPrescriptionActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_prescription);
    
        final ArrayList<String> medicineNames = new ArrayList<>();
        final MedicineAdapter medicineListAdapter = new MedicineAdapter(medicineNames);
                
        RecyclerView medicineList = (RecyclerView) findViewById(R.id.medicine_list);
        medicineList.setAdapter(medicineListAdapter);
    
        final EditText newMedicineTextbox = (EditText) findViewById(R.id.new_medicine_textbox);
        
        Button addMedicineButton = (Button) findViewById(R.id.add_medicine_button);
        addMedicineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newMedicine = newMedicineTextbox.getText().toString();
                newMedicineTextbox.setText("");
                medicineNames.add(newMedicine);
                medicineListAdapter.notifyDataSetChanged();
            }
        });
    }
    
    class MedicineAdapter extends RecyclerView.Adapter<MedicineAdapter.ViewHolder> {
        private ArrayList<String> data;
    
        class ViewHolder extends RecyclerView.ViewHolder {
            RelativeLayout medicineView;
    
            ViewHolder(RelativeLayout v) {
                super(v);
                medicineView = v;
            }
        }
    
        MedicineAdapter(ArrayList<String> data) {
            this.data = data;
        }
    
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            RelativeLayout v = (RelativeLayout) LayoutInflater.from(parent.getContext()).inflate(R.layout.medicine_item, parent, false);
            return new ViewHolder(v);
        }
    
        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            TextView medicineName = (TextView) holder.medicineView.findViewById(R.id.medicine_name);
            medicineName.setText(data.get(position));
        }
    
        @Override
        public int getItemCount() {
            return data.size();
        }
    }
}
