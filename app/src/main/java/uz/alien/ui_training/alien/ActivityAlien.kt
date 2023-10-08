package uz.alien.ui_training.alien

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.alien.ui_training.databinding.ActivityAlienBinding

class ActivityAlien : AppCompatActivity() {

    private val context = this
    private lateinit var binding: ActivityAlienBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlienBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bSend.setOnClickListener {
            val intent = Intent(context, ActivityShunchaki::class.java)
            intent.putExtra("name", binding.etName.text.toString())
            startActivity(intent)
        }
    }
}