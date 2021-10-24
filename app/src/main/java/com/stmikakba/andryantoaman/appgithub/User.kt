package com.stmikakba.andryantoaman.appgithub

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
        var photo: Int,
        var name: String?,
        var username: String?,
        var followers: String?,
        var following: String?,
        var company: String?,
        var location: String?,
        var repository: String?

) : Parcelable
