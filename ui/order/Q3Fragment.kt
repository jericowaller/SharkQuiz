package com.example.sharktest.ui.order

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.sharktest.R
import com.example.sharktest.databinding.FragmentQ3Binding
import com.example.sharktest.model.QuizViewModel

class Q3Fragment : Fragment() {
    private var _binding: FragmentQ3Binding? = null
    private val binding get() = _binding!!
    private val sharedViewModel: QuizViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQ3Binding.inflate(inflater, container, false)
        val root = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = sharedViewModel
            q3Fragment = this@Q3Fragment
        }
    }

    fun goToNextScreen() {
        sharedViewModel.solidify()
        sharedViewModel.updateShark()
        findNavController().navigate(R.id.action_q3Fragment_to_resultsFragment)
    }

    fun cancelQuiz() {
        sharedViewModel.resetQuiz()
        findNavController().navigate(R.id.action_q3Fragment_to_startQuizFragment)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
