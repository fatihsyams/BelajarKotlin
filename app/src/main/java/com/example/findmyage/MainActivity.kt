package com.example.findmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*
import org.jetbrains.anko.design.snackbar
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHello.onClick {
            toast("Hello, ${edtNama.text}")
        }
        btnAlert.onClick {
            alert("Happy Training", "Hello, ${edtNama.text}"){
                yesButton { toast("ohhh...") }
                noButton {  }
            }.show()
        }
        btnSelector.onClick {
            val club = listOf("Arsenal", "Real Madrid", "Barcelona", "MU", "Liverpool")
            selector("Hello, ${edtNama.text}, Apa CLub Bola Yang Anda Sukain", club){_, i ->
                toast("Jadi Kamu Menyukai, ${club}, benar")
            }
        }

        btnSnackbar.onClick {
            snackbar(edtNama,"Hai, ${edtNama.text}")
        }
    }
}
