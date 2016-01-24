package com.dam.profesor.paint;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.UUID;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton black;
    ImageButton white;

    private static canvas_class drawingv;
    float psmall;
    float pmedium;
    float plarge;
    float pdefecto;
    ImageButton brushsize;
    ImageButton newdraw;
    ImageButton eraser;
    ImageButton savedraw;

    ImageButton arrow_a_small_right;
    ImageButton arrow_a_small_left;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        newdraw = (ImageButton)findViewById(R.id.newdraw_a);
        brushsize = (ImageButton)findViewById(R.id.brush_a);
        eraser = (ImageButton)findViewById(R.id.eraser_a);
        savedraw = (ImageButton)findViewById(R.id.savedraw_a);

        arrow_a_small_right = (ImageButton)findViewById(R.id.arrow_a_small_right);
        arrow_a_small_left = (ImageButton)findViewById(R.id.arrow_a_small_left);


        brushsize.setOnClickListener(this);
        newdraw.setOnClickListener(this);
        eraser.setOnClickListener(this);
        savedraw.setOnClickListener(this);

        arrow_a_small_right.setOnClickListener(this);
        arrow_a_small_left.setOnClickListener(this);

        drawingv = (canvas_class)findViewById(R.id.canvas_a);

        psmall= 10;
        pmedium= 20;
        plarge= 30;

        pdefecto= pmedium;


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

    @Override
    public void onClick(View v) {
        String color = null;


        switch (v.getId()){
            case R.id.arrow_a_small_right:
                setContentView(R.layout.content_b);
                Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
                setSupportActionBar(toolbar);
                break;

            case R.id.arrow_a_small_left:
                setContentView(R.layout.content_b);
                Toolbar toolbar1 = (Toolbar)findViewById(R.id.toolbar);
                setSupportActionBar(toolbar1);
                break;

            case R.id.brush_a:
                final Dialog tamanyopunto = new Dialog(this);
                tamanyopunto.setTitle("Select Brush Size:");
                tamanyopunto.setContentView(R.layout.sizes);
            //listen for clicks on tamaños de los botones
                TextView smallBtn = (TextView)tamanyopunto.findViewById(R.id.tSmall);
                smallBtn.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        canvas_class.setBorrado(false);
                        canvas_class.setTamanyoPunto(psmall);

                        tamanyopunto.dismiss();
                    }
                });
                TextView mediumBtn = (TextView)tamanyopunto.findViewById(R.id.tMedium);
                mediumBtn.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        canvas_class.setBorrado(false);
                        canvas_class.setTamanyoPunto(pmedium);

                        tamanyopunto.dismiss();
                    }
                });
                TextView largeBtn = (TextView)tamanyopunto.findViewById(R.id.tLarge);
                largeBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        canvas_class.setBorrado(false);
                        canvas_class.setTamanyoPunto(plarge);

                        tamanyopunto.dismiss();
                    }
                });
                //show and wait for user interaction
                tamanyopunto.show();


                break;
            case R.id.newdraw_a:


                AlertDialog.Builder newDialog = new AlertDialog.Builder(this);
                newDialog.setTitle("New Drawing?");
                newDialog.setMessage("another drawing");
                newDialog.setPositiveButton("Accept", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which){

                        drawingv.NuevoDibujo();
                        dialog.dismiss();
                    }
                });
                newDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which){
                        dialog.cancel();
                    }
                });
                newDialog.show();


                break;
            case R.id.eraser_a:

                final Dialog eraserpunto = new Dialog(this);
                eraserpunto.setTitle("Select Eraser:");
                eraserpunto.setContentView(R.layout.sizes);
                //listen for clicks on tamaños de los botones
                TextView smallBtneraser = (TextView)eraserpunto.findViewById(R.id.tSmall);
                smallBtneraser.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        canvas_class.setBorrado(true);
                        canvas_class.setTamanyoPunto(psmall);

                        eraserpunto.dismiss();
                    }
                });
                TextView mediumBtneraser = (TextView)eraserpunto.findViewById(R.id.tMedium);
                mediumBtneraser.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        canvas_class.setBorrado(true);
                        canvas_class.setTamanyoPunto(pmedium);

                        eraserpunto.dismiss();
                    }
                });
                TextView largeBtneraser = (TextView)eraserpunto.findViewById(R.id.tLarge);
                largeBtneraser.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        canvas_class.setBorrado(true);
                        canvas_class.setTamanyoPunto(plarge);

                        eraserpunto.dismiss();
                    }
                });
                //show and wait for user interaction
                eraserpunto.show();


                break;
            case R.id.savedraw_a:

                AlertDialog.Builder salvarDibujo = new AlertDialog.Builder(this);
                salvarDibujo.setTitle("Save Drawing");
                salvarDibujo.setMessage("Do you want to save drawing?");
                salvarDibujo.setPositiveButton("Accept", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which){

                        //Salvar dibujo
                        drawingv.setDrawingCacheEnabled(true);
                        //attempt to save
                        String imgSaved = MediaStore.Images.Media.insertImage(
                                getContentResolver(), drawingv.getDrawingCache(),
                                UUID.randomUUID().toString()+".png", "drawing");
                        //Mensaje detodo correcto
                        if(imgSaved!=null){
                            Toast savedToast = Toast.makeText(getApplicationContext(),
                                    "Your drawing was saved in the gallery.", Toast.LENGTH_SHORT);
                            savedToast.show();
                        }
                        else{
                            Toast unsavedToast = Toast.makeText(getApplicationContext(),
                                    "Your drawing was not saved.", Toast.LENGTH_SHORT);
                            unsavedToast.show();
                        }
                        drawingv.destroyDrawingCache();


                    }
                });
                salvarDibujo.setNegativeButton("Cancel", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which){
                        dialog.cancel();
                    }
                });
                salvarDibujo.show();

                break;
            default:

                break;
        }
    }
}
