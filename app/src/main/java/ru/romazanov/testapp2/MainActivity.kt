package ru.romazanov.testapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {

    private lateinit var navControler: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val navHost = supportFragmentManager.findFragmentById(R.id.fragmentContainer) as NavHostFragment
        navControler = navHost.navController

        NavigationUI.setupActionBarWithNavController(this, navControler)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navControler.navigateUp() ||super.onSupportNavigateUp()
    }
}


