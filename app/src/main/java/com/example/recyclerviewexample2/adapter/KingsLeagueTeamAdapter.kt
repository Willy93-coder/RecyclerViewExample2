package com.example.recyclerviewexample2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample2.KingsLeagueTeams
import com.example.recyclerviewexample2.R

class KingsLeagueTeamAdapter(private val kingsLeagueTeamsList: List<KingsLeagueTeams>, private val onclickListener:(KingsLeagueTeams) -> Unit): RecyclerView.Adapter<KingsLeagueTeamViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KingsLeagueTeamViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return KingsLeagueTeamViewHolder(layoutInflater.inflate(R.layout.kings_league_team, parent, false))
    }

    override fun getItemCount(): Int = kingsLeagueTeamsList.size

    override fun onBindViewHolder(holder: KingsLeagueTeamViewHolder, position: Int) {
        val team = kingsLeagueTeamsList[position]
        holder.render(team, onclickListener)
    }
}