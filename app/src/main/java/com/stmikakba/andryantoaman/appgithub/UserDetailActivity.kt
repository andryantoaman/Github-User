package com.stmikakba.andryantoaman.appgithub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_user_detail.*

class UserDetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_USER = "extra_user"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_detail)

        var user:User? = intent.getParcelableExtra<User>(EXTRA_USER) as User

        Glide.with(this).load(user?.photo).into(iv_avatar_detail)
        tv_name_receive.text = user?.name
        tv_item_username_receive.text = user?.username
        tv_item_follower_receive.text = user?.followers
        tv_item_following_receive.text = user?.following
        tv_item_company_receive.text = user?.company
        tv_item_location_receive.text = user?.location
        tv_item_repository_receive.text = user?.repository
    }
}
//var nama = intent.getStringExtra("NAMA")
//var username = intent.getStringExtra("USERNAME")
//var follower = intent.getStringExtra("FOLLOWER")
//var following = intent.getStringExtra("FOLLOWING")
//var company = intent.getStringExtra("COMPANY")
//var location = intent.getStringExtra("LOCATION")
//var repository = intent.getStringExtra("REPOSITORY")