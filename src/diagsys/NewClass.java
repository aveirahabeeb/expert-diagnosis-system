/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagsys;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author AJIBOLA
 */
public class NewClass {
    
   
           static Timer timer;
           static int x = 0;
            static String[] list={"src/Mnet.jpg","src/symptoms.jpg"};
            
           
      public  static void LoadIntoMalariaPanel(){

                
                //Knowledge.pic.setBounds(40, 30, 700, 300);
               //setImageSize(0);
               timer = new Timer(4000, new ActionListener() {
               
             @Override
             public void actionPerformed(ActionEvent e) {
                setImageSize(x);
                x+= 1;   
                 if (x==1) {
                     
                     Knowledge.Malariadesclbl.setText(
                             "Did You Know\n"+"\tMalaria Can be Prevented With the use of Treated \n\tMosquito Nets");
                 } else if(x==2){
                     Knowledge.Malariadesclbl.setText("\n\nThese Are Some Of The Most Common Malaria Symptoms");
                 }
                 if (x>=list.length) {
                     x=0;
                     
                 }
                
                             }
        });
          
               
               timer.start();
               Knowledge.yo.setBackground(Color.decode("#a9ba9d"));
               
               
               
       }
    
    
    public  static void setImageSize(int i){
               
        ImageIcon MyImage = new ImageIcon(list[i]);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(Knowledge.pic.getWidth(),Knowledge.pic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        Knowledge.pic.setIcon(image);
     }
    
     
        
       
    
    
}
