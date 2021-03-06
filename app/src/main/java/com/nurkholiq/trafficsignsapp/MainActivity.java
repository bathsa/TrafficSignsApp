package com.nurkholiq.trafficsignsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;

import com.nurkholiq.trafficsignsapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnSignType.setOnClickListener(view -> {
            Intent moveIntent = new Intent(getApplicationContext(), SignTypeActivity.class);
            startActivity(moveIntent);
        });

        binding.btnRule.setOnClickListener(view -> {
            Intent moveIntent = new Intent(getApplicationContext(), MainActivity_Peraturan.class);
            startActivity(moveIntent);
        });

        binding.btnGames.setOnClickListener(view -> {
            Intent moveIntent = new Intent(getApplicationContext(), GameActivity.class);
            startActivity(moveIntent);
        });

        binding.btnScan.setOnClickListener(view -> {
            // TODO : moveIntent Activity or Fragment
        });

        binding.btnExit.setOnClickListener(view -> {
            onBackPressed();
        });

    }
}