package com.anyf.yourpantryassistant.models

data class StorageSpace(
    val name: String,
    val categories: Map<String, List<String>>
)