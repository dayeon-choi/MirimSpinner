package org.techtown.mirimspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    String[] titleRes={"기생충","설국열차","택시운전사","군함도","반도","레미제라블","라라랜드","메이즈러너","부산행","살아있다"};
    int[] imgRes = {
            R.drawable.post1,R.drawable.post2,R.drawable.post3,R.drawable.post4,R.drawable.post5,R.drawable.post6,R.drawable.post7,R.drawable.post8, R.drawable.post9,R.drawable.post10
    };
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner1=findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,titleRes);
        spinner1.setAdapter(adapter);
        imageView=findViewById(R.id.img_post);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                imageView.setImageResource(imgRes[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}