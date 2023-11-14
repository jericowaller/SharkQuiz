/*
 * Copyright (C) 2021 The Android Open Source Project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.sharktest.ui.order

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.sharktest.R
import com.example.sharktest.databinding.FragmentResultsBinding
import com.example.sharktest.model.QuizViewModel
import com.google.android.material.snackbar.Snackbar

class ResultsFragment : Fragment() {
    private var _binding: FragmentResultsBinding? = null
    private val binding get() = _binding!!
    private val sharedViewModel: QuizViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentResultsBinding.inflate(inflater, container, false)
        val root = binding.root
        val image_name = "shark" + sharedViewModel.points.value + "_image"
        val image_id = resources.getIdentifier(image_name, "drawable", context?.packageName)
        binding.sharkImage.setImageResource(image_id)
        (activity as AppCompatActivity).supportActionBar?.title = "Final Results"
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            viewModel = sharedViewModel
            lifecycleOwner = viewLifecycleOwner
            resultsFragment = this@ResultsFragment
        }
    }

    fun restartQuiz() {
        sharedViewModel.resetQuiz()
        findNavController().navigate(R.id.action_resultsFragment_to_startQuizFragment)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
