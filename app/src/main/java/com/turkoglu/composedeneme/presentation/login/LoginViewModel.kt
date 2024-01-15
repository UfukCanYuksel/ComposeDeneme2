package com.turkoglu.composedeneme.presentation.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.turkoglu.composedeneme.data.repo.Login
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class LoginViewModel @Inject constructor(private val loginRepo : Login) : ViewModel() {

    private fun getReququestToken(){
        viewModelScope.launch { loginRepo.getCreateRequestToken() }
    }
    private fun getCreateSession(){
        viewModelScope.launch { loginRepo.createSession() }
    }
    private fun getCreateSessionWL(username : String , password : String){
        viewModelScope.launch{ loginRepo.createSessionWithLogin(username , password )}
    }

    private fun getAccountDetail(){
        viewModelScope.launch { loginRepo.getAccountDetail() }
    }
}