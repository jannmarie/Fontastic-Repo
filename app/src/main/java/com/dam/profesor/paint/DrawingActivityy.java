package com.dam.profesor.paint;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class DrawingActivityy extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing_activityy);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton newdraw_y = (ImageButton)findViewById(R.id.newdraw_y);
        ImageButton brush_y = (ImageButton)findViewById(R.id.brush_y);
        ImageButton eraser_y = (ImageButton)findViewById(R.id.eraser_y);
        ImageButton savedraw_y = (ImageButton)findViewById(R.id.savedraw_y);
        ImageButton arrow_y_small_right = (ImageButton)findViewById(R.id.arrow_y_small_right);
        ImageButton arrow_y_small_left = (ImageButton)findViewById(R.id.arrow_y_small_left);

        newdraw_y.setOnClickListener(this);
        brush_y.setOnClickListener(this);
        eraser_y.setOnClickListener(this);
        savedraw_y.setOnClickListener(this);
        arrow_y_small_right.setOnClickListener(this);
        arrow_y_small_left.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        tools buttons = new tools(this);
        switch (v.getId()){
            case R.id.newdraw_y:
                buttons.newdrawing();
                break;
            case R.id.brush_y:
                buttons.brush();
                break;
            case R.id.eraser_y:
                buttons.eraser();
                break;
            case R.id.savedraw_y:
                break;
            case R.id.arrow_y_small_right:
                Intent intentright;
                intentright = new Intent("com.dam.profesor.paint.DrawingActivityz");
                startActivity(intentright);
                break;
            case R.id.arrow_y_small_left:
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

