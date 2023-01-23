package com.example.friendz

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FriendAdapter(val context: Context):
    RecyclerView.Adapter<FriendAdapter.ViewHolder>() {

    //put the sampleDatta inside a variable

    val goodfriends = SampleData()

    //put the listoffriends for the List<Friends> inside a variable and then state the path
    val realfriends = goodfriends.listOfFriends




    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int
    ): ViewHolder {
        val itemView: View = LayoutInflater.from(context).inflate(R.layout.list_of_friends,parent, false
        )
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FriendAdapter.ViewHolder, position: Int) {
        val friends= realfriends[position]
        holder.image.setImageResource(friends.drawableResource)
        holder.name.text = friends.name
        holder.gender.text = friends.gender
        holder.location.text = friends.location

    }

    override fun getItemCount(): Int {
        return realfriends.size

    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.image)
        val name : TextView = itemView.findViewById(R.id.name)
        val gender : TextView = itemView.findViewById(R.id.gender)
        val location: TextView = itemView.findViewById(R.id.location)

    }
}
