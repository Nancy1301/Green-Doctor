package isomora.com.greendoctor


import android.os.Bundle
import android.widget.ArrayAdapter
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.diseases.*

class diseases :AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.diseases)

        val clubs= listOf("apple apple scab",
                "apple black rot",
                "apple cedar ","apple rust"
                ,"apple healthy"
                ,"blueberry healthy"
                ,"cherry including sour powdery mildew"
                ,"cherry including sour healthy"
                ,"corn maize cercospora leaf spot gray leaf spot"
                ,"corn maize common rust"
            ,"corn maize northern leaf blight"
            ,"corn maize healthy"
            ," grape black rot"
            ," grape esca black measles"
            ,"grape leaf blight isariopsis leaf spot"
            ,"grape healthy"
            ,"orange haunglongbing citrus greening"
            ,"peach bacterial spot"
            ,"peach healthy"
            ,"pepper bell bacterial spot"
            ,"pepper bell healthy"
            ,"potato early blight"
            ,"potato late blight"
            ,"potato healthy"
            ,"raspberry healthy"
            ,"soybean healthy"
            ,"squash powdery mildew"
            ,"strawberry leaf scorch"
            ,"strawberry healthy"
            ,"tomato bacterial spot"
            ,"tomato early blight"
            ,"tomato late blight"
            ,"tomato leaf mold"
            ,"tomato septoria leaf spot"
            ,"tomato spider mites two spotted spider mite"
            ,"tomato target spot"
            ,"tomato tomato yellow leaf curl virus"
            ,"tomato tomato mosaic virus"
            ,"tomato healthy"
        )

        view.adapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,clubs)

    }
}