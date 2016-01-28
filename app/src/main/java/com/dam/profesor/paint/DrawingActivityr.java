package com.dam.profesor.paint;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class DrawingActivityr extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing_activityr);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton newdraw_r = (ImageButton)findViewById(R.id.newdraw_r);
        ImageButton brush_r = (ImageButton)findViewById(R.id.brush_r);
        ImageButton eraser_r = (ImageButton)findViewById(R.id.eraser_r);
        ImageButton savedraw_r = (ImageButton)findViewById(R.id.savedraw_r);
        ImageButton arrow_r_small_right = (ImageButton)findViewById(R.id.arrow_r_small_right);
        ImageButton arrow_r_small_left = (ImageButton)findViewById(R.id.arrow_r_small_left);

        newdraw_r.setOnClickListener(this);
        brush_r.setOnClickListener(this);
        eraser_r.setOnClickListener(this);
        savedraw_r.setOnClickListener(this);
        arrow_r_small_right.setOnClickListener(this);
        arrow_r_small_left.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        tools buttons = new tools(this);
        switch (v.getId()){
            case R.id.newdraw_r:
                buttons.newdrawing();
                break;
            case R.id.brush_r:
                buttons.brush();
                break;
            case R.id.eraser_r:
                buttons.eraser();
                break;
            case R.id.savedraw_r:
                break;
            case R.id.arrow_r_small_right:
                Intent intentright;
                intentright = new Intent("com.dam.profesor.paint.DrawingActivitys");
                startActivity(intentright);
                break;
            case R.id.arrow_r_small_left:
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

