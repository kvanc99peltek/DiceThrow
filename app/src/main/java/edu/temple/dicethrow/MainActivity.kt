package edu.temple.dicethrow

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragmentContainerView, DieFragment.newInstance(6))
                .add(R.id.fragmentContainerView2, DieFragment.newInstance(6))
                .commit()
            supportFragmentManager.executePendingTransactions()
        }

        val dieFragment1 = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as DieFragment
        val dieFragment2 = supportFragmentManager.findFragmentById(R.id.fragmentContainerView2) as DieFragment

        findViewById<Button>(R.id.rollDiceButton).setOnClickListener {
            dieFragment1.throwDie()
            dieFragment2.throwDie()
        }
    }
}
