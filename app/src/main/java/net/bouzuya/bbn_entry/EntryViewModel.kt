package net.bouzuya.bbn_entry

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import org.threeten.bp.LocalDate

class EntryViewModel(private val entryRepository: EntryRepository) : ViewModel() {
    private val _fetching = MutableLiveData<Boolean>()
    val fetching: LiveData<Boolean> = _fetching

    val name = "Entry"

    private val _title = MutableLiveData<String>()
    val title: LiveData<String> = _title

    fun fetch() = viewModelScope.launch {
        _fetching.postValue(true)
        val yesterday = LocalDate.now().minusDays(1)
        val entry = entryRepository.getEntry(yesterday)
        _title.postValue(entry.title)
        _fetching.postValue(false)
    }
}
