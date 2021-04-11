package com.thesis.android_challenge_w3.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.thesis.android_challenge_w3.model.User


class ProfileViewModel : ViewModel() {
    var user : MutableLiveData<User> = MutableLiveData()
    init{
        user.value= User()
    }
    fun setFullNameUserProfile(fullName: String){
        user.value?.fullName = fullName
        user.postValue(user.value)
    }
    fun setEmailUserProfile(email: String){
        user.value?.email = email
        user.postValue(user.value)
    }
    fun setPhoneNumberUserProfile(phoneNumber: String){
        user.value?.phoneNumber = phoneNumber
        user.postValue(user.value)
    }
}