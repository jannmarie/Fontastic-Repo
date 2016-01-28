package com.dam.profesor.paint;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.ImageButton;

public class DrawingActivityb extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing_activityb);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton newdraw_b = (ImageButton)findViewById(R.id.newdraw_b);
        ImageButton brush_b = (ImageButton)findViewById(R.id.brush_b);
        ImageButton eraser_b = (ImageButton)findViewById(R.id.eraser_b);
        ImageButton savedraw_b = (ImageButton)findViewById(R.id.savedraw_b);
        ImageButton arrow_b_small_right = (ImageButton)findViewById(R.id.arrow_b_small_right);
        ImageButton arrow_b_small_left = (ImageButton)findViewById(R.id.arrow_b_small_left);

        newdraw_b.setOnClickListener(this);
        brush_b.setOnClickListener(this);
        eraser_b.setOnClickListener(this);
        savedraw_b.setOnClickListener(this);
        arrow_b_small_right.setOnClickListener(this);
        arrow_b_small_left.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        tools buttons = new tools(this);
        switch (v.getId()){
            case R.id.newdraw_b:
                buttons.newdrawing();
                break;
            case R.id.brush_b:
                buttons.brush();
                break;
            case R.id.eraser_b:
                buttons.eraser();
                break;
            case R.id.savedraw_b:
                break;
            case R.id.arrow_b_small_right:
                Intent intentright;
                intentright = new Intent("com.dam.profesor.paint.DrawingActivitya");
                startActivity(intentright);
                break;
            case R.id.arrow_b_small_left:
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
