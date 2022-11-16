package com.example.res_q.ui.chat

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.res_q.databinding.FragmentChatBinding

class PengaturanFragment : Fragment() {

    private var _binding: FragmentChatBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val pengaturanViewModel =
            ViewModelProvider(this).get(PengaturanViewModel::class.java)

        _binding = FragmentChatBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textDashboard
        pengaturanViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
