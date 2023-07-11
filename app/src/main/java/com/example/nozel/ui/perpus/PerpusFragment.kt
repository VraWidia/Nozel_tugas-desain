package com.example.nozel.ui.perpus

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.nozel.databinding.FragmentHomeBinding
import com.example.nozel.databinding.FragmentPerpusBinding
import com.example.nozel.ui.home.PerpusViewModel

class PerpusFragment : Fragment() {

    private var _binding: FragmentPerpusBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val PerpusViewModel =
            ViewModelProvider(this).get(PerpusViewModel::class.java)

        _binding = FragmentPerpusBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}