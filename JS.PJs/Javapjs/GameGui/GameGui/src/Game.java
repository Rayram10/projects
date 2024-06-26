import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class Game {
  JFrame window;
  Container con;
  JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
  JLabel titleNameLabel, hpLabel, hpLabelNubmer, weaponLabel, weaponLabelName;
  Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
  Font normalFont = new Font("Times New Roman", Font.PLAIN, 30);
  JButton startButton, choice1, choice2, choice3, choice4;
  JTextArea mainTextArea;
  int playerHp;
  String weapon;

  TitleScreenHandler tsHandler = new TitleScreenHandler();

  public static void main(String[] args) {
    new Game();
  }

  public Game() {
    window = new JFrame();
    window.setSize(800, 600);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.getContentPane().setBackground(Color.black);
    window.setLayout(null);
    con = window.getContentPane();

    titleNamePanel = new JPanel();
    titleNamePanel.setBounds(100, 100, 600, 150);
    titleNamePanel.setBackground(Color.black);
    titleNameLabel = new JLabel("Roys Toys");
    titleNameLabel.setFont(titleFont);
    titleNameLabel.setForeground(Color.white);

    startButtonPanel = new JPanel();
    startButtonPanel.setBounds(300, 400, 200, 100);
    startButtonPanel.setBackground(Color.black);

    startButton = new JButton("START");
    startButton.setBackground(Color.black);
    startButton.setForeground(Color.white);
    startButton.setFont(normalFont);
    startButton.addActionListener(tsHandler);
    startButton.setFocusPainted(false);

    titleNamePanel.add(titleNameLabel);
    startButtonPanel.add(startButton);
    con.add(titleNamePanel);
    con.add(startButtonPanel);

    window.setVisible(true);

  }

  public void createGameScreen() {
    titleNamePanel.setVisible(false);
    startButtonPanel.setVisible(false);

    mainTextPanel = new JPanel();
    mainTextPanel.setBounds(100, 100, 600, 250);
    mainTextPanel.setBackground(Color.black);
    con.add(mainTextPanel);

    mainTextArea = new JTextArea("Roy the Toy ");
    mainTextArea.setBounds(100, 100, 600, 250);
    mainTextArea.setBackground(Color.black);
    mainTextArea.setForeground(Color.white);
    mainTextArea.setFont(normalFont);
    mainTextArea.setLineWrap(true);
    mainTextPanel.add(mainTextArea);

    choiceButtonPanel = new JPanel();
    choiceButtonPanel.setBounds(120, 350, 500, 150);
    choiceButtonPanel.setBackground(Color.black);
    choiceButtonPanel.setLayout(new GridLayout(4, 1));
    con.add(choiceButtonPanel);

    choice1 = new JButton("one");
    choice1.setBackground(Color.black);
    choice1.setForeground(Color.white);
    choice1.setFont(normalFont);
    choiceButtonPanel.add(choice1);
    choice1.setFocusPainted(false);

    choice2 = new JButton("two");
    choice2.setBackground(Color.black);
    choice2.setForeground(Color.white);
    choice2.setFont(normalFont);
    choiceButtonPanel.add(choice2);
    choice2.setFocusPainted(false);

    choice3 = new JButton("three");
    choice3.setBackground(Color.black);
    choice3.setForeground(Color.white);
    choice3.setFont(normalFont);
    choiceButtonPanel.add(choice3);
    choice3.setFocusPainted(false);

    choice4 = new JButton("four");
    choice4.setBackground(Color.black);
    choice4.setForeground(Color.white);
    choice4.setFont(normalFont);
    choiceButtonPanel.add(choice4);
    choice4.setFocusPainted(false);

    playerPanel = new JPanel();
    playerPanel.setBounds(100, 15, 600, 50);
    playerPanel.setBackground(Color.black);
    playerPanel.setLayout(new GridLayout(1, 4));
    con.add(playerPanel);
    hpLabel = new JLabel("HP:");
    hpLabel.setFont(normalFont);
    hpLabel.setForeground(Color.white);
    playerPanel.add(hpLabel);
    hpLabelNubmer = new JLabel();
    hpLabelNubmer.setFont(normalFont);
    hpLabelNubmer.setForeground(Color.white);
    playerPanel.add(hpLabelNubmer);
    weaponLabel = new JLabel("Weapon:");
    weaponLabel.setFont(normalFont);
    weaponLabel.setForeground(Color.white);
    playerPanel.add(weaponLabel);
    weaponLabelName = new JLabel();
    weaponLabelName.setFont(normalFont);
    weaponLabelName.setForeground(Color.white);
    playerPanel.add(weaponLabelName);

    playerSetup();

  }

  public class TitleScreenHandler implements ActionListener {

    public void actionPerformed(ActionEvent event) {
      createGameScreen();

    }

  }

  public void playerSetup() {
    playerHp = 15;
    weapon = "Sword";
    weaponLabelName.setText(weapon);
    hpLabelNubmer.setText("" + playerHp);

    startPoint();

  }

  public void startPoint() {
    mainTextArea
        .setText("You wake up in the middle of the forest and see a knight standing over you. \nWhat do you do next?");
    choice1.setText("Ask the knight what happened");
    choice2.setText("Attack knight");
    choice3.setText("Nothing");
    choice4.setText("");

  }

}
