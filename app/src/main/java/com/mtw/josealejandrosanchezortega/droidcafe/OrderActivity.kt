package com.mtw.josealejandrosanchezortega.droidcafe

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import android.widget.RadioButton





class OrderActivity : Activity() {

    // VARIABLE ESTATICA PARA OBTENER EL NOMBRE DE LA CLASE.
    // GENERALMENTE SE USA PARA EL TRACKING EN EL DEBUGING
    private val TAG_ACTIVITY = OrderActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)
    }

    // METODO PARA FACILITAR LA CREACION DE UN MENSAJE DE TIPO Toast
    fun displayToast(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }

    fun onRadioButtonClicked(view: View) {
        // Is the button now checked?
        val checked = (view as RadioButton).isChecked
        // Check which radio button was clicked
        when (view.getId()) {
            R.id.sameday -> if (checked)
            // Same day service
                displayToast(getString(R.string.chosen) + getString(R.string.same_day_messenger_service))
            R.id.nextday -> if (checked)
            // Next day delivery
                displayToast(getString(R.string.chosen) + getString(R.string.next_day_ground_delivery))
            R.id.pickup -> if (checked)
            // Pick up
                displayToast(getString(R.string.chosen) + getString(R.string.pick_up))
            else -> Log.d(TAG_ACTIVITY, getString(R.string.nothing_clicked))
        }
    }
}
