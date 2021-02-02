/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dopd.hvktmm;



import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;


/**
 *
 * @author Admin
 */
public class Form_VC extends javax.swing.JFrame implements TableModelListener {

    public static int len;
    public static String pathS1;
    public static String pathS2;
    
    public Form_VC() {
        initComponents();
        this.setSize(1335, 765);
        jPanel1.setSize(1335, 765);
        this.setTitle("LSB Steganography");
        this.setLocationRelativeTo(null);
        tf_path.setEnabled(false);
        tf_pathdecode.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        bt_xoahk = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tf_path = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_message = new javax.swing.JTextField();
        bt_themhk = new javax.swing.JButton();
        bt_encode = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tf_pathdecode = new javax.swing.JTextField();
        bt_themmon = new javax.swing.JButton();
        bt_decode = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_result = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb_share1 = new javax.swing.JLabel();
        lb_share2 = new javax.swing.JLabel();
        lb_overlap = new javax.swing.JLabel();
        lb_or = new javax.swing.JLabel();
        lb_imgsc = new javax.swing.JLabel();
        lb_s1 = new javax.swing.JLabel();
        lb_s2 = new javax.swing.JLabel();
        lb_over = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(1282, 599));
        setSize(new java.awt.Dimension(1282, 750));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cập Nhât Học Kỳ,Môn Học Phần,Lớp Học Phần,Điểm Quá trình Trình", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel1.setMinimumSize(new java.awt.Dimension(1282, 599));
        jPanel1.setPreferredSize(new java.awt.Dimension(1282, 599));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mã hóa ảnh", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(255, 0, 0))); // NOI18N

        bt_xoahk.setBackground(new java.awt.Color(51, 255, 51));
        bt_xoahk.setText("Chọn file");
        bt_xoahk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_xoahkActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Chọn ảnh:");

        tf_path.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pathActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Chọn file:");

