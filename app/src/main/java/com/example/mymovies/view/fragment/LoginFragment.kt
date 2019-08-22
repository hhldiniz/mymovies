package com.example.mymovies.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.example.mymovies.R
import com.example.mymovies.data.repository.UserRepository
import com.example.mymovies.extensions.inflate
import com.example.mymovies.viewmodel.LoginFragmentViewModel
import com.example.mymovies.viewmodel.LoginFragmentViewModelFactory
import kotlinx.android.synthetic.main.login_fragment.*

class LoginFragment: BaseFragment() {

    private val userRepository = UserRepository()
    private val viewModel: LoginFragmentViewModel by lazy {
        val factory = LoginFragmentViewModelFactory(userRepository, activity?.application!!)
        ViewModelProviders.of(this, factory).get(LoginFragmentViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return container?.inflate(R.layout.login_fragment)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        signup_btn.setOnClickListener {
            findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToSignupFragment())
        }
        this.lifecycle.addObserver(viewModel)
    }
}