package com.example.upalumniapp;

import java.util.ArrayList;
import com.example.upalumniapp.util.SystemUiHider;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;


public class ViewNews extends Activity{
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.news_read);

	    /*ActionBar actionBar = getActionBar();
	    actionBar.setDisplayHomeAsUpEnabled(true);
	    
		mDbHelper = new BookmarkDbAdapter(this);
		mDbHelper.open();
		mDbHelper.updateBookmark();
		mDbHelper.close();
		
		TabHost tabHost = getTabHost();

		TabSpec favorites = tabHost.newTabSpec("Favorites");
		favorites.setIndicator("Favorites");
		Intent favoriteIntent = new Intent(this, FavoritesTab.class);
		favorites.setContent(favoriteIntent);

		TabSpec borrowed = tabHost.newTabSpec("Borrowed");
		borrowed.setIndicator("Borrowed");
		Intent borrowIntent = new Intent(this, BorrowedTab.class);
		borrowed.setContent(borrowIntent);

		TabSpec overdue = tabHost.newTabSpec("Overdue");
		overdue.setIndicator("Overdue");
		Intent overdueIntent = new Intent(this, OverdueTab.class);
		overdue.setContent(overdueIntent);

		tabHost.addTab(favorites);
		tabHost.addTab(borrowed);
		tabHost.addTab(overdue);*/
	}
}
