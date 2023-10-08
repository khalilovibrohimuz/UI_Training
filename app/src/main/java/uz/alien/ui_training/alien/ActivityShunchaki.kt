package uz.alien.ui_training.alien

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.alien.ui_training.databinding.ActivityAShunchakiBinding

class ActivityShunchaki : AppCompatActivity() {

    private val context = this
    private lateinit var binding: ActivityAShunchakiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAShunchakiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val sher = "Soxtalikni yig'ishtir do'stim, Nafs quliga aylanib qolma. Omad kelib ko'paysa puling, Do'stga do'st bo'l o'zgarib qolma.\n" +
                "Molu dunyo o'tkinchi bilgin, So'zlarimga qovog'ing solma. Senga bersa Xudo uch to'rt so'm, Do'stga do'st bo'l o'zgarib qolma.\n" +
                "Tashvish bo'lsa birga yengamiz, Do'stim qo'rqma havotir olma. Yaxshilligim unutmasang bas, Do'stga do'st bo'l o'zgarib qolma."

        binding.tvSarlavha.text = name
        binding.tvSher.text = sher
    }
}