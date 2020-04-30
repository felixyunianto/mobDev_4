package felix.uts_group4_mobdev.uts.com.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import felix.uts_group4_mobdev.uts.com.R
import felix.uts_group4_mobdev.uts.com.storage.SharedPrefManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profil = findViewById<CardView>(R.id.crvUser)
        val buttonMasuk = findViewById<Button>(R.id.btnMasuk)
        val btnLogout = findViewById<Button>(R.id.btnLogout)

        buttonMasuk.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        profil.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        btnLogout.setOnClickListener{
            SharedPrefManager.getInstance(applicationContext).clear()
            val intent = Intent(applicationContext, LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK

            startActivity(intent)
        }
    }



    override fun onStart() {
        super.onStart()

        if(SharedPrefManager.getInstance(this).isLoggedIn){
            btnMasuk.visibility = View.GONE
        }

        if(!SharedPrefManager.getInstance(this).isLoggedIn){
            btnLogout.visibility = View.GONE
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }


}
