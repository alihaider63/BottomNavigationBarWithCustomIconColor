package com.haider.bottomnavigationbar

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.haider.bottomnavigationbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private lateinit var manager: FragmentTransaction
    private val personFragment = PersonFragment()
    private val homeFragment = HomeFragment()
    private val settingsFragment = SettingsFragment()
    private val notificationFragment = NotificationFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.icNavFeedNew.setBackgroundColor(getColor(R.color.icon_bg_color))

        manager = supportFragmentManager.beginTransaction()
            .replace(R.id.flFragment,homeFragment)
            manager.commit()

    }

    fun addFragmentOnClick(view: View) {
        manager = supportFragmentManager.beginTransaction()
        when (view) {
            binding.icNavFeedNew -> {
                binding.icNavFeedNew.setBackgroundColor(getColor(R.color.icon_bg_color))
                binding.icNavChatNew.setBackgroundColor(getColor(R.color.white))
                binding.icNavNotificationNew.setBackgroundColor(getColor(R.color.white))
                binding.icNavLeaderboardNew.setBackgroundColor(getColor(R.color.white))

                manager.replace(R.id.flFragment,homeFragment)
                    .commit()
            }
            binding.icNavChatNew -> {
                binding.icNavChatNew.setBackgroundColor(getColor(R.color.icon_bg_color))
                binding.icNavFeedNew.setBackgroundColor(getColor(R.color.white))
                binding.icNavLeaderboardNew.setBackgroundColor(getColor(R.color.white))
                binding.icNavNotificationNew.setBackgroundColor(getColor(R.color.white))

                manager.replace(R.id.flFragment,personFragment)
                    .commit()
            }
            binding.icNavLeaderboardNew -> {
                binding.icNavLeaderboardNew.setBackgroundColor(getColor(R.color.icon_bg_color))
                binding.icNavFeedNew.setBackgroundColor(getColor(R.color.white))
                binding.icNavChatNew.setBackgroundColor(getColor(R.color.white))
                binding.icNavNotificationNew.setBackgroundColor(getColor(R.color.white))

                manager.replace(R.id.flFragment,settingsFragment)
                    .commit()
            }
            binding.icNavNotificationNew -> {
                binding.icNavNotificationNew.setBackgroundColor(getColor(R.color.icon_bg_color))
                binding.icNavFeedNew.setBackgroundColor(getColor(R.color.white))
                binding.icNavLeaderboardNew.setBackgroundColor(getColor(R.color.white))
                binding.icNavChatNew.setBackgroundColor(getColor(R.color.white))

                manager.replace(R.id.flFragment,notificationFragment)
                    .commit()
            }
        }
    }
}