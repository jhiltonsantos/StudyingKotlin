package com.example.mytrip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalc.setOnClickListener(this)
        editDistance.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val id = view.id

        if (id == R.id.buttonCalc) {
            startCalculate()
        }
    }

    private fun isValid(): Boolean {
        if (editDistance.text.toString() != "" &&
            editAutonomy.text.toString() != "" &&
            editPrice.text.toString() != ""
        ) {
            return true
        }
        return false
    }

    private fun startCalculate() {
        if (isValid()) {

            try {
                val distance = editDistance.text.toString().toFloat()
                val autonomy = editAutonomy.text.toString().toFloat()
                val price = editPrice.text.toString().toFloat()

                val resultCalc = (distance * price) / autonomy
                textValue.setText("Total: $resultCalc")

            } catch (NFE: NumberFormatException) {
                Toast.makeText(applicationContext, R.string.valid_value, Toast.LENGTH_LONG).show()

            }

        } else {
            Toast.makeText(applicationContext, R.string.valid_value, Toast.LENGTH_LONG).show()
        }
    }


}
