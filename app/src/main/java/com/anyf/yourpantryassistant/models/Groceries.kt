package com.anyf.yourpantryassistant.models

import com.google.mlkit.vision.objects.DetectedObject

class Groceries {
    val food = mutableListOf<DetectedObject>()
}