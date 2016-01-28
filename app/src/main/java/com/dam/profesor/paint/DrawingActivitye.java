package com.dam.profesor.paint;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class DrawingActivitye extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing_activitye);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton newdraw_e = (ImageButton)findViewById(R.id.newdraw_e);
        ImageButton brush_e = (ImageButton)findViewById(R.id.brush_e);
        ImageButton eraser_e = (ImageButton)findViewById(R.id.eraser_e);
        ImageButton savedraw_e = (ImageButton)findViewById(R.id.savedraw_e);
        ImageButton arrow_e_small_right = (ImageButton)findViewById(R.id.arrow_e_small_right);
        ImageButton arrow_e_small_left = (ImageButton)findViewById(R.id.arrow_e_small_left);

        newdraw_e.setOnClickListener(this);
        brush_e.setOnClickListener(this);
        eraser_e.setOnClickListener(this);
        savedraw_e.setOnClickListener(this);
        arrow_e_small_right.setOnClickListener(this);
        arrow_e_small_left.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        tools buttons = new tools(this);
        switch (v.getId()){
            case R.id.newdraw_e:
                buttons.newdrawing();
                break;
            case R.id.brush_e:
                buttons.brush();
                break;
            case R.id.eraser_e:
                buttons.eraser();
                break;
            case R.id.savedraw_e:
                break;
            case R.id.arrow_e_small_right:
                Intent intentright;
                intentright = new Intent("com.dam.profesor.paint.DrawingActivityf");
                startActivity(intentright);
                break;
            case R.id.arrow_e_small_left:
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
