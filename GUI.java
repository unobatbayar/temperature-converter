import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//@author unobatbayar

public class GUI 
{
    public void createUI()
    {    
		JFrame frame =new JFrame("temperature-converter"); 
		frame.setLocationRelativeTo(null); 

		//Button (x, y, width, height)
		JButton b = new JButton("Convert");    
		b.setBounds(95,190,130, 40);    

		//Labels
		JLabel celsius_label = new JLabel();
		celsius_label.setText("Celsius");
		celsius_label.setBounds(45, -25, 100, 100);

		JLabel fahrenheit_label = new JLabel();
		fahrenheit_label.setText("Fahrenheit");
		fahrenheit_label.setBounds(45, 15, 100, 100);
		
		JLabel kelvin_label = new JLabel();
		kelvin_label.setText("Kelvin");
		kelvin_label.setBounds(45, 55, 100, 100);
								
		JLabel rankine_label = new JLabel();
		rankine_label.setText("Rankine");
		rankine_label.setBounds(45, 95, 100, 100);

		//Symbol labels
		JLabel celsius_symbol = new JLabel();
		celsius_symbol.setText("°C");
		celsius_symbol.setBounds(260, -25, 50, 100);

		JLabel fahrenheit_symbol = new JLabel();
		fahrenheit_symbol.setText("°F");
		fahrenheit_symbol.setBounds(260, 15, 100, 100);
		
		JLabel kelvin_symbol = new JLabel();
		kelvin_symbol.setText(" K");
		kelvin_symbol.setBounds(260, 55, 100, 100);
								
		JLabel rankine_symbol = new JLabel();
		rankine_symbol.setText("°R");
		rankine_symbol.setBounds(260, 95, 100, 100);

		//Input fields
		JTextField celsius= new JTextField();
		celsius.setBounds(125, 10, 130, 30);

		JTextField fahrenheit= new JTextField();
		fahrenheit.setBounds(125, 50, 130, 30);

		JTextField kelvin= new JTextField();
		kelvin.setBounds(125, 90, 130, 30);

		JTextField rankine= new JTextField();
		rankine.setBounds(125, 130, 130, 30);
					
		//Add labels
		frame.add(celsius_label);
		frame.add(fahrenheit_label);
		frame.add(kelvin_label);
		frame.add(rankine_label);

		//Add symbol lables
		frame.add(celsius_symbol);
		frame.add(fahrenheit_symbol);
		frame.add(kelvin_symbol);
		frame.add(rankine_symbol);

		//Add input fields
		frame.add(celsius);
		frame.add(fahrenheit);
		frame.add(kelvin);
		frame.add(rankine);

		//Add button 
		frame.add(b);  

		//Frame
		frame.setSize(320, 280);    
		frame.setLayout(null);    
		frame.setVisible(true);    
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   

		//Action listener
		b.addActionListener(new ActionListener() {
	    	@Override
			public void actionPerformed(ActionEvent arg0) {
				Converter converter = new Converter();
				double c = 0, f = 0, k = 0, r = 0;

				if(b.getText() == "Convert"){
					if(!(celsius.getText().isEmpty())){
						c = Double.parseDouble(celsius.getText());
						f = converter.toFarenheit(c);
						k = converter.toKelvin(f);
						r = converter.toRankine(k);
					}
					else if(!(fahrenheit.getText().isEmpty())){
						f = Double.parseDouble(fahrenheit.getText());
						k = converter.toKelvin(f);
						r = converter.toRankine(k);
						c = converter.toCelcius(r);
					}
					else if (!(kelvin.getText().isEmpty())){
						k = Double.parseDouble(kelvin.getText());
						r = converter.toRankine(k);
						c = converter.toCelcius(r);
						f = converter.toFarenheit(c);
					}
					else if (!(rankine.getText().isEmpty())){
						r = Double.parseDouble(rankine.getText());
						c = converter.toCelcius(r);
						f = converter.toFarenheit(c);
						k = converter.toKelvin(f);
					}
					if(!(celsius.getText().isEmpty()) || !(fahrenheit.getText().isEmpty()) || !(kelvin.getText().isEmpty()) || !(rankine.getText().isEmpty())){
						celsius.setText(Double.toString(c));
						fahrenheit.setText(Double.toString(f));
						kelvin.setText(Double.toString(k));
						rankine.setText(Double.toString(r));
						b.setText("Reset");	
					}
				}
				else { 
					celsius.setText("");
					fahrenheit.setText("");
					kelvin.setText("");
					rankine.setText("");
					b.setText("Convert");
				}
			}          
	    });
	}         
        public static void main(String[] args){
					//nothing
				}    
}
