package com.stmikakba.andryantoaman.appgithub


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val list = ArrayList<User>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_users.setHasFixedSize(true)
        //getListUsers()
        showRecyclerList()
    }

    fun getListUsers(): ArrayList<User> {
        val dataName = resources.getStringArray(R.array.name)
        val dataUsername = resources.getStringArray(R.array.username)
        val dataPhoto = resources.getStringArray(R.array.avatar)
        val listUser = ArrayList<User>()
        for (position in dataPhoto.indices) {
            val user = User(
                dataPhoto[position],
                dataName[position],
                dataUsername[position]
            )
            listUser.add(user)
        }
        return listUser
    }

    private fun showRecyclerList() {
        rv_users.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListUserAdapter(list)
        rv_users.adapter = listHeroAdapter
    }


}