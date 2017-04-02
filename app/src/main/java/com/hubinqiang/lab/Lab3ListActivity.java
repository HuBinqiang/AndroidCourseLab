package com.hubinqiang.lab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Lab3ListActivity extends AppCompatActivity {

    private List<Lab3ListAnimal> animalList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_list);

        initAnimals();

        Lab3ListAnimalAdapter adapter = new Lab3ListAnimalAdapter(Lab3ListActivity.this, R.layout.activity_lab3_list_animal, animalList);

        ListView listView = (ListView) findViewById(R.id.list_item);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Lab3ListAnimal animal = animalList.get(position);
                Toast.makeText(Lab3ListActivity.this, animal.getName(), Toast.LENGTH_SHORT).show();
            }
        });

        listView.setAdapter(adapter);


    }

    private void initAnimals() {

        Lab3ListAnimal lion = new Lab3ListAnimal("Lion", R.drawable.lion);
        animalList.add(lion);

        Lab3ListAnimal tiger = new Lab3ListAnimal("Tiger", R.drawable.tiger);
        animalList.add(tiger);

        Lab3ListAnimal monkey = new Lab3ListAnimal("Monkey", R.drawable.monkey);
        animalList.add(monkey);

        Lab3ListAnimal dog = new Lab3ListAnimal("Dog", R.drawable.dog);
        animalList.add(dog);

        Lab3ListAnimal cat = new Lab3ListAnimal("Cat", R.drawable.cat);
        animalList.add(cat);

        Lab3ListAnimal elephant = new Lab3ListAnimal("Elephant", R.drawable.elephant);
        animalList.add(elephant);
    }
}

