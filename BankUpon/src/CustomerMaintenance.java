
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class CustomerMaintenance extends javax.swing.JFrame {

    /**
     * Creates new form CustomerMaintenance
     */
    public CustomerMaintenance() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jComboBoxFunction = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCustomerId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        javax.swing.JButton jButtonSubmit = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jTextFieldCustomerName = new javax.swing.JTextField();
        jTextFieldFathersName = new javax.swing.JTextField();
        jComboBoxGender = new javax.swing.JComboBox<>();
        jTextFieldAddress = new javax.swing.JTextField();
        jTextFieldMobileNumber = new javax.swing.JTextField();
        jTextFieldPAN = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jXDatePickerDOB = new org.jdesktop.swingx.JXDatePicker();
        jTextFieldAADHAR = new javax.swing.JTextField();
        jButtonReset = new javax.swing.JButton();
        jButtonGo = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BankUpon - Customer Maintenance");
        setAlwaysOnTop(true);

        jComboBoxFunction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Add", "Modify", "Delete", "Inquire" }));
        jComboBoxFunction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFunctionActionPerformed(evt);
            }
        });

        jLabel1.setText("Function");

        jLabel2.setText("Customer Id ");

        jTextFieldCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCustomerIdActionPerformed(evt);
            }
        });

        jLabel3.setText("Customer Name");

        jLabel4.setText("Father's Name");

        jLabel5.setText("Gender");

        jLabel6.setText("Date of Birth ");

        jLabel7.setText("Address");

        jLabel8.setText("Mobile Number");

        jLabel9.setText("PAN Number");

        jLabel10.setText("Aadhar Number");

        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jTextFieldFathersName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFathersNameActionPerformed(evt);
            }
        });

        jComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));

        jTextFieldAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAddressActionPerformed(evt);
            }
        });

        jTextFieldMobileNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMobileNumberActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Algerian", 1, 30)); // NOI18N
        jLabel11.setText("CUSTOMER Maintenance");
        jLabel11.setToolTipText("");

        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jButtonGo.setText("Go");
        jButtonGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoActionPerformed(evt);
            }
        });

        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldCustomerName)
                                        .addComponent(jTextFieldFathersName, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                                        .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jXDatePickerDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextFieldAADHAR, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldPAN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                        .addComponent(jTextFieldMobileNumber, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jButtonSubmit)
                                .addGap(64, 64, 64)
                                .addComponent(jButtonCancel)
                                .addGap(77, 77, 77)
                                .addComponent(jButtonReset)
                                .addGap(61, 61, 61)
                                .addComponent(jButtonExit)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1001, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxFunction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jButtonGo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxFunction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldFathersName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jXDatePickerDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldPAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldAADHAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 54, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSubmit)
                    .addComponent(jButtonCancel)
                    .addComponent(jButtonReset)
                    .addComponent(jButtonExit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCustomerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCustomerIdActionPerformed

    private void jTextFieldFathersNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFathersNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFathersNameActionPerformed

    private void jTextFieldAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAddressActionPerformed

    private void jTextFieldMobileNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMobileNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMobileNumberActionPerformed

    private boolean validateCustomerForm(){
      if (jTextFieldCustomerName.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this,"Customer Name not Entered"); 
        return false;
      }
      else
      {
        jTextFieldCustomerName.setText(jTextFieldCustomerName.getText().toUpperCase());
      }
      if (jTextFieldFathersName.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this,"Father's Name not Entered");
        return false;
         }
      else
      {
        jTextFieldFathersName.setText(jTextFieldFathersName.getText().toUpperCase());
      }  
      if (jTextFieldAddress.getText().isEmpty()){
        JOptionPane.showMessageDialog(this,"Address not Entered");
        return false;
         }
      else
      {
        jTextFieldAddress.setText(jTextFieldAddress.getText().toUpperCase());
      }    
      if (jXDatePickerDOB.getDate().equals(null)){
        JOptionPane.showMessageDialog(this,"Date of Birth not Entered");
        return false;
         }
      //DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
      Calendar cal = Calendar.getInstance();
           
      if (jXDatePickerDOB.getDate().after(cal.getTime())) {
        JOptionPane.showMessageDialog(this,"Date of Birth can not be a future date!");
        return false;
         }
     return true;
     
}
    
    
    private void jComboBoxFunctionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFunctionActionPerformed
        if (jComboBoxFunction.getSelectedItem() == "Add" )    
        jTextFieldCustomerId.setEditable(false);
        else
        jTextFieldCustomerId.setEditable(true);
    }//GEN-LAST:event_jComboBoxFunctionActionPerformed
    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
