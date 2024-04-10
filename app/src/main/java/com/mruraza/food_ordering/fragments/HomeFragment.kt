package com.mruraza.food_ordering.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ImageView.ScaleType
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.mruraza.food_ordering.R
import com.mruraza.food_ordering.adaptors.popularAdaptor
import com.mruraza.food_ordering.modals.PopularRecyclerView


class HomeFragment : Fragment() {

    private lateinit var view: View
    private val listofimg = ArrayList<SlideModel>()
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        view = inflater.inflate(R.layout.fragment_home, container, false)
        // Inflate the layout for this fragment
        listofimg.add(SlideModel(R.drawable.banner01,ScaleTypes.FIT))
        listofimg.add(SlideModel(R.drawable.banner02,ScaleTypes.FIT))
        listofimg.add(SlideModel(R.drawable.banner02,ScaleTypes.FIT))
        listofimg.add(SlideModel(R.drawable.banner04,ScaleTypes.FIT))

        val imagesliderrr = view.findViewById<ImageSlider>(R.id.image_slider)
        imagesliderrr.setImageList(listofimg)
        imagesliderrr.setImageList(listofimg,ScaleTypes.FIT)

        imagesliderrr.setItemClickListener(object :ItemClickListener{
            override fun doubleClick(position: Int) {
                TODO("Not yet implemented")
            }

            override fun onItemSelected(position: Int) {
                val imageAtPos = listofimg[position]
                val itemmsg = "Selected Image is $position"
                Toast.makeText(requireContext(),itemmsg,Toast.LENGTH_SHORT).show()
            }
        })


        recyclerView = view.findViewById(R.id.recycler_of_popular_home_frag)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        val popular_items = ArrayList<PopularRecyclerView>()

        popular_items.add(PopularRecyclerView("Thakali",R.drawable.thakali,"350"))
        popular_items.add(PopularRecyclerView("Yomari",R.drawable.yomari,"100"))
        popular_items.add(PopularRecyclerView("Momo",R.drawable.momo,"120"))
        popular_items.add(PopularRecyclerView("SelRoti",R.drawable.sel_roti,"80"))
        popular_items.add(PopularRecyclerView("Thakali",R.drawable.thakali,"350"))
        popular_items.add(PopularRecyclerView("Yomari",R.drawable.yomari,"100"))
        popular_items.add(PopularRecyclerView("Momo",R.drawable.momo,"120"))
        popular_items.add(PopularRecyclerView("SelRoti",R.drawable.sel_roti,"80"))
        popular_items.add(PopularRecyclerView("Thakali",R.drawable.thakali,"350"))
        popular_items.add(PopularRecyclerView("Yomari",R.drawable.yomari,"100"))
        popular_items.add(PopularRecyclerView("Momo",R.drawable.momo,"120"))
        popular_items.add(PopularRecyclerView("SelRoti",R.drawable.sel_roti,"80"))
        popular_items.add(PopularRecyclerView("Thakali",R.drawable.thakali,"350"))
        popular_items.add(PopularRecyclerView("Yomari",R.drawable.yomari,"100"))
        popular_items.add(PopularRecyclerView("Momo",R.drawable.momo,"120"))
        popular_items.add(PopularRecyclerView("SelRoti",R.drawable.sel_roti,"80"))

        val adaptor = popularAdaptor(popular_items,requireContext())
        recyclerView.adapter=adaptor


        val menu_btn:TextView = view.findViewById(R.id.viewMenuInHomeFragTV)

        menu_btn.setOnClickListener {
            val bottomSheetDialogg = MenuBottomSheetFragment()
            bottomSheetDialogg.show(parentFragmentManager,"Test")
        }


        return view
    }


}