package com.example.emergency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.here.android.mpa.common.GeoCoordinate;
import com.here.android.mpa.common.OnEngineInitListener;
import com.here.android.mpa.mapping.Map;
import com.here.android.mpa.venues3d.VenueMapFragment;

public class Admin extends AppCompatActivity {
//    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

//        text = findViewById(R.id.textAdmin);
//        text.setText("Department of health ");
//        String[] para = text.getText().toString().split("\r\n\r\n");
//        Toast.makeText(Admin.this, "" + para.length, Toast.LENGTH_LONG).show();
    }
}