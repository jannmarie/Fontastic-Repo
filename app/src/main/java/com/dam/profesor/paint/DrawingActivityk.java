package com.dam.profesor.paint;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class DrawingActivityk extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing_activityk);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton newdraw_k = (ImageButton)findViewById(R.id.newdraw_k);
        ImageButton brush_k = (ImageButton)findViewById(R.id.brush_k);
        ImageButton eraser_k = (ImageButton)findViewById(R.id.eraser_k);
        ImageButton savedraw_k = (ImageButton)findViewById(R.id.savedraw_k);
        ImageButton arrow_k_small_right = (ImageButton)findViewById(R.id.arrow_k_small_right);
        ImageButton arrow_k_small_left = (ImageButton)findViewById(R.id.arrow_k_small_left);

        newdraw_k.setOnClickListener(this);
        brush_k.setOnClickListener(this);
        eraser_k.setOnClickListener(this);
        savedraw_k.setOnClickListener(this);
        arrow_k_small_right.setOnClickListener(this);
        arrow_k_small_left.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        tools buttons = new tools(this);
        switch (v.getId()){
            case R.id.newdraw_k:
                buttons.newdrawing();
                break;
            case R.id.brush_k:
                buttons.brush();
                break;
            case R.id.eraser_k:
                buttons.eraser();
                break;
            case R.id.savedraw_k:
                break;
            case R.id.arrow_k_small_right:
                Intent intentright;
                intentright = new Intent("com.dam.profesor.paint.DrawingActivityl");
                startActivity(intentright);
                break;
            case R.id.arrow_k_small_left:
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
