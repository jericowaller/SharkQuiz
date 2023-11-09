
package com.example.sharktest.ui.order

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.sharktest.R
import com.example.sharktest.databinding.FragmentQ1Binding
import com.example.sharktest.model.QuizViewModel

class Q1Fragment : Fragment() {
    private var _binding: FragmentQ1Binding? = null
    private val binding get() = _binding!!
    private val sharedViewModel: QuizViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQ1Binding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = sharedViewModel
            q1Fragment = this@Q1Fragment
        }
    }

    fun goToNextScreen() {
        sharedViewModel.solidify()
        findNavController().navigate(R.id.action_q1Fragment_to_q2Fragment)

    }

    fun cancelQuiz() {
        sharedViewModel.resetQuiz()
        findNavController().navigate(R.id.action_q1Fragment_to_startQuizFragment)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
