package com.example.foodapk.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.ViewModelProvider;

import com.example.foodapk.R;
import com.example.foodapk.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {



    View root = inflater.inflate(R.layout.fragment_home,container,false);


        return root;
    }

    }
