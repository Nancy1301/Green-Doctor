package isomora.com.greendoctor

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v7.app.AppCompatActivity
import android.telephony.SmsManager
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.mess.*


class mess: AppCompatActivity()
{
    private val requestSendSms=2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mess)
        var intent = intent
        val num = findViewById<TextView>(R.id.mess_num)
        val remedy=intent.getStringExtra("remed")
        val dname = intent.getStringExtra("dname")

        var obj = SmsManager.getDefault()
        val message= "$dname\n$remedy\nhelpline number: \n Satyam : 8982224600\n Chandan : 9871355742 \n Nancy : 100"
        button.setOnClickListener()
        {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS)!=PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.SEND_SMS),requestSendSms)
            obj.sendTextMessage(num.text.toString(), "Health Care", message, null, null)

            Toast.makeText(this, "message sent", Toast.LENGTH_LONG).show()
            val int = Intent(this, MainActivity::class.java)
            startActivity(int)
        }
        else {
                obj.sendTextMessage(num.text.toString(), "Health Care", message, null, null)

                Toast.makeText(this, "message sent", Toast.LENGTH_LONG).show()
                val int = Intent(this, MainActivity::class.java)
                startActivity(int)
            }
        }
    }

}