package isomora.com.greendoctor

import isomora.com.greendoctor.R
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.Window
import android.view.WindowManager

class flash_screen : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.flash_screen)
        Handler().postDelayed({
            startActivity(Intent(this@flash_screen, MainActivity::class.java))
            finish()
        },600)
    }
}