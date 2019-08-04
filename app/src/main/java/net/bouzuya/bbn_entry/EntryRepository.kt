package net.bouzuya.bbn_entry

class EntryRepository(private val bbnService: BbnService) {
    suspend fun getEntry() = bbnService.getEntry("2019", "08", "01")
}
