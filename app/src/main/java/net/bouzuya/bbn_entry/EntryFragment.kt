package net.bouzuya.bbn_entry

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import net.bouzuya.bbn_entry.databinding.EntryFragmentBinding


class EntryFragment : Fragment() {
    private val viewModel: EntryViewModel by viewModels {
        EntryViewModelFactory(requireContext())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return EntryFragmentBinding.inflate(
            inflater, container, false
        ).also { binding ->
            binding.lifecycleOwner = this
            binding.viewModel = viewModel

            binding.entryFetchButton.setOnClickListener {
                viewModel.fetch()
            }
        }.root
    }
}
