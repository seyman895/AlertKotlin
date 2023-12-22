package com.suleyman.alertkotlin

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Hello", Toast.LENGTH_LONG).show()
    }

    fun save(view : View){
        val alert = AlertDialog.Builder(this@MainActivity)
        alert.setTitle("Save?")
        alert.setMessage("Are you sure?")
        alert.setPositiveButton("yes", object : DialogInterface.OnClickListener{
            override fun onClick(dialog: DialogInterface?, which: Int) {
                Toast.makeText(this@MainActivity, "saved", Toast.LENGTH_LONG).show()
            }

        })
        alert.setNegativeButton("no", object: DialogInterface.OnClickListener{
            override fun onClick(dialog: DialogInterface?, which: Int) {
                Toast.makeText(this@MainActivity, "No saved", Toast.LENGTH_LONG).show()
            }

        })

        alert.show()

    }
}