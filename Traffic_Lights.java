package tr_signals;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.TimerTask;
import java.util.Timer;

import javax.swing.*;

class Traffic_Lights extends JFrame implements ItemListener{
	// creation of instances of JFrame, JPanel, JLabel, ButtonGroup, TextField and time and also import TimerTask into java.util package
	JFrame frame;
	JPanel messageContainer;
	JPanel lightsContainer;
	JLabel message;
	ButtonGroup btn;
	JRadioButton red_btn, yellow_btn, green_btn;
	TextField msgBox;
	java.util.TimerTask task;
	Timer time;
	// creation of java method called frameFigure
	public void framefigure()
	{
		// set a TextField with object name called msgBox and setBounds of msgBox
		msgBox = new TextField();
		msgBox.setBounds(150, 150, 150, 30);
		// create and instance of Font to set text from msgBox in font colour
		Font myFont = new Font("Serif",Font.ITALIC,28);
		Font font = new Font("Serif",Font.BOLD,18);
		msgBox.setFont(myFont);
		// create a frame with traffic lights name
		frame = new JFrame("Traffic Lights");
		// creation of Panel with messageContainer that hold signal word as usual and lightsContainer that will hold signal sign
		messageContainer = new JPanel();
		lightsContainer = new JPanel();
		// creation of label in a frame with a Traffic_Light_Signals and set font colour the message
		message = new JLabel("Traffic_Light_Signals");
		message.setFont(myFont);
		// creation of button 
		btn = new ButtonGroup();
		// Naming radioButton by its specific name and set the font colour to them
		red_btn = new JRadioButton("Red_light");
		red_btn.setFont(font);
		yellow_btn= new JRadioButton("Yellow_light");
		yellow_btn.setFont(font);
		green_btn = new JRadioButton("Green_light");
		green_btn.setFont(font);
		// set layout of frame and Foreground of radioButton(red_btn, yellow_btn, green_btn)
		frame.setLayout(new GridLayout(3, 2));
		red_btn.setForeground(Color.RED);
		yellow_btn.setForeground(Color.YELLOW);
		green_btn.setForeground(Color.GREEN);
		// addition of button into radioButton
		btn.add(red_btn);
		btn.add(yellow_btn);
		btn.add(green_btn);
		// using addItemListerner(this) to refer the radiButton selected
		red_btn.addItemListener(this);
		yellow_btn.addItemListener(this);
		green_btn.addItemListener(this);
		//demonstrate the message in the frame by message container
		messageContainer.add(message);
		// list container reveal the signals from red_button, yellow_button and green_button into the frame
		lightsContainer.add(red_btn);
		lightsContainer.add(yellow_btn);
		lightsContainer.add(green_btn);
		// add messageContainer, lightsContainer and msgBox into the frame
		frame.add(messageContainer);
		frame.add(lightsContainer);
		frame.add(msgBox);
		// set size and Visible of frame		
		frame.setSize(700, 200);
		frame.setVisible(true);
		// instance of timer
		time = new Timer();
    }
	// overriding framefigure method and use getSource to determine which button was clicked 
	@Override
	public void itemStateChanged(ItemEvent ie) {
		JRadioButton selected = (JRadioButton) ie.getSource();
		// assigning selected.getText to textOnButton variable name
		String textOnButton = selected.getText();
		// if condition to check if button clicked is equal to Red_light and set a foreground of its colour
		if(textOnButton.equals("Red_light")) {
			msgBox.setForeground(Color.RED);
		}
		// if condition to check if button clicked is equal to yellow_light and set a foreground of its colour
		else if(textOnButton.equals("Yellow_light")) {
			msgBox.setForeground(Color.YELLOW);
		} else {
			msgBox.setForeground(Color.GREEN);
		}
	//creating an instance of task to be scheduled
	task = new TimerTask() {
	public void run() {
	/*if condition to check if textOnButton equal to Red_light, yellow and Green_light, 
	 * if it's equal it will immediately present the message into msgBox and use
	 * time.Schecudule with two argument task and specific seconds, in this program
	 * i used millisecond which is equal to second required in question
	 */
		if(textOnButton.equals("Red_light")) {
		msgBox.setText("STAY IN THE QUEUE");
	}
		}
};time.schedule(task, 20000);
task = new TimerTask() {
	public void run() {
		if(textOnButton.equals("Yellow_light")) {
			msgBox.setText("GO one by one every two seconds");
			}
		}
};time.schedule(task, 10000);
task = new TimerTask() {
	public void run() {
		if(textOnButton.equals("Green_light")) {
			msgBox.setText("GO one by one every second");
			}
		}
};time.schedule(task, 30000);

}}
// creation of child class called Cars inheriting to parent class Traffic_Lights
	class Cars extends Traffic_Lights{
		int car_length; // variable declaration of car_length variable name
//		String signal = " "; // Initialise empty value to signal variable
		// array list declaration with car_collection array name that hold the all cars from Queue through addition of all
		ArrayList<Integer> car_collection = new ArrayList<Integer>();
		// java method creation with signal method name
			public void Signal()
			{
				//creation of rand object from random package helps to generate the random car, let assume car coming are between 1 and 200
				Random car_rand = new Random();
				//creation of random_carNumber to hold generalised number used nextInt() method
				int random_carNumber = car_rand.nextInt(1, 200);
				// statement printing all random cars
				System.out.println("all cars coming to be stored in the collection are " + random_carNumber);
				System.out.println("car random number added in ArrayList collection is");
				// using for loop to add the cars in Queue
				for (int i = 1; i <= random_carNumber; i ++) 
				{
					// creation of Queue by cars variable name
					Queue<Integer> cars = new PriorityQueue<Integer>();
					// use add function to add car in queue
					cars.add(i);
					// add all cars from Queue to car_collectio variable name of array
					car_collection.addAll(cars);
					// create a car_length variable to hold the size cars in the array 
					car_length = car_collection.size();
					// if condition to check if size is greater than 100, if its greater than 100 it will stop to add the cars in the collection
					if (car_length > 100)
					{
					System.out.println("WARNING!");
					System.out.println("stop adding the cars into the collection it's already 100 cars");
					System.exit(0);
				}
					/*if condition checked size is less than or equal to 100, will print the car collected in the collection
					 * else print no cars in the collection
					 */
					else if (car_length <= 100) {
						System.out.println(car_collection);
						
					}
					else
					{
						System.out.println("no cars in the collection");


					}
				}}
			// creation of method
			public void GreenLight() throws InterruptedException {
				// assign 0 to index variable name
				int index = 0;
				// create variable name called index and initialise to index plus 0
				index = index + 0;
				System.out.println("\n");
				System.out.println("\n");
				System.out.println(" FOR GREEN LIGHT SIGN");
				// using while loop iterate car from collection
				while (car_length <= 100)
				{
					// if condition to check if car_length equal to zero, and print out all has taken off into the collection 
					if (car_length == 0)
					{
						System.out.println("all car has taken off into the collection");
						break;
					} 
					else{
						// use remove function to remove cars into the collection once the signal light green or yellow
						car_collection.remove(index);
						System.out.println("cars permitted to move after one by one after seconds \n" + car_collection);
						Thread.sleep(1000);
					}
					car_length = car_length - 1; // subtract(remove) one car till collection remain empty
					
				}					

			}
			public void YellowLight() throws InterruptedException {
				// assign 0 to index variable name
				int index = 0;
				// create variable name called index and initialise to index plus 0
				index = index + 0;
				System.out.println("\n");
				System.out.println("\n");
				System.out.println(" FOR YELLOW LIGHT SIGN");
				// using while loop iterate car from collection
				while (car_length <= 100)
				{
					// if condition to check if car_length equal to zero, and print out all has taken off into the collection 
					if (car_length == 0)
					{
						System.out.println("all car has taken off into the collection");
						break;
					} 
					else{
						// use remove function to remove cars into the collection once the signal light green or yellow
						car_collection.remove(index);
						System.out.println("cars permitted to move after one by one after two seconds \n" + car_collection);
						Thread.sleep(2000);
					}
					car_length = car_length - 1; // subtract(remove) one car till collection remain empty
					
				}					
			}
			// creation of method and print No Car permitted to move once signal light red
			public void redlight() {
				System.out.println("\n");
				System.out.println("FOR RED LIGHT");
				
					System.out.println("NO Car permitted to move");
				}
// creation of main method
	public static void main(String[] args) throws InterruptedException {
		// creation of object of Traffic_Lights 
		Traffic_Lights obj = new Traffic_Lights();
		// Access framefigure method
		obj.framefigure();
		// creation of object of Cars 
		Cars obj1 = new Cars();
		// Access methods of Cars class
		obj1.Signal();
		obj1.GreenLight();
		obj1.YellowLight();
		obj1.redlight();
		
	}

}

	
	

