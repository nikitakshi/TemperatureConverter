import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverterGUI extends JFrame implements ActionListener {
    private JTextField inputField;
    private JLabel outputCelsiusLabel, outputFahrenheitLabel, outputKelvinLabel;

    public TemperatureConverterGUI() {
        setTitle("Temperature Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        inputField = new JTextField(10);
        JButton convertButton = new JButton("Convert");
        convertButton.addActionListener(this);

        outputCelsiusLabel = new JLabel("Celsius: ");
        outputFahrenheitLabel = new JLabel("Fahrenheit: ");
        outputKelvinLabel = new JLabel("Kelvin: ");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));
        panel.add(new JLabel("Enter Temperature: "));
        panel.add(inputField);
        panel.add(outputCelsiusLabel);
        panel.add(outputFahrenheitLabel);
        panel.add(outputKelvinLabel);
        panel.add(convertButton);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double celsius = Double.parseDouble(inputField.getText());
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;

        outputCelsiusLabel.setText("Celsius: " + celsius);
        outputFahrenheitLabel.setText("Fahrenheit: " + fahrenheit);
        outputKelvinLabel.setText("Kelvin: " + kelvin);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TemperatureConverterGUI());
    }
}
