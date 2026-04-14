package edu.temple.myapplication
/*
TODO
Replicate all button functions as Menu action
Make each item an Action Button (if there is room)
*/
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.action_start -> {
                TimerService().start(1000)
                Toast.makeText(this, "Timer started", Toast.LENGTH_SHORT).show()
            }

            R.id.action_stop -> {
                TimerService().pause()
                Toast.makeText(this, "Timer stopped", Toast.LENGTH_SHORT).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}