
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class LockerUI extends javax.swing.JFrame {

   LockerUI() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        Browse = new javax.swing.JButton();
        Lock = new javax.swing.JButton();
        Unlock = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Browse.setBackground(new java.awt.Color(51, 102, 255));
        Browse.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Browse.setText("Browse");
        Browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseActionPerformed(evt);
            }
        });

        Lock.setBackground(new java.awt.Color(255, 0, 0));
        Lock.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Lock.setText("Lock");
        Lock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LockActionPerformed(evt);
            }
        });

        Unlock.setBackground(new java.awt.Color(51, 255, 51));
        Unlock.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Unlock.setText("Unlock");
        Unlock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnlockActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("Folder Locker");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Lock, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Unlock, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Browse, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(Browse, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Lock, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Unlock, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseActionPerformed
        // TODO add your handling code here:
        JFileChooser jfilechooser=new JFileChooser();
        int res=jfilechooser.showOpenDialog(null);
        if(res==JFileChooser.APPROVE_OPTION){
            File file=new File(jfilechooser.getSelectedFile().getAbsolutePath());
            jTextField1.setText(file.getPath());
        }
        
    }//GEN-LAST:event_BrowseActionPerformed

    private void LockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LockActionPerformed
        // TODO add your handling code here:
        String text=jTextField1.getText();
        if(text.equals("")){
            JOptionPane.showMessageDialog(null,"Please chosse The file");
        }
        else{
        try{
        File file=new File(jTextField1.getText());
        file.setReadable(false);
        file.setWritable(false);
        file.setExecutable(false);
        JOptionPane.showMessageDialog(null,"The file is lock you can on ly read");
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(null,"Error while opening the file");
        }
        }
    }//GEN-LAST:event_LockActionPerformed

    private void UnlockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnlockActionPerformed
        // TODO add your handling code here:
         String text=jTextField1.getText();
        if(text.equals("")){
            JOptionPane.showMessageDialog(null,"Please chosse The file");
        }else{
        try{
        File file=new File(jTextField1.getText());
        file.setReadable(true);
        file.setWritable(true);
        file.setExecutable(true);
        JOptionPane.showMessageDialog(null,"File is unlocked");
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(null,"Error while opening the file");
        }
        }
        
    }//GEN-LAST:event_UnlockActionPerformed
 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LockerUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Browse;
    private javax.swing.JButton Lock;
    private javax.swing.JButton Unlock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
