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
package com.example.sharktest.data

import com.example.sharktest.model.Shark

/**
 * Map of available menu items to be displayed in the menu fragments.
 */
object DataSource {
    val sharksMap = mapOf(
        0 to
        Shark(
            name = "Nurse shark",
            description = "Nurse sharks are gentle reef sharks commonly found in waters near the Americas. They're one of the few sharks " +
                    "that can breathe without swimming. They are exceptionally sedentary, just like you! " +
                    "However, this doesn't mean they are harmless. They are one of the highest in terms of shark bites on humans. " +
                    "Just because they're relatively tame doesn't mean they won't defend themselves, which you can definitely relate to.",
        ),
        1 to
        Shark(
            name = "Whale shark",
            description = "These giants may look scary, but the whale shark isn't dangerous at all! They feed on microscopic plankton, " +
                    "which they filter out of the water using big bristles in their mouths. They're pretty much harmless to humans, which " +
                    "mimics your soft temperament perfectly. Additionally, the pattern on their backs is totally unique, just like you!",
        ),
        2 to
        Shark(
            name = "Basking shark",
            description = "The basking shark is formidable, but relatively harmless. They're filter feeders, which means they sift" +
                    " tiny organisms out of the water for food. Their most unique trait is the bone-white coloration inside their jaws. " +
                    "They make a bold statement whenever they open their mouths, which you can certainly relate to.",
        ),
        3 to
        Shark(
            name = "Tiger shark",
            description = "The tiger shark is a common coastal shark notable for the striped pattern along their back. They are " +
                    "ambush predators, waiting until they're out of sight to catch their prey, which closely resembles your clever " +
                    "nature. Tiger sharks are one of the more dangerous types of sharks. They're not to be messed with, and neither are you.",
        ),
        4 to
        Shark(
            name = "Goblin shark",
            description = "...Jumpscare! The goblin shark is a terrifying deep-sea predator with a long nose and extendable jaws. " +
                    "Like you, it isn't afraid to take action, detecting prey by electrical impulses and snatching them up. It's also " +
                    "a good reminder that true beauty lies within... Sorry.",
        ),
        5 to
        Shark(
            name = "Spotted wobbegong shark",
            description = "The spotted wobbegong is a strange one, plain and simple. They've got a unique fashion sense (just like you!), " +
                    "with a shaggy camouflage to help them hide in the seabed. They're also opportunistic, waiting for prey to drift " +
                    "by. Both you and the spotted wobbegong shark don't hesitate to seize an opportunity when it arises!",
        ),
        6 to
        Shark(
            name = "Mako shark",
            description = "Mako sharks are fast, aggressive predators. They are well known as some of the fastest aquatic creatures, " +
                    "reaching speeds of up to 45 miles per hour! Like you, they know how to get the job done. Also like you, they're very perceptive, " +
                    "using their eyes to scan the water above them searching for prey.",
        ),
        7 to
        Shark(
            name = "Oceanic Whitetip shark",
            description = "The oceanic whitetip shark is a slow-moving open ocean predator. They spend their time hunting for fish and squid " +
                    "in open waters. Their most distinctive trait is the swarms of pilot fish that swim alongside them. The fish gain security, " +
                    "while the shark gets free cleaning! Similarly to this shark, you have a wide circle of friends by your side.",
        ),
        8 to
        Shark(
            name = "Thresher shark",
            description = "The thresher shark is an unusual hunter. It has a huge upper caudal fin, which can sometimes comprise over half " +
                    "their body length. They use this tail to smack prey (yes, really) to disorient them before eating them. Neither you nor" +
                    " thresher shark is scared of smacking somebody if you need to. This shark is also Jerico's favorite. Congrats!",
        ),
        9 to
        Shark(
            name = "White shark",
            description = "The killer king of the ocean: the white shark. More commonly known as the great white shark, this beast is " +
                    "easily the most well known of its kind. It operates at peak efficiency to hunt its prey. Just like this shark, you " +
                    "know you're the boss, and everyone else does too. And yet, despite your intimidating nature, you're nicer than most " +
                    "would expect, similar to how the white shark doesn't attack as often as most people believe."
        )


    )
}
