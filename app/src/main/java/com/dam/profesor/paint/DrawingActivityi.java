package com.dam.profesor.paint;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class DrawingActivityi extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing_activityi);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton newdraw_i = (ImageButton)findViewById(R.id.newdraw_i);
        ImageButton brush_i = (ImageButton)findViewById(R.id.brush_i);
        ImageButton eraser_i = (ImageButton)findViewById(R.id.eraser_i);
        ImageButton savedraw_i = (ImageButton)findViewById(R.id.savedraw_i);
        ImageButton arrow_i_small_right = (ImageButton)findViewById(R.id.arrow_i_small_right);
        ImageButton arrow_i_small_left = (ImageButton)findViewById(R.id.arrow_i_small_left);

        newdraw_i.setOnClickListener(this);
        brush_i.setOnClickListener(this);
        eraser_i.setOnClickListener(this);
        savedraw_i.setOnClickListener(this);
        arrow_i_small_right.setOnClickListener(this);
        arrow_i_small_left.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        tools buttons = new tools(this);
        switch (v.getId()){
            case R.id.newdraw_i:
                buttons.newdrawing();
                break;
            case R.id.brush_i:
                buttons.brush();
                break;
            case R.id.eraser_i:
                buttons.eraser();
                break;
            case R.id.savedraw_i:
                break;
            case R.id.arrow_i_small_right:
                Intent intentright;
                intentright = new Intent("com.dam.profesor.paint.DrawingActivityj");
                startActivity(intentright);
                break;
            case R.id.arrow_i_small_left:
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

