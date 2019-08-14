package com.hn.test.librarytest

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.demo.kotlin.mylibrary.EntranceActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_jump.setOnClickListener(this);
        //测试git
        //dev 分支
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_jump->{
                Toast.makeText(this,"点击", Toast.LENGTH_LONG).show();
                var intent = Intent(this,EntranceActivity::class.java);
                startActivity(intent);
//                val intent = Intent(this, EntranceActivity::class.java)
//                startActivity(intent)
            }
        }
    }
}
