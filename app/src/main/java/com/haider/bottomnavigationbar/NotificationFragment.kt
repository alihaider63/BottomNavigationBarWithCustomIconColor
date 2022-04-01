package com.haider.bottomnavigationbar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.haider.bottomnavigationbar.databinding.FragmentNotificationBinding

class NotificationFragment : Fragment() {

    lateinit var binding: FragmentNotificationBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        super.onCreateView(inflater, container, savedInstanceState)
        binding = FragmentNotificationBinding.inflate(layoutInflater)
        return binding.root
    }

}