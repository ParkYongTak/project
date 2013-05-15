package com.shinsegae.android.scarte;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.DigitalClock;
import android.widget.ImageView;

public class MainActivity extends Activity {

	private static final String URL = "http://www.sinc.co.kr/Upload/BuildCase_20120810083952_1.JPG";
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		DigitalClock dc = (DigitalClock) findViewById(R.id.clock);

		ImageView imageView = (ImageView) findViewById(R.id.image_view);
		ImageDownloader.download(URL, imageView);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
