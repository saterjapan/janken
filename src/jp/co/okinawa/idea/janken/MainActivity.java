package jp.co.okinawa.idea.janken;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends Activity
{

	/*** プロパティ ***/

	private ImageButton btn_gu;
	private ImageButton btn_choki;
	private ImageButton btn_pa;


	/*** コンストラクタ ***/

	@Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* 「グー」ボタンの処理 */
        btn_gu = (ImageButton)findViewById(R.id.btn_gu);
        btn_gu.setOnClickListener
        (
        	new OnClickListener()
        	{
				@Override
				public void onClick(View v)
				{
					// TODO: 処理を記述すること
				}
        	}
        );

        /* 「チョキ」ボタンの処理 */
        btn_choki = (ImageButton)findViewById(R.id.btn_choki);
        btn_choki.setOnClickListener
        (
        	new OnClickListener()
        	{
				@Override
				public void onClick(View v)
				{
					// TODO: 処理を記述すること
				}
        	}
        );

        /* 「パー」ボタンの処理 */
        btn_pa = (ImageButton)findViewById(R.id.btn_pa);
        btn_pa.setOnClickListener
        (
        	new OnClickListener()
        	{
				@Override
				public void onClick(View v)
				{
					// TODO: 処理を記述すること
				}
        	}
        );

    }


	/*** メニュー ***/

	@Override
    public boolean onCreateOptionsMenu(Menu menu)
    {

		getMenuInflater().inflate(R.menu.main, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {

    	int id = item.getItemId();

    	/* サーバー */
    	if (id == R.id.item1)
        {
            return true;
        }

    	/* クライアント */
    	if (id == R.id.item2)
        {
            return true;
        }

    	/* やめる */
    	if (id == R.id.item3)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);

    }

}
