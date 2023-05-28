package dev.heryordejy.basiccalc

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.btnAddition
import kotlinx.android.synthetic.main.activity_main.btnDivision
import kotlinx.android.synthetic.main.activity_main.btnMultiplication
import kotlinx.android.synthetic.main.activity_main.btnSubtraction
import kotlinx.android.synthetic.main.activity_main.firstOperand
import kotlinx.android.synthetic.main.activity_main.secondOperand

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        val btnAddition = findViewById<Button>(R.id.btnAddition)
//        val btnSubtraction = findViewById<Button>(R.id.btnSubtraction)
//        val btnMultiplication = findViewById<Button>(R.id.btnMultiplcation)
//        val btnDivision = findViewById<Button>(R.id.btnDivision)
//        val firstOperand = findViewById<EditText>(R.id.firstOperand)
//        val secondOperand = findViewById<EditText>(R.id.secondOperand)


        btnAddition.setOnClickListener {
            val result = findViewById<TextView>(R.id.result)

            if (firstOperand.text?.isEmpty() == true || secondOperand.text?.isEmpty() == true) {
                btnAddition.isEnabled = false
                Log.d("TEst ing", "--------")
            } else {
                val firstOperandValue = firstOperand.text.toString().toInt()
                val secondOperandValue = secondOperand.text.toString().toInt()
                val calc = firstOperandValue + secondOperandValue
                result.text = "Result is $calc"
            }

        }

        btnSubtraction.setOnClickListener {
            val result = findViewById<TextView>(R.id.result)

            if (firstOperand.text?.isEmpty() == true || secondOperand.text?.isEmpty() == true) {
                btnSubtraction.isEnabled = false
            } else {
                val firstOperandValue = firstOperand.text.toString().toInt()
                val secondOperandValue = secondOperand.text.toString().toInt()
                val calc = firstOperandValue - secondOperandValue
                result.text = "Result is $calc"
            }

        }

        btnMultiplication.setOnClickListener {
            val result = findViewById<TextView>(R.id.result)

            if (firstOperand.text?.isEmpty() == true || secondOperand.text?.isEmpty() == true) {
                btnMultiplication.isEnabled = false
            } else {
                val firstOperandValue = firstOperand.text.toString().toInt()
                val secondOperandValue = secondOperand.text.toString().toInt()
                val calc = firstOperandValue * secondOperandValue
                result.text = "Result is $calc"
            }

        }

        btnDivision.setOnClickListener {
            val result = findViewById<TextView>(R.id.result)

            if (firstOperand.text?.isEmpty() == true || secondOperand.text?.isEmpty() == true) {
                btnDivision.isEnabled = false
            } else {
                val firstOperandValue = firstOperand.text.toString().toInt()
                val secondOperandValue = secondOperand.text.toString().toInt()
                val calc = firstOperandValue / secondOperandValue
                result.text = "Result is $calc"
            }

        }
    }


}
