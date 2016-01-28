package com.dam.profesor.paint;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.UUID;

public class DrawingActivitya extends AppCompatActivity implements View.OnClickListener {

    public static canvas_class drawingv;
    ImageButton brushsize_a;
    ImageButton newdraw_a;
    ImageButton eraser_a;
    ImageButton savedraw_a;
    ImageButton arrow_a_small_right;
    ImageButton arrow_a_small_left;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing_activitya);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        newdraw_a = (ImageButton)findViewById(R.id.newdraw_a);
        brushsize_a = (ImageButton)findViewById(R.id.brush_a);
        eraser_a = (ImageButton)findViewById(R.id.eraser_a);
        savedraw_a = (ImageButton)findViewById(R.id.savedraw_a);
        arrow_a_small_right = (ImageButton)findViewById(R.id.arrow_a_small_right);
        arrow_a_small_left = (ImageButton)findViewById(R.id.arrow_a_small_left);

        brushsize_a.setOnClickListener(this);
        newdraw_a.setOnClickListener(this);
        eraser_a.setOnClickListener(this);
        savedraw_a.setOnClickListener(this);
        arrow_a_small_right.setOnClickListener(this);
        arrow_a_small_left.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void save(){
        AlertDialog.Builder savedrawing = new AlertDialog.Builder(this);
        savedrawing.setTitle("Save");
        savedrawing.setMessage("Do you want to save drawing?");
        savedrawing.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {

                //Salvar dibujo
                drawingv.setDrawingCacheEnabled(true);
                //attempt to save
                String imgSaved = MediaStore.Images.Media.insertImage(
                        getContentResolver(), drawingv.getDrawingCache(),
                        UUID.randomUUID().toString() + ".png", "drawing");
                //Mensaje detodo correcto
                if (imgSaved != null) {
                    Toast savedToast = Toast.makeText(getApplicationContext(),
                            "Your drawing was saved in the gallery.", Toast.LENGTH_SHORT);
                    savedToast.show();
                } else {
                    Toast unsavedToast = Toast.makeText(getApplicationContext(),
                            "Your drawing was not saved.", Toast.LENGTH_SHORT);
                    unsavedToast.show();
                }
                drawingv.destroyDrawingCache();
            }
        });
        savedrawing.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        savedrawing.show();

    }

    @Override
    public void onClick(View v) {
        tools buttons = new tools(this);
        switch (v.getId()){
            case R.id.newdraw_a:
                buttons.newdrawing();
                break;
            case R.id.brush_a:
                buttons.brush();
                break;
            case R.id.eraser_a:
                buttons.eraser();
                break;
            case R.id.savedraw_a:
                save();
                break;
            case R.id.arrow_a_small_right:
                Intent intentright;
                intentright = new Intent("com.dam.profesor.paint.DrawingActivityb");
                startActivity(intentright);
                break;
            case R.id.arrow_a_small_left:
                finish();
                break;
            default:
                break;
        }
    }
}