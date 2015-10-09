package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
	    Parse.initialize(this, 
	    	"8dLxoQJekV7x4QYF10YUXeTyL3esAyZtiluNhd5V",
	    	"f38tCUxJQGl0EZMKJkLGxCiwWh2VMJZla3lw0nkR");
	}
}
