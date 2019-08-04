package net.bouzuya.bbn_entry

import retrofit2.http.GET

interface BbnService {
    @GET("/2019/08/01/index.json")
    suspend fun getEntry(): Entry
}