if (jComboBoxFunction.getSelectedItem() == "Add" )  
{
    if (validateCustomerForm()) {
    String CustomerName=jTextFieldCustomerName.getText();  
    String FathersName=jTextFieldFathersName.getText();  
    String Gender=jComboBoxGender.getSelectedItem().toString();  
    DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    String DateOfBirth = format.format(jXDatePickerDOB.getDate());
    String Address=jTextFieldAddress.getText();
    String MobileNumber=jTextFieldMobileNumber.getText();
    String PAN=jTextFieldPAN.getText();
    String AADHARNumber=jTextFieldAADHAR.getText();
    ResultSet rs = null;
       try { Class.forName("java.sql.DriverManager"); 
Connection con = (Connection) DriverManager.getConnection (BankUponDataSource.CONNECTIONSTRING, BankUponDataSource.USERID, BankUponDataSource.PASSWD);   

Statement stmt = (Statement) con.createStatement();
     
String query="INSERT INTO customers (CustomerName, FathersName, Gender, DateOfBirth, Address, MobileNumber, PAN, AADHARNumber) VALUES  ('"+CustomerName+"','"+FathersName+"','"+Gender+"','"+DateOfBirth+"','"+Address+"','"+MobileNumber+"','"+PAN+"','"+AADHARNumber+"');";      
long key = -1L;

stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
rs = stmt.getGeneratedKeys();

if (rs != null && rs.next()) {
    key = rs.getLong(1);
    
}

JOptionPane.showMessageDialog(this,"Customer Id created " + key);  
jTextFieldCustomerId.setText(Long.toString(key));      
       
}
catch (Exception e) 
{ JOptionPane.showMessageDialog (this, e.getMessage());   } 
}
}

