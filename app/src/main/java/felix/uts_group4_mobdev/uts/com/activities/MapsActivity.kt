package felix.uts_group4_mobdev.uts.com.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import felix.uts_group4_mobdev.uts.com.R

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

        val map: SupportMapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment

        map.getMapAsync(this)
    }

    override fun onMapReady(map: GoogleMap) {
        val lok = LatLng(-6.259412, 106.878688)
        val update = CameraUpdateFactory.newLatLng(lok)
        val zoom = CameraUpdateFactory.zoomTo(17f)
        map.moveCamera(update)
        map.animateCamera(zoom)
        map.addMarker(
            MarkerOptions()
                .position(lok)
                .title("Toko PLUGIN").snippet("Alamatnya di sana"))

    }
}
