package com.curevivepatient.app.modules.homeactivity.data

import CardAdapter
import CardRotationItemDecoration
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.curevivepatient.app.R
import com.curevivepatient.app.appcomponents.base.BaseFragment
import com.curevivepatient.app.databinding.FragmentHomeBinding
import com.curevivepatient.app.modules.homeactivity.UserprofileAdapter
import com.curevivepatient.app.modules.homeactivity.ViewhierarchyAdapter
import com.curevivepatient.app.modules.homeactivity.data.model.UserprofileRowModel
import com.curevivepatient.app.modules.homeactivity.data.model.ViewhierarchyRowModel
import com.praveensapplication.app.modules.home.data.viewmodel.HomeVM

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {


    private val viewModel: HomeVM by viewModels<HomeVM>()
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override lateinit var binding: FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onInitialized() {
        val intent = requireActivity().intent // Accessing the intent property here is valid
        viewModel.navArguments = intent.extras?.getBundle("bundle")
        val viewhierarchyAdapter =
            ViewhierarchyAdapter(viewModel.viewhierarchyList.value ?: mutableListOf())
        binding.recyclerViewhierarchy.adapter = viewhierarchyAdapter
        viewhierarchyAdapter.setOnItemClickListener(
            object : ViewhierarchyAdapter.OnItemClickListener {
                override fun onItemClick(view: View, position: Int, item: ViewhierarchyRowModel) {
                    onClickRecyclerViewhierarchy(view, position, item)
                }
            }
        )
        viewModel.viewhierarchyList.observe(this) {
            viewhierarchyAdapter.updateData(it)
        }
        val userprofileAdapter =
            UserprofileAdapter(viewModel.userprofileList.value ?: mutableListOf())
        binding.recyclerUserprofile.adapter = userprofileAdapter
        userprofileAdapter.setOnItemClickListener(
            object : UserprofileAdapter.OnItemClickListener {
                override fun onItemClick(view: View, position: Int, item: UserprofileRowModel) {
                    onClickRecyclerUserprofile(view, position, item)
                }
            }
        )
        viewModel.userprofileList.observe(this) {
            userprofileAdapter.updateData(it)
        }

        val items = listOf("Aroma Therapy", "Yoga", "Meditation", "Spa", "Therapy Session")

        val recyclerView: RecyclerView = binding.recyclerview
        recyclerView.layoutManager = LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = CardAdapter(items)
        recyclerView.addItemDecoration(CardRotationItemDecoration())

        // Attach LinearSnapHelper
        val snapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(recyclerView)




        binding.homeVM = viewModel
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun setUpClicks() {

    }


    fun onClickRecyclerViewhierarchy(
        view: View,
        position: Int,
        item: ViewhierarchyRowModel
    ): Unit {
        when(view.id) {
        }
    }

    fun onClickRecyclerUserprofile(
        view: View,
        position: Int,
        item: UserprofileRowModel
    ): Unit {
        when(view.id) {
        }
    }



    companion object {

        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}