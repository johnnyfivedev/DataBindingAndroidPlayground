package com.johnnyfivedev.databindingandroidplayground;

import android.os.Bundle;
import android.view.View;

import com.johnnyfivedev.databindingandroidplayground.databinding.ActivityMainBinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // All views are accessible
        // tested on phone and tablet

        binding.clContainer.setVisibility(View.VISIBLE);
        binding.includePartial.tvPartial.setText("partial");

        //tvPartial2 will be null if accessed in devices with sw < 600 dp
        if (binding.includePartial.tvPartial2 != null) {
            binding.includePartial.tvPartial2.setText("partial2 tablet");
        }
        binding.tvHello.setText("Hello");
    }
}
