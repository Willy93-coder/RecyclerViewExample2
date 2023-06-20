package com.example.recyclerviewexample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewexample2.adapter.KingsLeagueTeamAdapter
import com.example.recyclerviewexample2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        val manager = LinearLayoutManager(this)
        val decoration = DividerItemDecoration(this, manager.orientation)
        binding.recyclerViewContainer.layoutManager = manager
        binding.recyclerViewContainer.adapter =
            KingsLeagueTeamAdapter(KingsLeagueTeamsProvider.KingsLeagueTeamsList) { kingsLeagueTeams ->
                onItemSelected(kingsLeagueTeams)
            }
        binding.recyclerViewContainer.addItemDecoration(decoration)
    }

    private fun onItemSelected(kingsLeagueTeam: KingsLeagueTeams) {
        Toast.makeText(this, kingsLeagueTeam.name, Toast.LENGTH_SHORT).show()
    }
}