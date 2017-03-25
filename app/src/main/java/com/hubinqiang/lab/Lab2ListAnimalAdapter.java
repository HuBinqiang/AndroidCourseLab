package com.hubinqiang.lab;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by hu on 2017/3/25.
 */

public class Lab2ListAnimalAdapter extends ArrayAdapter<Lab3ListAnimal>{

    private int resourceID;


    public Lab2ListAnimalAdapter(Context context, int textViewResourceId, List<Lab3ListAnimal> objects) {
        super(context, textViewResourceId, objects);

        resourceID = textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Lab3ListAnimal animal = getItem(position);

        View view = LayoutInflater.from(getContext()).inflate(resourceID, parent, false);

        ImageView animalImage = (ImageView) view.findViewById(R.id.animal_image);

        TextView animalText = (TextView) view.findViewById(R.id.animal_name);

        animalImage.setImageResource(animal.getImageID());

        animalText.setText(animal.getName());
        return view;
    }
}
