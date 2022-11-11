package com.example.tp2_menu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.action_bar,menu)
        return super.onCreateOptionsMenu(menu)
    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id. menu_search -> {
                Toast.makeText(applicationContext, "u can search what ever u want", Toast.LENGTH_SHORT).show()
                return super.onOptionsItemSelected(item)
            }
            R.id. menu_exit-> {
                System.exit(-1) ;
               return true
            }
            else -> super.onOptionsItemSelected(item)
        }
        }

}