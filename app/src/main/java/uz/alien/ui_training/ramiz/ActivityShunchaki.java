package uz.alien.ui_training.ramiz;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import uz.alien.ui_training.databinding.ActivityRShunchakiBinding;


public class ActivityShunchaki extends AppCompatActivity {

    ActivityRShunchakiBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRShunchakiBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String name = getIntent().getStringExtra("name");
        String sher = "Soxtalikni yig'ishtir do'stim,\nNafs quliga aylanib qolma.\nOmad kelib ko'paysa puling,\nDo'stga do'st bo'l o'zgarib qolma.\n\n" +
                "Molu dunyo o'tkinchi bilgin,\nSo'zlarimga qovog'ing solma.\nSenga bersa Xudo uch to'rt so'm,\nDo'stga do'st bo'l o'zgarib qolma.\n\n" +
                "Tashvish bo'lsa birga yengamiz,\nDo'stim qo'rqma havotir olma.\nYaxshilligim unutmasang bas,\nDo'stga do'st bo'l o'zgarib qolma.";

        binding.tvSarlovha.setText(name);
        binding.tvShero.setText(sher);
    }
}