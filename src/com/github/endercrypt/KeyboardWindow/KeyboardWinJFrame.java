package com.github.endercrypt.KeyboardWindow;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class KeyboardWinJFrame extends JFrame implements KeyListener
{
	private List<KeyWinListener> listeners = new ArrayList<>();
	private List<Integer> keysDown = new ArrayList<>();
	public KeyboardWinJFrame(Color color)
	{
		setBackground(color);
		setSize(100, 100);
		addKeyListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	public void updateListeners()
	{
		// create new KeysDownData
		KeysDownData kdd = new KeysDownData(keysDown);
		// activate listeners
		for (KeyWinListener listener: listeners)
		{
			listener.keyDown(kdd);
		}
	}
	public void addListener(KeyWinListener listener)
	{
		listeners.add(listener);
	}
	@Override
	public void keyTyped(KeyEvent e)
	{
		// ignore
	}
	@Override
	public void keyPressed(KeyEvent e)
	{
		// add key to keysDown
		int key = e.getKeyCode();
		if (!keysDown.contains(key))
		{
			keysDown.add(key);
		}
		// activate listeners
		for (KeyWinListener listener: listeners)
		{
			listener.keyPressed(e);
		}
	}
	@Override
	public void keyReleased(KeyEvent e)
	{
		// remove key from keysDown
		int key = e.getKeyCode();
		int location = keysDown.lastIndexOf(key);
		if (location > -1)
		{
			keysDown.remove(location);
		}
		// activate listeners
		for (KeyWinListener listener: listeners)
		{
			listener.keyReleased(e);
		}
	}
}
