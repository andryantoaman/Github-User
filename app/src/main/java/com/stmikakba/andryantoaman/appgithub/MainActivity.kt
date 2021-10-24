package com.stmikakba.andryantoaman.appgithub

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val list = ArrayList<User>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_users.setHasFixedSize(true)
        list.addAll(getListUsers())
        showRecyclerList()
    }

    fun getListUsers(): ArrayList<User> {
        val dataName = resources.getStringArray(R.array.name)
        val dataUsername = resources.getStringArray(R.array.username)
        val dataPhoto = resources.obtainTypedArray(R.array.avatar)
        val dataFollower = resources.getStringArray(R.array.followers)
        val dataFollowing = resources.getStringArray(R.array.following)
        val dataCompany = resources.getStringArray(R.array.company)
        val dataLocation = resources.getStringArray(R.array.location)
        val dataRepository = resources.getStringArray(R.array.repository)
        val listUser = ArrayList<User>()
        for (position in dataName.indices) {
            val user = User(
                dataPhoto.getResourceId(position,-1),
                dataName[position],
                dataUsername[position],
                dataFollower[position],
                dataFollowing[position],
                dataCompany[position],
                dataLocation[position],
                dataRepository[position]
            )
            listUser.add(user)
        }
        return listUser
    }

    private fun showRecyclerList() {
        if (applicationContext.resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            rv_users.layoutManager = GridLayoutManager(this, 2)
        } else {
            rv_users.layoutManager = LinearLayoutManager(this)
        }
        val listUserAdapter = ListUserAdapter(list)
        rv_users.adapter = listUserAdapter
    }
}