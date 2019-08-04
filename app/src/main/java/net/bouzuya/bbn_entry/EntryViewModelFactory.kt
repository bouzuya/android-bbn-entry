package net.bouzuya.bbn_entry

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class EntryViewModelFactory(private val context: Context) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val application = context.applicationContext as BbnEntryApplication
        @Suppress("UNCHECKED_CAST")
        return EntryViewModel(application.getEntryRepository()) as T
    }
}
