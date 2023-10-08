package uz.alien.ui_training;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import uz.alien.ui_training.databinding.ActivityAlienBinding;
import uz.alien.ui_training.databinding.ActivityRamzbekBinding;

public class ActivityRamzbek extends AppCompatActivity {

    ActivityRamzbekBinding binding ;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRamzbekBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
