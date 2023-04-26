package com.lmg.nlp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class input {

        private JFrame frame;
        private JTextArea inputTextArea;
        private JTextArea outputTextArea;
        private JButton processButton;

        public input() {
            createUI();
        }

        private void createUI() {
            frame = new JFrame("NLP Application");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 500);

            // Create input text area
            inputTextArea = new JTextArea();
            inputTextArea.setLineWrap(true);
            inputTextArea.setWrapStyleWord(true);

            // Create output text area
            outputTextArea = new JTextArea();
            outputTextArea.setLineWrap(true);
            outputTextArea.setWrapStyleWord(true);
            outputTextArea.setEditable(false);

            // Create process button
            processButton = new JButton("Process");
            processButton.setSize(10,5);
            processButton.setPreferredSize(new Dimension(10, 5));
            processButton.setBackground(Color.blue);
            processButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Perform NLP processing on input text and display results in output text area
                    String inputText = inputTextArea.getText();
                    String outputText = processInputText(inputText);
                    outputTextArea.setText(outputText);
                }
            });

            // Add components to frame
            JPanel panel = new JPanel(new GridLayout(3, 1));
            panel.add(new JScrollPane(inputTextArea));
            panel.add(processButton);
            panel.add(new JScrollPane(outputTextArea));
            frame.getContentPane().add(panel);

            frame.setVisible(true);
        }

        private String processInputText(String inputText) {
            // Perform NLP processing on input text and return results as a string
            return "Processed output for input text: " + inputText;
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    new input();
                }
            });
        }
    }


