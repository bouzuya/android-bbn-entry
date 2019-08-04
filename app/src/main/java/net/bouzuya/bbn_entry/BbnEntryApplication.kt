package net.bouzuya.bbn_entry

import android.app.Application
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class BbnEntryApplication : Application() {
    fun getEntryRepository(): EntryRepository = EntryRepository(
        Retrofit.Builder()
            .baseUrl("https://blog.bouzuya.net")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create(BbnService::class.java)
    )
}