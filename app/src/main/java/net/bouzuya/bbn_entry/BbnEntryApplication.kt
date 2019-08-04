package net.bouzuya.bbn_entry

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class BbnEntryApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        AndroidThreeTen.init(this)
    }

    fun getEntryRepository(): EntryRepository = EntryRepository(
        Retrofit.Builder()
            .baseUrl("https://blog.bouzuya.net")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create(BbnService::class.java)
    )
}