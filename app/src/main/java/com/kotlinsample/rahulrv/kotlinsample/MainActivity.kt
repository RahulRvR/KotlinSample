package com.kotlinsample.rahulrv.kotlinsample

import android.app.Activity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

/**
 *
 *
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity);
        toast("Hello world");
    }


    fun Activity.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, duration).show()
    }

    fun Activity.switchFragment(fragment: Fragment, tag: String = fragment.tag) {
        supportFragmentManager.beginTransaction().replace(R.id.container, fragment, tag)
    }
}