package com.example.android.done.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.android.done.R

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var newActivity: NewActivity = NewActivity()
    private lateinit var addButton: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        // val cardView: CardView = root.findViewById(R.id.cardView)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {

        })
        addButton = root.findViewById(R.id.addNewActivityButton)
        addButton.setOnClickListener {
            fragmentManager?.let { it1 -> newActivity.show(it1, "dialog") }
        }
        return root
    }
}
