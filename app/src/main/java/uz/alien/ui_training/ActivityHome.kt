package uz.alien.ui_training

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.alien.ui_training.databinding.ActivityMainBinding

class ActivityHome : AppCompatActivity() {

    private val context = this
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bAlien.setOnClickListener { startActivity(Intent(context, ActivityAlien::class.java)) }
        binding.bRamzbek.setOnClickListener { startActivity(Intent(context, ActivityRamzbek::class.java)) }
    }
}