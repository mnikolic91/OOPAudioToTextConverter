package View.IndexWindow;

import javax.swing.*;

public class MainWindow {
    private JFrame frame;
    private LoginPanel loginPanel;
    private AudioInfoInputPanel audioInfoInputPanel;
    private ConvertPanel convertPanel;

    public MainWindow() {
        frame = new JFrame("Audio to Text Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650, 250);



        // Kreiranje i postavljanje glavnog panela
        JPanel mainPanel = new JPanel();
        //mainPanel.setLayout(new BorderLayout());



        // Dodavanje LoginPanel
        loginPanel = new LoginPanel();
        mainPanel.add(loginPanel);


        // Dodavanje LinkInputPanel
        audioInfoInputPanel = new AudioInfoInputPanel();
        mainPanel.add(audioInfoInputPanel);
        audioInfoInputPanel.setBorder(BorderFactory.createEmptyBorder(25, 100, 25, 200));

        convertPanel = new ConvertPanel();
        mainPanel.add(convertPanel);

        // Postavljanje glavnog panela u okvir
        frame.add(mainPanel);
        frame.setVisible(true);
    }

}



