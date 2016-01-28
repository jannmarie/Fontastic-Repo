package com.dam.profesor.paint;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class DrawingActivityp extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing_activityp);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton newdraw_p = (ImageButton)findViewById(R.id.newdraw_p);
        ImageButton brush_p = (ImageButton)findViewById(R.id.brush_p);
        ImageButton eraser_p = (ImageButton)findViewById(R.id.eraser_p);
        ImageButton savedraw_p = (ImageButton)findViewById(R.id.savedraw_p);
        ImageButton arrow_p_small_right = (ImageButton)findViewById(R.id.arrow_p_small_right);
        ImageButton arrow_p_small_left = (ImageButton)findViewById(R.id.arrow_p_small_left);

        newdraw_p.setOnClickListener(this);
        brush_p.setOnClickListener(this);
        eraser_p.setOnClickListener(this);
        savedraw_p.setOnClickListener(this);
        arrow_p_small_right.setOnClickListener(this);
        arrow_p_small_left.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        tools buttons = new tools(this);
        switch (v.getId()){
            case R.id.newdraw_p:
                buttons.newdrawing();
                break;
            case R.id.brush_p:
                buttons.brush();
                break;
            case R.id.eraser_p:
                buttons.eraser();
                break;
            case R.id.savedraw_p:
                break;
            case R.id.arrow_p_small_right:
                Intent intentright;
                intentright = new Intent("com.dam.profesor.paint.DrawingActivityq");
                startActivity(intentright);
                break;
            case R.id.arrow_p_small_left:
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

