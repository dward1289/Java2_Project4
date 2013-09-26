package com.DevonaWard.java2_project1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;

public class SecondFragment extends Fragment {
Bundle data;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		super.onCreateView(inflater, container, savedInstanceState);
		
		LinearLayout view = (LinearLayout)inflater.inflate(R.layout.second_activity, container,false);
	
		
		WebView myWebView = (WebView) view.findViewById(R.id.webview);
		//Fit content in web view. Found at http://pastebin.com/UkzM15QH
				myWebView.setInitialScale(100);
				myWebView.loadUrl("http://search.espn.go.com/nba");
		return view;
	};

}
