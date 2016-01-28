package com.dam.profesor.paint;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class DrawingActivityj extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing_activityj);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton newdraw_j = (ImageButton)findViewById(R.id.newdraw_j);
        ImageButton brush_j = (ImageButton)findViewById(R.id.brush_j);
        ImageButton eraser_j = (ImageButton)findViewById(R.id.eraser_j);
        ImageButton savedraw_j = (ImageButton)findViewById(R.id.savedraw_j);
        ImageButton arrow_j_small_right = (ImageButton)findViewById(R.id.arrow_j_small_right);
        ImageButton arrow_j_small_left = (ImageButton)findViewById(R.id.arrow_j_small_left);

        newdraw_j.setOnClickListener(this);
        brush_j.setOnClickListener(this);
        eraser_j.setOnClickListener(this);
        savedraw_j.setOnClickListener(this);
        arrow_j_small_right.setOnClickListener(this);
        arrow_j_small_left.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        tools buttons = new tools(this);
        switch (v.getId()){
            case R.id.newdraw_j:
                buttons.newdrawing();
                break;
            case R.id.brush_j:
                buttons.brush();
                break;
            case R.id.eraser_j:
                buttons.eraser();
                break;
            case R.id.savedraw_j:
                break;
            case R.id.arrow_j_small_right:
                Intent intentright;
                intentright = new Intent("com.dam.profesor.paint.DrawingActivityk");
                startActivity(intentright);
                break;
            case R.id.arrow_j_small_left:
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
