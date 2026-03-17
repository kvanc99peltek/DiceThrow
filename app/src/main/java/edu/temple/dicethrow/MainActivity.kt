package edu.temple.dicethrow

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dieFragment1 = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as DieFragment
        val dieFragment2 = supportFragmentManager.findFragmentById(R.id.fragmentContainerView2) as DieFragment

        findViewById<Button>(R.id.rollDiceButton).setOnClickListener {
            dieFragment1.throwDie()
            dieFragment2.throwDie()
        }
    }
}
