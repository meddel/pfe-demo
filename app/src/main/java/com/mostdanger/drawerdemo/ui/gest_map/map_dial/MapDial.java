package com.mostdanger.drawerdemo.ui.gest_map.map_dial;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

import com.google.android.gms.maps.MapView;
import com.mostdanger.drawerdemo.R;

public class MapDial extends AppCompatDialogFragment {
    MapView mapView;
    public Dialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater= getActivity().getLayoutInflater();
        View view=inflater.inflate(R.layout.add_station_dial, null);
        builder.setView(view)
                .setTitle("ajouter station par map")
                .setNegativeButton("annuler",new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }})
                .setPositiveButton("ajouter", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        mapView=view.findViewById(R.id.mapView2);
        return builder.create();

                }
    }

