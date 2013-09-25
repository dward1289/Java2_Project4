package com.DevonaWard.java2_project1;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainFragment extends Fragment {
	
	private mainListener listener;
	
	public interface mainListener{
		public void onService();
		public void onNewAct();
		public void onAboutStart();
	}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
			super.onCreateView(inflater, container, savedInstanceState);
			
			LinearLayout view = (LinearLayout)inflater.inflate(R.layout.activity_main, container,false);
			
			Button goButton = (Button) view.findViewById(R.id.goBtn);
			goButton.setOnClickListener(new OnClickListener(){
			//On click for the "Go" button
			public void onClick(View view) {
				listener.onService();	
				}
			});
			
			Button goAct = (Button) view.findViewById(R.id.aboutBtn);
			goAct.setOnClickListener(new OnClickListener(){
			//New Activity called from onClick
			public void onClick(View view){
				listener.onNewAct();
				}
			});
			
			Button moreBtn = (Button) view.findViewById(R.id.moreBtn);
			moreBtn.setOnClickListener(new OnClickListener(){
			//Start About Intent (Implicit Intent)
			public void onClick(View view){
				listener.onAboutStart();
				}
			});
			return view;
		};
		
		
	@Override
	public void onAttach(Activity activity){
		super.onAttach(activity);
		try{
			listener = (mainListener) activity;
		} catch(ClassCastException e){
			throw new ClassCastException(activity.toString()+ "must implement mainListener");
		}
	}
}
