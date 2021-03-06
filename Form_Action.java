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
public class Form_Action extends javax.swing.JFrame implements TableModelListener {

    public static int len;

    public Form_Action() {
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
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_result = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Giải mã ảnh", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(255, 0, 0))); // NOI18N

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
        bt_decode.setText("Decode");
        bt_decode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_decodeActionPerformed(evt);
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
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Giải mã thông điệp", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel5.setPreferredSize(new java.awt.Dimension(324, 235));

        tb_result.setColumns(20);
        tb_result.setRows(5);
        jScrollPane1.setViewportView(tb_result);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(1025, 1000));
        jPanel2.setLayout(null);
        jPanel2.add(lb1);
        lb1.setBounds(389, 11, 506, 332);
        jPanel2.add(lb2);
        lb2.setBounds(389, 354, 506, 332);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Processed image");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Original image");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 390, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(30, 30, 30))
        );

        jPanel2.add(jPanel6);
        jPanel6.setBounds(72, 89, 264, 548);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
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
                        .addGap(0, 179, Short.MAX_VALUE))
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
                    Logger.getLogger(Form_Action.class.getName()).log(Level.SEVERE, null, ex);
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
            Decoder decoder = new Decoder();
            String path = tf_pathdecode.getText().trim();
            String textBinary;
            try {
                textBinary = decoder.decode(decoder.getImage(path),len * 8);
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
                Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
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
                JOptionPane.showMessageDialog(this,"Ẩn thành công thông điệp vào ảnh");
            } catch (IOException ex) {
                Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this,"Có lỗi xẩy ra.Vui lòng thử lại!", "Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_bt_encodeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_decode;
    private javax.swing.JButton bt_encode;
    private javax.swing.JButton bt_themhk;
    private javax.swing.JButton bt_themmon;
    private javax.swing.JButton bt_xoahk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JTextArea tb_result;
    private javax.swing.JTextField tf_message;
    private javax.swing.JTextField tf_path;
    private javax.swing.JTextField tf_pathdecode;
    // End of variables declaration//GEN-END:variables

}
