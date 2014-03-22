package com.example.simplewifi;

import android.app.Activity;
import android.os.Bundle;

import com.example.ToolBox.compassData;
import com.example.ToolBox.inventory;

/*
 * Activity for navigation
 * 
 * This activity is in charge of location finding
 * and navigating the user, with data recorded from
 * 'Capture' activity
 * */

//TODO: needs to split the data recording and 
//navigation into two activities
public class Navigation extends Activity {

	private compassData compassdata;

	@Override
	public void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		setContentView(R.layout.navigate);

		// hook up compass sensor
		inventory.hookCompassData(this);

	}

}
