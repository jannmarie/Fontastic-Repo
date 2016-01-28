package com.dam.profesor.paint;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class DrawingActivitys extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing_activitys);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton newdraw_s = (ImageButton)findViewById(R.id.newdraw_s);
        ImageButton brush_s = (ImageButton)findViewById(R.id.brush_s);
        ImageButton eraser_s = (ImageButton)findViewById(R.id.eraser_s);
        ImageButton savedraw_s = (ImageButton)findViewById(R.id.savedraw_s);
        ImageButton arrow_s_small_right = (ImageButton)findViewById(R.id.arrow_s_small_right);
        ImageButton arrow_s_small_left = (ImageButton)findViewById(R.id.arrow_s_small_left);

        newdraw_s.setOnClickListener(this);
        brush_s.setOnClickListener(this);
        eraser_s.setOnClickListener(this);
        savedraw_s.setOnClickListener(this);
        arrow_s_small_right.setOnClickListener(this);
        arrow_s_small_left.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        tools buttons = new tools(this);
        switch (v.getId()){
            case R.id.newdraw_s:
                buttons.newdrawing();
                break;
            case R.id.brush_s:
                buttons.brush();
                break;
            case R.id.eraser_s:
                buttons.eraser();
                break;
            case R.id.savedraw_s:
                break;
            case R.id.arrow_s_small_right:
                Intent intentright;
                intentright = new Intent("com.dam.profesor.paint.DrawingActivityt");
                startActivity(intentright);
                break;
            case R.id.arrow_s_small_left:
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

