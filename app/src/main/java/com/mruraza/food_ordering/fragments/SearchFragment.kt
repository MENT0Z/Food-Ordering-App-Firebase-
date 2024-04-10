package com.mruraza.food_ordering.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mruraza.food_ordering.R
import com.mruraza.food_ordering.adaptors.MenuAdaptor
import com.mruraza.food_ordering.modals.Menu


class SearchFragment : Fragment() {
  private lateinit var view: View
  private val filteredItems = ArrayList<Menu>()
    private lateinit var adaptor : MenuAdaptor
    private val mylist = ArrayList<Menu>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_search, container, false)

        var recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView_search)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val searchView:SearchView = view.findViewById(R.id.search_box_searchfrag)

       
        mylist.add(Menu(R.drawable.thakali,"Thakali","120"))
        mylist.add(Menu(R.drawable.yomari,"Yomari","100"))
        mylist.add(Menu(R.drawable.momo,"Momo","180"))
        mylist.add(Menu(R.drawable.sel_roti,"SelRoti","220"))
        mylist.add(Menu(R.drawable.thakali,"Thakali","120"))
        mylist.add(Menu(R.drawable.yomari,"Yomari","100"))
        mylist.add(Menu(R.drawable.momo,"Momo","180"))
        mylist.add(Menu(R.drawable.sel_roti,"SelRoti","220"))
        mylist.add(Menu(R.drawable.thakali,"Thakali","120"))
        mylist.add(Menu(R.drawable.yomari,"Yomari","100"))
        mylist.add(Menu(R.drawable.momo,"Momo","180"))
        mylist.add(Menu(R.drawable.sel_roti,"SelRoti","220"))


        adaptor = MenuAdaptor(filteredItems,requireContext())
        recyclerView.adapter = adaptor



        searchView.setOnQueryTextListener(object :SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String): Boolean {
                filterMenuItems(query)
                return true
            }

            override fun onQueryTextChange(newText: String): Boolean {
               filterMenuItems(newText)
                return true
            }
        })

        showallmenu()




        return view
    }

    private fun showallmenu() {
        filteredItems.clear()
        filteredItems.addAll(mylist)
        adaptor.notifyDataSetChanged()
    }

    private fun filterMenuItems(query: String) {
        filteredItems.clear()
        mylist.forEachIndexed { index, menu ->
            if(menu.itemName.contains(query,ignoreCase = true)){
                filteredItems.add(menu)
            }
        }
        adaptor.notifyDataSetChanged()
    }


}