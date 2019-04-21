/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applic_salle_presse;

import java.awt.Component;
import java.awt.Dialog.ModalityType;
import java.awt.Dimension;
import java.awt.PopupMenu;
import java.awt.Toolkit;
import java.awt.event.*;
import java.text.DateFormat;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Kevin
 */
public class Applic_Salle_Presse extends javax.swing.JFrame {

    /**
     * Creates new form Applic_Salle_Presses
     */
    
    private Journaliste nomJ;
    static Hashtable htNews = new Hashtable();
    
    public Applic_Salle_Presse() {
        initComponents();
        setTitle("\"Le clairon rapporteur\" - Le journal de l'élite qui aime savoir");
        
        // centrer fenetre
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        //Parametre date
        JMenuItem jMenuItemParamDate = new JMenuItem("Paramètres date");
        jMenuAide.add(jMenuItemParamDate);
        jMenuItemParamDate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                Date aujourdhui = new Date();
                DateFormat shortDateFormat = DateFormat.getDateTimeInstance(
                        DateFormat.SHORT,
                        DateFormat.SHORT);
                DateFormat mediumDateFormat = DateFormat.getDateTimeInstance(
                        DateFormat.MEDIUM,
                        DateFormat.MEDIUM);
                DateFormat longDateFormat = DateFormat.getDateTimeInstance(
                        DateFormat.LONG,
                        DateFormat.LONG);
                DateFormat fullDateFormat = DateFormat.getDateTimeInstance(
                        DateFormat.FULL,
                        DateFormat.FULL);
                JPanel panel = new JPanel();
                JLabel JlabelNom = new JLabel("Choisissez le nouvel affichage de la date et heure :");
                JComboBox<String> combobox = new JComboBox<String>();
                combobox.addItem(shortDateFormat.format(aujourdhui));
                combobox.addItem(mediumDateFormat.format(aujourdhui));
                combobox.addItem(longDateFormat.format(aujourdhui));
                combobox.addItem(fullDateFormat.format(aujourdhui));
                panel.add(JlabelNom);
                panel.add(combobox);
                String[] options = new String[]{"OK", "Annuler"};
                JOptionPane.showOptionDialog(null, panel, "Parametre date-heure",
                        0, JOptionPane.PLAIN_MESSAGE,
                        null, options, options[1]);
            }
        });
        
        //Menu aide
        JMenuItem jMenuItemLog = new JMenuItem("Afficher le log");
        jMenuAide.add(jMenuItemLog);
        JPopupMenu.Separator jSeparator = new JPopupMenu.Separator();
        jMenuAide.add(jSeparator);
        JMenuItem jMenuItemAPropos = new JMenuItem("A propos de ...");
        jMenuItemAPropos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                JPanel panel = new JPanel();
                JLabel JlabelNom = new JLabel("<html> Cette application a été dévelopée par : <br> Kevin Ratz <br> Maxime Troisfontaine <br> Date : 31-03-2019.</html>");
                panel.add(JlabelNom);
                String[] options = new String[]{"OK"};
                JOptionPane.showOptionDialog(null, panel, "A propos de cette application",
                        0, JOptionPane.PLAIN_MESSAGE,
                        null, options, null);
            }
        });
        jMenuAide.add(jMenuItemAPropos);
        Date aujourdhui = new Date();
        DateFormat shortDateFormat = DateFormat.getDateInstance(
                        DateFormat.SHORT);
        jLabelDate.setText(shortDateFormat.format(aujourdhui));
        java.net.URL imageURL = this.getClass().getResource("black_diamond.png");
        jMenuItemStartReception.setIcon(new ImageIcon(imageURL));
                
        String[] matieres = {"Informatique", "Mécanique", "Gestion", "Electricité"};
        jComboBoxNews.addItem(matieres[0]);
        jComboBoxNews.addItem(matieres[1]);
        jComboBoxNews.addItem(matieres[2]);
        jComboBoxNews.addItem(matieres[3]);
        
        // grouper radiobutton
        ButtonGroup buttonGroupPreferences = new ButtonGroup();
        buttonGroupPreferences.add(jRadioButtonInter);
        buttonGroupPreferences.add(jRadioButtonPolitique);
        buttonGroupPreferences.add(jRadioButtonRagot);
        buttonGroupPreferences.add(jRadioButtonSports);
        
        
        htNews.put("Informatique","Info-Informatique-IT");
        htNews.put("Mécanique","Meca-Mecanique");
        htNews.put("Information","Info/Information");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxNews = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButtonTraiter = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonSupp = new javax.swing.JButton();
        jRadioButtonInter = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListInter = new javax.swing.JList<>();
        jRadioButtonPolitique = new javax.swing.JRadioButton();
        jRadioButtonSports = new javax.swing.JRadioButton();
        jRadioButtonRagot = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListPolitique = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListSports = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListRagot = new javax.swing.JList<>();
        jButtonEdit = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jCheckBoxNews = new javax.swing.JCheckBox();
        jButtonLire = new javax.swing.JButton();
        jButtonConfRecep = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButtonSend = new javax.swing.JButton();
        jLabelNomJ = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuUsers = new javax.swing.JMenu();
        jMenuItemLogin = new javax.swing.JMenuItem();
        jMenuItemLogout = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemNew = new javax.swing.JMenuItem();
        jMenuItemListe = new javax.swing.JMenuItem();
        jMenuConnexions = new javax.swing.JMenu();
        jMenuItemStartReception = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuRech = new javax.swing.JMenu();
        jMenuItemRechCat = new javax.swing.JMenuItem();
        jMenuItemRechMotCle = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItemNewsPeople = new javax.swing.JMenuItem();
        jMenuAide = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Journaliste : ");

        jLabel2.setText("News reçues :");

        jLabel3.setText("Ajouter news : ");

        jLabel4.setText("Nous sommes le :");

        jButtonTraiter.setText("Traiter");
        jButtonTraiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTraiterActionPerformed(evt);
            }
        });

        jButtonAdd.setText("Ajouter");

        jButtonSupp.setText("Supprimer");

        jRadioButtonInter.setText("Internationales");

        jListInter.setToolTipText("");
        jScrollPane1.setViewportView(jListInter);

        jRadioButtonPolitique.setText("Vie politique");

        jRadioButtonSports.setText("Infos sports");

        jRadioButtonRagot.setText("Ragot et potins");

        jScrollPane2.setViewportView(jListPolitique);

        jScrollPane3.setViewportView(jListSports);

        jScrollPane4.setViewportView(jListRagot);

        jButtonEdit.setText("Editer");

        jCheckBoxNews.setText("News reçue !");

        jButtonLire.setText("Lire la news");

        jButtonConfRecep.setText("Confirmer réception");

        jLabel5.setText("OU");

        jButtonSend.setText("Envoyer message");

        jMenuUsers.setText("Utilisateurs");

        jMenuItemLogin.setText("Login");
        jMenuItemLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLoginActionPerformed(evt);
            }
        });
        jMenuUsers.add(jMenuItemLogin);

        jMenuItemLogout.setText("Logout");
        jMenuItemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLogoutActionPerformed(evt);
            }
        });
        jMenuUsers.add(jMenuItemLogout);
        jMenuUsers.add(jSeparator2);

        jMenuItemNew.setText("Nouveau");
        jMenuUsers.add(jMenuItemNew);

        jMenuItemListe.setText("Liste");
        jMenuUsers.add(jMenuItemListe);

        jMenuBar1.add(jMenuUsers);

        jMenuConnexions.setText("Connexions");

        jMenuItemStartReception.setText("Démarrer réceptions");
        jMenuItemStartReception.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuConnexions.add(jMenuItemStartReception);

        jMenuItem2.setText("Arrêter réceptions");
        jMenuConnexions.add(jMenuItem2);
        jMenuConnexions.add(jSeparator3);

        jMenuItem3.setText("Liste des ports");
        jMenuConnexions.add(jMenuItem3);

        jMenuItem4.setText("Liste des messages reçus");
        jMenuConnexions.add(jMenuItem4);

        jMenuBar1.add(jMenuConnexions);

        jMenuRech.setText("Recherches");

        jMenuItemRechCat.setText("Par catégorie");
        jMenuRech.add(jMenuItemRechCat);

        jMenuItemRechMotCle.setText("Par mot clé");
        jMenuItemRechMotCle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRechMotCleActionPerformed(evt);
            }
        });
        jMenuRech.add(jMenuItemRechMotCle);
        jMenuRech.add(jSeparator4);

        jMenuItemNewsPeople.setText("News people");
        jMenuRech.add(jMenuItemNewsPeople);

        jMenuBar1.add(jMenuRech);

        jMenuAide.setText("Aide");
        jMenuBar1.add(jMenuAide);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jComboBoxNews, 0, 150, Short.MAX_VALUE)
                            .addComponent(jLabelNomJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(224, 224, 224)
                                .addComponent(jButtonTraiter))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(224, 224, 224)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonSupp)
                                    .addComponent(jButtonAdd)
                                    .addComponent(jRadioButtonSports))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jRadioButtonInter)
                        .addGap(115, 115, 115)
                        .addComponent(jRadioButtonPolitique)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(253, 253, 253)
                                .addComponent(jRadioButtonRagot))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonEdit)
                .addGap(373, 373, 373))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jCheckBoxNews)
                        .addGap(29, 29, 29)
                        .addComponent(jButtonLire)
                        .addGap(201, 201, 201)
                        .addComponent(jButtonConfRecep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSend)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4)
                                .addComponent(jLabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelNomJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBoxNews, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonTraiter))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAdd))
                        .addGap(33, 33, 33)
                        .addComponent(jButtonSupp)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonInter, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButtonPolitique, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRadioButtonRagot)
                                .addComponent(jRadioButtonSports)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addComponent(jButtonEdit)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxNews)
                    .addComponent(jButtonLire)
                    .addComponent(jButtonConfRecep)
                    .addComponent(jLabel5)
                    .addComponent(jButtonSend))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Traitement()
    {
        //nomJ = new Journaliste();
        //jLabelNomJ.setText(nomJ);//.getJournaliste());
    }
    
    
    private void jButtonTraiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTraiterActionPerformed
        JDialogTraitementNews jdtn =  new JDialogTraitementNews(this, rootPaneCheckingEnabled);
        jdtn.setModalityType(ModalityType.APPLICATION_MODAL);
        jdtn.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        jdtn.setVisible(true);
        
        /*JOptionPane.showConfirmDialog(null, options,
                "Don't forget to Tick it!",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
*/
    }//GEN-LAST:event_jButtonTraiterActionPerformed

    private void jMenuItemLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLoginActionPerformed
        LoginJDialog l =  new LoginJDialog(this,rootPaneCheckingEnabled);
        l.setModalityType(ModalityType.APPLICATION_MODAL);
        l.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        l.setVisible(true);
        jLabelNomJ.setText(l.nomJ.getJournaliste());
    }//GEN-LAST:event_jMenuItemLoginActionPerformed

    private void jMenuItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLogoutActionPerformed
        jLabelNomJ.setText("");
        Vector vDefauts = new Vector();
        jListInter.setListData(vDefauts);
        jListPolitique.setListData(vDefauts);
        jListRagot.setListData(vDefauts);
        jListSports.setListData(vDefauts);
    }//GEN-LAST:event_jMenuItemLogoutActionPerformed

    private void jMenuItemRechMotCleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRechMotCleActionPerformed
        String mcDialog = JOptionPane.showInputDialog("Rechercher une news par un mot clé :");
        if(!mcDialog.equals(""))
        {
            String[] splitmot;
            ArrayList listNews = new ArrayList();
            for(Object item : htNews.keySet()){
                splitmot=htNews.get(item).toString().split("[-\\/]");
                for (String splitmot1 : splitmot) {
                    if (splitmot1.equals(mcDialog)) {
                        listNews.add(item);
                        break;
                    }
                }
            }
            if(!listNews.isEmpty())
            {
                JList list = new JList(listNews.toArray());
                JDialog waitDialog = new JDialog( this, "Paused", true );
                waitDialog.setDefaultCloseOperation( JDialog.DISPOSE_ON_CLOSE);
                
                list.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent me) {
                       if (me.getClickCount() == 2) {
                           Object news = list.getSelectedValue();
                           Object[] message = { "Détail de la news recherchée :", news };
                            JOptionPane.showMessageDialog(
                                null, message, "Liste des news recherchées",JOptionPane.YES_OPTION);
                       }
                    }
                 });
                
                waitDialog.getContentPane().add( list );
                waitDialog.pack();
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                waitDialog.setLocation(dim.width/2-waitDialog.getSize().width/2, dim.height/2-waitDialog.getSize().height/2);
                waitDialog.setVisible(true);
                
                
                Object[] options = {""};
                        // On utilise showOptionDialog(), qui propose l'interface la plus complète :
                
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Aucune news trouvées");
            }
        }
    }//GEN-LAST:event_jMenuItemRechMotCleActionPerformed

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
            java.util.logging.Logger.getLogger(Applic_Salle_Presse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Applic_Salle_Presse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Applic_Salle_Presse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Applic_Salle_Presse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Applic_Salle_Presse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonConfRecep;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonLire;
    private javax.swing.JButton jButtonSend;
    private javax.swing.JButton jButtonSupp;
    private javax.swing.JButton jButtonTraiter;
    private javax.swing.JCheckBox jCheckBoxNews;
    private javax.swing.JComboBox<String> jComboBoxNews;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelNomJ;
    private javax.swing.JList<String> jListInter;
    private javax.swing.JList<String> jListPolitique;
    private javax.swing.JList<String> jListRagot;
    private javax.swing.JList<String> jListSports;
    private javax.swing.JMenu jMenuAide;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuConnexions;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItemListe;
    private javax.swing.JMenuItem jMenuItemLogin;
    private javax.swing.JMenuItem jMenuItemLogout;
    private javax.swing.JMenuItem jMenuItemNew;
    private javax.swing.JMenuItem jMenuItemNewsPeople;
    private javax.swing.JMenuItem jMenuItemRechCat;
    private javax.swing.JMenuItem jMenuItemRechMotCle;
    private javax.swing.JMenuItem jMenuItemStartReception;
    private javax.swing.JMenu jMenuRech;
    private javax.swing.JMenu jMenuUsers;
    private javax.swing.JRadioButton jRadioButtonInter;
    private javax.swing.JRadioButton jRadioButtonPolitique;
    private javax.swing.JRadioButton jRadioButtonRagot;
    private javax.swing.JRadioButton jRadioButtonSports;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
