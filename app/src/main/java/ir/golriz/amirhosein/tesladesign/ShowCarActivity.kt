package ir.golriz.amirhosein.tesladesign

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ir.golriz.amirhosein.tesladesign.data.Item
import ir.golriz.amirhosein.tesladesign.databinding.ActivityShowCarBinding
import soup.neumorphism.NeumorphImageView
import soup.neumorphism.ShapeType

class ShowCarActivity : AppCompatActivity() {

    private lateinit var binding: ActivityShowCarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShowCarBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnMenu.setOnClickListener {
            clickOnButton(binding.btnMenu)
        }

        binding.btnProfile.setOnClickListener {
            clickOnButton(binding.btnProfile)
        }

        binding.btnAuto.setOnClickListener {

            clickBottomMenu(binding.btnAuto)

        }

        binding.btnDry.setOnClickListener {

            clickBottomMenu(binding.btnDry)

        }

        binding.btnCool.setOnClickListener {

            clickBottomMenu(binding.btnCool)

        }

        binding.btnProgram.setOnClickListener {

            clickBottomMenu(binding.btnProgram)

        }


        val adapter = ItemAdapter(listItem())
        binding.recycler.adapter = adapter
        binding.recycler.layoutManager =
            LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)


    }


    private fun listItem(): List<Item> {


        return listOf(
            Item("Engine", "Sleeping mode", false),
            Item("Climate", "A/C is ON", true),
            Item("Tires", "Low Pressure", true)
        )

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

    private fun clickBottomMenu(buttonClicked: NeumorphImageView) {


        if (buttonClicked.getShapeType() == ShapeType.FLAT) {

            if (binding.btnAuto.getShapeType() == ShapeType.PRESSED) {
                binding.btnAuto.setShapeType(ShapeType.FLAT)
                binding.btnAuto.setColorFilter(ContextCompat.getColor(this, R.color.text_gray))
            }

            if (binding.btnDry.getShapeType() == ShapeType.PRESSED) {
                binding.btnDry.setShapeType(ShapeType.FLAT)
                binding.btnDry.setColorFilter(ContextCompat.getColor(this, R.color.text_gray))
            }

            if (binding.btnCool.getShapeType() == ShapeType.PRESSED) {
                binding.btnCool.setShapeType(ShapeType.FLAT)
                binding.btnCool.setColorFilter(ContextCompat.getColor(this, R.color.text_gray))
            }

            if (binding.btnProgram.getShapeType() == ShapeType.PRESSED) {
                binding.btnProgram.setShapeType(ShapeType.FLAT)
                binding.btnProgram.setColorFilter(
                    ContextCompat.getColor(
                        this,
                        R.color.text_gray
                    )
                )
            }

            buttonClicked.setShapeType(ShapeType.PRESSED)
            buttonClicked.setColorFilter(ContextCompat.getColor(this, R.color.blue_light))

        } else {

            buttonClicked.setShapeType(ShapeType.FLAT)
            buttonClicked.setColorFilter(ContextCompat.getColor(this, R.color.text_gray))

        }

    }

}