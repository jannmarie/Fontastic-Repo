package com.dam.profesor.paint;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class DrawingActivityw extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing_activityw);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton newdraw_w = (ImageButton)findViewById(R.id.newdraw_w);
        ImageButton brush_w = (ImageButton)findViewById(R.id.brush_w);
        ImageButton eraser_w = (ImageButton)findViewById(R.id.eraser_w);
        ImageButton savedraw_w = (ImageButton)findViewById(R.id.savedraw_w);
        ImageButton arrow_w_small_right = (ImageButton)findViewById(R.id.arrow_w_small_right);
        ImageButton arrow_w_small_left = (ImageButton)findViewById(R.id.arrow_w_small_left);

        newdraw_w.setOnClickListener(this);
        brush_w.setOnClickListener(this);
        eraser_w.setOnClickListener(this);
        savedraw_w.setOnClickListener(this);
        arrow_w_small_right.setOnClickListener(this);
        arrow_w_small_left.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        tools buttons = new tools(this);
        switch (v.getId()){
            case R.id.newdraw_w:
                buttons.newdrawing();
                break;
            case R.id.brush_w:
                buttons.brush();
                break;
            case R.id.eraser_w:
                buttons.eraser();
                break;
            case R.id.savedraw_w:
                break;
            case R.id.arrow_w_small_right:
                Intent intentright;
                intentright = new Intent("com.dam.profesor.paint.DrawingActivityx");
                startActivity(intentright);
                break;
            case R.id.arrow_w_small_left:
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

