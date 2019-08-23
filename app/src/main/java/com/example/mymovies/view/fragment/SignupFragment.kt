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
import com.example.mymovies.viewmodel.SignupFragmentViewModel
import com.example.mymovies.viewmodel.SignupFragmentViewModelFactory
import kotlinx.android.synthetic.main.signup_fragment.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class SignupFragment: BaseFragment() {

    private val viewModel: SignupFragmentViewModel by lazy {
        val factory = SignupFragmentViewModelFactory(UserRepository(), activity?.application!!)
        ViewModelProviders.of(this, factory).get(SignupFragmentViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return container?.inflate(R.layout.signup_fragment)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lifecycle.addObserver(viewModel)
        complete_register_btn.setOnClickListener {
            if(new_password.text.toString() == new_password_confirmation.text.toString())
                GlobalScope.launch {
                    viewModel.saveAsync().await()
                    findNavController().popBackStack()
                }
            else
                new_password.error = context?.getString(R.string.invalid_password)
        }
    }
}