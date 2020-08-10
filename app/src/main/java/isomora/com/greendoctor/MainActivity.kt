package isomora.com.greendoctor

import android.content.Intent
import android.os.Bundle
import android.widget.*
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val scan : ImageButton =findViewById(R.id.id_scan)
        scan.setOnClickListener()
        {
            val intent = Intent(this, scan2:: class.java)


                startActivity(intent)
        }
        id_diseases.setOnClickListener {
            val intent =Intent(this, diseases::class.java)
            startActivity(intent)
        }

    }
}
