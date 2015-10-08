package com.github.endercrypt.KeyboardWindow;

import java.util.List;

public class KeysDownData
{
	final List<Integer> keysDown;
	public KeysDownData(List<Integer> keysDown)
	{
		this.keysDown = keysDown;
	}
	public boolean isKeyDown(int keyDown)
	{
		for (int key:keysDown)
		{
			if (keyDown == key)
			{
				return true;
			}
		}
		return false;
	}
	public String toString()
	{
		return keysDown.toString();
	}
}
