package net.bouzuya.bbn_entry

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EntryViewModel : ViewModel() {
    val name = "Entry"

    private val _title = MutableLiveData<String>()
    val title: LiveData<String> = _title

    fun fetch() {
        _title.postValue("hello")
    }
}
