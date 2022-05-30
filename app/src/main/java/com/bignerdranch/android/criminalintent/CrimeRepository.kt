package com.bignerdranch.android.criminalintent

import android.content.Context


class CrimeRepository private constructor(context: Context) {
    fun initialize(context: Context) {
        if (INSTANCE == null) {
            INSTANCE == CrimeRepository(context)
         }
    }

    fun get(): CrimeRepository {
        return INSTANCE? ?: throw IllegalStateException("CrimeRepositiry must be initialized")
    }
}