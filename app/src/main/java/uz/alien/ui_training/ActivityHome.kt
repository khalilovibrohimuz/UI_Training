package uz.alien.ui_training

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.alien.ui_training.alien.ActivityAlien
import uz.alien.ui_training.databinding.ActivityHomeBinding
import uz.alien.ui_training.ramiz.ActivityRamzbek

class ActivityHome : AppCompatActivity() {

    private val context = this
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bAlien.setOnClickListener { startActivity(Intent(context, ActivityAlien::class.java)) }
        binding.bRamzbek.setOnClickListener { startActivity(Intent(context, ActivityRamzbek::class.java)) }
    }
}