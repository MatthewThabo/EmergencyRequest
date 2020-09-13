package com.example.emergency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class About extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        text = findViewById(R.id.textParagraph);
        text.setText("  Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" + " Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,\n"+"  when an unknown printer took a galley of type and scrambled it to make a type specimen\n"+"  book. It has survived not only five centuries, but\n" +
                "    also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the"+" 1960s with the release of Letraset sheets\n" +
                "    containing Lorem Ipsum passages, and more recently with desktop publishing\n" +
                "    software like Aldus PageMaker including versions of Lorem Ipsum .");
        String[] para = text.getText().toString().split("\r\n\r\n");
        Toast.makeText(About.this, "" + para.length, Toast.LENGTH_LONG).show();
    }
}