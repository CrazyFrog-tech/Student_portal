package com.example.studentportal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_portal.view.*
import kotlinx.android.synthetic.main.asds.view.*

class PortalAdapter (private val portals: List<PortalData>) : RecyclerView.Adapter<PortalAdapter.ViewHolder>() {


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            return ViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.asds, parent, false)
            )
        }

        override fun getItemCount(): Int {
            return portals.size
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bind(portals[position])
        }

        inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


            fun bind(portal: PortalData) {
                itemView.btnPortalyon.setText(portal.title + '\n' + portal.url)

            }

        }
    }

