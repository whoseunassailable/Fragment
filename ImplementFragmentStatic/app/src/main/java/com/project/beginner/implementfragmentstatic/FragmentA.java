package com.project.beginner.implementfragmentstatic;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentA extends Fragment {

    public FragmentA() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        /** Usually we use setContentView in activity so we can find the id by findViewById
        but the same doesn't work here as the reference of an id cannot be called automatically
         So, we used the return inflater value which was returning the View and store it in a
         view variable
         */
        TextView textView = view.findViewById(R.id.frag_a); // Confused
        return view;
    }
}