package com.example.abbassample.homework25

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RegisterViewModel: ViewModel() {

    private val _email = MutableLiveData<String>()
    val email: LiveData<String> = _email

    private val _code = MutableLiveData<String>()
    val code: LiveData<String> = _code

    private val _password = MutableLiveData<String>()
    val password: LiveData<String> = _password

    private val _name = MutableLiveData<String>()
    val name: LiveData<String>  = _name

    private val _surname = MutableLiveData<String>()
    val surname: LiveData<String>  = _surname

    private val _gender = MutableLiveData<String>()
    val gender: LiveData<String> = _gender


    fun setEmail(value: String) {
        _email.value = value
    }

    fun setCode(value: String) {
        _code.value = value
    }

    fun setPassword(value: String) {
        _password.value = value
    }

    fun setName(value: String) {
        _name.value = value
    }

    fun setSurname(value: String) {
        _surname.value = value
    }

    fun setGender(value: String) {
        _gender.value = value
    }
}