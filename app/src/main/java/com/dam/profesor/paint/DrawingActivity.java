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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class DrawingActivity extends AppCompatActivity implements View.OnClickListener {

    ViewFlipper viewFlipper, imageflipper;
    ImageButton next, previous, newdraw, brushsize, savedraw;

    ImageView image_a, image_b, image_c, image_d, image_e, image_f, image_g, image_h, image_i, image_j, image_k, image_l, image_m, image_n, image_o, image_p, image_q, image_r, image_s, image_t, image_u, image_v, image_w, image_x, image_y, image_z;
    ImageView image_A, image_B, image_C, image_D, image_E, image_F, image_G, image_H, image_I, image_J, image_K, image_L, image_M, image_N, image_O, image_P, image_Q, image_R, image_S, image_T, image_U, image_V, image_W, image_X, image_Y, image_Z;

    public static canvas_class drawingcanvas_a, drawingcanvas_b, drawingcanvas_c, drawingcanvas_d, drawingcanvas_e, drawingcanvas_f, drawingcanvas_g, drawingcanvas_h, drawingcanvas_i, drawingcanvas_j, drawingcanvas_k, drawingcanvas_l, drawingcanvas_m, drawingcanvas_n, drawingcanvas_o, drawingcanvas_p, drawingcanvas_q, drawingcanvas_r, drawingcanvas_s, drawingcanvas_t, drawingcanvas_u, drawingcanvas_v, drawingcanvas_w, drawingcanvas_x, drawingcanvas_y, drawingcanvas_z;
    public static canvas_class drawingcanvas_A, drawingcanvas_B, drawingcanvas_C, drawingcanvas_D, drawingcanvas_E, drawingcanvas_F, drawingcanvas_G, drawingcanvas_H, drawingcanvas_I, drawingcanvas_J, drawingcanvas_K, drawingcanvas_L, drawingcanvas_M, drawingcanvas_N, drawingcanvas_O, drawingcanvas_P, drawingcanvas_Q, drawingcanvas_R, drawingcanvas_S, drawingcanvas_T, drawingcanvas_U, drawingcanvas_V, drawingcanvas_W, drawingcanvas_X, drawingcanvas_Y, drawingcanvas_Z;

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
        imageflipper = (ViewFlipper) findViewById(R.id.image_flipper);

        next = (ImageButton) findViewById(R.id.arrow_next);
        previous = (ImageButton) findViewById(R.id.arrow_previous);
        newdraw = (ImageButton)findViewById(R.id.newdraw);
        brushsize = (ImageButton)findViewById(R.id.brush);
        savedraw = (ImageButton)findViewById(R.id.savedraw);

        image_a = (ImageView)findViewById(R.id.lowercase_0);
        image_b = (ImageView)findViewById(R.id.lowercase_1);
        image_c = (ImageView)findViewById(R.id.lowercase_2);
        image_d = (ImageView)findViewById(R.id.lowercase_3);
        image_e = (ImageView)findViewById(R.id.lowercase_4);
        image_f = (ImageView)findViewById(R.id.lowercase_5);
        image_g = (ImageView)findViewById(R.id.lowercase_6);
        image_h = (ImageView)findViewById(R.id.lowercase_7);
        image_i = (ImageView)findViewById(R.id.lowercase_8);
        image_j = (ImageView)findViewById(R.id.lowercase_9);
        image_k = (ImageView)findViewById(R.id.lowercase_10);
        image_l = (ImageView)findViewById(R.id.lowercase_11);
        image_m = (ImageView)findViewById(R.id.lowercase_12);
        image_n = (ImageView)findViewById(R.id.lowercase_13);
        image_o = (ImageView)findViewById(R.id.lowercase_14);
        image_p = (ImageView)findViewById(R.id.lowercase_15);
        image_q = (ImageView)findViewById(R.id.lowercase_16);
        image_r = (ImageView)findViewById(R.id.lowercase_17);
        image_s = (ImageView)findViewById(R.id.lowercase_18);
        image_t = (ImageView)findViewById(R.id.lowercase_19);
        image_u = (ImageView)findViewById(R.id.lowercase_20);
        image_v = (ImageView)findViewById(R.id.lowercase_21);
        image_w = (ImageView)findViewById(R.id.lowercase_22);
        image_x = (ImageView)findViewById(R.id.lowercase_23);
        image_y = (ImageView)findViewById(R.id.lowercase_24);
        image_z = (ImageView)findViewById(R.id.lowercase_25);
        image_A = (ImageView)findViewById(R.id.uppercase_26);
        image_B = (ImageView)findViewById(R.id.uppercase_27);
        image_C = (ImageView)findViewById(R.id.uppercase_28);
        image_D = (ImageView)findViewById(R.id.uppercase_29);
        image_E = (ImageView)findViewById(R.id.uppercase_30);
        image_F = (ImageView)findViewById(R.id.uppercase_31);
        image_G = (ImageView)findViewById(R.id.uppercase_32);
        image_H = (ImageView)findViewById(R.id.uppercase_33);
        image_I = (ImageView)findViewById(R.id.uppercase_34);
        image_J = (ImageView)findViewById(R.id.uppercase_35);
        image_K = (ImageView)findViewById(R.id.uppercase_36);
        image_L = (ImageView)findViewById(R.id.uppercase_37);
        image_M = (ImageView)findViewById(R.id.uppercase_38);
        image_N = (ImageView)findViewById(R.id.uppercase_39);
        image_O = (ImageView)findViewById(R.id.uppercase_40);
        image_P = (ImageView)findViewById(R.id.uppercase_41);
        image_Q = (ImageView)findViewById(R.id.uppercase_42);
        image_R = (ImageView)findViewById(R.id.uppercase_43);
        image_S = (ImageView)findViewById(R.id.uppercase_44);
        image_T = (ImageView)findViewById(R.id.uppercase_45);
        image_U = (ImageView)findViewById(R.id.uppercase_46);
        image_V = (ImageView)findViewById(R.id.uppercase_47);
        image_W = (ImageView)findViewById(R.id.uppercase_48);
        image_X = (ImageView)findViewById(R.id.uppercase_49);
        image_Y = (ImageView)findViewById(R.id.uppercase_50);
        image_Z = (ImageView)findViewById(R.id.uppercase_51);


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
        drawingcanvas_A = (canvas_class)findViewById(R.id.canvas_uppercase_a);
        drawingcanvas_B = (canvas_class)findViewById(R.id.canvas_uppercase_b);
        drawingcanvas_C = (canvas_class)findViewById(R.id.canvas_uppercase_c);
        drawingcanvas_D = (canvas_class)findViewById(R.id.canvas_uppercase_d);
        drawingcanvas_E = (canvas_class)findViewById(R.id.canvas_uppercase_e);
        drawingcanvas_F = (canvas_class)findViewById(R.id.canvas_uppercase_f);
        drawingcanvas_G = (canvas_class)findViewById(R.id.canvas_uppercase_g);
        drawingcanvas_H = (canvas_class)findViewById(R.id.canvas_uppercase_h);
        drawingcanvas_I = (canvas_class)findViewById(R.id.canvas_uppercase_i);
        drawingcanvas_J = (canvas_class)findViewById(R.id.canvas_uppercase_j);
        drawingcanvas_K = (canvas_class)findViewById(R.id.canvas_uppercase_k);
        drawingcanvas_L = (canvas_class)findViewById(R.id.canvas_uppercase_l);
        drawingcanvas_M = (canvas_class)findViewById(R.id.canvas_uppercase_m);
        drawingcanvas_N = (canvas_class)findViewById(R.id.canvas_uppercase_n);
        drawingcanvas_O = (canvas_class)findViewById(R.id.canvas_uppercase_o);
        drawingcanvas_P = (canvas_class)findViewById(R.id.canvas_uppercase_p);
        drawingcanvas_Q = (canvas_class)findViewById(R.id.canvas_uppercase_q);
        drawingcanvas_R = (canvas_class)findViewById(R.id.canvas_uppercase_r);
        drawingcanvas_S = (canvas_class)findViewById(R.id.canvas_uppercase_s);
        drawingcanvas_T = (canvas_class)findViewById(R.id.canvas_uppercase_t);
        drawingcanvas_U = (canvas_class)findViewById(R.id.canvas_uppercase_u);
        drawingcanvas_V = (canvas_class)findViewById(R.id.canvas_uppercase_v);
        drawingcanvas_W = (canvas_class)findViewById(R.id.canvas_uppercase_w);
        drawingcanvas_X = (canvas_class)findViewById(R.id.canvas_uppercase_x);
        drawingcanvas_Y = (canvas_class)findViewById(R.id.canvas_uppercase_y);
        drawingcanvas_Z = (canvas_class)findViewById(R.id.canvas_uppercase_z);

        next.setOnClickListener(this);
        previous.setOnClickListener(this);
        brushsize.setOnClickListener(this);
        newdraw.setOnClickListener(this);
        savedraw.setOnClickListener(this);

    }

    public void saving(canvas_class drawingcanvas, int index){
        switch (index){
            case 0:
                filename = "a";
                break;
            case 1:
                filename = "b";
                break;
            case 2:
                filename = "c";
                break;
            case 3:
                filename = "d";
                break;
            case 4:
                filename = "e";
                break;
            case 5:
                filename = "f";
                break;
            case 6:
                filename = "g";
                break;
            case 7:
                filename = "h";
                break;
            case 8:
                filename = "i";
                break;
            case 9:
                filename = "j";
                break;
            case 10:
                filename = "k";
                break;
            case 11:
                filename = "l";
                break;
            case 12:
                filename = "m";
                break;
            case 13:
                filename = "n";
                break;
            case 14:
                filename = "o";
                break;
            case 15:
                filename = "p";
                break;
            case 16:
                filename = "q";
                break;
            case 17:
                filename = "r";
                break;
            case 18:
                filename = "s";
                break;
            case 19:
                filename = "t";
                break;
            case 20:
                filename = "u";
                break;
            case 21:
                filename = "v";
                break;
            case 22:
                filename = "w";
                break;
            case 23:
                filename = "x";
                break;
            case 24:
                filename = "y";
                break;
            case 25:
                filename = "z";
                break;
            case 26:
                filename = "A";
                break;
            case 27:
                filename = "B";
                break;
            case 28:
                filename = "C";
                break;
            case 29:
                filename = "D";
                break;
            case 30:
                filename = "E";
                break;
            case 31:
                filename = "F";
                break;
            case 32:
                filename = "G";
                break;
            case 33:
                filename = "H";
                break;
            case 34:
                filename = "I";
                break;
            case 35:
                filename = "J";
                break;
            case 36:
                filename = "K";
                break;
            case 37:
                filename = "L";
                break;
            case 38:
                filename = "M";
                break;
            case 39:
                filename = "N";
                break;
            case 40:
                filename = "O";
                break;
            case 41:
                filename = "P";
                break;
            case 42:
                filename = "Q";
                break;
            case 43:
                filename = "R";
                break;
            case 44:
                filename = "S";
                break;
            case 45:
                filename = "T";
                break;
            case 46:
                filename = "U";
                break;
            case 47:
                filename = "V";
                break;
            case 48:
                filename = "W";
                break;
            case 49:
                filename = "X";
                break;
            case 50:
                filename = "Y";
                break;
            case 51:
                filename = "Z";
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
                imageflipper.showNext();
                break;
            case R.id.arrow_previous:
                viewFlipper.showPrevious();
                imageflipper.showPrevious();
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
                            case 26:
                                drawingcanvas_A.newDrawing();
                                break;
                            case 27:
                                drawingcanvas_B.newDrawing();
                                break;
                            case 28:
                                drawingcanvas_C.newDrawing();
                                break;
                            case 29:
                                drawingcanvas_D.newDrawing();
                                break;
                            case 30:
                                drawingcanvas_E.newDrawing();
                                break;
                            case 31:
                                drawingcanvas_F.newDrawing();
                                break;
                            case 32:
                                drawingcanvas_G.newDrawing();
                                break;
                            case 33:
                                drawingcanvas_H.newDrawing();
                                break;
                            case 34:
                                drawingcanvas_I.newDrawing();
                                break;
                            case 35:
                                drawingcanvas_J.newDrawing();
                                break;
                            case 36:
                                drawingcanvas_K.newDrawing();
                                break;
                            case 37:
                                drawingcanvas_L.newDrawing();
                                break;
                            case 38:
                                drawingcanvas_M.newDrawing();
                                break;
                            case 39:
                                drawingcanvas_N.newDrawing();
                                break;
                            case 40:
                                drawingcanvas_O.newDrawing();
                                break;
                            case 41:
                                drawingcanvas_P.newDrawing();
                                break;
                            case 42:
                                drawingcanvas_Q.newDrawing();
                                break;
                            case 43:
                                drawingcanvas_R.newDrawing();
                                break;
                            case 44:
                                drawingcanvas_S.newDrawing();
                                break;
                            case 45:
                                drawingcanvas_T.newDrawing();
                                break;
                            case 46:
                                drawingcanvas_U.newDrawing();
                                break;
                            case 47:
                                drawingcanvas_V.newDrawing();
                                break;
                            case 48:
                                drawingcanvas_W.newDrawing();
                                break;
                            case 49:
                                drawingcanvas_X.newDrawing();
                                break;
                            case 50:
                                drawingcanvas_Y.newDrawing();
                                break;
                            case 51:
                                drawingcanvas_Z.newDrawing();
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
                            case 26:
                                saving(drawingcanvas_A, index_savedraw);
                                break;
                            case 27:
                                saving(drawingcanvas_B, index_savedraw);
                                break;
                            case 28:
                                saving(drawingcanvas_C, index_savedraw);
                                break;
                            case 29:
                                saving(drawingcanvas_D, index_savedraw);
                                break;
                            case 30:
                                saving(drawingcanvas_E, index_savedraw);
                                break;
                            case 31:
                                saving(drawingcanvas_F, index_savedraw);
                                break;
                            case 32:
                                saving(drawingcanvas_G, index_savedraw);
                                break;
                            case 33:
                                saving(drawingcanvas_H, index_savedraw);
                                break;
                            case 34:
                                saving(drawingcanvas_I, index_savedraw);
                                break;
                            case 35:
                                saving(drawingcanvas_J, index_savedraw);
                                break;
                            case 36:
                                saving(drawingcanvas_K, index_savedraw);
                                break;
                            case 37:
                                saving(drawingcanvas_L, index_savedraw);
                                break;
                            case 38:
                                saving(drawingcanvas_M, index_savedraw);
                                break;
                            case 39:
                                saving(drawingcanvas_N, index_savedraw);
                                break;
                            case 40:
                                saving(drawingcanvas_O, index_savedraw);
                                break;
                            case 41:
                                saving(drawingcanvas_P, index_savedraw);
                                break;
                            case 42:
                                saving(drawingcanvas_Q, index_savedraw);
                                break;
                            case 43:
                                saving(drawingcanvas_R, index_savedraw);
                                break;
                            case 44:
                                saving(drawingcanvas_S, index_savedraw);
                                break;
                            case 45:
                                saving(drawingcanvas_T, index_savedraw);
                                break;
                            case 46:
                                saving(drawingcanvas_U, index_savedraw);
                                break;
                            case 47:
                                saving(drawingcanvas_V, index_savedraw);
                                break;
                            case 48:
                                saving(drawingcanvas_W, index_savedraw);
                                break;
                            case 49:
                                saving(drawingcanvas_X, index_savedraw);
                                break;
                            case 50:
                                saving(drawingcanvas_Y, index_savedraw);
                                break;
                            case 51:
                                saving(drawingcanvas_Z, index_savedraw);
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