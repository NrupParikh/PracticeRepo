package com.nrup.practice.ui

import com.nrup.practice.base.BaseActivity
import com.nrup.practice.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun setBinding(): ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
}