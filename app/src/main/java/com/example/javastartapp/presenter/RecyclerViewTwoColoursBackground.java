package com.example.javastartapp.presenter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.javastartapp.R;
import com.example.javastartapp.model.RecyclerViewTwoColoursBackgroundAdapter;

public class RecyclerViewTwoColoursBackground extends Activity {

    RecyclerViewTwoColoursBackgroundAdapter mAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //poniższe z wykorzystaniem Adaptera RecyclerView oraz jawnych layoutów
        setContentView(R.layout.recycler_view);
        RecyclerView recyclerView = findViewById(R.id.sampleRecyclerView);
        final String[] animals = {"Kot", "Pies", "Słoń", "Kot", "Pies", "Słoń", "Kot", "Pies", "Słoń", "Kot", "Pies",
                "Słoń"};
        mAdapter = new RecyclerViewTwoColoursBackgroundAdapter(animals);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(mAdapter);
    }
/*
//        metoda krótsza z wykorzystaniem ListView
        setContentView(R.layout.animal_list);
        ListView animalList =findViewById(R.id.animalList);
        final String[] animals = { "Kot", "Pies", "Słoń", "Kot", "Pies", "Słoń", "Kot", "Pies", "Słoń", "Kot", "Pies",
                "Słoń" };
        AlternatelyColorAdapter adapter= new AlternatelyColorAdapter(animals);
        animalList.setAdapter(adapter);
*/



/*    private class AlternatelyColorAdapter extends BaseAdapter {

        private String[] items;

        public AlternatelyColorAdapter(String[] items) {
            this.items = items;
        }

        @Override
        public int getCount() {
            return items.length;
        }

        @Override
        public String getItem(int position) {
            return items[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(android.R.layout.simple_list_item_1, parent, false);
            }

            TextView textView = (TextView) convertView.findViewById(android.R.id.text1);

            textView.setText(getItem(position));

            int color = Color.LTGRAY;
            if(position % 2 == 0) {
                color = Color.WHITE;
            }
            textView.setBackgroundColor(color);

            return convertView;
        }
    }*/
}
