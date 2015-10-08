package test;

import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;

import com.github.endercrypt.KeyboardWindow.KeyWinListener;
import com.github.endercrypt.KeyboardWindow.KeyboardWindow;
import com.github.endercrypt.KeyboardWindow.KeysDownData;

public class Main
{
	public static void main(String[] args)
	{
		KeyboardWindow kw = new KeyboardWindow();
		kw.addListener(new KeyWinListener()
		{
			
			@Override
			public void keyReleased(KeyEvent e)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e)
			{
				// TODO Auto-generated method stub
			}
			
			@Override
			public void keyDown(KeysDownData e)
			{
				// TODO Auto-generated method stub
				if (e.isKeyDown(KeyEvent.VK_W))
				{
					System.out.println("up");
				}
			}
		});
		Timer timer = new Timer();
		timer.schedule(new TimerTask()
		{
			@Override
			public void run()
			{
				kw.updateListeners();
			}
		}, 0, (1000/1));
	}
}
