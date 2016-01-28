package com.dam.profesor.paint;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class DrawingActivityd extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing_activityd);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton newdraw_d = (ImageButton)findViewById(R.id.newdraw_d);
        ImageButton brush_d = (ImageButton)findViewById(R.id.brush_d);
        ImageButton eraser_d = (ImageButton)findViewById(R.id.eraser_d);
        ImageButton savedraw_d = (ImageButton)findViewById(R.id.savedraw_d);
        ImageButton arrow_d_small_right = (ImageButton)findViewById(R.id.arrow_d_small_right);
        ImageButton arrow_d_small_left = (ImageButton)findViewById(R.id.arrow_d_small_left);

        newdraw_d.setOnClickListener(this);
        brush_d.setOnClickListener(this);
        eraser_d.setOnClickListener(this);
        savedraw_d.setOnClickListener(this);
        arrow_d_small_right.setOnClickListener(this);
        arrow_d_small_left.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        tools buttons = new tools(this);
        switch (v.getId()){
            case R.id.newdraw_d:
                buttons.newdrawing();
                break;
            case R.id.brush_d:
                buttons.brush();
                break;
            case R.id.eraser_d:
                buttons.eraser();
                break;
            case R.id.savedraw_d:
                break;
            case R.id.arrow_d_small_right:
                Intent intentright;
                intentright = new Intent("com.dam.profesor.paint.DrawingActivitye");
                startActivity(intentright);
                break;
            case R.id.arrow_d_small_left:
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
