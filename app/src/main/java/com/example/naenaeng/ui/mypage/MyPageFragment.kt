package com.example.naenaeng.ui.mypage

import com.example.naenaeng.MainActivity
import com.example.naenaeng.R
import com.example.naenaeng.base.BaseFragment
import com.example.naenaeng.databinding.FragmentMyPageBinding
import com.example.naenaeng.ui.info.AllergyFragment
import com.example.naenaeng.ui.info.PreferenceFragment

class MyPageFragment : BaseFragment<FragmentMyPageBinding>(R.layout.fragment_my_page) {
    override fun initStartView() {
        super.initStartView()
        (activity as MainActivity).setToolbar("마이")
    }

    override fun initAfterBinding() {
        super.initAfterBinding()

        binding.btnChangePassword.setOnClickListener {
            navController.navigate(R.id.action_myPageFragment_to_changePasswordFragment)
        }
        binding.btnChangePreference.setOnClickListener {
            PreferenceFragment().show(parentFragmentManager, "preference")
        }
        binding.btnChangeAllergy.setOnClickListener {
            AllergyFragment().show(parentFragmentManager, "preference")
        }
        binding.btnLogout.setOnClickListener {
            navController.navigate(R.id.action_myPageFragment_to_loginFragment)
        }
    }
}