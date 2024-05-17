package com.cazulabs.mylogin.resetPassword.domain

import com.cazulabs.mylogin.resetPassword.data.ResetPasswordRepository
import javax.inject.Inject

class ResetPasswordUseCase @Inject constructor(private val repository: ResetPasswordRepository) {

    suspend operator fun invoke(email: String, password: String): Boolean {
        return repository.onResetPassword(email, password)
    }

}