package id.ac.polbeng.wawansaputra.intens4

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.my_toolbar))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menu?.add("Web")
        menu?.add("Map")
        menu?.add("Phone number")
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val uri: Uri
        var intent = Intent()

        when (item.toString()) {
            "Web" -> {
                uri = Uri.parse("http://www.polbeng.ac.id")
                intent = Intent(Intent.ACTION_VIEW, uri)
            }
            "Map" -> {
                uri = Uri.parse("geo:1.4686296,102.1227118")
                // This would have worked as well
                // uri = Uri.parse("https://maps.google.com/maps?q=40.7113399,-74.0263469")
                intent = Intent(Intent.ACTION_VIEW, uri)
            }
            "Phone number" -> {
                uri = Uri.parse("tel:+6276624566")
                intent = Intent(Intent.ACTION_DIAL, uri)
            }
        }

        startActivity(intent)
        return true
    }
}