if (jComboBoxFunction.getSelectedItem() == "Modify" )  
{
    String CustomerId=jTextFieldCustomerId.getText(); 
    {
        
       try { Class.forName("java.sql.DriverManager"); 
Connection con = (Connection) DriverManager.getConnection (BankUponDataSource.CONNECTIONSTRING, BankUponDataSource.USERID, BankUponDataSource.PASSWD);   

Statement stmt = (Statement) con.createStatement();

    String CustomerName=jTextFieldCustomerName.getText();  
    String FathersName=jTextFieldFathersName.getText();  
    String Gender=jComboBoxGender.getSelectedItem().toString();  
    DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    String DateOfBirth = format.format(jXDatePickerDOB.getDate());
    String Address=jTextFieldAddress.getText();
    String MobileNumber=jTextFieldMobileNumber.getText();
    String PAN=jTextFieldPAN.getText();
    String AADHARNumber=jTextFieldAADHAR.getText();
     ResultSet rs = null;
    
     
String query="Update customers set CustomerName = '" + CustomerName + "', FathersName = '" + FathersName + "', Gender = '" + Gender + "', DateOfBirth = '" + DateOfBirth + "', Address = '" + Address + "', MobileNumber = '" + MobileNumber + "', AADHARNumber = '" + AADHARNumber + "' where CustomerId = '"+CustomerId+"';";   


stmt.executeUpdate(query);


JOptionPane.showMessageDialog(this,"Customer Id updated ");  
}
catch (Exception e) 
{ JOptionPane.showMessageDialog (this, e.getMessage());   } 
}
}




    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
    jTextFieldCustomerId.setText(""); 
    jTextFieldCustomerName.setText(""); 
    jTextFieldFathersName.setText("");  
    jComboBoxGender.setSelectedItem("Male"); 
    jXDatePickerDOB.setDate(null);
    jTextFieldAddress.setText("");
    jTextFieldMobileNumber.setText("");
    jTextFieldPAN.setText("");
    jTextFieldAADHAR.setText("");
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoActionPerformed
        // TODO add your handling code here:
        
        if (jComboBoxFunction.getSelectedItem() == "Modify" )  
{
    String CustomerId=jTextFieldCustomerId.getText(); 
    if (CustomerId.isEmpty()) {
        JOptionPane.showMessageDialog(this,"Customer Id not Entered");
    }
    else
    {
        
       try { Class.forName("java.sql.DriverManager"); 
Connection con = (Connection) DriverManager.getConnection (BankUponDataSource.CONNECTIONSTRING, BankUponDataSource.USERID, BankUponDataSource.PASSWD);   

Statement stmt = (Statement) con.createStatement();
     
String query="select * from Customers where CustomerId = '"+CustomerId+"';";      

ResultSet rs = stmt.executeQuery(query);
if (rs.next()) {
    
    jTextFieldCustomerName.setText(rs.getString("CustomerName"));  
    jTextFieldFathersName.setText(rs.getString("FathersName"));  
    jComboBoxGender.setSelectedItem(rs.getString("Gender")); 
    DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    jXDatePickerDOB.setDate(rs.getDate("DateOfBirth"));
    jTextFieldAddress.setText(rs.getString("Address"));
    jTextFieldMobileNumber.setText(rs.getString("MobileNumber"));
    jTextFieldPAN.setText(rs.getString("PAN"));
    jTextFieldAADHAR.setText(rs.getString("AADHARNumber"));
    
    
}      
else 
    JOptionPane.showMessageDialog(this,"No such Customer Id exists.");
}
catch (Exception e) 
{ JOptionPane.showMessageDialog (this, e.getMessage());   } 
}
}
        
        
if (jComboBoxFunction.getSelectedItem() == "Inquire" )  
{
    String CustomerId=jTextFieldCustomerId.getText(); 
    if (CustomerId.isEmpty()) {
        JOptionPane.showMessageDialog(this,"Customer Id not Entered");
    }
    else
    {
        
       try { Class.forName("java.sql.DriverManager"); 
Connection con = (Connection) DriverManager.getConnection (BankUponDataSource.CONNECTIONSTRING, BankUponDataSource.USERID, BankUponDataSource.PASSWD);   

Statement stmt = (Statement) con.createStatement();
     
String query="select * from Customers where CustomerId = '"+CustomerId+"';";      

ResultSet rs = stmt.executeQuery(query);
if (rs.next()) {
    
    jTextFieldCustomerName.setText(rs.getString("CustomerName"));  
    jTextFieldFathersName.setText(rs.getString("FathersName"));  
    jComboBoxGender.setSelectedItem(rs.getString("Gender")); 
    DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    jXDatePickerDOB.setDate(rs.getDate("DateOfBirth"));
    jTextFieldAddress.setText(rs.getString("Address"));
    jTextFieldMobileNumber.setText(rs.getString("MobileNumber"));
    jTextFieldPAN.setText(rs.getString("PAN"));
    jTextFieldAADHAR.setText(rs.getString("AADHARNumber"));
    
    
}      
else 
    JOptionPane.showMessageDialog(this,"No such Customer Id exists.");
}
catch (Exception e) 
{ JOptionPane.showMessageDialog (this, e.getMessage());   } 
}
}

    }//GEN-LAST:event_jButtonGoActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonExitActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerMaintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerMaintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerMaintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerMaintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerMaintenance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonGo;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JComboBox<String> jComboBoxFunction;
    private javax.swing.JComboBox<String> jComboBoxGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextFieldAADHAR;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldCustomerId;
    private javax.swing.JTextField jTextFieldCustomerName;
    private javax.swing.JTextField jTextFieldFathersName;
    private javax.swing.JTextField jTextFieldMobileNumber;
    private javax.swing.JTextField jTextFieldPAN;
    private org.jdesktop.swingx.JXDatePicker jXDatePickerDOB;
    // End of variables declaration//GEN-END:variables
}