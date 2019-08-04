package net.bouzuya.bbn_entry

import org.threeten.bp.LocalDate
import org.threeten.bp.format.DateTimeFormatter

class EntryRepository(private val bbnService: BbnService) {
    suspend fun getEntry(localDate: LocalDate): Entry {
        val dateString = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE) // YYYY-MM-DD
        val year = dateString.slice(0..3) // YYYY
        val month = dateString.slice(5..6) // MM
        val date = dateString.slice(8..9) // DD
        return bbnService.getEntry(year, month, date)
    }
}
