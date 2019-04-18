package sg.edu.rp.c346.demoradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    //Get the RadioGroup object
                    RadioGroup rg = findViewById(R.id.radioGroup1);
                    //Get the id of the selected radio button in the radiogroup
                    int selectedButtonId = rg.getCheckedRadioButtonId();
                    //Get the radio button object from the id we got above
                    RadioButton rb = findViewById(selectedButtonId);
                    //Show a toast that displays the text on the selected radio button
                    Toast.makeText(getBaseContext(), rb.getText(), Toast.LENGTH_LONG).show();

            }
        });
    }
}
