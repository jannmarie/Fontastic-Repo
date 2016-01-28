package com.dam.profesor.paint;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class DrawingActivityo extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing_activityo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton newdraw_o = (ImageButton)findViewById(R.id.newdraw_o);
        ImageButton brush_o = (ImageButton)findViewById(R.id.brush_o);
        ImageButton eraser_o = (ImageButton)findViewById(R.id.eraser_o);
        ImageButton savedraw_o = (ImageButton)findViewById(R.id.savedraw_o);
        ImageButton arrow_o_small_right = (ImageButton)findViewById(R.id.arrow_o_small_right);
        ImageButton arrow_o_small_left = (ImageButton)findViewById(R.id.arrow_o_small_left);

        newdraw_o.setOnClickListener(this);
        brush_o.setOnClickListener(this);
        eraser_o.setOnClickListener(this);
        savedraw_o.setOnClickListener(this);
        arrow_o_small_right.setOnClickListener(this);
        arrow_o_small_left.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        tools buttons = new tools(this);
        switch (v.getId()){
            case R.id.newdraw_o:
                buttons.newdrawing();
                break;
            case R.id.brush_o:
                buttons.brush();
                break;
            case R.id.eraser_o:
                buttons.eraser();
                break;
            case R.id.savedraw_o:
                break;
            case R.id.arrow_o_small_right:
                Intent intentright;
                intentright = new Intent("com.dam.profesor.paint.DrawingActivityp");
                startActivity(intentright);
                break;
            case R.id.arrow_o_small_left:
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

