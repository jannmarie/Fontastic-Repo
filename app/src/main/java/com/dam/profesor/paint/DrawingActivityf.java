package com.dam.profesor.paint;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class DrawingActivityf extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing_activityf);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton newdraw_f = (ImageButton)findViewById(R.id.newdraw_f);
        ImageButton brush_f = (ImageButton)findViewById(R.id.brush_f);
        ImageButton eraser_f = (ImageButton)findViewById(R.id.eraser_f);
        ImageButton savedraw_f = (ImageButton)findViewById(R.id.savedraw_f);
        ImageButton arrow_f_small_right = (ImageButton)findViewById(R.id.arrow_f_small_right);
        ImageButton arrow_f_small_left = (ImageButton)findViewById(R.id.arrow_f_small_left);

        newdraw_f.setOnClickListener(this);
        brush_f.setOnClickListener(this);
        eraser_f.setOnClickListener(this);
        savedraw_f.setOnClickListener(this);
        arrow_f_small_right.setOnClickListener(this);
        arrow_f_small_left.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        tools buttons = new tools(this);
        switch (v.getId()){
            case R.id.newdraw_f:
                buttons.newdrawing();
                break;
            case R.id.brush_f:
                buttons.brush();
                break;
            case R.id.eraser_f:
                buttons.eraser();
                break;
            case R.id.savedraw_f:
                break;
            case R.id.arrow_f_small_right:
                Intent intentright;
                intentright = new Intent("com.dam.profesor.paint.DrawingActivityg");
                startActivity(intentright);
                break;
            case R.id.arrow_f_small_left:
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
