package com.dam.profesor.paint;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class DrawingActivityc extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing_activityc);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton newdraw_c = (ImageButton)findViewById(R.id.newdraw_c);
        ImageButton brush_c = (ImageButton)findViewById(R.id.brush_c);
        ImageButton eraser_c = (ImageButton)findViewById(R.id.eraser_c);
        ImageButton savedraw_c = (ImageButton)findViewById(R.id.savedraw_c);
        ImageButton arrow_c_small_right = (ImageButton)findViewById(R.id.arrow_c_small_right);
        ImageButton arrow_c_small_left = (ImageButton)findViewById(R.id.arrow_c_small_left);

        newdraw_c.setOnClickListener(this);
        brush_c.setOnClickListener(this);
        eraser_c.setOnClickListener(this);
        savedraw_c.setOnClickListener(this);
        arrow_c_small_right.setOnClickListener(this);
        arrow_c_small_left.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        tools buttons = new tools(this);
        switch (v.getId()){
            case R.id.newdraw_c:
                buttons.newdrawing();
                break;
            case R.id.brush_c:
                buttons.brush();
                break;
            case R.id.eraser_c:
                buttons.eraser();
                break;
            case R.id.savedraw_c:
                break;
            case R.id.arrow_c_small_right:
                Intent intentright;
                intentright = new Intent("com.dam.profesor.paint.DrawingActivityd");
                startActivity(intentright);
                break;
            case R.id.arrow_c_small_left:
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
