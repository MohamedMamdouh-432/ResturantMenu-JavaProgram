package com.mycompany.javagui ;
import java.awt.* ;
import java.awt.event.*;
import javax.swing.* ;
import javax.swing.border.Border;

public class ThirdProgram 
{
          @SuppressWarnings("serial")
          static class FrameBuilder extends JFrame
          {
                    String[] numbers = {"One","Two","Three","Four","Five","Six","Seven","Seven","Eight","Nine","Ten"} ;
                    public FrameBuilder()
                    {
                        /*  The Main Frame Layout  & Containers  */
                               setLayout(null) ;
                               JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,15,15)) ;
                               topPanel.setBounds(20, 10, 440, 250) ;
                               JPanel sizePanel = new JPanel() ;
                               JPanel subLeftPanel = new JPanel() ;
                               JPanel middlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER,15,15)) ;
                               middlePanel.setBounds(20, 280, 440, 130) ;
                               JPanel subMiddlePanel = new JPanel() ;
                               JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.LEFT,15,15)) ;
                               bottomPanel.setBounds(20, 440, 440, 130) ;
                               JPanel subRightPanel = new JPanel() ;
                               topPanel.setBackground(Color.ORANGE) ;
                               middlePanel.setBackground(Color.GREEN) ;
                               bottomPanel.setBackground(Color.GRAY) ;
                               
                        /*  The Components in The Frame   */
                               Border topBorder = BorderFactory.createTitledBorder("Main Meal") ;
                               Border sizeBorder = BorderFactory.createTitledBorder("Meal Size") ;
                               Border middleBorder = BorderFactory.createTitledBorder("Extra Meal") ;
                               Border bottomBorder = BorderFactory.createTitledBorder("Dessert Meal") ;
                               topPanel.setBorder(topBorder) ;
                               sizePanel.setBorder(sizeBorder) ;
                               middlePanel.setBorder(middleBorder) ;
                               bottomPanel.setBorder(bottomBorder) ;
                               
                         /*  Top Panel Components  */
                               JCheckBox chick = new JCheckBox("Chicken") ;
                               JCheckBox fish = new JCheckBox("Fish") ;
                               JCheckBox pizza = new JCheckBox("Pizza") ;
                               JCheckBox meat = new JCheckBox("Grilled Meat") ;
                               JCheckBox hamb = new JCheckBox("Hamburger") ;
                               JCheckBox pige = new JCheckBox("Pigeon") ;
                               JCheckBox spag = new JCheckBox("Spaghetti") ;
                               topPanel.add(chick) ;  topPanel.add(fish) ;   topPanel.add(pizza) ;  
                               topPanel.add(meat) ;   topPanel.add(hamb) ;   topPanel.add(pige) ;   topPanel.add(spag) ;
                               JRadioButton small = new JRadioButton("Small") ;
                               JRadioButton medium = new JRadioButton("Medium") ;
                               JRadioButton large = new JRadioButton("Large") ;
                               JRadioButton gix = new JRadioButton("Very Large") ;
                               sizePanel.add(small) ;    sizePanel.add(medium) ;   sizePanel.add(large) ;   sizePanel.add(gix) ;
                               JLabel label1 = new JLabel("Main Meals Number") ;
                               JComboBox <String> box1 = new JComboBox <>(numbers) ;
                               subLeftPanel.add(label1) ;        subLeftPanel.add(box1) ;
                               topPanel.add(sizePanel) ;
                               topPanel.add(subLeftPanel) ;
                               
                        /*   Middle Panel Components */
                               JCheckBox rice = new JCheckBox("Rice") ;
                               JCheckBox pasta = new JCheckBox("Pasta") ;
                               JCheckBox bread = new JCheckBox("Bread") ;
                               JCheckBox soup = new JCheckBox("Soup") ;
                                JCheckBox spagh = new JCheckBox("Spaghetti") ;
                               middlePanel.add(rice) ;   middlePanel.add(pasta) ;  middlePanel.add(bread) ;
                               middlePanel.add(spagh) ;  middlePanel.add(soup) ;
                               JLabel label2 = new JLabel("Extra Meals Number") ;
                               JComboBox <String> box2 = new JComboBox <>(numbers) ;
                               subMiddlePanel.add(label2) ;     subMiddlePanel.add(box2) ;
                               middlePanel.add(subMiddlePanel) ;
                               
                         /*  Bottom Panel Components  */
                               JCheckBox rice_milk = new JCheckBox("Rice & Milk") ;
                               JCheckBox pudding = new JCheckBox("Pudding") ;
                               JCheckBox jelly = new JCheckBox("Jelly") ;
                               JCheckBox pepsi = new JCheckBox("Pepsi") ;
                               JCheckBox icecream = new JCheckBox("Ice Cream") ;
                               bottomPanel.add(icecream) ;   bottomPanel.add(pudding) ;
                               bottomPanel.add(jelly) ;  bottomPanel.add(pepsi) ;  bottomPanel.add(rice_milk) ; 
                               JLabel label3 = new JLabel("Dessert Meals Number") ;
                               JComboBox <String> box3 = new JComboBox <>(numbers) ;
                               subRightPanel.add(label3) ;        subRightPanel.add(box3) ;
                               bottomPanel.add(subRightPanel) ;
                               
                         /*  Order Button to save toppings */
                               JButton order = new JButton("Order Now") ;
                               order.setBounds(80, 590, 130, 40) ;
                               order.setBackground(Color.RED) ;
                               order.setForeground(Color.BLACK) ;
                               
                         /*  Exit Button to exit from the program */
                               JButton exit = new JButton("Exit") ;
                               exit.setBounds(350, 590, 90, 40) ;
                               exit.setBackground(Color.BLACK) ;
                               exit.setForeground(Color.ORANGE) ;
                               
                         /*  Order Button Action Listener */
                               order.addActionListener((ActionEvent listener)->
                               {
                                         if(listener.getSource() == order)
                                         {
                                                   String tops = "" , num1 = "" ;  
                                                   if(chick.isSelected())               tops += chick.getText()+" & " ;
                                                   if(fish.isSelected())                  tops += fish.getText()+" & " ;
                                                   if(pizza.isSelected())               tops += pizza.getText()+" & " ;
                                                   if(meat.isSelected())                tops += meat.getText()+" & " ;
                                                   if(hamb.isSelected())              tops += hamb.getText()+" & " ;
                                                   if(pige.isSelected())                 tops += pige.getText()+" & " ;
                                                   if(spag.isSelected())                tops += spag.getText()+" & " ;
                                                   if(!tops.equals(""))
                                                             tops = tops.substring(0, tops.length()-3) ;
                                                   
                                                   if(box1.getSelectedItem() == "One")        num1 = "One" ;
                                                   if(box1.getSelectedItem() == "Two")       num1 = "Two" ;
                                                   if(box1.getSelectedItem() == "Three")     num1 = "Three" ;
                                                   if(box1.getSelectedItem() == "Four")       num1 = "Four" ;
                                                   if(box1.getSelectedItem() == "Five")        num1 = "Five" ;
                                                   if(box1.getSelectedItem() == "Six")          num1 = "Six" ;
                                                   if(box1.getSelectedItem() == "Seven")     num1 = "Seven" ;
                                                   if(box1.getSelectedItem() == "Eight")      num1 = "Eight" ;
                                                   if(box1.getSelectedItem() == "Nine")       num1 = "Nine" ;
                                                   if(box1.getSelectedItem() == "Ten")         num1 = "Ten" ;
                                                   
                                                   String size = "" ;
                                                   if(small.isSelected())              size = small.getText() ;
                                                   if(medium.isSelected())         size = medium.getText() ;
                                                   if(large.isSelected())               size = large.getText() ;
                                                   if(gix.isSelected())                   size = gix.getText() ;
                                                   
                                                   String extra = "" , num2 ;          
                                                   if(rice.isSelected())                 extra += rice.getText()+" & " ;
                                                   if(pasta.isSelected())              extra += pasta.getText()+" & " ;
                                                   if(bread.isSelected())             extra += bread.getText()+" & " ;
                                                   if(spagh.isSelected())             extra += spagh.getText()+" & " ;
                                                   if(soup.isSelected())               extra += soup.getText()+" & " ;
                                                   if(!extra.equals(""))
                                                             extra = extra.substring(0, extra.length()-3) ;
                                                   
                                                   if(box2.getSelectedItem() == "One")        num2 = "One" ;
                                                   if(box2.getSelectedItem() == "Two")       num2 = "Two" ;
                                                   if(box2.getSelectedItem() == "Three")     num2 = "Three" ;
                                                   if(box2.getSelectedItem() == "Four")       num2 = "Four" ;
                                                   if(box2.getSelectedItem() == "Five")        num2 = "Five" ;
                                                   if(box2.getSelectedItem() == "Six")          num2 = "Six" ;
                                                   if(box2.getSelectedItem() == "Seven")     num2 = "Seven" ;
                                                   if(box2.getSelectedItem() == "Eight")      num2 = "Eight" ;
                                                   if(box2.getSelectedItem() == "Nine")       num2 = "Nine" ;
                                                   if(box2.getSelectedItem() == "Ten")         num2 = "Ten" ;
                                                   
                                                   String dessert = "" , num3 ;
                                                   if(rice_milk.isSelected())       dessert += rice_milk.getText()+" & " ;
                                                   if(pudding.isSelected())        dessert += pudding.getText()+" & " ;
                                                   if(jelly.isSelected())                dessert += jelly.getText()+" & " ;
                                                   if(pepsi.isSelected())              dessert += pepsi.getText()+" & " ;
                                                   if(icecream.isSelected())        dessert += icecream.getText()+" & " ;
                                                   if(!dessert.equals(""))
                                                             dessert = dessert.substring(0, dessert.length()-3) ;
                                                   
                                                   if(box3.getSelectedItem() == "One")        num3 = "One" ;
                                                   if(box3.getSelectedItem() == "Two")       num3 = "Two" ;
                                                   if(box3.getSelectedItem() == "Three")     num3 = "Three" ;
                                                   if(box3.getSelectedItem() == "Four")       num3 = "Four" ;
                                                   if(box3.getSelectedItem() == "Five")        num3 = "Five" ;
                                                   if(box3.getSelectedItem() == "Six")          num3 = "Six" ;
                                                   if(box3.getSelectedItem() == "Seven")     num3 = "Seven" ;
                                                   if(box3.getSelectedItem() == "Eight")      num3 = "Eight" ;
                                                   if(box3.getSelectedItem() == "Nine")       num3 = "Nine" ;
                                                   if(box3.getSelectedItem() == "Ten")         num3 = "Ten" ;
                                                   
                                                   if(tops.equals(""))   
                                                             JOptionPane.showMessageDialog(null, "You should first choose your main meal") ;
                                                   if(size.equals("")) 
                                                             JOptionPane.showMessageDialog(null, "You should first choose size meal") ;        
                                                   else
                                                   {
                                                             String Order = "" ;
                                                             if(!extra.equals("") && !dessert.equals(""))
                                                                        Order = "Main Meal : "+tops +" .\nMeal Size : "+size+" .\nExtra Meals : "+extra+" .\nDessert Meals : "+dessert +" .";
                                                             else if(!extra.equals(""))
                                                                        Order = "Main Meal : "+tops +" .\nMeal Size : "+size+" .\nExtra Meals : "+extra +" ." ;
                                                             else if(!dessert.equals(""))
                                                                        Order = "Main Meal : "+tops +" .\nMeal Size : "+size+" .\nDessert Meals : "+dessert +" ." ;
                                                             
                                                             if(extra.equals("") && dessert.equals(""))
                                                                        Order = "Main Meal : "+tops ;
                                                             else if(extra.equals(""))
                                                                        Order = "Main Meal : "+tops +" .\nMeal Size : "+size+" .\nDessert Meals : "+dessert+" ." ;
                                                             else if(dessert.equals(""))
                                                                        Order = "Main Meal : "+tops +" .\nMeal Size : "+size+" .\nExtra Meals : "+extra+" ." ;
                                                             
                                                             JOptionPane.showMessageDialog(null, "-------------  Your order -------------- \n"+Order) ;
                                                   }
                                         }
                               }) ;
                               
                          /* Exit Button Action Listener */
                               exit.addActionListener((ActionEvent Listener)->
                               {
                                         if(Listener.getSource() == exit)
                                         {
                                                   System.exit(0) ;
                                         }
                               }) ;
                          
                        /*   Adding all Container Panels  to the Frame */
                               add(topPanel) ;
                               add(middlePanel) ;
                               add(bottomPanel) ;
                               add(order) ;
                               add(exit) ;
                               
                        /*  The Main Properties  for The Frame */
                               setTitle("Resturant  Menu") ;
                               setSize(490,700) ;
                               setBackground(Color.GRAY) ;
                               setVisible(true) ;
                               setLocationRelativeTo(null) ;
                               setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
                    }
          }
          
          public static void main(String[] args)
          {
                    FrameBuilder frame = new FrameBuilder() ;
                    
          }
}
