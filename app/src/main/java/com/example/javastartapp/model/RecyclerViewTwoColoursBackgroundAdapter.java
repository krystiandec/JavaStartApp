package com.example.javastartapp.model;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.javastartapp.R;

public class RecyclerViewTwoColoursBackgroundAdapter extends RecyclerView.Adapter<RecyclerViewTwoColoursBackgroundAdapter.ViewHolder> {

    private String[] animals;

    public RecyclerViewTwoColoursBackgroundAdapter(String[] animals) {
        this.animals = animals;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView mTextView;

        public ViewHolder(TextView v) {
            super(v);
            this.mTextView = v;
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TextView v =(TextView) LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1,parent,false);
        ViewHolder holder = new ViewHolder(v);
        holder.mTextView = v.findViewById(android.R.id.text1);
        return holder ;
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if (position % 2 == 0) {
            holder.itemView.setBackgroundColor(R.color.black);
        }else{
            holder.itemView.setBackgroundColor(R.color.white);
        }
    String animal = animals[position];
    holder.mTextView.setText(animal);

    }

    @Override
    public int getItemCount() {
        return animals.length;
    }


}
