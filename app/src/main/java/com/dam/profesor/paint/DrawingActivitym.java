package com.dam.profesor.paint;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class DrawingActivitym extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing_activitym);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton newdraw_m = (ImageButton)findViewById(R.id.newdraw_m);
        ImageButton brush_m = (ImageButton)findViewById(R.id.brush_m);
        ImageButton eraser_m = (ImageButton)findViewById(R.id.eraser_m);
        ImageButton savedraw_m = (ImageButton)findViewById(R.id.savedraw_m);
        ImageButton arrow_m_small_right = (ImageButton)findViewById(R.id.arrow_m_small_right);
        ImageButton arrow_m_small_left = (ImageButton)findViewById(R.id.arrow_m_small_left);

        newdraw_m.setOnClickListener(this);
        brush_m.setOnClickListener(this);
        eraser_m.setOnClickListener(this);
        savedraw_m.setOnClickListener(this);
        arrow_m_small_right.setOnClickListener(this);
        arrow_m_small_left.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        tools buttons = new tools(this);
        switch (v.getId()){
            case R.id.newdraw_m:
                buttons.newdrawing();
                break;
            case R.id.brush_m:
                buttons.brush();
                break;
            case R.id.eraser_m:
                buttons.eraser();
                break;
            case R.id.savedraw_m:
                break;
            case R.id.arrow_m_small_right:
                Intent intentright;
                intentright = new Intent("com.dam.profesor.paint.DrawingActivityn");
                startActivity(intentright);
                break;
            case R.id.arrow_m_small_left:
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

