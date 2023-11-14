package com.example.sharktest.ui.order

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.sharktest.R
import com.example.sharktest.databinding.FragmentQ2Binding
import com.example.sharktest.model.QuizViewModel

class Q2Fragment : Fragment() {
    private var _binding: FragmentQ2Binding? = null
    private val binding get() = _binding!!
    private val sharedViewModel: QuizViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQ2Binding.inflate(inflater, container, false)
        val root = binding.root
        (activity as AppCompatActivity).supportActionBar?.title = "Question 2"
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = sharedViewModel
            q2Fragment = this@Q2Fragment
        }
    }

    fun goToNextScreen() {
        sharedViewModel.solidify()
        findNavController().navigate(R.id.action_q2Fragment_to_q3Fragment)
    }

    fun cancelQuiz() {
        sharedViewModel.resetQuiz()
        findNavController().navigate(R.id.action_q2Fragment_to_startQuizFragment)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
