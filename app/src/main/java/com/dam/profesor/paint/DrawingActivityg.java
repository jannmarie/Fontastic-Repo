package com.dam.profesor.paint;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class DrawingActivityg extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing_activityg);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton newdraw_g = (ImageButton)findViewById(R.id.newdraw_g);
        ImageButton brush_g = (ImageButton)findViewById(R.id.brush_g);
        ImageButton eraser_g = (ImageButton)findViewById(R.id.eraser_g);
        ImageButton savedraw_g = (ImageButton)findViewById(R.id.savedraw_g);
        ImageButton arrow_g_small_right = (ImageButton)findViewById(R.id.arrow_g_small_right);
        ImageButton arrow_g_small_left = (ImageButton)findViewById(R.id.arrow_g_small_left);

        newdraw_g.setOnClickListener(this);
        brush_g.setOnClickListener(this);
        eraser_g.setOnClickListener(this);
        savedraw_g.setOnClickListener(this);
        arrow_g_small_right.setOnClickListener(this);
        arrow_g_small_left.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        tools buttons = new tools(this);
        switch (v.getId()){
            case R.id.newdraw_g:
                buttons.newdrawing();
                break;
            case R.id.brush_g:
                buttons.brush();
                break;
            case R.id.eraser_g:
                buttons.eraser();
                break;
            case R.id.savedraw_g:
                break;
            case R.id.arrow_g_small_right:
                Intent intentright;
                intentright = new Intent("com.dam.profesor.paint.DrawingActivityh");
                startActivity(intentright);
                break;
            case R.id.arrow_g_small_left:
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
