package com.dam.profesor.paint;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class DrawingActivityu extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing_activityu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton newdraw_u = (ImageButton)findViewById(R.id.newdraw_u);
        ImageButton brush_u = (ImageButton)findViewById(R.id.brush_u);
        ImageButton eraser_u = (ImageButton)findViewById(R.id.eraser_u);
        ImageButton savedraw_u = (ImageButton)findViewById(R.id.savedraw_u);
        ImageButton arrow_u_small_right = (ImageButton)findViewById(R.id.arrow_u_small_right);
        ImageButton arrow_u_small_left = (ImageButton)findViewById(R.id.arrow_u_small_left);

        newdraw_u.setOnClickListener(this);
        brush_u.setOnClickListener(this);
        eraser_u.setOnClickListener(this);
        savedraw_u.setOnClickListener(this);
        arrow_u_small_right.setOnClickListener(this);
        arrow_u_small_left.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        tools buttons = new tools(this);
        switch (v.getId()){
            case R.id.newdraw_u:
                buttons.newdrawing();
                break;
            case R.id.brush_u:
                buttons.brush();
                break;
            case R.id.eraser_u:
                buttons.eraser();
                break;
            case R.id.savedraw_u:
                break;
            case R.id.arrow_u_small_right:
                Intent intentright;
                intentright = new Intent("com.dam.profesor.paint.DrawingActivityv");
                startActivity(intentright);
                break;
            case R.id.arrow_u_small_left:
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

