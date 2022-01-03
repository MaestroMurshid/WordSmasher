

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */




public class GameScreen extends javax.swing.JFrame {
   
    
    boolean moveWord = true,gameSkip=false,enterPressed=false,stopGame=false;
    String[] wordArray = new String[3] ;
    
    String wordNow="";
    
    int counter=0,right=0,wrong=0,missed=0,decider,time=60,moveSpeed=0,speedCounter=1;
    
    Beginner beginner = new Beginner();
    Intermediate intermediate = new Intermediate();
    Advanced advanced = new Advanced();
   

    /**
     * Creates new form GameScreen
     */
    public GameScreen() {
        initComponents();
       
        
                     
    }
    public GameScreen(int imported){
        initComponents();
        this.setAlwaysOnTop(true);
        
        decider=imported;
        playGame();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        wordLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        correctLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        wrongLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        missedLabel = new javax.swing.JLabel();
        answerField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        wordLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        wordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wordLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(343, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SCORE");

        scoreLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        scoreLabel.setForeground(new java.awt.Color(255, 255, 255));
        scoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreLabel.setText("0");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CORRECT");

        correctLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        correctLabel.setForeground(new java.awt.Color(255, 255, 255));
        correctLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        correctLabel.setText("0");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("WRONG");

        wrongLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        wrongLabel.setForeground(new java.awt.Color(255, 255, 255));
        wrongLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wrongLabel.setText("0");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MISSED");

        missedLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        missedLabel.setForeground(new java.awt.Color(255, 255, 255));
        missedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        missedLabel.setText("0");

        answerField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        answerField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        answerField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                answerFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(answerField)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(correctLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wrongLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(missedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(scoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(correctLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wrongLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(missedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(answerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void playGame(){
         // startButton.setEnabled(false);
       
        switch (decider) {
            case 1:
                beginner.shuffleWords();
                wordLabel.setText(beginner.wordArray[counter]);
                break;
            case 2:
                intermediate.shuffleWords();
                wordLabel.setText(intermediate.wordArray[counter]);
                break;
            default:
                advanced.shuffleWords();
                wordLabel.setText(advanced.wordArray[counter]);
                break;
        }

        answerField.grabFocus();
        counter=0;
 
        wordNow=wordLabel.getText();
        //wordPrevious="";
        Timer timer = new Timer();
       
        TimerTask task = new TimerTask(){
            
            @Override
            public void run()
                { 
                    // This if is used to move the word downwards
                    if(wordLabel.getLocation().y<350 && moveWord){
                        wordLabel.setLocation(wordLabel.getLocation().x, wordLabel.getLocation().y+1+moveSpeed);
                        if(enterPressed==true){
                            if(gameSkip==true){
                                 wordLabel.setLocation(wordLabel.getLocation().x, wordLabel.getLocation().y+350);
                                 gameSkip=false;
                            }
                            
                        }
                        //System.out.println(String.valueOf(stopGame));
                        
                            
                            if(stopGame==true){
                                timer.cancel();
                                wordLabel.setLocation(6, 0);
                                moveWord=true;
                                wordLabel.setText("");
                                wordNow="";
                               // wordPrevious="";
                                counter=0;
                                //timer.cancel();
                                enterPressed=false;
                                answerField.setText("");
                                answerField.setEnabled(false);
                            }
                    }
                   else{
                       //once else is reached, word has reached the bottom. Now, it's time to decide the score.
                       //Inside switch, previous word is stored into a variable
                       /* switch (decider) {
                            case 1:
                                wordPrevious=beginner.wordArray[counter];
                                break;
                            case 2:
                                wordPrevious=intermediate.wordArray[counter];
                                break;
                            default:
                                wordPrevious=advanced.wordArray[counter];
                                break;
                            }*/
                        //Enter pressed will only be true if right word or wrong word is typed. If the player typed previous word, he/she will get to retry the new word.
                        
                       speedCounter++;
                       if(speedCounter%5==0){
                           moveSpeed+=1;
                           speedCounter=0;
                       }
                       if(enterPressed==true)
                                enterPressed=false;
                            else
                                missed++;
                       answerField.setText("");
                       //Set value of score lables accordingly
                       correctLabel.setText(String.valueOf(right));
                       missedLabel.setText(String.valueOf(missed));
                       wrongLabel.setText(String.valueOf(wrong));
                       scoreLabel.setText(String.valueOf(5*right));
                       //Inside this if begins the next iteration with a new word.
                        if(counter<=99)
                        {
                            
                            wordLabel.setLocation(6, 0);
                            counter++;
                            
                            switch (decider) {
                            case 1:
                                wordLabel.setText(beginner.wordArray[counter]);
                                wordNow=beginner.wordArray[counter];
                                break;
                            case 2:
                                wordLabel.setText(intermediate.wordArray[counter]);
                                wordNow=intermediate.wordArray[counter];
                                break;
                            default:
                                wordLabel.setText(advanced.wordArray[counter]);
                                wordNow=advanced.wordArray[counter];
                                break;
                            }
                            
                            
                            enterPressed=false;
                            
                        }
                        //If this else is reached, game has ended. Every gaming parameter except the scores, will be reset.
                        else
                        {
                             wordLabel.setLocation(6, 0);
                             moveWord=true;
                             wordLabel.setText("");
                             wordNow="";
                            // wordPrevious="";
                             counter=0;
                             //timer.cancel();
                             enterPressed=false;

                        }
                    }
                }                
        };
        timer.scheduleAtFixedRate(task, 20,30);
    }
    
 
    private void answerFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_answerFieldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==10 ){
            if(enterPressed==false)
            {
           
                if(answerField.getText().equals(wordNow)){
                      right++;
                      enterPressed=true;
                      gameSkip=true;
                }
                  
             /*   else if(answerField.getText().equals(wordPrevious))
                {
                  
                    
                    if(enterPressed==true)
                    {
                       // missed++;     
                        
                        System.out.println("I am here!!!");
                    }
                    enterPressed=true;
                }*/
                else
                {
                   wrong++;
                   enterPressed=true;
                   gameSkip=true;
                }
            }
                
            answerField.setText("");
            
        }
         
    }//GEN-LAST:event_answerFieldKeyPressed

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GameScreen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerField;
    private javax.swing.JLabel correctLabel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel missedLabel;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JLabel wordLabel;
    private javax.swing.JLabel wrongLabel;
    // End of variables declaration//GEN-END:variables
}
