package app.web.localhost;

import android.app.*;
import android.os.*;
import android.webkit.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity 
{
	WebView wv;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		wv = findViewById(R.id.mainWebView);
		wv.getSettings().setJavaScriptEnabled(true);
		wv.loadUrl("http://localhost:3000");
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main_menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		if (item.getItemId() == R.id.mainRefresh) {
			Toast.makeText(this, "Refreshing...", Toast.LENGTH_SHORT).show();
			wv.reload();
		}
		return super.onOptionsItemSelected(item);
	}
}
