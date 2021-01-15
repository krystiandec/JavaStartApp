package com.example.javastartapp.presenter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

import com.example.javastartapp.model.AnimalFragment;
import com.example.javastartapp.model.AnimalFragmentRepository;

public class AnimalListFragmentPresenter extends ListFragment {

    private OnAnimalClickedListener onAnimalClickedListener;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                AnimalFragmentRepository.getmAnimalFragments()));
    }

    @Override
    public void onAttach(@NonNull Activity activity) {
        super.onAttach(activity);
        try {
            onAnimalClickedListener = (OnAnimalClickedListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + "must implement OnAnimalClickedListener");
        }

    }

    @Override
    public void onDetach() {
        super.onDetach();
        onAnimalClickedListener = null;
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        if (null != onAnimalClickedListener) {
            onAnimalClickedListener.onAnimalClicked(position);
        }
    }

    public interface OnAnimalClickedListener {
        void onAnimalClicked(int id);
    }
}
