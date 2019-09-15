package com.example.converterkp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText Kg,Pound;
    private String kg,pound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Kg = findViewById(R.id.KgEditText);
        Pound = findViewById(R.id.PoundEditText);

        Kg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kg= Kg.getText().toString().trim();
                try {
                    Pound.setText((Double.parseDouble(kg)*2.20462)+"");
                } catch (NumberFormatException e) {

                }

            }
        });
        Pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pound = Pound.getText().toString().trim();
                try {
                    Kg.setText(String.format("%.2f",(Double.parseDouble(pound)/2.20462)));
                } catch (NumberFormatException e) {

                }

            }
        });

    }
}
