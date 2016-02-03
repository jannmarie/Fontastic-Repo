package com.dam.profesor.paint;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import java.util.UUID;

public class DrawingActivity extends AppCompatActivity implements View.OnClickListener {

    ViewFlipper viewFlipper;
    ImageButton next, previous, newdraw, brushsize, savedraw;

    public static canvas_class drawingcanvas_a;

    float psmall= 10;
    float pmedium= 20;
    float plarge= 30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewFlipper = (ViewFlipper) findViewById(R.id.flipper_canvas);
        next = (ImageButton) findViewById(R.id.arrow_next);
        previous = (ImageButton) findViewById(R.id.arrow_previous);
        newdraw = (ImageButton)findViewById(R.id.newdraw);
        brushsize = (ImageButton)findViewById(R.id.brush);
        savedraw = (ImageButton)findViewById(R.id.savedraw);

        drawingcanvas_a = (canvas_class)findViewById(R.id.canvas_lowercase_a);

        next.setOnClickListener(this);
        previous.setOnClickListener(this);
        brushsize.setOnClickListener(this);
        newdraw.setOnClickListener(this);
        savedraw.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.arrow_next:
                viewFlipper.showNext();
                break;
            case R.id.arrow_previous:
                viewFlipper.showPrevious();
                break;
            case R.id.newdraw:
                AlertDialog.Builder newDialog = new AlertDialog.Builder(this);
                newDialog.setTitle("New Drawing?");
                newDialog.setMessage("You will overwrite all your current drawings. Are you sure you want to add another drawing?");
                newDialog.setPositiveButton("Accept", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which){
                        drawingcanvas_a.newDrawing();
                        dialog.dismiss();
                    }
                });
                newDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                newDialog.show();
                break;
            case R.id.brush:
                final Dialog brushsize = new Dialog(this);
                brushsize.setTitle("Select Brush Size:");
                brushsize.setContentView(R.layout.sizes);

                TextView smallBtn = (TextView)brushsize.findViewById(R.id.tSmall);
                smallBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        canvas_class.setPointSize(psmall);
                        brushsize.dismiss();
                    }
                });
                TextView mediumBtn = (TextView)brushsize.findViewById(R.id.tMedium);
                mediumBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        canvas_class.setPointSize(pmedium);

                        brushsize.dismiss();
                    }
                });
                TextView largeBtn = (TextView)brushsize.findViewById(R.id.tLarge);
                largeBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        canvas_class.setPointSize(plarge);
                        brushsize.dismiss();
                    }
                });
                brushsize.show();
                break;
            case R.id.savedraw:
                AlertDialog.Builder savedrawing = new AlertDialog.Builder(this);
                savedrawing.setTitle("Save");
                savedrawing.setMessage("Do you want to save drawing?");

                savedrawing.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        drawingcanvas_a.setDrawingCacheEnabled(true);
                        String imgSaved = MediaStore.Images.Media.insertImage(
                                getContentResolver(), drawingcanvas_a.getDrawingCache(),
                                UUID.randomUUID().toString() + ".png", "drawing");
                        if (imgSaved != null) {
                            Toast savedToast = Toast.makeText(getApplicationContext(),
                                    "Your drawing was saved in the gallery.", Toast.LENGTH_SHORT);
                            savedToast.show();
                        } else {
                            Toast unsavedToast = Toast.makeText(getApplicationContext(),
                                    "Your drawing was not saved.", Toast.LENGTH_SHORT);
                            unsavedToast.show();
                        }
                        drawingcanvas_a.destroyDrawingCache();
                    }
                });

                savedrawing.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                savedrawing.show();
                break;
            }

        }

    }