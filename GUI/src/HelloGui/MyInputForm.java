/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloGui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class MyInputForm extends JFrame {
   private static final int FRAME_WIDTH = 600;
   private static final int FRAME_HEIGHT = 200;
   private JLabel aLabel;
   private JLabel bLabel;
   private JLabel cLabel;
   private JLabel dLabel;
   private JTextField aField;
   private JTextField bField;
   private JButton buttontambah,buttonkali;
   private JPanel panel;
   
   public MyInputForm() {
       createTextField();
       createButtonTambah();
       createButtonKali();
       createPanel();
       setSize(FRAME_WIDTH, FRAME_WIDTH);
   }
   
   private void createTextField(){
       aLabel = new JLabel("Nilai A: ");
       bLabel = new JLabel("Nilai C: ");
       cLabel = new JLabel("Hasil Kali : ");
       dLabel = new JLabel("Hasil Tambah : ");
       
       final int FIELD_WIDTH = 10;
       aField = new JTextField(FIELD_WIDTH);
       aField.setText("0");
       bField = new JTextField(FIELD_WIDTH);
       bField.setText("0");
   }
   private void createButtonTambah(){
       buttontambah = new JButton("Tambah");
       class AddInterestListener implements ActionListener{
           
           public void actionPerformed(ActionEvent event){
               int a = Integer.valueOf(aField.getText());
               int b = Integer.valueOf(bField.getText());
               int c = a+b;
               cLabel.setText("Hasil Pertambahan: "+c);
           }
       }
       ActionListener listener = new AddInterestListener();
       buttontambah.addActionListener(listener);
   }
   
   private void createButtonKali(){
       buttonkali = new JButton("Perkalian");
       class AddInterestListener implements ActionListener{
           
           public void actionPerformed(ActionEvent event){
               int a = Integer.valueOf(aField.getText());
               int b = Integer.valueOf(bField.getText());
               int d = a*b;
               dLabel.setText("Hasil Perkalian: "+d);
           }
       }
       ActionListener listener1 = new AddInterestListener();
       buttonkali.addActionListener(listener1);
   }
   
   private void createPanel(){
       panel = new JPanel();
       panel.add(aLabel);
       panel.add(aField);
       panel.add(bLabel);
       panel.add(bField);
       panel.add(buttontambah);
       panel.add(buttonkali);
       panel.add(cLabel);
       panel.add(dLabel);
       
       add(panel);
   }
   
}

