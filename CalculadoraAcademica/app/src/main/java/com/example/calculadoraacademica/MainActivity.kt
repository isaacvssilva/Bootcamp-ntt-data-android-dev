package com.example.calculadoraacademica

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcula = calcula
        val res = resultado

        //adicionando evento para o botao
        btCalcula.setOnClickListener {
            val n1 = Integer.parseInt(nota1.text.toString())
            val n2 = Integer.parseInt(nota2.text.toString())
            val falta = Integer.parseInt(faltas.text.toString())
            val media = ((n1+n2)/2)

            if(media >= 7 && falta <= 16){
                res.text = "Aprovado!\nMedia: $media\nTotal de Faltas: $falta\n"
            }else res.text = "Reprovado!\nMedia: $media\nTotal de Faltas: $falta\n"
        }
    }
}