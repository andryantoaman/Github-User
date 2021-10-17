package com.stmikakba.andryantoaman.appgithub

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    var photo: String?,
    var name: String?,
    var username: String?

) : Parcelable
