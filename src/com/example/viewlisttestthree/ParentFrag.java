package com.example.viewlisttestthree;

import android.app.Fragment;
import android.os.Bundle;
import android.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ParentFrag extends Fragment {
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
    	//whether to create new fragment
    	boolean shouldCreateChild = getArguments().getBoolean("CreateAChildFrag");

        if (shouldCreateChild) {
            FragmentTransaction ftrans = getFragmentManager().beginTransaction();

            ParentFrag ChildFrag = new ParentFrag();
            Bundle arguments = new Bundle();
            arguments.putBoolean("CreateAChildFrag", false);
            ChildFrag.setArguments(arguments);
            
            ftrans.add(R.id.inside_frag , ChildFrag );
            ftrans.commit();
        }
    	
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.parent_container, container, false);
    }

}
