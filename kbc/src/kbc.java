import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Image;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/*
@author Upendra & Sreekrishnan 
 */
public class kbc extends javax.swing.JFrame {
    public kbc() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        play = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ques = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        ans1 = new javax.swing.JRadioButton();
        ans2 = new javax.swing.JRadioButton();
        ans3 = new javax.swing.JRadioButton();
        ans4 = new javax.swing.JRadioButton();
        admin = new javax.swing.JFrame();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        add = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        quest = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        opt1 = new javax.swing.JTextField();
        opt2 = new javax.swing.JTextField();
        opt3 = new javax.swing.JTextField();
        opt4 = new javax.swing.JTextField();
        ans = new javax.swing.JComboBox();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        delete = new javax.swing.JFrame();
        no1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTextArea();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        change = new javax.swing.JFrame();
        jLabel16 = new javax.swing.JLabel();
        ssnnoo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cor = new javax.swing.JComboBox();
        opp1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        opp4 = new javax.swing.JTextField();
        opp3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        opp2 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        ques3 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        annss = new javax.swing.JTextField();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTextArea();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        pic1 = new javax.swing.JLabel();

        play.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        play.setResizable(false);
        play.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                playWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Nyala", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Play");

        jLabel3.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel3.setText("Question");

        ques.setEditable(false);
        ques.setColumns(20);
        ques.setLineWrap(true);
        ques.setRows(5);
        jScrollPane1.setViewportView(ques);

        jButton4.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jButton4.setText("submit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jButton5.setText("back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jButton6.setText("exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        buttonGroup1.add(ans1);
        ans1.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N

        buttonGroup1.add(ans2);
        ans2.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N

        buttonGroup1.add(ans3);
        ans3.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N

        buttonGroup1.add(ans4);
        ans4.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N

        javax.swing.GroupLayout playLayout = new javax.swing.GroupLayout(play.getContentPane());
        play.getContentPane().setLayout(playLayout);
        playLayout.setHorizontalGroup(
            playLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(playLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))
                    .addGroup(playLayout.createSequentialGroup()
                        .addGroup(playLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ans3, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(ans1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(playLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ans2, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(ans4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29))
                    .addGroup(playLayout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addContainerGap())
        );
        playLayout.setVerticalGroup(
            playLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(playLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(playLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ans1)
                    .addComponent(ans2))
                .addGap(28, 28, 28)
                .addGroup(playLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ans3)
                    .addComponent(ans4))
                .addGap(6, 6, 6)
                .addGroup(playLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        admin.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        admin.setMinimumSize(new java.awt.Dimension(390, 165));
        admin.setResizable(false);

        jButton7.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jButton7.setText("add");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jButton8.setText("delete");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jButton9.setText("change");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jButton10.setText("back");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jButton11.setText("exit");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminLayout = new javax.swing.GroupLayout(admin.getContentPane());
        admin.getContentPane().setLayout(adminLayout);
        adminLayout.setHorizontalGroup(
            adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, adminLayout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        adminLayout.setVerticalGroup(
            adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        add.setMinimumSize(new java.awt.Dimension(400, 290));

        jLabel4.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jLabel4.setText("Question");

        quest.setColumns(20);
        quest.setRows(5);
        jScrollPane2.setViewportView(quest);

        jLabel5.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jLabel5.setText("Option 1");

        jLabel6.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jLabel6.setText("Option 2");

        jLabel7.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jLabel7.setText("Option 3");

        jLabel8.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jLabel8.setText("Option 4");

        opt1.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N

        opt2.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N

        opt3.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N

        opt4.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N

        ans.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        ans.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Option 1", "Option 2", "Option 3", "Option 4" }));

        jButton12.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jButton12.setText("Add");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jButton13.setText("Back");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jButton14.setText("Exit");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton24.setText("Clear");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addLayout = new javax.swing.GroupLayout(add.getContentPane());
        add.getContentPane().setLayout(addLayout);
        addLayout.setHorizontalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addLayout.createSequentialGroup()
                        .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addLayout.createSequentialGroup()
                                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(addLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(opt1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(addLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(opt3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(69, 69, 69)
                                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(addLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(opt2))
                                    .addGroup(addLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(opt4, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(addLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addLayout.createSequentialGroup()
                        .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(addLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65))
                            .addGroup(addLayout.createSequentialGroup()
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)))
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        addLayout.setVerticalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(23, 23, 23)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(opt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(opt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 20, Short.MAX_VALUE)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(jButton13)
                    .addComponent(jButton14))
                .addContainerGap())
        );

        delete.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        delete.setMinimumSize(new java.awt.Dimension(370, 295));

        no1.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jLabel9.setText("Sno.");

        jButton15.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jButton15.setText("Delete");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jButton16.setText("View table");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        table1.setColumns(20);
        table1.setRows(5);
        jScrollPane3.setViewportView(table1);

        jButton17.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jButton17.setText("Back");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jButton18.setText("Exit");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deleteLayout = new javax.swing.GroupLayout(delete.getContentPane());
        delete.getContentPane().setLayout(deleteLayout);
        deleteLayout.setHorizontalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteLayout.createSequentialGroup()
                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deleteLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel9)
                        .addGap(43, 43, 43)
                        .addComponent(no1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteLayout.createSequentialGroup()
                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteLayout.createSequentialGroup()
                                .addGap(0, 2, Short.MAX_VALUE)
                                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                                        .addComponent(jButton15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        deleteLayout.setVerticalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(no1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jButton15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18)
                    .addComponent(jButton17))
                .addContainerGap())
        );

        change.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        change.setFocusTraversalPolicyProvider(true);
        change.setMinimumSize(new java.awt.Dimension(400, 500));

        jLabel16.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("OPTION A");

        ssnnoo.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        ssnnoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssnnooActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("OPTION C");

        jLabel10.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jLabel10.setText("SNO");

        cor.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        cor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "OPTION 1", "OPTION 2", "OPTION 3", "OPTION 4" }));

        opp1.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("OPTION D");

        jLabel15.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jLabel15.setText("CORRECT");

        jLabel13.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("OPTION B");

        opp4.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N

        opp3.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jLabel18.setText("Correct Option");

        opp2.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N

        ques3.setColumns(20);
        ques3.setRows(5);
        jScrollPane4.setViewportView(ques3);

        jLabel12.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jLabel12.setText("Question");

        annss.setEditable(false);
        annss.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        annss.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton19.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jButton19.setText("UPDATE");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jButton20.setText("EXIT");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        table2.setColumns(20);
        table2.setRows(5);
        jScrollPane5.setViewportView(table2);

        jButton21.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jButton21.setText("BACK");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jButton22.setText("View Table");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout changeLayout = new javax.swing.GroupLayout(change.getContentPane());
        change.getContentPane().setLayout(changeLayout);
        changeLayout.setHorizontalGroup(
            changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5)
                    .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(changeLayout.createSequentialGroup()
                        .addGroup(changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(changeLayout.createSequentialGroup()
                                .addGroup(changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(opp3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(changeLayout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabel18))
                                    .addGroup(changeLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(annss, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(changeLayout.createSequentialGroup()
                                .addGroup(changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(opp1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(changeLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(opp2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(opp4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(changeLayout.createSequentialGroup()
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(changeLayout.createSequentialGroup()
                        .addGroup(changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ssnnoo)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        changeLayout.setVerticalGroup(
            changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ssnnoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(changeLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(4, 4, 4)
                        .addComponent(opp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(changeLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(4, 4, 4)
                        .addComponent(opp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(changeLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(7, 7, 7)
                        .addComponent(cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(annss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton21)
                    .addComponent(jButton20))
                .addGap(7, 7, 7))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(410, 200));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUIZ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 11, 380, 48);

        jButton1.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jButton1.setText("play");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 65, 380, 25);

        jButton2.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jButton2.setText("configure quiz database");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 96, 380, 25);

        jButton3.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jButton3.setText("exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(10, 127, 380, 25);
        getContentPane().add(pic1);
        pic1.setBounds(0, 0, 400, 160);

        pack();
    }// </editor-fold>//GEN-END:initComponents
ResultSet dml(String a)
{
    ResultSet rs=null;
try
{
Class.forName("java.sql.DriverManager");
    Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","dav");
    Statement stat=(Statement)con.createStatement();
    rs=stat.executeQuery(a);

}
catch(Exception e)
{
JOptionPane.showMessageDialog(null, e.getMessage());
}
return rs;
}
void ddl(String a)
{
try
{
Class.forName("java.sql.DriverManager");
    Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","dav");
    Statement stat=(Statement)con.createStatement();
    stat.executeUpdate(a);

}
catch(Exception e)
{
JOptionPane.showMessageDialog(null, e.getMessage());
}
}
void exit()
{
    admin.dispose();
    play.dispose();
System.exit(0);
}
void givequestion()
{
        ResultSet f=dml("select * from ques where sno="+g);
try{
   while(f.next()){
    ques.setText(f.getString("questions"));
    ans1.setText(f.getString("a"));
    ans2.setText(f.getString("b"));
    ans3.setText(f.getString("c"));
    ans4.setText(f.getString("d"));
   }}
catch(Exception e)
{
JOptionPane.showMessageDialog(null,e.getMessage());
}
}
int count()
{
    int a=0;
    ResultSet b=dml("select count(sno) \"a\" from ques");
    try{while(b.next())
    {
    a=b.getInt("a");
    }}
    catch(Exception e)
    {
    JOptionPane.showMessageDialog(null,e.getMessage());
    }
return a;
}
void setpic(String a,JLabel d)
{
      ImageIcon image = new ImageIcon(a);
    Image simage = image.getImage().getScaledInstance(d.getWidth(),d.getHeight(), Image.SCALE_SMOOTH);
    d.setIcon(new ImageIcon(simage));
}
int g=1;
int score=0;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.setVisible(false);
play.setSize(400,320);
play.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.setVisible(false);
admin.setVisible(true);   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
exit();     
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
exit();    
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
String a="";
        ResultSet h=dml("select * from ques where sno="+g);
        g++;
try
{
    while(h.next())
{
    a=h.getString("opt");
    if(ans1.isSelected())
    {
    if(ans1.getText().equals(h.getString(a)))
    {
JOptionPane.showMessageDialog(null,"Your answer is correct");   
    score++;}
    else
    {
    JOptionPane.showMessageDialog(null,"Your answer is wrong\ncorrect answer is "+h.getString(a));
    }
    }
    if(ans2.isSelected())
    {
    if(ans2.getText().equals(h.getString(a)))
    {
    JOptionPane.showMessageDialog(null,"Your answer is correct");
    score++;
    }
    else
    {
    JOptionPane.showMessageDialog(null,"Your answer is wrong\ncorrect answer is "+h.getString(a));
    }
    }
    if(ans3.isSelected())
    {
    if(ans3.getText().equals(h.getString(a)))
    {
JOptionPane.showMessageDialog(null,"Your answer is correct");  
    score++;
    }
    else
    {
    JOptionPane.showMessageDialog(null,"Your answer is wrong\ncorrect answer is "+h.getString(a));
    }
    }
    if(ans4.isSelected())
    {
    if(ans4.getText().equals(h.getString(a)))
    {
JOptionPane.showMessageDialog(null,"Your answer is correct");   
    score++;
    }
    else
    {
    JOptionPane.showMessageDialog(null,"Your answer is wrong\ncorrect answer is "+h.getString(a));
    }
    }
}
}catch(Exception e)
{
JOptionPane.showMessageDialog(null,e.getMessage());
}
if(g<=count())
{
givequestion();
}
else
        {
JOptionPane.showMessageDialog(null, score+"/"+count());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
g=0;
        play.setVisible(false);
play.dispose();
this.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void playWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_playWindowOpened
givequestion();
    }//GEN-LAST:event_playWindowOpened

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
exit();     
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
admin.setVisible(false);
admin.dispose();
        this.setVisible(true);     
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
admin.setVisible(false);
admin.dispose();
        add.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
exit();       
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
add.setVisible(false);
add.dispose();
        admin.setVisible(true);         
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
   String d="";
   switch(ans.getSelectedIndex())
           {
       case 0:d="a";break;
       case 1:d="b";break;
       case 2:d="c";break;
       case 3:d="d";break;
           }
    if(quest.getText().isEmpty() || opt1.getText().isEmpty() || opt2.getText().isEmpty() || opt3.getText().isEmpty() || opt4.getText().isEmpty() )
{
JOptionPane.showMessageDialog(null,"sorry some field is empty ,please write the information ");
}
    else{
           String a="insert into ques values("+(count()+1)+",\""+quest.getText()+"\",\""+opt1.getText()+"\",\""+opt2.getText()+"\",\""+opt3.getText()+"\",\""+opt4.getText()+"\",\""+d+"\")";
    ddl(a); 
    JOptionPane.showMessageDialog(null,"YOUR DATA IS ENTERED SUCCESSFULLY");
    }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
admin.setVisible(false);
admin.dispose();
        delete.setVisible(true);       
    }//GEN-LAST:event_jButton8ActionPerformed

    private void ssnnooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssnnooActionPerformed
String a="select * from ques where sno="+Integer.parseInt(ssnnoo.getText());
ResultSet d=dml(a);
try
{
    while(d.next())
    {
ques3.setText(d.getString("questions"));
opp1.setText(d.getString("a"));
opp2.setText(d.getString("b"));
opp3.setText(d.getString("c"));
opp4.setText(d.getString("d"));
annss.setText(d.getString("opt"));
    }
}
    catch(Exception e)
            {
JOptionPane.showMessageDialog(null,e.getMessage());
            }
    }//GEN-LAST:event_ssnnooActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
   String q="";
   switch(cor.getSelectedIndex())
           {
       case 0:q="a";break;
       case 1:q="b";break;
       case 2:q="c";break;
       case 3:q="d";break;
           }
    if(ques3.getText().isEmpty() || opp1.getText().isEmpty() || opp2.getText().isEmpty() || opp3.getText().isEmpty() || opp4.getText().isEmpty() )
{
JOptionPane.showMessageDialog(null,"sorry some field is empty ,please write the information ");
}
    else{
           String a="update ques set questions=\""+ques3.getText()+"\" where sno="+Integer.parseInt(ssnnoo.getText());
           String b="update ques set a=\""+opp1.getText()+"\" where sno="+Integer.parseInt(ssnnoo.getText());
           String c="update ques set b=\""+opp2.getText()+"\" where sno="+Integer.parseInt(ssnnoo.getText());
           String d="update ques set c=\""+opp3.getText()+"\" where sno="+Integer.parseInt(ssnnoo.getText());
           String e="update ques set d=\""+opp4.getText()+"\" where sno="+Integer.parseInt(ssnnoo.getText());
           String f="update ques set opt=\""+q+"\" where sno="+Integer.parseInt(ssnnoo.getText());
    ddl(a);ddl(b);ddl(c);ddl(d);ddl(e);ddl(f); 
    JOptionPane.showMessageDialog(null,"YOUR DATA IS UPDATED SUCCESSFULLY");
    } 
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
exit();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
change.setVisible(false);
change.dispose();
        admin.setVisible(true);    
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
table2.setText("");
        String a="select * from ques";
ResultSet d=dml(a);
try
{
    while(d.next())
    {
    table2.append("Question Number - "+d.getInt("sno")+"\n");
    table2.append("Question - "+d.getString("questions")+"\n"+"---------"+"\n");
    table2.append("Option 1 - "+d.getString("a")+"\n");
    table2.append("Option 2 - "+d.getString("b")+"\n");
    table2.append("Option 3 - "+d.getString("c")+"\n");
    table2.append("Option 4 - "+d.getString("d")+"\n");
    table2.append("Correct Option - "+d.getString("opt")+"\n");
    table2.append("-------------------------------------");
    }
        }
catch(Exception e){
JOptionPane.showMessageDialog(null,e.getMessage());
}
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
admin.setVisible(false);
admin.dispose();
        change.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        exit();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        delete.setVisible(false);
        delete.dispose();
        admin.setVisible(true);        
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        table1.setText("");
        String a="select * from ques";
        ResultSet d=dml(a);
        try
        {
            while(d.next())
            {
                table1.append("Question Number - "+d.getInt("sno")+"\n");
                table1.append("Question - "+d.getString("questions")+"\n"+"---------"+"\n");
                table1.append("Option 1 - "+d.getString("a")+"\n");
                table1.append("Option 2 - "+d.getString("b")+"\n");
                table1.append("Option 3 - "+d.getString("c")+"\n");
                table1.append("Option 4 - "+d.getString("d")+"\n");
                table1.append("Correct Option - "+d.getString("opt")+"\n");
                table1.append("-------------------------------------");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        if(!no1.getText().equals(""))
        {String a="Delete from ques where sno="+Integer.parseInt(no1.getText());
            JOptionPane.showMessageDialog(null,"DATA deleted successfully","sucess",1);
            ddl(a);
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
quest.setText("");
opt1.setText("");
opt2.setText(""); 
opt3.setText(""); 
opt4.setText(""); 
    }//GEN-LAST:event_jButton24ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
setpic("G:/pic/16.jpg",pic1); 

// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(kbc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kbc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kbc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kbc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kbc().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame add;
    private javax.swing.JFrame admin;
    private javax.swing.JTextField annss;
    private javax.swing.JComboBox ans;
    private javax.swing.JRadioButton ans1;
    private javax.swing.JRadioButton ans2;
    private javax.swing.JRadioButton ans3;
    private javax.swing.JRadioButton ans4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFrame change;
    private javax.swing.JComboBox cor;
    private javax.swing.JFrame delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField no1;
    private javax.swing.JTextField opp1;
    private javax.swing.JTextField opp2;
    private javax.swing.JTextField opp3;
    private javax.swing.JTextField opp4;
    private javax.swing.JTextField opt1;
    private javax.swing.JTextField opt2;
    private javax.swing.JTextField opt3;
    private javax.swing.JTextField opt4;
    private javax.swing.JLabel pic1;
    private javax.swing.JFrame play;
    private javax.swing.JTextArea ques;
    private javax.swing.JTextArea ques3;
    private javax.swing.JTextArea quest;
    private javax.swing.JTextField ssnnoo;
    private javax.swing.JTextArea table1;
    private javax.swing.JTextArea table2;
    // End of variables declaration//GEN-END:variables
}