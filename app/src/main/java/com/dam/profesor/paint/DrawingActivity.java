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

public class DrawingActivity extends AppCompatActivity implements View.OnClickListener {

    ViewFlipper viewFlipper;
    ImageButton next, previous, newdraw, brushsize, savedraw;

    public static canvas_class drawingcanvas_a, drawingcanvas_b, drawingcanvas_c, drawingcanvas_d, drawingcanvas_e, drawingcanvas_f, drawingcanvas_g, drawingcanvas_h, drawingcanvas_i, drawingcanvas_j, drawingcanvas_k, drawingcanvas_l, drawingcanvas_m, drawingcanvas_n, drawingcanvas_o, drawingcanvas_p, drawingcanvas_q, drawingcanvas_r, drawingcanvas_s, drawingcanvas_t, drawingcanvas_u, drawingcanvas_v, drawingcanvas_w, drawingcanvas_x, drawingcanvas_y, drawingcanvas_z;

    float psmall= 10;
    float pmedium= 20;
    float plarge= 30;

    String filename;

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
        drawingcanvas_b = (canvas_class)findViewById(R.id.canvas_lowercase_b);
        drawingcanvas_c = (canvas_class)findViewById(R.id.canvas_lowercase_c);
        drawingcanvas_d = (canvas_class)findViewById(R.id.canvas_lowercase_d);
        drawingcanvas_e = (canvas_class)findViewById(R.id.canvas_lowercase_e);
        drawingcanvas_f = (canvas_class)findViewById(R.id.canvas_lowercase_f);
        drawingcanvas_g = (canvas_class)findViewById(R.id.canvas_lowercase_g);
        drawingcanvas_h = (canvas_class)findViewById(R.id.canvas_lowercase_h);
        drawingcanvas_i = (canvas_class)findViewById(R.id.canvas_lowercase_i);
        drawingcanvas_j = (canvas_class)findViewById(R.id.canvas_lowercase_j);
        drawingcanvas_k = (canvas_class)findViewById(R.id.canvas_lowercase_k);
        drawingcanvas_l = (canvas_class)findViewById(R.id.canvas_lowercase_l);
        drawingcanvas_m = (canvas_class)findViewById(R.id.canvas_lowercase_m);
        drawingcanvas_n = (canvas_class)findViewById(R.id.canvas_lowercase_n);
        drawingcanvas_o = (canvas_class)findViewById(R.id.canvas_lowercase_o);
        drawingcanvas_p = (canvas_class)findViewById(R.id.canvas_lowercase_p);
        drawingcanvas_q = (canvas_class)findViewById(R.id.canvas_lowercase_q);
        drawingcanvas_r = (canvas_class)findViewById(R.id.canvas_lowercase_r);
        drawingcanvas_s = (canvas_class)findViewById(R.id.canvas_lowercase_s);
        drawingcanvas_t = (canvas_class)findViewById(R.id.canvas_lowercase_t);
        drawingcanvas_u = (canvas_class)findViewById(R.id.canvas_lowercase_u);
        drawingcanvas_v = (canvas_class)findViewById(R.id.canvas_lowercase_v);
        drawingcanvas_w = (canvas_class)findViewById(R.id.canvas_lowercase_w);
        drawingcanvas_x = (canvas_class)findViewById(R.id.canvas_lowercase_x);
        drawingcanvas_y = (canvas_class)findViewById(R.id.canvas_lowercase_y);
        drawingcanvas_z = (canvas_class)findViewById(R.id.canvas_lowercase_z);


