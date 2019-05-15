package com.cs.study

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentPagerAdapter
import android.support.v7.app.AppCompatActivity
import com.cs.study.fragment.MarkFragment
import com.cs.study.fragment.RadarFragment
import com.cs.study.fragment.StepViewFragment
import com.cs.study.fragment.StickyRecyclerViewFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var titles = arrayOf("评分", "城市列表", "时光轴", "雷达图")

    var fragments = arrayListOf(MarkFragment(), StickyRecyclerViewFragment(), StepViewFragment(), RadarFragment())


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        viewpager.adapter = object : FragmentPagerAdapter(supportFragmentManager) {

            override fun getItem(position: Int): Fragment {
                return fragments[position]
            }

            override fun getCount(): Int {
                return fragments.size
            }

            override fun getPageTitle(position: Int): CharSequence? {
                return titles[position]
            }
        }

        tablayout.setupWithViewPager(viewpager)


    }


}
