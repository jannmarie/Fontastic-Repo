package com.thesis.fontasticmaker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagebutton_create();
    }

    protected void imagebutton_create(){
        ImageButton createFont = (ImageButton) findViewById(R.id.makefont);
        createFont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent("com.thesis.fontasticmaker.DrawingActivity");
                startActivity(intent);
            }
        });
    }

}
