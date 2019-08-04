package net.bouzuya.bbn_entry

import retrofit2.http.GET
import retrofit2.http.Path

interface BbnService {
    @GET("/{year}/{month}/{date}/index.json")
    suspend fun getEntry(
        @Path("year") year: String,
        @Path("month") month: String,
        @Path("date") date: String
    ): Entry
}
