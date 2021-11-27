package com.example.cricketchirptemperature;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ET1;
    Button btn1;
    TextView TV1;
    TextView TV2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ET1 = findViewById(R.id.ET1);
        btn1 = findViewById(R.id.btn1);
        TV1 = findViewById(R.id.TV1);
        TV2 = findViewById(R.id.TV2);

        TV2.setVisibility(View.GONE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ET1.getText().toString().isEmpty())
                    Toast.makeText(MainActivity.this,"Please Enter all Fields!",Toast.LENGTH_SHORT).show();
                else {
                    int chirps = Integer.parseInt(ET1.getText().toString().trim());
                    double temp = (chirps / 3.0) + 4;
                    String results = "The approx temperature outside is " + temp + "degrees celsius ";
                    TV2.setText(results);
                    TV2.setVisibility(View.VISIBLE);
                }

            }
        });
    }
}