        next.setOnClickListener(this);
        previous.setOnClickListener(this);
        brushsize.setOnClickListener(this);
        newdraw.setOnClickListener(this);
        savedraw.setOnClickListener(this);

    }

    public void saving(canvas_class drawingcanvas, int index){
        switch (index){
            case 0:
                filename = "lowercase_a";
                break;
            case 1:
                filename = "lowercase_b";
                break;
            case 2:
                filename = "lowercase_c";
                break;
            case 3:
                filename = "lowercase_d";
                break;
            case 4:
                filename = "lowercase_e";
                break;
            case 5:
                filename = "lowercase_f";
                break;
            case 6:
                filename = "lowercase_g";
                break;
            case 7:
                filename = "lowercase_h";
                break;
            case 8:
                filename = "lowercase_i";
                break;
            case 9:
                filename = "lowercase_j";
                break;
            case 10:
                filename = "lowercase_k";
                break;
            case 11:
                filename = "lowercase_l";
                break;
            case 12:
                filename = "lowercase_m";
                break;
            case 13:
                filename = "lowercase_n";
                break;
            case 14:
                filename = "lowercase_o";
                break;
            case 15:
                filename = "lowercase_p";
                break;
            case 16:
                filename = "lowercase_q";
                break;
            case 17:
                filename = "lowercase_r";
                break;
            case 18:
                filename = "lowercase_s";
                break;
            case 19:
                filename = "lowercase_t";
                break;
            case 20:
                filename = "lowercase_u";
                break;
            case 21:
                filename = "lowercase_v";
                break;
            case 22:
                filename = "lowercase_w";
                break;
            case 23:
                filename = "lowercase_x";
                break;
            case 24:
                filename = "lowercase_y";
                break;
            case 25:
                filename = "lowercase_z";
                break;
        }
        drawingcanvas.setDrawingCacheEnabled(true);
        String imgSaved = MediaStore.Images.Media.insertImage(getContentResolver(), drawingcanvas.getDrawingCache(), filename + ".png", "drawing");
        if (imgSaved != null){
            Toast savedToast = Toast.makeText(getApplicationContext(), filename + " was saved in the gallery.", Toast.LENGTH_SHORT);
            savedToast.show();
            }
        else {
            Toast unsavedToast = Toast.makeText(getApplicationContext(), filename + " was not saved.", Toast.LENGTH_SHORT);
            unsavedToast.show();
            }
        drawingcanvas.destroyDrawingCache();
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
                        int index_newdraw = viewFlipper.getDisplayedChild();
                        switch (index_newdraw){
                            case 0:
                                drawingcanvas_a.newDrawing();
                                break;
                            case 1:
                                drawingcanvas_b.newDrawing();
                                break;
                            case 2:
                                drawingcanvas_c.newDrawing();
                                break;
                            case 3:
                                drawingcanvas_d.newDrawing();
                                break;
                            case 4:
                                drawingcanvas_e.newDrawing();
                                break;
                            case 5:
                                drawingcanvas_f.newDrawing();
                                break;
                            case 6:
                                drawingcanvas_g.newDrawing();
                                break;
                            case 7:
                                drawingcanvas_h.newDrawing();
                                break;
                            case 8:
                                drawingcanvas_i.newDrawing();
                                break;
                            case 9:
                                drawingcanvas_j.newDrawing();
                                break;
                            case 10:
                                drawingcanvas_k.newDrawing();
                                break;
                            case 11:
                                drawingcanvas_l.newDrawing();
                                break;
                            case 12:
                                drawingcanvas_m.newDrawing();
                                break;
                            case 13:
                                drawingcanvas_n.newDrawing();
                                break;
                            case 14:
                                drawingcanvas_o.newDrawing();
                                break;
                            case 15:
                                drawingcanvas_p.newDrawing();
                                break;
                            case 16:
                                drawingcanvas_q.newDrawing();
                                break;
                            case 17:
                                drawingcanvas_r.newDrawing();
                                break;
                            case 18:
                                drawingcanvas_s.newDrawing();
                                break;
                            case 19:
                                drawingcanvas_t.newDrawing();
                                break;
                            case 20:
                                drawingcanvas_u.newDrawing();
                                break;
                            case 21:
                                drawingcanvas_v.newDrawing();
                                break;
                            case 22:
                                drawingcanvas_w.newDrawing();
                                break;
                            case 23:
                                drawingcanvas_x.newDrawing();
                                break;
                            case 24:
                                drawingcanvas_y.newDrawing();
                                break;
                            case 25:
                                drawingcanvas_z.newDrawing();
                                break;
                        }
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
                        int index_savedraw = viewFlipper.getDisplayedChild();
                        switch (index_savedraw){
                            case 0:
                                saving(drawingcanvas_a, index_savedraw);
                                break;
                            case 1:
                                saving(drawingcanvas_b, index_savedraw);
                                break;
                            case 2:
                                saving(drawingcanvas_c, index_savedraw);
                                break;
                            case 3:
                                saving(drawingcanvas_d, index_savedraw);
                                break;
                            case 4:
                                saving(drawingcanvas_e, index_savedraw);
                                break;
                            case 5:
                                saving(drawingcanvas_f, index_savedraw);
                                break;
                            case 6:
                                saving(drawingcanvas_g, index_savedraw);
                                break;
                            case 7:
                                saving(drawingcanvas_h, index_savedraw);
                                break;
                            case 8:
                                saving(drawingcanvas_i, index_savedraw);
                                break;
                            case 9:
                                saving(drawingcanvas_j, index_savedraw);
                                break;
                            case 10:
                                saving(drawingcanvas_k, index_savedraw);
                                break;
                            case 11:
                                saving(drawingcanvas_l, index_savedraw);
                                break;
                            case 12:
                                saving(drawingcanvas_m, index_savedraw);
                                break;
                            case 13:
                                saving(drawingcanvas_n, index_savedraw);
                                break;
                            case 14:
                                saving(drawingcanvas_o, index_savedraw);
                                break;
                            case 15:
                                saving(drawingcanvas_p, index_savedraw);
                                break;
                            case 16:
                                saving(drawingcanvas_q, index_savedraw);
                                break;
                            case 17:
                                saving(drawingcanvas_r, index_savedraw);
                                break;
                            case 18:
                                saving(drawingcanvas_s, index_savedraw);
                                break;
                            case 19:
                                saving(drawingcanvas_t, index_savedraw);
                                break;
                            case 20:
                                saving(drawingcanvas_u, index_savedraw);
                                break;
                            case 21:
                                saving(drawingcanvas_v, index_savedraw);
                                break;
                            case 22:
                                saving(drawingcanvas_w, index_savedraw);
                                break;
                            case 23:
                                saving(drawingcanvas_x, index_savedraw);
                                break;
                            case 24:
                                saving(drawingcanvas_y, index_savedraw);
                                break;
                            case 25:
                                saving(drawingcanvas_z, index_savedraw);
                                break;
                            }
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