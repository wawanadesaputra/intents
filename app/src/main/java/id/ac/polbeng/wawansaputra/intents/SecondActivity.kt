package id.ac.polbeng.wawansaputra.intents

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.ac.polbeng.wawansaputra.intents.databinding.ActivitySecondBinding
import java.util.logging.Logger

class SecondActivity : AppCompatActivity() {
    private val log = Logger.getLogger(SecondActivity::class.java.name)
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        log.info("onCreate")

        binding.btnExitActivity.setOnClickListener {
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        log.info("onStart")
    }

    override fun onStop() {
        super.onStop()
        log.info("onStop")
    }
}
