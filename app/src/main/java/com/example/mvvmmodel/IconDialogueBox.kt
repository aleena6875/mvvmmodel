package com.example.mvvmmodel

import android.content.Intent.ShortcutIconResource
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.fragment.app.DialogFragment

class IconDialogueBox (private val iconImageResource:String): DialogFragment() {

lateinit var iconImageView:ImageView
lateinit var closeButton:ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_icon_dialogue_box, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        iconImageView=view.findViewById(R.id.iconImageView)
        closeButton=view.findViewById(R.id.closeButton)

            iconImageView.setImage(iconImageResource)

        closeButton.setOnClickListener{
            dismiss()
        }
    }

    companion object {

        @JvmStatic
        fun newInstance(iconImageResource: String): IconDialogueBox {
            return IconDialogueBox(iconImageResource )
        }

    }
}