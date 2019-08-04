package net.bouzuya.bbn_entry

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class EntryViewModel(private val entryRepository: EntryRepository) : ViewModel() {
    val name = "Entry"

    private val _title = MutableLiveData<String>()
    val title: LiveData<String> = _title

    fun fetch() = viewModelScope.launch {
        val entry = entryRepository.getEntry()
        _title.postValue(entry.title)
    }
}
