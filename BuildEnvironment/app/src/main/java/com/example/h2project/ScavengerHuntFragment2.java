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

public class ScavengerHuntFragment2 extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.scavenger_hunt_fragment_2, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.scavenger_hunt_fragment_2_button_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ScavengerHuntFragment2.this)
                        .navigate(R.id.action_scavengerHuntFragment2_to_scavengerHuntFragment1);
            }
        });

        view.findViewById(R.id.scavenger_hunt_fragment_2_button_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ScavengerHuntFragment2.this)
                        .navigate(R.id.action_scavengerHuntFragment2_to_scavengerHuntFragment3);
            }
        });

        view.findViewById(R.id.scavenger_hunt_fragment_2_button_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ScavengerHuntFragment2.this)
                        .navigate(R.id.action_scavengerHuntFragment2_to_scavengerHuntFragment3);
            }
        });

        view.findViewById(R.id.scavenger_hunt_fragment_2_button_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ScavengerHuntFragment2.this)
                        .navigate(R.id.action_scavengerHuntFragment2_to_scavengerHuntFragment3);
            }
        });

        view.findViewById(R.id.scavenger_hunt_fragment_2_button_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ScavengerHuntFragment2.this)
                        .navigate(R.id.action_scavengerHuntFragment2_to_scavengerHuntFragment3);
            }
        });

        view.findViewById(R.id.scavenger_hunt_fragment_2_button_5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ScavengerHuntFragment2.this)
                        .navigate(R.id.action_scavengerHuntFragment2_to_scavengerHuntFragment3);
            }
        });
    }
}