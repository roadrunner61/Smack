package com.example.android.smack

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_creat_user.*
import java.util.*

class CreatUserActivity : AppCompatActivity() {

        /* sets the default avatar*/
    var  userAvatar = "profileDefault"
    var  avatarColor = "[0.5, 0.5, 0.5, 1]"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_creat_user)
    }

    fun generateUserAvatar(view: View) {
            /*color will generate a number between 0 & 1
            avatar will generate a number between 0 & 27*/
        val random = Random()
        val color = random.nextInt(2)
        val avatar = random.nextInt(28)

        /*if color = 0 use a light avatar
        * if color is 1 use a dark avatar*/
        if (color == 0) {
            userAvatar = "light$avatar"
        } else {
            userAvatar = "dark$avatar"
        }
        /*gets the resourceId of the chosen avatar by the random
        numbers and sets it in the createAvatarImageView*/
        val  resourceId = resources.getIdentifier(userAvatar, "drawable", packageName)
        createAvatarImageView.setImageResource(resourceId)

    }

    fun generateColorClicked(view: View) {
        /*creates random rgb numbers*/
        val random = Random()
        val r = random.nextInt(255)
        val g = random.nextInt(255)
        val b = random.nextInt(255)

        /*creates a random color from the three
        random rgb numbers and sets the background */
        createAvatarImageView.setBackgroundColor(Color.rgb(r, g, b))

        /*converts the rgb value to a number between 0 & 1
        * because the API being used accepts those values
        * ie floating point numbers between 0 & 1 for
        * each of the rgb values*/
        val savedR = r.toDouble() / 255
        val savedG = g.toDouble() / 255
        val savedB = b.toDouble() / 255

        avatarColor = "[$savedR, $savedG, $savedB, 1]"


    }

    fun createUserClicked(view: View) {


    }

}
