package gameWord;

import java.awt.Component;
import java.util.List;

public class JFrameGame extends javax.swing.JFrame {

    WordModel modelWord;
    List<WordModel> bankSoal;

    public JFrameGame() {
        initComponents();
        bankSoal = QuestionGenerator.createQuestionInCollection();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        strartButton = new javax.swing.JButton();
        petunjukLabel1 = new javax.swing.JLabel();
        checkAnswerButton = new javax.swing.JButton();
        jawabanTextField = new javax.swing.JTextField();
        commentLabel = new javax.swing.JLabel();
        hintButton = new javax.swing.JButton();
        hintLabel = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tebakKata.png"))); // NOI18N

        strartButton.setText("Mulai");
        strartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                strartButtonActionPerformed(evt);
            }
        });

        petunjukLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        petunjukLabel1.setForeground(new java.awt.Color(0, 102, 102));
        petunjukLabel1.setText("Klik Tombol Mulai");

        checkAnswerButton.setText("Are you sure?");
        checkAnswerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAnswerButtonActionPerformed(evt);
            }
        });

        jawabanTextField.setEnabled(false);

        commentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        commentLabel.setText("---------------------------");

        hintButton.setText("hint");
        hintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hintButtonActionPerformed(evt);
            }
        });

        hintLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hintLabel.setText("?????");
        hintLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        scoreLabel.setText("100");

        jLabel2.setText("Score :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(strartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(petunjukLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 59, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(hintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jawabanTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkAnswerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(commentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56))
                    .addComponent(hintLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(strartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(petunjukLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jawabanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkAnswerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(commentLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hintButton)
                    .addComponent(scoreLabel)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hintLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void strartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_strartButtonActionPerformed
        int soalIndex = (int) Math.floor(Math.random() * bankSoal.size());
        System.out.println("Index : " + soalIndex);
        modelWord = bankSoal.get(soalIndex);
        System.out.println(modelWord.getBasicWord());
        jawabanTextField.setText("");
        petunjukLabel1.setText(modelWord.acakHuruf());
        jawabanTextField.setEnabled(true);
        strartButton.setEnabled(false);
        checkAnswerButton.setEnabled(true);
        commentLabel.setText("");
        hintButton.setEnabled(true);
    }//GEN-LAST:event_strartButtonActionPerformed
    
    int score = 100;
    
    private void checkAnswerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAnswerButtonActionPerformed
       
        try {
        String jawaban = jawabanTextField.getText().trim();
        modelWord.setJawaban(jawaban);

        if (modelWord.cekJawaban()) {
            commentLabel.setText("Cucok deh kamyuuuuu !!");
            strartButton.setEnabled(true);
            int n = score += 10;
            scoreLabel.setText(String.valueOf(n));
            jawabanTextField.setEnabled(false);
            hintButton.setEnabled(false);
            checkAnswerButton.setEnabled(false);
            strartButton.setEnabled(true);
            
        } else {
            commentLabel.setText("Coba lagi!!");
            int n = score -= 10;
            scoreLabel.setText(String.valueOf(n));
        }
            
            
        } catch (Exception e) {
            System.out.println("aaaaaaaaaaaaaauooooooooo");
        }
       
    }//GEN-LAST:event_checkAnswerButtonActionPerformed

    private void hintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hintButtonActionPerformed
        hintLabel.setText(modelWord.getHint());
        int n = score-=5;
        scoreLabel.setText(String.valueOf(n));
    }//GEN-LAST:event_hintButtonActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkAnswerButton;
    private javax.swing.JLabel commentLabel;
    private javax.swing.JButton hintButton;
    private javax.swing.JLabel hintLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jawabanTextField;
    private javax.swing.JLabel petunjukLabel1;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JButton strartButton;
    // End of variables declaration//GEN-END:variables
}
