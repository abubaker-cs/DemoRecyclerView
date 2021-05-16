package org.abubaker.demorecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import org.abubaker.demorecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Binding Object
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)


    }


    /**
     * Function is used to get the Items List which is added in the list.
     */
    private fun getItemsList(): ArrayList<String> {
        val list = ArrayList<String>()

        list.add("Item One")
        list.add("Item Two")
        list.add("Item Three")
        list.add("Item Four")
        list.add("Item Five")
        list.add("Item Six")
        list.add("Item Seven")
        list.add("Item Eight")
        list.add("Item Nine")
        list.add("Item Ten")
        list.add("Item Eleven")
        list.add("Item Twelve")

        return list
    }

}