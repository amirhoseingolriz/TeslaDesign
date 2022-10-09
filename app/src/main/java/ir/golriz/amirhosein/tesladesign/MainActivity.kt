package ir.golriz.amirhosein.tesladesign

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import ir.golriz.amirhosein.tesladesign.databinding.ActivityMainBinding
import soup.neumorphism.NeumorphImageView
import soup.neumorphism.ShapeType

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnMenu.setOnClickListener {

            clickOnButton(binding.btnMenu)

        }
        binding.btnSetting.setOnClickListener {

            clickOnButton(binding.btnSetting)

        }

        binding.btnOpenCar.setOnClickListener {

            startActivity(Intent(this, ShowCarActivity::class.java))

        }


    }


    private fun clickOnButton(buttonClicked: NeumorphImageView) {

        if (buttonClicked.getShapeType() == ShapeType.PRESSED) {

            buttonClicked.setShapeType(ShapeType.FLAT)
            buttonClicked.setColorFilter(ContextCompat.getColor(this, R.color.text_gray))

        } else {
            buttonClicked.setShapeType(ShapeType.PRESSED)
            buttonClicked.setColorFilter(ContextCompat.getColor(this, R.color.blue_light))
        }

    }


}
