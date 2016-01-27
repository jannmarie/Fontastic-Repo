package com.dam.profesor.paint;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;

public class tools extends View{

    float psmall= 10;
    float pmedium= 20;
    float plarge= 30;

    public tools(Context context) {
        super(context);
    }

    public void newdrawing(){
        final AlertDialog.Builder newDialog = new AlertDialog.Builder(this.getContext());
        newDialog.setTitle("New Drawing?");
        newDialog.setMessage("You will overwrite all your current drawings. Are you sure you want to add another drawing?");
        newDialog.setPositiveButton("Accept", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int which){
                dialog.dismiss();
                canvas_class.NuevoDibujo();
            }
        });
        newDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        newDialog.show();
    }

    public void brush (){
        final Dialog brushsize = new Dialog(this.getContext());
        brushsize.setTitle("Select Brush Size:");
        brushsize.setContentView(R.layout.sizes);

        TextView smallBtn = (TextView)brushsize.findViewById(R.id.tSmall);
        smallBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                canvas_class.setBorrado(false);
                canvas_class.setTamanyoPunto(psmall);
                brushsize.dismiss();
            }
        });
        TextView mediumBtn = (TextView)brushsize.findViewById(R.id.tMedium);
        mediumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                canvas_class.setBorrado(false);
                canvas_class.setTamanyoPunto(pmedium);

                brushsize.dismiss();
            }
        });
        TextView largeBtn = (TextView)brushsize.findViewById(R.id.tLarge);
        largeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                canvas_class.setBorrado(false);
                canvas_class.setTamanyoPunto(plarge);

                brushsize.dismiss();
            }
        });
        //show and wait for user interaction
        brushsize.show();
    }

    public void eraser(){
        final Dialog erasersize = new Dialog(this.getContext());
        erasersize.setTitle("Select Eraser:");
        erasersize.setContentView(R.layout.sizes);

        TextView smallBtneraser = (TextView)erasersize.findViewById(R.id.tSmall);
        smallBtneraser.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                canvas_class.setBorrado(true);
                canvas_class.setTamanyoPunto(psmall);
                erasersize.dismiss();
            }
        });
        TextView mediumBtneraser = (TextView)erasersize.findViewById(R.id.tMedium);
        mediumBtneraser.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                canvas_class.setBorrado(true);
                canvas_class.setTamanyoPunto(pmedium);
                erasersize.dismiss();
            }
        });
        TextView largeBtneraser = (TextView)erasersize.findViewById(R.id.tLarge);
        largeBtneraser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                canvas_class.setBorrado(true);
                canvas_class.setTamanyoPunto(plarge);
                erasersize.dismiss();
            }
        });
        erasersize.show();
    }



}
