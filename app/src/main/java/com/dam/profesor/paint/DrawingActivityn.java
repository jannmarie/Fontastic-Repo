package com.dam.profesor.paint;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class DrawingActivityn extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing_activityn);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton newdraw_n = (ImageButton)findViewById(R.id.newdraw_n);
        ImageButton brush_n = (ImageButton)findViewById(R.id.brush_n);
        ImageButton eraser_n = (ImageButton)findViewById(R.id.eraser_n);
        ImageButton savedraw_n = (ImageButton)findViewById(R.id.savedraw_n);
        ImageButton arrow_n_small_right = (ImageButton)findViewById(R.id.arrow_n_small_right);
        ImageButton arrow_n_small_left = (ImageButton)findViewById(R.id.arrow_n_small_left);

        newdraw_n.setOnClickListener(this);
        brush_n.setOnClickListener(this);
        eraser_n.setOnClickListener(this);
        savedraw_n.setOnClickListener(this);
        arrow_n_small_right.setOnClickListener(this);
        arrow_n_small_left.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        tools buttons = new tools(this);
        switch (v.getId()){
            case R.id.newdraw_n:
                buttons.newdrawing();
                break;
            case R.id.brush_n:
                buttons.brush();
                break;
            case R.id.eraser_n:
                buttons.eraser();
                break;
            case R.id.savedraw_n:
                break;
            case R.id.arrow_n_small_right:
                Intent intentright;
                intentright = new Intent("com.dam.profesor.paint.DrawingActivityo");
                startActivity(intentright);
                break;
            case R.id.arrow_n_small_left:
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

