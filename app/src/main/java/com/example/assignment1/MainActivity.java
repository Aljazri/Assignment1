package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ViewGroup tContainer1;
    TextView txt1,txt2;
    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tContainer1 = findViewById(R.id.transitionContainer);
        txt1 = findViewById(R.id.text1);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        txt2 = findViewById(R.id.text2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(tContainer1);
                txt1.setVisibility(txt1.getVisibility()==View.INVISIBLE ? View.VISIBLE : View.INVISIBLE);
                Toast.makeText(MainActivity.this, "Clicking Blue Button", Toast.LENGTH_SHORT).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(tContainer1);
                Toast.makeText(MainActivity.this, "Clicking Purple Button", Toast.LENGTH_SHORT).show();
                if(txt2.getVisibility()== View.INVISIBLE){
                    txt2.setVisibility(View.VISIBLE);
                }
            }
        });
        txt2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                txt2.setVisibility(View.INVISIBLE);
                Toast.makeText(MainActivity.this, "Long pressing new Text", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
}