package com.dam.profesor.paint;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class DrawingActivityl extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing_activityl);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton newdraw_l = (ImageButton)findViewById(R.id.newdraw_l);
        ImageButton brush_l = (ImageButton)findViewById(R.id.brush_l);
        ImageButton eraser_l = (ImageButton)findViewById(R.id.eraser_l);
        ImageButton savedraw_l = (ImageButton)findViewById(R.id.savedraw_l);
        ImageButton arrow_l_small_right = (ImageButton)findViewById(R.id.arrow_l_small_right);
        ImageButton arrow_l_small_left = (ImageButton)findViewById(R.id.arrow_l_small_left);

        newdraw_l.setOnClickListener(this);
        brush_l.setOnClickListener(this);
        eraser_l.setOnClickListener(this);
        savedraw_l.setOnClickListener(this);
        arrow_l_small_right.setOnClickListener(this);
        arrow_l_small_left.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        tools buttons = new tools(this);
        switch (v.getId()){
            case R.id.newdraw_l:
                buttons.newdrawing();
                break;
            case R.id.brush_l:
                buttons.brush();
                break;
            case R.id.eraser_l:
                buttons.eraser();
                break;
            case R.id.savedraw_l:
                break;
            case R.id.arrow_l_small_right:
                Intent intentright;
                intentright = new Intent("com.dam.profesor.paint.DrawingActivitym");
                startActivity(intentright);
                break;
            case R.id.arrow_l_small_left:
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

