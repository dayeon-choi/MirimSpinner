package org.techtown.mirimspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    String[] titleRes={"기생충","설국열차","택시운전사","군함도","반도","레미제라블","라라랜드","메이즈러너","부산행","살아있다"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner1=findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,titleRes);
        spinner1.setAdapter(adapter);

    }
}