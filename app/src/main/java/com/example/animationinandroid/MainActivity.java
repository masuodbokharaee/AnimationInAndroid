package com.example.animationinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtHelloWorld ,txtHiWorld;
    private ImageView imgLion , imgLeopard;

    private boolean isHelloWorldShowing = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgLeopard = findViewById(R.id.imgLeopard);
        imgLion = findViewById(R.id.imgLion);
        txtHelloWorld = findViewById(R.id.txtHelloWorld);
        txtHiWorld =findViewById(R.id.txtHiWorld);
        txtHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isHelloWorldShowing){
                    txtHelloWorld.animate().alpha(0).setDuration(3000);
                    txtHiWorld.animate().alpha(1).setDuration(3000);
                    isHelloWorldShowing = false;
                }else if (!isHelloWorldShowing) {
                    txtHelloWorld.animate().alpha(1).setDuration(3000);
                    txtHiWorld.animate().alpha(0).setDuration(3000);
                    isHelloWorldShowing = true;
                }

            }
        });

        imgLion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isHelloWorldShowing){
                    imgLion.animate().alpha(0).setDuration(3000);
                    imgLion.animate().rotation(360);
                    imgLeopard.animate().alpha(1).setDuration(5000);
                    isHelloWorldShowing = false;
                }else if (!isHelloWorldShowing) {
                    imgLion.animate().alpha(1).setDuration(3000);
                    imgLion.animate().rotation(-360);
                    imgLeopard.animate().alpha(0).setDuration(5000);
                    isHelloWorldShowing = true;
                }
            }
        });
    }
}