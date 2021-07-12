package com.example.contactapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactRvAdapter (var contactList:List<Contact>):RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false)
        return ContactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=contactList.get(position)
        holder.etName.text=currentContact.name
        holder.etphone.text=currentContact.phone
        holder.etEmail.text=currentContact.email



    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}
class ContactViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var etName=itemView.findViewById<TextView>(R.id.etName)
    var etphone=itemView.findViewById<TextView>(R.id.etPhone)
    var etEmail=itemView.findViewById<TextView>(R.id.etEmail)

}
















