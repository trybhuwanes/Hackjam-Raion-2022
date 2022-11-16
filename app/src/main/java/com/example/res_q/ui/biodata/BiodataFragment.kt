package com.example.res_q.ui.biodata

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.res_q.databinding.FragmentBiodataBinding

class BiodataFragment : Fragment() {

    private var _binding: FragmentBiodataBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val biodataViewModel =
            ViewModelProvider(this).get(BiodataViewModel::class.java)

        _binding = FragmentBiodataBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textBiodata
        biodataViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
