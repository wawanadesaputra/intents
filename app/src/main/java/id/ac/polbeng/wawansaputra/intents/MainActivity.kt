package id.ac.polbeng.wawansaputra.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.ac.polbeng.wawansaputra.intents.databinding.ActivityMainBinding
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {
    private val log = Logger.getLogger(MainActivity::class.java.name)
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        log.info("onCreate")

        binding.btnToSecondActivity.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onPause() {
        super.onPause()
        log.info("onPause")
    }

    override fun onRestart() {
        super.onRestart()
        log.info("onRestart")
    }

    override fun onResume() {
        super.onResume()
        log.info("onResume")
    }
}

