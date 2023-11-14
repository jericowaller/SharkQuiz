package com.example.sharktest.ui.order

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.sharktest.R
import com.example.sharktest.databinding.FragmentStartQuizBinding

class StartQuizFragment : Fragment() {
    private var _binding: FragmentStartQuizBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentStartQuizBinding.inflate(inflater, container, false)
        val root: View = binding.root
        binding.startQuizBtn.setOnClickListener {
            findNavController().navigate(R.id.action_startQuizFragment_to_q1Fragment)
        }
        (activity as AppCompatActivity).supportActionBar?.title = "Shark Personality Quiz"
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
