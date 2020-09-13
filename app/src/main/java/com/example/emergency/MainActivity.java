package com.example.emergency;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Request_button to be clickable

        Button button = findViewById(R.id.request_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Request_form.class);
//               intent.putExtra("string", "hello world data");
                startActivity(intent);
            }
        });
        Button button1 = findViewById(R.id.admin_button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Admin.class);
//               intent.putExtra("string", "hello world data");
                startActivity(intent);
            }
        });


        dl = (DrawerLayout)findViewById(R.id.activity_main);
        t = new ActionBarDrawerToggle(this, dl,R.string.Open, R.string.Close);

        dl.addDrawerListener(t);
        t.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nv = (NavigationView)findViewById(R.id.nv);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch(id)
                {
                    case R.id.about:
                        Toast.makeText(MainActivity.this, "About",Toast.LENGTH_SHORT).show();
                    case R.id.emergency:
                        Toast.makeText(MainActivity.this, "Emergency Tips",Toast.LENGTH_SHORT).show();
                    case R.id.contact:
                        Toast.makeText(MainActivity.this, "Emergency Contact Details",Toast.LENGTH_SHORT).show();
                    default:
                        return true;
                }




            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.navigation_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if (id == R.id.about) {

            Intent intent = new Intent(this,About.class);
            this.startActivity(intent);
            return true;
        }
        if (id == R.id.contact) {
            Intent intent = new Intent(this,Emerg_num.class);
            this.startActivity(intent);
            return true;
        }
//        int id = item.getItemId();
//            if (id == R.id.account){
//                Intent intent = new Intent(MainActivity.this, About.class);
//                startActivity(intent);
//
//                return false;
//            }
//        switch (item.getItemId()){
//            case R.id.account:
//                Intent intent = new Intent(MainActivity.this, About.class);
//                startActivity(intent);
//        }
        if(t.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
    }
}
