package com.dam.profesor.paint;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class DrawingActivityt extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing_activityt);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton newdraw_t = (ImageButton)findViewById(R.id.newdraw_t);
        ImageButton brush_t = (ImageButton)findViewById(R.id.brush_t);
        ImageButton eraser_t = (ImageButton)findViewById(R.id.eraser_t);
        ImageButton savedraw_t = (ImageButton)findViewById(R.id.savedraw_t);
        ImageButton arrow_t_small_right = (ImageButton)findViewById(R.id.arrow_t_small_right);
        ImageButton arrow_t_small_left = (ImageButton)findViewById(R.id.arrow_t_small_left);

        newdraw_t.setOnClickListener(this);
        brush_t.setOnClickListener(this);
        eraser_t.setOnClickListener(this);
        savedraw_t.setOnClickListener(this);
        arrow_t_small_right.setOnClickListener(this);
        arrow_t_small_left.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        tools buttons = new tools(this);
        switch (v.getId()){
            case R.id.newdraw_t:
                buttons.newdrawing();
                break;
            case R.id.brush_t:
                buttons.brush();
                break;
            case R.id.eraser_t:
                buttons.eraser();
                break;
            case R.id.savedraw_t:
                break;
            case R.id.arrow_t_small_right:
                Intent intentright;
                intentright = new Intent("com.dam.profesor.paint.DrawingActivityu");
                startActivity(intentright);
                break;
            case R.id.arrow_t_small_left:
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
