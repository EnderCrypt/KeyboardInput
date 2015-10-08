package com.github.endercrypt.KeyboardWindow;

import java.awt.Color;

public class KeyboardWindow
{
	KeyboardWinJFrame window;
	public KeyboardWindow()
	{
		this(Color.BLACK);
	}
	public KeyboardWindow(Color color)
	{
		window = new KeyboardWinJFrame(Color.BLACK);
	}
	public void addListener(KeyWinListener listener)
	{
		window.addListener(listener);
	}
	public void updateListeners()
	{
		window.updateListeners();
	}
}
