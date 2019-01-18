import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConversaoTemperaturaFrame extends JFrame {
	
	
	private final JTextField fahrenheit;
	private final JLabel celsius;
	private final JLabel labelFahrenheit;
	private final JPanel panelFahrenheit;
	private final JPanel panelCelsius;
	
	public ConversaoTemperaturaFrame() {
		
		super("Conversão de Temperatura:");
		setLayout(new GridLayout(2, 1));
		
		labelFahrenheit = new JLabel("Fahrenheit:");
		fahrenheit = new JTextField(3);
		celsius = new JLabel("Celsius");
		panelFahrenheit = new JPanel();
		panelCelsius = new JPanel();
		
		panelFahrenheit.setLayout(new FlowLayout());
		panelCelsius.setLayout(new FlowLayout());
		
		panelFahrenheit.add(labelFahrenheit);
		panelFahrenheit.add(fahrenheit);
		
		panelCelsius.add(celsius);
		
		add(panelFahrenheit);
		add(panelCelsius);
		
	}
	
}
