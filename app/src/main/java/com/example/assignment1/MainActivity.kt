package com.example.assignment1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timeInput = findViewById<EditText>(R.id.timeInput)
        val suggestButton = findViewById<Button>(R.id.suggestButton)
        val resetButton = findViewById<Button>(R.id.resetButton)
        val mealSuggestion = findViewById<TextView>(R.id.mealSuggestion)

        val mealImage1 = findViewById<ImageView>(R.id.mealImage1)
        val mealImage2 = findViewById<ImageView>(R.id.mealImage2)
        val mealImage3 = findViewById<ImageView>(R.id.mealImage3)
        val mealImage4 = findViewById<ImageView>(R.id.mealImage4)
        val mealImage5 = findViewById<ImageView>(R.id.mealImage5)
        val mealImage6 = findViewById<ImageView>(R.id.mealImage6)

        suggestButton.setOnClickListener {
            val timeOfDay = timeInput.text.toString().trim().lowercase()

            when (timeOfDay) {
                "morning" -> {
                    mealSuggestion.text = "Breakfast: Eggs"
                    mealImage1.setImageResource(R.drawable.eggs)
                    mealImage1.visibility = View.VISIBLE
                    mealImage2.visibility = View.INVISIBLE
                    mealImage3.visibility = View.INVISIBLE
                    mealImage4.visibility = View.INVISIBLE
                    mealImage5.visibility = View.INVISIBLE
                    mealImage6.visibility = View.INVISIBLE
                }

                "mid-morning" -> {
                    mealSuggestion.text = "Snack: Fruit"
                    mealImage2.setImageResource(R.drawable.fruit)
                    mealImage1.visibility = View.INVISIBLE
                    mealImage2.visibility = View.VISIBLE
                    mealImage3.visibility = View.INVISIBLE
                    mealImage4.visibility = View.INVISIBLE
                    mealImage5.visibility = View.INVISIBLE
                    mealImage6.visibility = View.INVISIBLE
                }
                // Add similar logic for other times of the day
                "afternoon" -> {
                    mealSuggestion.text = "Lunch: Sandwich"
                    mealImage3.setImageResource(R.drawable.sandwich)
                    mealImage1.visibility = View.INVISIBLE
                    mealImage2.visibility = View.INVISIBLE
                    mealImage3.visibility = View.VISIBLE
                    mealImage4.visibility = View.INVISIBLE
                    mealImage5.visibility = View.INVISIBLE
                    mealImage6.visibility = View.INVISIBLE
                }

                "mid-afternoon" -> {
                    mealSuggestion.text = "Snack: Cake"
                    mealImage4.setImageResource(R.drawable.cake)
                    mealImage1.visibility = View.INVISIBLE
                    mealImage2.visibility = View.INVISIBLE
                    mealImage3.visibility = View.INVISIBLE
                    mealImage4.visibility = View.VISIBLE
                    mealImage5.visibility = View.INVISIBLE
                    mealImage6.visibility = View.INVISIBLE
                }

                "dinner" -> {
                    mealSuggestion.text = "Dinner: Pasta"
                    mealImage5.setImageResource(R.drawable.creamy_pasta)
                    mealImage1.visibility = View.INVISIBLE
                    mealImage2.visibility = View.INVISIBLE
                    mealImage3.visibility = View.INVISIBLE
                    mealImage4.visibility = View.INVISIBLE
                    mealImage5.visibility = View.VISIBLE
                    mealImage6.visibility = View.INVISIBLE
                }

                "after dinner" -> {
                    mealSuggestion.text = "Dessert: Ice Cream"
                    mealImage6.setImageResource(R.drawable.desert_ice_cream)  // Correct the image name if needed
                    mealImage1.visibility = View.INVISIBLE
                    mealImage2.visibility = View.INVISIBLE
                    mealImage3.visibility = View.INVISIBLE
                    mealImage4.visibility = View.INVISIBLE
                    mealImage5.visibility = View.INVISIBLE
                    mealImage6.visibility = View.VISIBLE
                }

                else -> {
                    Toast.makeText(
                        this ,
                        "Invalid input! Please enter a valid time of day." ,
                        Toast.LENGTH_SHORT
                    ).show()
                    mealSuggestion.text = ""
                    // Hide all meal images instead of `mealImage`
                    mealImage1.setImageResource(0)
                    mealImage2.setImageResource(0)
                    mealImage3.setImageResource(0)
                    mealImage4.setImageResource(0)
                    mealImage5.setImageResource(0)
                    mealImage6.setImageResource(0)

                    mealImage1.visibility = View.INVISIBLE
                    mealImage2.visibility = View.INVISIBLE
                    mealImage3.visibility = View.INVISIBLE
                    mealImage4.visibility = View.INVISIBLE
                    mealImage5.visibility = View.INVISIBLE
                    mealImage6.visibility = View.INVISIBLE
                }
            }
                resetButton.setOnClickListener {
                    timeInput.text.clear()
                    mealSuggestion.text = ""
                    // Clear all images and hide ImageViews
                    mealImage1.setImageResource(0)
                    mealImage2.setImageResource(0)
                    mealImage3.setImageResource(0)
                    mealImage4.setImageResource(0)
                    mealImage5.setImageResource(0)
                    mealImage6.setImageResource(0)

                    mealImage1.visibility = View.INVISIBLE
                    mealImage2.visibility = View.INVISIBLE
                    mealImage3.visibility = View.INVISIBLE
                    mealImage4.visibility = View.INVISIBLE
                    mealImage5.visibility = View.INVISIBLE
                    mealImage6.visibility = View.INVISIBLE
                }
            }
        } }