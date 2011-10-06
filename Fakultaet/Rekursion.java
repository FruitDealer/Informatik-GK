import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.math.*;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 21.09.2011
  * @author  Martin Engelking
  */

public class Rekursion extends JFrame {
  // Anfang Attribute
  private Label label1 = new Label();
  private NumberField eingabeFeld = new NumberField();
  private Label label2 = new Label();
  private Button fibonaccilButton = new Button();
  private Button fakultaetButton = new Button();
  private Button button1 = new Button();
  // Ende Attribute

  public Rekursion(String title) {
    // Frame-Initialisierung
    super(title);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 488; 
    int frameHeight = 198;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten

    label1.setBounds(16, 72, 75, 25);
    label1.setText("Eingabe");
    label1.setFont(new Font("Fixedsys", Font.BOLD, 16));
    cp.add(label1);
    eingabeFeld.setBounds(104, 72, 353, 25);
    eingabeFeld.setText("");
    cp.add(eingabeFeld);
    label2.setBounds(16, 8, 451, 49);
    label2.setText("Ergebnis: ");
    label2.setFont(new Font("Fixedsys", Font.BOLD, 22));
    cp.add(label2);
    fibonaccilButton.setBounds(16, 112, 161, 33);
    fibonaccilButton.setLabel("Fibonacci");
    fibonaccilButton.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        fibonaccilButton_ActionPerformed(evt);
      }
    });
    cp.add(fibonaccilButton);
    fakultaetButton.setBounds(184, 112, 161, 33);
    fakultaetButton.setLabel("Fakultät");
    fakultaetButton.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        fakultaetButton_ActionPerformed(evt);
      }
    });
    cp.add(fakultaetButton);
    button1.setBounds(352, 112, 113, 33);
    button1.setLabel("Ende");
    button1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        button1_ActionPerformed(evt);
      }
    });
    cp.add(button1);
    // Ende Komponenten

    setVisible(true);
  }

  // Anfang Methoden
  public void fibonaccilButton_ActionPerformed(ActionEvent evt) {

  }

  public void fakultaetButton_ActionPerformed(ActionEvent evt) {

  }
  
  public BigInteger fib(long n) {
    if(n == 1) {
      return new BigInteger("0");
    }else {
      return new BigInteger((long)(n - 1 + fib(n-1)));
    }
  }
  
  public BigInteger fakultaet(long n) {
    if (n <= 1) {
      return new BigInteger("1");
    }else {
      return new BigInteger((long)(n * fakultaet(n - 1)));
    }
  }

  public void button1_ActionPerformed(ActionEvent evt) {
    dispose();
  }

  // Ende Methoden

  public static void main(String[] args) {
    new Rekursion("beispiel1");
  }
}
