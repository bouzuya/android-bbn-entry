package net.bouzuya.bbn_entry

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import net.bouzuya.bbn_entry.databinding.HomeFragmentBinding


class HomeFragment : Fragment() {
    private val viewModel: HomeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return HomeFragmentBinding.inflate(
            inflater, container, false
        ).also { binding ->
            binding.lifecycleOwner = this
            binding.viewModel = viewModel

            binding.homeGoButton.setOnClickListener { view ->
                val action = HomeFragmentDirections.actionHomeToEntry()
                view.findNavController().navigate(action)
            }
        }.root
    }
}
