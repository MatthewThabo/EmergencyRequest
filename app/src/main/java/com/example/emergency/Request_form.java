package com.example.emergency;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class Request_form extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_form);

        text = findViewById(R.id.textTime);
        String currentDateTimeString = java.text.DateFormat.getDateTimeInstance().format(new Date());

        Button button = findViewById(R.id.button_submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Check.class);
//               intent.putExtra("string", "hello world data");
                startActivity(intent);
            }
        });

// textView is the TextView view that should display it
        text.setText(currentDateTimeString);
    }
}