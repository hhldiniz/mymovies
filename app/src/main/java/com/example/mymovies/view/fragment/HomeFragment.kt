package com.example.mymovies.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.mymovies.R
import com.example.mymovies.extensions.inflate
import kotlinx.android.synthetic.main.home_fragment.*

class HomeFragment: BaseFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return container?.inflate(R.layout.home_fragment)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bottom_menu.setupWithNavController(activity?.findViewById<View>(R.id.home_navhost_fragment)!!.findNavController())
    }
}