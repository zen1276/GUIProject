package gui.view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import gui.controller.GUIController;

public class FirstPanel
{
	private GUIController appController;
	private JButton myButton;
	private JLabel myLabel;
	private SpringLayout appLayout;
	
	public FirstPanel(GUIController appController)
	{
		super();
		this.appController = appController;
		myButton = new JButton("Click");
		myLabel = new JLabel("Labelllll");
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayoutt(appLayout);
		this.add(myButton);
		this.add(myLabel);
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, myLabel, 74, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST,  myLabel,  -86,  SpringLayout.EAST,  this);
		appLayout.putConstraint(SpringLayout.WEST,  myButton,  174,  SpringLayout.WEST,  this);
		appLayout.putConstraint(SpringLayout.SOUTH,  myButton,  -135,  SpringLayout.SOUTH,  this);
	}

	private void changeColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
	}
	
	
	
	private void setupListeners()
	{
		myButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				changeColor();
			}
		}
	}




}





