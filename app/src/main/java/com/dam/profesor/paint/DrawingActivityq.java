package com.dam.profesor.paint;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class DrawingActivityq extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing_activityq);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton newdraw_q = (ImageButton)findViewById(R.id.newdraw_q);
        ImageButton brush_q = (ImageButton)findViewById(R.id.brush_q);
        ImageButton eraser_q = (ImageButton)findViewById(R.id.eraser_q);
        ImageButton savedraw_q = (ImageButton)findViewById(R.id.savedraw_q);
        ImageButton arrow_q_small_right = (ImageButton)findViewById(R.id.arrow_q_small_right);
        ImageButton arrow_q_small_left = (ImageButton)findViewById(R.id.arrow_q_small_left);

        newdraw_q.setOnClickListener(this);
        brush_q.setOnClickListener(this);
        eraser_q.setOnClickListener(this);
        savedraw_q.setOnClickListener(this);
        arrow_q_small_right.setOnClickListener(this);
        arrow_q_small_left.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        tools buttons = new tools(this);
        switch (v.getId()){
            case R.id.newdraw_q:
                buttons.newdrawing();
                break;
            case R.id.brush_q:
                buttons.brush();
                break;
            case R.id.eraser_q:
                buttons.eraser();
                break;
            case R.id.savedraw_q:
                break;
            case R.id.arrow_q_small_right:
                Intent intentright;
                intentright = new Intent("com.dam.profesor.paint.DrawingActivityr");
                startActivity(intentright);
                break;
            case R.id.arrow_q_small_left:
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

