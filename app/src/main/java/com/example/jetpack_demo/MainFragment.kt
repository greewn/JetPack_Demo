package com.example.jetpack_demo


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment(), View.OnClickListener {

//  initiate navcontroller
    var navController: NavController? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

//  associate navcontroller with buttons
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.nextbtn).setOnClickListener(this)
        view.findViewById<Button>(R.id.altbtn).setOnClickListener(this)
    }

//    associate buttons with fragment actions
    override fun onClick(v: View?) {
        when(v!!.id) {
            R.id.nextbtn -> navController!!.navigate(R.id.action_mainFragment_to_nextFragment)
            R.id.altbtn -> navController!!.navigate(R.id.action_mainFragment_to_alternateFragment)
        }
    }
}
