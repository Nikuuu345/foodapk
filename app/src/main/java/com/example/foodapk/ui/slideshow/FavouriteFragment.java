package com.example.foodapk.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import com.example.foodapk.R;
import android.arch.lifecycle.ViewModelProvider;


public class FavouriteFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {



    View root = inflater.inflate(R.layout.fragment_favourite,container,false);


        return root;
    }
}