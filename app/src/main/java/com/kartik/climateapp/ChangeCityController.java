package com.kartik.climateapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class ChangeCityController extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_city_layout);
        final EditText editTextfield = (EditText)findViewById(R.id.queryET);
        ImageButton backButton = (ImageButton)findViewById(R.id.backButton);


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        editTextfield.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {


                String newCity = editTextfield.getText().toString();
                Intent myIntent = new Intent(ChangeCityController.this, WeatherController.class);
                myIntent.putExtra("City", newCity);
                startActivity(myIntent);

                return false;
            }
        });

    }
}
