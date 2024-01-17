package com.example.chuvidientichhinhtron

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.chuvidientichhinhtron.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttontinhtoan.setOnClickListener {
            val a: Double = binding.editTextA.text.toString().toDouble()
            val b: Double = binding.editTextB.text.toString().toDouble()
            val c: Double = binding.editTextC.text.toString().toDouble()

            val delta: Double = b*b - (4*a*c)
            if (delta < 0){
                println("phuong trinh vo nghiem")
            }
            else if(delta == 0.0){
                println("phuong trinh co nghiem kep: x = ${-b / (2*a)}")
            }
            else{
                println("""
                    phuong trinh co 2 nghiem:
                    x1 = ${(-b + Math.sqrt(delta)) / (2*a)}
                    x2 = ${(-b - Math.sqrt(delta)) / (2*a)}
                """.trimIndent())

            }

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}