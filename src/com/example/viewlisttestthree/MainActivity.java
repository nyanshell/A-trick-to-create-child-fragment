package com.example.viewlisttestthree;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//set Main fragment
		FragmentTransaction fragTrans = getFragmentManager().beginTransaction();
		ParentFrag testFrag = new ParentFrag();
		
		//create child fragment
        Bundle arguments = new Bundle();
        arguments.putBoolean("CreateAChildFrag", true );
        testFrag.setArguments(arguments);
		
        //commit fragment
		fragTrans.add(R.id.main_activity , testFrag );
		fragTrans.commit();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
