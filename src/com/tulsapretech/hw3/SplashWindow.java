package com.tulsapretech.hw3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.SplashScreen;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class SplashWindow extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public SplashWindow() {
		JWindow window = new JWindow();
		window.getContentPane().add(
		    new JLabel("", new ImageIcon(new URL("http://docs.oracle.com/javase/tutorial/uiswing/examples/misc/SplashDemoProject/src/misc/images/splash.gif")), SwingConstants.CENTER));
		window.setBounds(500, 150, 300, 200);
		window.setVisible(true);
		try {
		    Thread.sleep(5000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		window.setVisible(false);
		JFrame frame = new JFrame();
		frame.add(new JLabel("Welcome to MyCar HW3"));
		frame.setVisible(true);
		frame.setSize(300,100);
		window.dispose();
	}

}
