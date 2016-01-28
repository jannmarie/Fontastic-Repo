package com.dam.profesor.paint;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class DrawingActivityh extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing_activityh);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton newdraw_h = (ImageButton)findViewById(R.id.newdraw_h);
        ImageButton brush_h = (ImageButton)findViewById(R.id.brush_h);
        ImageButton eraser_h = (ImageButton)findViewById(R.id.eraser_h);
        ImageButton savedraw_h = (ImageButton)findViewById(R.id.savedraw_h);
        ImageButton arrow_h_small_right = (ImageButton)findViewById(R.id.arrow_h_small_right);
        ImageButton arrow_h_small_left = (ImageButton)findViewById(R.id.arrow_h_small_left);

        newdraw_h.setOnClickListener(this);
        brush_h.setOnClickListener(this);
        eraser_h.setOnClickListener(this);
        savedraw_h.setOnClickListener(this);
        arrow_h_small_right.setOnClickListener(this);
        arrow_h_small_left.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        tools buttons = new tools(this);
        switch (v.getId()){
            case R.id.newdraw_h:
                buttons.newdrawing();
                break;
            case R.id.brush_h:
                buttons.brush();
                break;
            case R.id.eraser_h:
                buttons.eraser();
                break;
            case R.id.savedraw_h:
                break;
            case R.id.arrow_h_small_right:
                Intent intentright;
                intentright = new Intent("com.dam.profesor.paint.DrawingActivityi");
                startActivity(intentright);
                break;
            case R.id.arrow_h_small_left:
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

