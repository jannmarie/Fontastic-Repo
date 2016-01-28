package com.dam.profesor.paint;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class DrawingActivityz extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing_activityz);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton newdraw_z = (ImageButton)findViewById(R.id.newdraw_z);
        ImageButton brush_z = (ImageButton)findViewById(R.id.brush_z);
        ImageButton eraser_z = (ImageButton)findViewById(R.id.eraser_z);
        ImageButton savedraw_z = (ImageButton)findViewById(R.id.savedraw_z);
        ImageButton arrow_z_small_right = (ImageButton)findViewById(R.id.arrow_z_small_right);
        ImageButton arrow_z_small_left = (ImageButton)findViewById(R.id.arrow_z_small_left);

        newdraw_z.setOnClickListener(this);
        brush_z.setOnClickListener(this);
        eraser_z.setOnClickListener(this);
        savedraw_z.setOnClickListener(this);
        arrow_z_small_right.setOnClickListener(this);
        arrow_z_small_left.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        tools buttons = new tools(this);
        switch (v.getId()){
            case R.id.newdraw_z:
                buttons.newdrawing();
                break;
            case R.id.brush_z:
                buttons.brush();
                break;
            case R.id.eraser_z:
                buttons.eraser();
                break;
            case R.id.savedraw_z:
                break;
            case R.id.arrow_z_small_right:
                Intent intentright;
                intentright = new Intent("com.dam.profesor.paint.DrawingActivitya");
                startActivity(intentright);
                break;
            case R.id.arrow_z_small_left:
                finish();
                //               Intent intentleft;
                //              intentleft = new Intent("com.dam.profesor.paint.DrawingActivitya");
                //              startActivity(intentleft);
                break;
            default:
                break;
        }
    }

}

