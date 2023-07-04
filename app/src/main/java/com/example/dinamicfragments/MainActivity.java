package com.example.dinamicfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dinamicfragments.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btShowFragment.setOnClickListener(v -> {
            showFirstFragment();
        });

        binding.btSecondFragment.setOnClickListener(v -> {
                    showSecondFragment();
                }
        );

    }

    private void showSecondFragment() {
        SecondFragment secondFragment = SecondFragment.newInstance("", "");
        getSupportFragmentManager().beginTransaction().replace(R.id.mainContainer, secondFragment, "Second").commit();
    }

    private void showFirstFragment() {
        FirstFragment firstFragment = FirstFragment.newInstance("", "");
        getSupportFragmentManager().beginTransaction().replace(R.id.mainContainer, firstFragment, "First").commit();

    }
}