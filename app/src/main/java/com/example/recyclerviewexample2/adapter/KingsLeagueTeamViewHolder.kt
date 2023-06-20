package com.example.recyclerviewexample2.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerviewexample2.KingsLeagueTeams
import com.example.recyclerviewexample2.databinding.KingsLeagueTeamBinding

class KingsLeagueTeamViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = KingsLeagueTeamBinding.bind(view)

    fun render(
        kingsLeagueTeamsModel: KingsLeagueTeams,
        onClickListener: (KingsLeagueTeams) -> Unit
    ) {
        binding.tvNameTeam.text = kingsLeagueTeamsModel.name
        binding.tvPresident.text = kingsLeagueTeamsModel.president
        binding.tvClassification.text = kingsLeagueTeamsModel.classification
        Glide.with(binding.ivShield.context).load(kingsLeagueTeamsModel.shield)
            .into(binding.ivShield)

        itemView.setOnClickListener { onClickListener(kingsLeagueTeamsModel) }
    }
}