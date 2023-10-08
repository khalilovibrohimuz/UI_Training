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
        val sher = "Soxtalikni yig'ishtir do'stim,\nNafs quliga aylanib qolma.\nOmad kelib ko'paysa puling,\nDo'stga do'st bo'l o'zgarib qolma.\n\n" +
                "Molu dunyo o'tkinchi bilgin,\nSo'zlarimga qovog'ing solma.\nSenga bersa Xudo uch to'rt so'm,\nDo'stga do'st bo'l o'zgarib qolma.\n\n" +
                "Tashvish bo'lsa birga yengamiz,\nDo'stim qo'rqma havotir olma.\nYaxshilligim unutmasang bas,\nDo'stga do'st bo'l o'zgarib qolma."

        binding.tvSarlavha.text = name
        binding.tvSher.text = sher
    }
}