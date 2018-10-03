package constraints.karynboyd.com.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText peopleField;
    EditText tipField;
    EditText billField;
    TextView tipTotalView;
    TextView billTotalView;
    TextView perPersonView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        perPersonView = findViewById(R.id.perPersonView);
        tipTotalView = findViewById(R.id.tipTotalView);
        billTotalView = findViewById(R.id.billTotalView);
        peopleField = findViewById(R.id.peopleField);
        tipField = findViewById(R.id.tipField);
        billField = findViewById(R.id.billField);
    }

    public void calculate() {
        double bill = Integer.parseInt(billField.getText().toString());
        double split = Integer.parseInt(peopleField.getText().toString());
        double tip = Integer.parseInt(tipField.getText().toString());

        double billTotal = bill / split;
        billTotalView.setText("The total per person is " + billTotal);


    }
}
