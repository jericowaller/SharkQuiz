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
package com.example.sharktest.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sharktest.data.DataSource

class QuizViewModel : ViewModel() {

    // Map of sharks
    val sharksMap = DataSource.sharksMap

    // Current shark
    private val _shark = MutableLiveData<Shark?>()
    val shark: LiveData<Shark?> = _shark

    // Current points
    private val _points = MutableLiveData<Int?>(-1)
    val points: LiveData<Int?> = _points

    var currentAdd = -1


    fun updateShark() {
        _shark.value = sharksMap[points.value!!]
    }

    fun updatePoints(tpoints: Int) {
        if (_points.value != -1) {
            _points.value = _points.value?.minus(currentAdd)
        } else {
            _points.value = 0
        }
        currentAdd = tpoints
        _points.value = _points.value?.plus(currentAdd)

    }

    fun solidify() {
        currentAdd = 0
    }

        fun resetQuiz() {
            _shark.value = null
            _points.value = -1
            currentAdd = -1
        }
    }
