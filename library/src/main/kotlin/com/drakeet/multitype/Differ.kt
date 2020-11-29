package com.drakeet.multitype

import androidx.annotation.NonNull

abstract class DifferItem {
    abstract fun isOtherItemTheSame(@NonNull other : Any) : Boolean
    abstract fun isOtherContentsTheSame(@NonNull other: Any) : Boolean
    abstract fun getChangePayload(@NonNull newItem: Any): Any?
}