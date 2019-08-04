package net.bouzuya.bbn_entry

class EntryRepository(private val bbnService: BbnService) {
    suspend fun getEntry() = bbnService.getEntry()
}
