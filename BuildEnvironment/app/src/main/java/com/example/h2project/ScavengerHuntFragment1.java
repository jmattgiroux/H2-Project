package com.example.h2project;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class ScavengerHuntFragment1 extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.scavenger_hunt_fragment_1, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.scavenger_hunt_fragment_1_button_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ScavengerHuntFragment1.this)
                        .navigate(R.id.action_scavengerHuntFragment1_to_homeScreenFragment1);
            }
        });

        view.findViewById(R.id.scavenger_hunt_fragment_1_button_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ScavengerHuntFragment1.this)
                        .navigate(R.id.action_scavengerHuntFragment1_to_scavengerHuntFragment2);
            }
        });

        view.findViewById(R.id.scavenger_hunt_fragment_1_button_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ScavengerHuntFragment1.this)
                        .navigate(R.id.action_scavengerHuntFragment1_to_scavengerHuntFragment2);
            }
        });

        view.findViewById(R.id.scavenger_hunt_fragment_1_button_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ScavengerHuntFragment1.this)
                        .navigate(R.id.action_scavengerHuntFragment1_to_scavengerHuntFragment2);
            }
        });
    }
}