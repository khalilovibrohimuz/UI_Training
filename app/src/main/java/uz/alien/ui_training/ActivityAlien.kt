package uz.alien.ui_training

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.alien.ui_training.databinding.ActivityAlienBinding

class ActivityAlien : AppCompatActivity() {

    private lateinit var binding: ActivityAlienBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlienBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}