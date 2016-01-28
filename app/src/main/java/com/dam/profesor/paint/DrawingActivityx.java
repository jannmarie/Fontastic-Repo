package com.dam.profesor.paint;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class DrawingActivityx extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing_activityx);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton newdraw_x = (ImageButton)findViewById(R.id.newdraw_x);
        ImageButton brush_x = (ImageButton)findViewById(R.id.brush_x);
        ImageButton eraser_x = (ImageButton)findViewById(R.id.eraser_x);
        ImageButton savedraw_x = (ImageButton)findViewById(R.id.savedraw_x);
        ImageButton arrow_x_small_right = (ImageButton)findViewById(R.id.arrow_x_small_right);
        ImageButton arrow_x_small_left = (ImageButton)findViewById(R.id.arrow_x_small_left);

        newdraw_x.setOnClickListener(this);
        brush_x.setOnClickListener(this);
        eraser_x.setOnClickListener(this);
        savedraw_x.setOnClickListener(this);
        arrow_x_small_right.setOnClickListener(this);
        arrow_x_small_left.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        tools buttons = new tools(this);
        switch (v.getId()){
            case R.id.newdraw_x:
                buttons.newdrawing();
                break;
            case R.id.brush_x:
                buttons.brush();
                break;
            case R.id.eraser_x:
                buttons.eraser();
                break;
            case R.id.savedraw_x:
                break;
            case R.id.arrow_x_small_right:
                Intent intentright;
                intentright = new Intent("com.dam.profesor.paint.DrawingActivityy");
                startActivity(intentright);
                break;
            case R.id.arrow_x_small_left:
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
