package com.example.hwapp01

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        button1.setOnClickListener {
            if(ed_drink.length()<1)
                Toast.makeText(this, "請輸入飲料名稱", Toast.LENGTH_SHORT).show()
            else{
                //宣告Bundle
                val b = Bundle()
                //取得 EditText 字串內容，把飲料名稱甜度與冰塊資訊放入Bundle
                b.putString("drink", ed_drink.text.toString())
                b.putString("sugar", radioGroup.findViewById<RadioButton>
                    (radioGroup.checkedRadioButtonId).text.toString())
                b.putString("ice", radioGroup2.findViewById<RadioButton>
                    (radioGroup2.checkedRadioButtonId).text.toString())
                //用Activity.RESULT_OK 標記執行狀態並記錄Intent
                setResult(Activity.RESULT_OK, Intent().putExtras(b))
                finish()
            }

        }
    }
}