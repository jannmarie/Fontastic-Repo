package com.dam.profesor.paint;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class DrawingActivityv extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing_activityv);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton newdraw_v = (ImageButton)findViewById(R.id.newdraw_v);
        ImageButton brush_v = (ImageButton)findViewById(R.id.brush_v);
        ImageButton eraser_v = (ImageButton)findViewById(R.id.eraser_v);
        ImageButton savedraw_v = (ImageButton)findViewById(R.id.savedraw_v);
        ImageButton arrow_v_small_right = (ImageButton)findViewById(R.id.arrow_v_small_right);
        ImageButton arrow_v_small_left = (ImageButton)findViewById(R.id.arrow_v_small_left);

        newdraw_v.setOnClickListener(this);
        brush_v.setOnClickListener(this);
        eraser_v.setOnClickListener(this);
        savedraw_v.setOnClickListener(this);
        arrow_v_small_right.setOnClickListener(this);
        arrow_v_small_left.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        tools buttons = new tools(this);
        switch (v.getId()){
            case R.id.newdraw_v:
                buttons.newdrawing();
                break;
            case R.id.brush_v:
                buttons.brush();
                break;
            case R.id.eraser_v:
                buttons.eraser();
                break;
            case R.id.savedraw_v:
                break;
            case R.id.arrow_v_small_right:
                Intent intentright;
                intentright = new Intent("com.dam.profesor.paint.DrawingActivityw");
                startActivity(intentright);
                break;
            case R.id.arrow_v_small_left:
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

