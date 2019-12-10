package com.example.kotlinhelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private var resultat = ""
    private var resultat1 = ""
    private var operation="?"
    private var operatonActive = false
    private var virgule = false

    fun onSubmitReset(view:View) {
        resultat = ""
        resultat1 = ""
        operation ="?"
        operatonActive = false
        virgule = false
        affichage.text = resultat
    }

    fun onSubmit(view:View) {
        if (operation == "?"){
            resultat =  "0"
            affichage.text = resultat
        }
        else{
            var a = resultat.toFloat()
            var b = resultat1.toFloat()
            var valeur = 0f
            when(operation){
                "+" -> valeur = a+b
                "-" -> valeur = a-b
                "*" -> valeur = a*b
                "/" -> valeur = a/b
                else ->{affichage.text = "ERREUR"}
            }
            affichage.text = valeur.toString()
            operation = "?"
        }
    }
    fun onSubmit0(view:View) {
        if (operation == "?"){
            resultat = affichage.text as String
            resultat +=  "0"
            affichage.text = resultat
        }
        else{
            if(operatonActive){
                operatonActive = false
                affichage.text ="0"
                resultat1 = "0"
            }else {
                resultat1 = affichage.text as String
                resultat1 += "0"
                affichage.text = resultat1
            }
        }
    }
    fun onSubmit1(view:View) {
        if (operation == "?"){
            resultat = affichage.text as String
            resultat +=  "1"
            affichage.text = resultat
        }
        else{
            if(operatonActive){
                operatonActive =false
                affichage.text ="1"
                resultat1 = "1"
            }else {
                resultat1 = affichage.text as String
                resultat1 += "1"
                affichage.text = resultat1
            }
        }
    }
    fun onSubmit2(view:View) {
        if (operation == "?"){
            resultat = affichage.text as String
            resultat +=  "2"
            affichage.text = resultat
        }
        else{
            if(operatonActive){
                operatonActive =false
                affichage.text ="2"
                resultat1 = "2"
            }else {
                resultat1 = affichage.text as String
                resultat1 += "2"
                affichage.text = resultat1
            }
        }
    }
    fun onSubmit3(view:View) {
        if (operation == "?"){
            resultat = affichage.text as String
            resultat += "3"
            affichage.text = resultat
        }
        else{
            if(operatonActive){
                operatonActive =false
                affichage.text ="3"
                resultat1 = "3"
            }else {
                resultat1 = affichage.text as String
                resultat1 += "3"
                affichage.text = resultat1
            }
        }
    }
    fun onSubmit4(view:View) {
        if (operation == "?"){
            resultat = affichage.text as String
            resultat += "4"
            affichage.text = resultat
        }
        else{
            if(operatonActive){
                operatonActive =false
                affichage.text ="4"
                resultat1 = "4"
            }else {
                resultat1 = affichage.text as String
                resultat1 += "4"
                affichage.text = resultat1
            }
        }
    }
    fun onSubmit5(view:View) {
        if (operation == "?"){
            resultat = affichage.text as String
            resultat += "5"
            affichage.text = resultat
        }
        else{
            if(operatonActive){
                operatonActive =false
                affichage.text ="5"
                resultat1 = "5"
            }else {
                resultat1 = affichage.text as String
                resultat1 += "5"
                affichage.text = resultat1
            }
        }
    }
    fun onSubmit6(view:View) {
        if (operation == "?"){
            resultat = affichage.text as String
            resultat += "6"
            affichage.text = resultat
        }
        else{
            if(operatonActive){
                operatonActive =false
                affichage.text ="6"
                resultat1 = "6"
            }else {
                resultat1 = affichage.text as String
                resultat1 += "6"
                affichage.text = resultat1
            }
        }
    }
    fun onSubmit7(view:View) {
        if (operation == "?"){
            resultat = affichage.text as String
            resultat +=  "7"
            affichage.text = resultat
        }
        else{
            if(operatonActive){
                operatonActive =false
                affichage.text ="7"
                resultat1 = "7"
            }else {
                resultat1 = affichage.text as String
                resultat1 += "7"
                affichage.text = resultat1
            }
        }
    }
    fun onSubmit8(view:View) {
        if (operation == "?"){
            resultat = affichage.text as String
            resultat +=  "8"
            affichage.text = resultat
        }
        else{
            if(operatonActive){
                operatonActive =false
                affichage.text ="8"
                resultat1 = "8"
            }else {
                resultat1 = affichage.text as String
                resultat1 += "8"
                affichage.text = resultat1
            }
        }
    }
    fun onSubmit9(view:View) {
        if (operation == "?"){
            resultat = affichage.text as String
            resultat +=  "9"
            affichage.text = resultat
        }
        else{
            if(operatonActive){
                operatonActive =false
                affichage.text ="9"
                resultat1 = "9"
            }else {
                resultat1 = affichage.text as String
                resultat1 += "9"
                affichage.text = resultat1
            }
        }
    }
    fun onSubmitVirgule(view:View) {
        if (operation == "?"){
            if(virgule){
                affichage.text = "ERREUR"
            }else {
                resultat = affichage.text as String
                resultat += "."
                affichage.text = resultat
                virgule = true
            }
        }
        else{
            if(virgule){
                affichage.text = "ERREUR"
            }
            else if(operatonActive){
                operatonActive =false
                affichage.text ="."
            }else {
                resultat1 = affichage.text as String
                resultat1 += "."
                affichage.text = resultat1
            }
        }
    }
    fun onSubmitPlus(view:View) {
        if (operation == "?") {
            operatonActive=true
            affichage.text  = "+"
            operation = "+"
        }
        else{
            affichage.text = "ERREUR"
        }
    }
    fun onSubmitMoins(view:View) {
        if (operation == "?") {
            operatonActive=true
            affichage.text = "-"
            operation = "-"
        }
        else{
            affichage.text = "ERREUR"
        }
    }
    fun onSubmitDiviser(view:View) {
        if (operation == "?") {
            operatonActive=true
            affichage.text = "/"
            operation = "/"
        }
        else{
            affichage.text = "ERREUR"
        }
    }
    fun onSubmitMultiplier(view:View) {
        if (operation == "?") {
            operatonActive=true
            affichage.text="X"
            operation = "*"
        }
        else{
            affichage.text = "ERREUR"
        }
    }
}
