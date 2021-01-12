package com.example.javastartapp.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.javastartapp.R;
import com.example.javastartapp.model.AnimalRecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RecyclerViewActivity extends AppCompatActivity {

    private AnimalsAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);

        RecyclerView recyclerView = findViewById(R.id.sampleRecyclerView);

        AnimalRecyclerView[] posibleAnimal = {
                new AnimalRecyclerView(R.drawable.cat_icon, "Kot"),
                new AnimalRecyclerView(R.drawable.dog_icon, "Pies"),
                new AnimalRecyclerView(R.drawable.ele_icon, "Słoń")};

        List<AnimalRecyclerView> animals = new ArrayList<>();
        Random random = new Random();
        for (int i = 0;
             i < 10; i++) {
            AnimalRecyclerView randomAnimal = posibleAnimal[random.nextInt(posibleAnimal.length)];
            AnimalRecyclerView animal = new AnimalRecyclerView(randomAnimal.getImage(), randomAnimal.getDescription() + " " + (i + 1));
            animals.add(animal);
        }

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new AnimalsAdapter(animals);
        recyclerView.setAdapter(adapter);
    }


    private class AnimalsAdapter extends RecyclerView.Adapter<AnimalsAdapter.AnimalsAdapterViewHolder> {
        private List<AnimalRecyclerView> animals;

        public AnimalsAdapter(List<AnimalRecyclerView> animals) {
            this.animals = animals;
        }

        public class AnimalsAdapterViewHolder extends RecyclerView.ViewHolder {
            public TextView animalName;
            public ImageView animalImage;
            public ImageButton animalDeleteButton;

            public AnimalsAdapterViewHolder(View v) {
                super(v);
            }
        }

        @NonNull
        @Override
        public AnimalsAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycrer_view_item, parent, false);
            AnimalsAdapterViewHolder viewHolder = new AnimalsAdapterViewHolder(v);
            viewHolder.animalName = v.findViewById(R.id.animal_name);
            viewHolder.animalImage = v.findViewById(R.id.animal_image);
            viewHolder.animalDeleteButton = v.findViewById(R.id.delete_animal_button);

            return viewHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull AnimalsAdapterViewHolder holder, int position) {
            if (position % 2 == 0) {
                holder.itemView.setBackgroundColor(getBaseContext().getResources().getColor(R.color.white));
            }else{
                holder.itemView.setBackgroundColor(getBaseContext().getResources().getColor(R.color.black));
            }

            AnimalRecyclerView animal = animals.get(position);
            holder.animalName.setText(animal.getDescription());
            holder.animalImage.setImageResource(animal.getImage());
            holder.animalDeleteButton.setOnClickListener(v -> {
                int position1 = holder.getAbsoluteAdapterPosition();
                animals.remove(position1);
                adapter.notifyDataSetChanged();
            });


        }

        @Override
        public int getItemCount() {
            return animals.size();
        }
    }
}
