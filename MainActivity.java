package com.example.why_twice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonMail = (Button) findViewById(R.id.buttonMail);
        buttonMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editRollNumber = (EditText) findViewById(R.id.editRollNum);
                TextView viewMail = (TextView) findViewById(R.id.viewMail);

                String roll = editRollNumber.getText().toString();
                viewMail.setText(roll + "@vce.ac.in");

            }
        });


    }
}