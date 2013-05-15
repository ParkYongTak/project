package com.shinsegae.android.scarte;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.DigitalClock;
import android.widget.ImageView;

public class MainActivity extends Activity {

	private static final String URL = "http://www.sinc.co.kr/Upload/BuildCase_20120810083952_1.JPG";
	//private static final String URL = "http://theeye.pe.kr/attach/1/1149348246.png";
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		DigitalClock dc = (DigitalClock) findViewById(R.id.clock);
		// what can i do with DigitalClock also? for display only

		ImageView imageView = (ImageView) findViewById(R.id.image_view);
		ImageDownloader.download(URL, imageView);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
