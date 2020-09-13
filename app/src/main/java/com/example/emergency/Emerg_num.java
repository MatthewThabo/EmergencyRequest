package com.example.emergency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Emerg_num extends AppCompatActivity {
    TextView  text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emerg__num);

        text = findViewById(R.id.textContact);
        text.setText("  Nationwide Emergency Response\n" + "\u200B10111.\n" +
                "       Dial the telephone number 10111 from anywhere in South Africa.\n"+
                "       A call centre operator will answer the incoming call, take all necessary\n"+
                "       particulars and assign the complaint to a Flying Squad patrol vehicle,\n"+
                "       or the local police station, to attend the incident.\n\n\n"+
                "       City of Johannesburg Emergency Connect.\n"+
                "        \u200B011 37 55 911\n"+
                "        A 24-hour emergency services relating to all-life threatening situations,\n"+
                "        including ambulances, fire engines and metro police.");
        String[] para = text.getText().toString().split("\r\n\r\n");
        Toast.makeText(Emerg_num.this, "" + para.length, Toast.LENGTH_LONG).show();
    }
}