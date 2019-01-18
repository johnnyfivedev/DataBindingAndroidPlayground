package com.johnnyfivedev.databindingandroidplayground;

import android.os.Bundle;

import com.johnnyfivedev.databindingandroidplayground.databinding.ActivityMainBinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        binding.tvParti
    }
}