        bt_themhk.setBackground(new java.awt.Color(51, 255, 51));
        bt_themhk.setText("Chọn ảnh");
        bt_themhk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_themhkActionPerformed(evt);
            }
        });

        bt_encode.setBackground(new java.awt.Color(51, 255, 51));
        bt_encode.setText("Encode");
        bt_encode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_encodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_message, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_themhk)
                            .addComponent(tf_path, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(bt_xoahk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_encode, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tf_path, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_themhk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_message, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_xoahk)
                    .addComponent(bt_encode))
                .addGap(21, 21, 21))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Visual Cryptography", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Chọn ảnh:");

        bt_themmon.setBackground(new java.awt.Color(51, 255, 51));
        bt_themmon.setText("Chọn ảnh");
        bt_themmon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_themmonActionPerformed(evt);
            }
        });

        bt_decode.setBackground(new java.awt.Color(51, 255, 51));
        bt_decode.setText("Generate Share");
        bt_decode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_decodeActionPerformed(evt);
            }
        });

        jButton1.setText("Overlap");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(bt_themmon)
                        .addGap(18, 18, 18)
                        .addComponent(bt_decode))
                    .addComponent(tf_pathdecode, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_pathdecode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_themmon)
                    .addComponent(bt_decode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Giải mã thông điệp", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel5.setPreferredSize(new java.awt.Dimension(324, 235));

        tb_result.setColumns(20);
        tb_result.setRows(5);
        jScrollPane1.setViewportView(tb_result);

        jTextField1.setEnabled(false);

        jLabel5.setText("Chọn ảnh:");

        jButton2.setText("Chọn ảnh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Giải mã");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(28, 28, 28)
                                .addComponent(jButton3))
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1025, 1000));
        jPanel2.setLayout(null);

        lb1.setText("Original");
        jPanel2.add(lb1);
        lb1.setBounds(90, 10, 330, 190);

        lb2.setText("Image Secret");
        jPanel2.add(lb2);
        lb2.setBounds(480, 10, 340, 190);

        lb_share1.setText("Share1");
        jPanel2.add(lb_share1);
        lb_share1.setBounds(60, 320, 230, 160);

        lb_share2.setText("Share2");
        jPanel2.add(lb_share2);
        lb_share2.setBounds(330, 320, 240, 160);

        lb_overlap.setText("Overlap");
        jPanel2.add(lb_overlap);
        lb_overlap.setBounds(620, 320, 240, 160);

        lb_or.setText("lb_or");
        jPanel2.add(lb_or);
        lb_or.setBounds(90, 220, 330, 14);

        lb_imgsc.setText("lb_imgsc");
        jPanel2.add(lb_imgsc);
        lb_imgsc.setBounds(480, 220, 340, 14);

        lb_s1.setForeground(new java.awt.Color(51, 51, 255));
        lb_s1.setText("share1");
        jPanel2.add(lb_s1);
        lb_s1.setBounds(70, 520, 210, 14);

        lb_s2.setForeground(new java.awt.Color(51, 51, 255));
        lb_s2.setText("jLabel1");
        jPanel2.add(lb_s2);
        lb_s2.setBounds(330, 520, 240, 14);

        lb_over.setForeground(new java.awt.Color(51, 51, 255));
        lb_over.setText("jLabel1");
        jPanel2.add(lb_over);
        lb_over.setBounds(624, 520, 250, 14);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Share 1");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(140, 290, 120, 28);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Share 2");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(420, 290, 130, 28);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("Overlap");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(690, 290, 150, 28);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 174, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_themhkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_themhkActionPerformed
            File chooseFile;
            String currentDirectory = "C:\\Users\\Laptop88\\Desktop";
            JFileChooser fileChooser = new JFileChooser(currentDirectory);
            int chooser = fileChooser.showOpenDialog(null);
            if (chooser == JFileChooser.APPROVE_OPTION) {
                chooseFile = fileChooser.getSelectedFile();
                tf_path.setText(chooseFile+"");
                try {
                    BufferedImage img=ImageIO.read(new File(tf_path.getText().trim()));
                    Image dimg = img.getScaledInstance(lb1.getWidth(), lb1.getHeight(),
                    Image.SCALE_SMOOTH);
                    ImageIcon icon=new ImageIcon(dimg);
                    lb1.setIcon(icon);
                    jPanel2.add(lb1);
                    jPanel2.validate();
                    jPanel2.repaint();
                    lb_or.setText(chooseFile+"");
                } catch (IOException ex) {
                    Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
    }//GEN-LAST:event_bt_themhkActionPerformed

    private void bt_themmonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_themmonActionPerformed
            File chooseFile;
            String currentDirectory = "C:\\Users\\Laptop88\\Desktop";
            JFileChooser fileChooser = new JFileChooser(currentDirectory);
            int chooser = fileChooser.showOpenDialog(null);
            if (chooser == JFileChooser.APPROVE_OPTION) {
                chooseFile = fileChooser.getSelectedFile();
                tf_pathdecode.setText(chooseFile+"");
                BufferedImage img;
                try {
                    img = ImageIO.read(new File(tf_pathdecode.getText().trim()));
                    Image dimg = img.getScaledInstance(lb2.getWidth(), lb2.getHeight(),
                    Image.SCALE_SMOOTH);
                    ImageIcon icon=new ImageIcon(dimg);
                    lb2.setIcon(icon);
                    jPanel2.add(lb2);
                    jPanel2.validate();
                    jPanel2.repaint();
                } catch (IOException ex) {
                    Logger.getLogger(Form_VC.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }//GEN-LAST:event_bt_themmonActionPerformed

    private void tf_pathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_pathActionPerformed
    @Override
    public void tableChanged(TableModelEvent e) {
        
    }
    private void bt_xoahkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_xoahkActionPerformed
       
    }//GEN-LAST:event_bt_xoahkActionPerformed

    private void bt_decodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_decodeActionPerformed
        if(tf_pathdecode.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Vui lòng chọn ảnh giải mã", "Error",JOptionPane.ERROR_MESSAGE);
        }else{
            String path = tf_pathdecode.getText().trim();
            Share share = new Share();
            try {
                String pathShare = share.generateShare(path);
                String pathShare1 = pathShare.split("\\$")[0];
                String pathShare2 = pathShare.split("\\$")[1];
                pathS1 = pathShare1;
                pathS2 = pathShare2;
                BufferedImage img;
                img = ImageIO.read(new File(pathShare1));
                Image dimg = img.getScaledInstance(lb_share1.getWidth(), lb_share1.getHeight(),
                Image.SCALE_SMOOTH);
                ImageIcon icon=new ImageIcon(dimg);
                lb_share1.setIcon(icon);
                jPanel2.add(lb_share1);
                jPanel2.validate();
                jPanel2.repaint();
                lb_s1.setText(pathS1);
                img = ImageIO.read(new File(pathShare2));
                Image dimg1 = img.getScaledInstance(lb_share2.getWidth(), lb_share2.getHeight(),
                Image.SCALE_SMOOTH);
                ImageIcon icon1=new ImageIcon(dimg1);
                lb_share2.setIcon(icon1);
                jPanel2.add(lb_share2);
                jPanel2.validate();
                jPanel2.repaint();
                lb_s2.setText(pathS2);
                JOptionPane.showMessageDialog(this,"Tạo share thành công", "Error",JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
                Logger.getLogger(Form_VC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }//GEN-LAST:event_bt_decodeActionPerformed

    private void bt_encodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_encodeActionPerformed
        if(tf_message.getText().trim().equals("") || tf_path.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this,"Vui lòng nhập đầy đủ thông tin", "Error",JOptionPane.ERROR_MESSAGE);
        }else{
            String path = tf_path.getText().trim();
            String mess = tf_message.getText().trim();
            len = mess.length();
            Encoder encoder = new Encoder();
            BufferedImage original;
            try {
                original = ImageIO.read(new File(path));
                String pathEncode = encoder.encode(original, mess.trim());
                BufferedImage img=ImageIO.read(new File(pathEncode));
                Image dimg = img.getScaledInstance(lb2.getWidth(), lb2.getHeight(),
                Image.SCALE_SMOOTH);
                ImageIcon icon=new ImageIcon(dimg);
                lb2.setIcon(icon);
                jPanel2.add(lb2);
                jPanel2.revalidate();
                jPanel2.repaint();
                lb_imgsc.setText(pathEncode);
                JOptionPane.showMessageDialog(this,"Ẩn thành công thông điệp vào ảnh");
            } catch (IOException ex) {
                Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this,"Có lỗi xẩy ra.Vui lòng thử lại!", "Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_bt_encodeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!"".equals(pathS1) && !"".equals(pathS2)){
            Share share = new Share();
            try {
                String pathOvelap = share.overLapping(pathS1, pathS2);
                BufferedImage img=ImageIO.read(new File(pathOvelap));
                Image dimg = img.getScaledInstance(lb_overlap.getWidth(), lb_overlap.getHeight(),
                Image.SCALE_SMOOTH);
                ImageIcon icon=new ImageIcon(dimg);
                lb_overlap.setIcon(icon);
                jPanel2.add(lb_overlap);
                jPanel2.revalidate();
                jPanel2.repaint();
                lb_over.setText(pathOvelap);
                JOptionPane.showMessageDialog(this,"Phục hồi thành công ảnh");
            } catch (IOException ex) {
                Logger.getLogger(Form_VC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Có lỗi xẩy ra.Vui lòng thử lại!", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        File chooseFile;
            String currentDirectory = "C:\\Users\\Laptop88\\Desktop";
            JFileChooser fileChooser = new JFileChooser(currentDirectory);
            int chooser = fileChooser.showOpenDialog(null);
            if (chooser == JFileChooser.APPROVE_OPTION) {
                chooseFile = fileChooser.getSelectedFile();
                jTextField1.setText(chooseFile+"");
                try {
                    BufferedImage img=ImageIO.read(new File(jTextField1.getText().trim()));
                    Image dimg = img.getScaledInstance(lb1.getWidth(), lb1.getHeight(),
                    Image.SCALE_SMOOTH);
                    ImageIcon icon=new ImageIcon(dimg);
                    lb1.setIcon(icon);
                    jPanel2.add(lb1);
                    jPanel2.validate();
                    jPanel2.repaint();
                    lb_over.setText(chooseFile+"");
                } catch (IOException ex) {
                    Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Decoder decoder = new Decoder();
        BufferedImage img;
        try {
            img = ImageIO.read(new File(jTextField1.getText().trim()));
            String textBinary = decoder.decode(img, len*8);
            String plainText = "";
            String blockBig = Converter.prettyBinary(textBinary, 8, " ");
            String[] blockSmall = blockBig.split("\\ ");
            for (String block : blockSmall) {
                int charCode = Integer.parseInt(block, 2);
                String str = new Character((char) charCode).toString();
                plainText += str;
            }
            tb_result.setText(plainText);
            JOptionPane.showMessageDialog(this,"Giải mã thông điệp thành công");
        } catch (IOException ex) {
            Logger.getLogger(Form_VC.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_decode;
    private javax.swing.JButton bt_encode;
    private javax.swing.JButton bt_themhk;
    private javax.swing.JButton bt_themmon;
    private javax.swing.JButton bt_xoahk;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb_imgsc;
    private javax.swing.JLabel lb_or;
    private javax.swing.JLabel lb_over;
    private javax.swing.JLabel lb_overlap;
    private javax.swing.JLabel lb_s1;
    private javax.swing.JLabel lb_s2;
    private javax.swing.JLabel lb_share1;
    private javax.swing.JLabel lb_share2;
    private javax.swing.JTextArea tb_result;
    private javax.swing.JTextField tf_message;
    private javax.swing.JTextField tf_path;
    private javax.swing.JTextField tf_pathdecode;
    // End of variables declaration//GEN-END:variables

}
