package com.hxzk.kottlindemo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_start.setOnClickListener {
            var startIntent  = Intent(this,StartActivity :: class.java)
            startActivity(startIntent)
        }


        btn_base.setOnClickListener {
            var baseIntent =Intent(this,BaseActivity:: class.java)
            startActivity(baseIntent)
        }
        btn_classAndObject.setOnClickListener{
            var classAndObject =Intent(this,ClassAndObjectActivity:: class.java)
            startActivity(classAndObject)
        }
        btn_funAndLambda.setOnClickListener {
            var funAndLambda =Intent(this,FunAndLambdaActivity:: class.java)
            startActivity(funAndLambda)
        }

        btn_list.setOnClickListener{
            startActivity(Intent(this,ListActivity ::class.java))
        }
        btn_other.setOnClickListener{
            startActivity(Intent(this,OtherActivity ::class.java))
        }

        btn_reference.setOnClickListener{
            startActivity(Intent(this,ReferenceActivity ::class.java))
        }
        btn_async.setOnClickListener{
            startActivity(Intent(this,AsyncActivity ::class.java))
        }
    }
}
