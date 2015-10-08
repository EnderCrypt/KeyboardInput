package com.github.endercrypt.KeyboardWindow;

import java.awt.event.KeyEvent;

public interface KeyWinListener
{
	public void keyPressed(KeyEvent e);
	public void keyReleased(KeyEvent e);
	public void keyDown(KeysDownData e);
}
