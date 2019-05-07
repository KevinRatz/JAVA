/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applic_salle_presse;

import java.awt.Dialog.ModalityType;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
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
    
    public Journaliste nomJournaliste;
    static Hashtable htMotCle = new Hashtable();
    static Hashtable htJournaliste = new Hashtable();
    static Hashtable htNews = new Hashtable();
    static Vector<News> vNewsInter;
    static Vector<News> vNewsViePolitique;
    static Vector<News> vNewsInfoSport;
    static Vector<News> vNewsRagotPotin;
    public Applic_Salle_Presse() {
        initComponents();
        setTitle("\"Le clairon rapporteur\" - Le journal de l'élite qui aime savoir");
        
        /*!!!!!!!! TEMPORAIRE !!!!!!!!
        nomJournaliste = new Journaliste();
        nomJournaliste.setLogin("alexispierre");*/
        // créer les logins
        htJournaliste.put("lopezdimitri","ld");
        htJournaliste.put("dupuisalix","da");
        htJournaliste.put("alexispierre","ap");
        
        // centrer fenetre
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
      
        Date aujourdhui = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        jLabelDate.setText(dateFormat.format(aujourdhui));
        
        java.net.URL imageURL = this.getClass().getResource("black_diamond.png");
        jMenuItemStartReception.setIcon(new ImageIcon(imageURL));
                
        // grouper radiobutton
        ButtonGroup buttonGroupPreferences = new ButtonGroup();
        buttonGroupPreferences.add(jRadioButtonInter);
        buttonGroupPreferences.add(jRadioButtonPolitique);
        buttonGroupPreferences.add(jRadioButtonRagot);
        buttonGroupPreferences.add(jRadioButtonSports);
        
        jTextFieldAddNews.setEditable(false);
        
        htMotCle.put("Informatique","Info-Informatique-IT");
        htMotCle.put("Mécanique","Meca-Mecanique");
        htMotCle.put("coucou","Info/Information");
        
        vNewsInter = new Vector<News>();
        vNewsViePolitique = new Vector<News>();
        vNewsInfoSport = new Vector<News>();
        vNewsRagotPotin = new Vector<News>();
        
        htNews.put("Internationales", vNewsInter);
        htNews.put("Vie politique", vNewsViePolitique);
        htNews.put("Infos sports", vNewsInfoSport);
        htNews.put("Ragots et potins", vNewsRagotPotin);
        
        //effet click radio button
        jRadioButtonInter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jListInter.setEnabled(true);
                jListViePolitique.setEnabled(false);
                jListSports.setEnabled(false);
                jListRagot.setEnabled(false);
                jListViePolitique.clearSelection();
                jListSports.clearSelection();
                jListRagot.clearSelection();
            }
        });
        jRadioButtonPolitique.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jListInter.setEnabled(false);
                jListViePolitique.setEnabled(true);
                jListSports.setEnabled(false);
                jListRagot.setEnabled(false);
                jListInter.clearSelection();
                jListSports.clearSelection();
                jListRagot.clearSelection();
            }
        });
        jRadioButtonSports.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jListInter.setEnabled(false);
                jListViePolitique.setEnabled(false);
                jListSports.setEnabled(true);
                jListRagot.setEnabled(false);
                jListInter.clearSelection();
                jListViePolitique.clearSelection();
                jListRagot.clearSelection();
            }
        });
        jRadioButtonRagot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jListInter.setEnabled(false);
                jListViePolitique.setEnabled(false);
                jListSports.setEnabled(false);
                jListRagot.setEnabled(true);
                jListInter.clearSelection();
                jListViePolitique.clearSelection();
                jListSports.clearSelection();
            }
        });
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
        jTextFieldAddNews = new javax.swing.JTextField();
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
        jListViePolitique = new javax.swing.JList<>();
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
        jMenuParamDate = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItemAPropos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonSupp.setText("Supprimer");
        jButtonSupp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuppActionPerformed(evt);
            }
        });

        jRadioButtonInter.setText("Internationales");

        jListInter.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListInter.setToolTipText("");
        jListInter.setEnabled(false);
        jScrollPane1.setViewportView(jListInter);

        jRadioButtonPolitique.setText("Vie politique");

        jRadioButtonSports.setText("Infos sports");

        jRadioButtonRagot.setText("Ragot et potins");

        jListViePolitique.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListViePolitique.setEnabled(false);
        jScrollPane2.setViewportView(jListViePolitique);

        jListSports.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListSports.setEnabled(false);
        jScrollPane3.setViewportView(jListSports);

        jListRagot.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListRagot.setEnabled(false);
        jScrollPane4.setViewportView(jListRagot);

        jButtonEdit.setText("Editer");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

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
        jMenuItemNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNewActionPerformed(evt);
            }
        });
        jMenuUsers.add(jMenuItemNew);

        jMenuItemListe.setText("Liste");
        jMenuItemListe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListeActionPerformed(evt);
            }
        });
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
        jMenuItemRechCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRechCatActionPerformed(evt);
            }
        });
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

        jMenuParamDate.setText("Paramètres date");
        jMenuParamDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuParamDateActionPerformed(evt);
            }
        });
        jMenuAide.add(jMenuParamDate);

        jMenuItem1.setText("Afficher le log");
        jMenuAide.add(jMenuItem1);
        jMenuAide.add(jSeparator5);

        jMenuItemAPropos.setText("A propos");
        jMenuItemAPropos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAProposActionPerformed(evt);
            }
        });
        jMenuAide.add(jMenuItemAPropos);

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
                            .addComponent(jTextFieldAddNews)
                            .addComponent(jComboBoxNews, 0, 150, Short.MAX_VALUE)
                            .addComponent(jLabelNomJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(222, 222, 222)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRadioButtonSports)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonTraiter)
                                        .addComponent(jButtonSupp)
                                        .addComponent(jButtonAdd)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jRadioButtonInter)
                        .addGap(115, 115, 115)
                        .addComponent(jRadioButtonPolitique)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jRadioButtonRagot)
                                .addGap(40, 40, 40))))))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
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
            .addGroup(layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(jButtonEdit)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
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
                    .addComponent(jTextFieldAddNews, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdd))
                .addGap(18, 18, 18)
                .addComponent(jButtonSupp)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonInter, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButtonPolitique, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButtonRagot)
                        .addComponent(jRadioButtonSports)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButtonEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxNews)
                    .addComponent(jButtonLire)
                    .addComponent(jButtonConfRecep)
                    .addComponent(jLabel5)
                    .addComponent(jButtonSend))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    private void jMenuItemLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLoginActionPerformed
        try
        {
            if(!jLabelNomJ.getText().isEmpty())
            {
                throw new LoginException("Veuillez d'abord vous déconnecter !!!");
            }
            else
            {
                LoginJDialog l =  new LoginJDialog(this,rootPaneCheckingEnabled,htJournaliste);
                l.setModalityType(ModalityType.APPLICATION_MODAL);
                l.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                l.setVisible(true);
                jLabelNomJ.setText(l.login);
                nomJournaliste = new Journaliste();
                nomJournaliste.setLogin(l.login);
                jTextFieldAddNews.setEditable(true);
                Vector<Vector> list = new Vector<Vector>();
                list.add(vNewsInter);
                list.add(vNewsInfoSport);
                list.add(vNewsViePolitique);
                list.add(vNewsRagotPotin);
                Vector<JList> vList = new Vector<JList>();
                vList.add(jListInter);
                vList.add(jListSports);
                vList.add(jListViePolitique);
                vList.add(jListRagot);
                for(int i=0;i<4;i++)
                {
                    DefaultListModel listTitreNews = new DefaultListModel();
                    listTitreNews=RemplirjLists(list.get(i),false);
                    vList.get(i).setModel(listTitreNews);
                }
            }
        } catch (LoginException e) {
            JLabel erreur = new JLabel(e.getErrorMessage());
            JOptionPane.showMessageDialog(this, erreur, "Info", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItemLoginActionPerformed
    
    private DefaultListModel RemplirjLists(Vector temp,boolean rech)
    {
        DefaultListModel listNews = new DefaultListModel();
        for(int i=0; i < temp.size(); i++)
        {
            News o = (News) temp.elementAt(i);
            Vector vMotCle = o.getMotCle();
            if(rech&&o.getJournaliste().getLogin().equals(nomJournaliste.getLogin())&&vMotCle.size()>0)
            {
                listNews.addElement(o);
            }
            else if(o.getJournaliste().getLogin().equals(nomJournaliste.getLogin()))
                listNews.addElement(o.getTitre());
        }
        return listNews;
    }
    
    private void jMenuItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLogoutActionPerformed
        try
        {
            if(!jLabelNomJ.getText().isEmpty())
            {
                jLabelNomJ.setText("");
                Vector vDefauts = new Vector();
                jListInter.setListData(vDefauts);
                jListViePolitique.setListData(vDefauts);
                jListRagot.setListData(vDefauts);
                jListSports.setListData(vDefauts);
                jTextFieldAddNews.setEditable(false);
            }
            else
            {
                throw new LoginException("Pas besoin vous n'etes pas connecté !!!");
            }
        } catch (LoginException e) {
            JLabel erreur = new JLabel(e.getErrorMessage());
            JOptionPane.showMessageDialog(this, erreur, "Info", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItemLogoutActionPerformed

    private void jMenuItemNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNewActionPerformed
        JPanel panelNom = new JPanel();
        panelNom.setLayout(new BoxLayout(panelNom,BoxLayout.Y_AXIS));
        panelNom.setAlignmentX(LEFT_ALIGNMENT);
        JLabel JlabelNom = new JLabel("Entrer votre nom suivi de votre prénom :");
        JlabelNom.setAlignmentX(LEFT_ALIGNMENT);
        JTextField JtfNom = new JTextField();
        panelNom.add(JlabelNom);
        panelNom.add(JtfNom);
        JPanel panelMdp = new JPanel();
        panelMdp.setLayout(new BoxLayout(panelMdp,BoxLayout.Y_AXIS));
        panelMdp.setAlignmentX(LEFT_ALIGNMENT);
        JLabel JlabelMdp = new JLabel("Entrer votre mot de passe :");
        JlabelMdp.setAlignmentX(LEFT_ALIGNMENT);
        JPasswordField JpfMdp = new JPasswordField();
        panelMdp.add(JlabelMdp);
        panelMdp.add(JpfMdp);
        
        // focus du textfield
        SwingUtilities.invokeLater(new Runnable() {
              public void run() {
                JtfNom.dispatchEvent(
                  new FocusEvent(JtfNom, FocusEvent.FOCUS_GAINED));
              }
            });
        
        // affichage dialogue d'ajout htJournaliste
        Object[] message = {panelNom,panelMdp};
        boolean ok = false;
        do {
            int jdialog = JOptionPane.showConfirmDialog(null, message,
                    "Nouveau journaliste",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if(jdialog==JOptionPane.OK_OPTION)
            {
                if(JtfNom.getText().isEmpty()||JpfMdp.getPassword()==null)
                {
                    JOptionPane.showMessageDialog(this, "Les champs ne peuvent pas être vide !!!", "Erreur création login",JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    String nom = JtfNom.getText();
                    String mdp = new String(JpfMdp.getPassword());
                    htJournaliste.put(nom, mdp);
                    ok=true;
                }
            }
            else
            {
                ok=true;
            }
        }while(!ok);
    }//GEN-LAST:event_jMenuItemNewActionPerformed

    private void jMenuItemListeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListeActionPerformed
        Enumeration enumeration = htJournaliste.keys();
        System.out.println("Liste des journalistes enregistrés \n");
        while(enumeration.hasMoreElements()) {
            Object key = enumeration.nextElement();
            System.out.println("Login : "  + key); //+ "\t\t Mot de passe : "  + htJournaliste.get(key));
        }
    }//GEN-LAST:event_jMenuItemListeActionPerformed

    private void jButtonSuppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuppActionPerformed
        jComboBoxNews.removeItem(jComboBoxNews.getSelectedItem());
    }//GEN-LAST:event_jButtonSuppActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        try
        {
            if(!jLabelNomJ.getText().isEmpty())
            {
                String titreNews = jTextFieldAddNews.getText();
                if(titreNews.isEmpty())
                {
                    JOptionPane.showMessageDialog(this, "Veuillez entre un titre de news dans le champ news avant", "Info", JOptionPane.WARNING_MESSAGE);
                }
                else
                {
                    jComboBoxNews.addItem(titreNews);
                    jComboBoxNews.setSelectedItem(titreNews);
                    jTextFieldAddNews.setText("");
                }
            }
            else
                throw new LoginException("Veuillez vous connecter !!!");
        } catch (LoginException e)
        {
            JOptionPane.showMessageDialog(null, e.getErrorMessage(),"Info",
                JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonTraiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTraiterActionPerformed
        String news;
        try
        {
            if(!jLabelNomJ.getText().isEmpty()&&jComboBoxNews.getItemCount()>0)
            {
                news = jComboBoxNews.getSelectedItem().toString();
                if(!news.isEmpty())
                {
                    JDialogTraitementNews jdtn =  new JDialogTraitementNews(this, rootPaneCheckingEnabled,news,nomJournaliste);
                    jdtn.setModalityType(ModalityType.APPLICATION_MODAL);
                    jdtn.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                    jdtn.setVisible(true);
                    AddjList(jdtn.n);
                }
            }
            else if(jLabelNomJ.getText().isEmpty())
            {
                throw new LoginException("Veuillez vous connecter !!!");
            }
            else
                throw new LoginException("Veuillez entrer un titre de news si la liste de news reçue est vide");
        } catch (LoginException e)
        {
            JOptionPane.showMessageDialog(null, e.getErrorMessage(),"Info",
                JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonTraiterActionPerformed
    private void AddjList(News n) {
        DefaultListModel listNews = new DefaultListModel();
        if(n!=null)
        {
            if(n.getCategorie().equals(Categorie.INTERNATIONAL))
            {
                vNewsInter.add(n);
                listNews = RemplirjLists(vNewsInter, false);
                jListInter.setModel(listNews);
            }
            else if(n.getCategorie().equals(Categorie.POLITIQUE))
            {    
                vNewsViePolitique.add(n);
                listNews = RemplirjLists(vNewsViePolitique, false);
                jListViePolitique.setModel(listNews);
            }
            else if(n.getCategorie().equals(Categorie.SPORT))
            {
                vNewsInfoSport.add(n);
                listNews = RemplirjLists(vNewsInfoSport, false);
                jListSports.setModel(listNews);
            }
            else
            {
                vNewsRagotPotin.add(n);
                listNews = RemplirjLists(vNewsRagotPotin,false);
                jListRagot.setModel(listNews);
            }
            jComboBoxNews.removeItem(jComboBoxNews.getSelectedItem());
        }
    }
    private void jMenuItemRechCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRechCatActionPerformed
        try
        {
            if(!jLabelNomJ.getText().isEmpty())
            {
                JLabel JlabelCat = new JLabel("Choisissez la catégorie de la news à rechercher :");
                JlabelCat.setAlignmentX(LEFT_ALIGNMENT);
                JComboBox<String> comboboxCat = new JComboBox<String>();
                comboboxCat.addItem("Internationales");
                comboboxCat.addItem("Vie politique");
                comboboxCat.addItem("Infos sports");
                comboboxCat.addItem("Ragots et potins");

                Object[] message = {JlabelCat,comboboxCat};
                String[] options = new String[]{"OK", "Annuler"};
                int dialog = JOptionPane.showOptionDialog(null,message , "Recherche par catégorie",
                        0, JOptionPane.PLAIN_MESSAGE,
                        null, options, options[0]);
                if(dialog == JOptionPane.OK_OPTION)
                {
                    //Recherche la liste des news par la catégorie sélectionné
                    Object ob = "";
                    for(Object item : htNews.keySet()){
                        if(item.toString().equals(comboboxCat.getSelectedItem().toString()))
                        {
                            ob = htNews.get(item);
                            break;
                        }
                    }
                    Vector listNews = new Vector();
                    if(!ob.equals(""))
                    {
                        Vector vNews = new Vector(Arrays.asList(ob));
                        vNews = (Vector) vNews.elementAt(0);

                        for(int i=0; i < vNews.size(); i++)
                        {
                            News o = (News) vNews.elementAt(i);
                            if(o.getJournaliste().getLogin().equals(nomJournaliste.getLogin()))
                                listNews.add(o);
                        }
                    }
                    if(listNews.isEmpty())
                    {
                        JOptionPane.showMessageDialog(this, "Aucune news trouvées","Info", JOptionPane.WARNING_MESSAGE);
                    }
                    else
                    {
                        JList list = new JList(listNews);
                        JDialog listDialog = new JDialog( this, "Liste des news", true );
                            listDialog.setDefaultCloseOperation( JDialog.DISPOSE_ON_CLOSE);

                            DoubleClickjList(list,listDialog);

                            listDialog.getContentPane().add( list );
                            listDialog.pack();
                            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                            listDialog.setLocation(dim.width/2-listDialog.getSize().width/2, dim.height/2-listDialog.getSize().height/2);
                            listDialog.setVisible(true);
                    }
                }
            }
            else
            {
                throw new LoginException("Veuillez-vous connecter !!!");
            }
        } catch (LoginException e) {
            JLabel erreur = new JLabel(e.getErrorMessage());
            JOptionPane.showMessageDialog(this, erreur, "Info", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItemRechCatActionPerformed

    private void jMenuItemRechMotCleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRechMotCleActionPerformed
        try
        {
            Vector listTitreNews = new Vector();
            if(!jLabelNomJ.getText().isEmpty())
            {
                String mcDialog = JOptionPane.showInputDialog("Rechercher une news par un mot clé :");
                if(mcDialog!=null)
                {
                    if(!mcDialog.isEmpty())
                    {
                        Vector<Vector> listNews = new Vector<Vector>();
                        listNews.add(vNewsInter);
                        listNews.add(vNewsInfoSport);
                        listNews.add(vNewsViePolitique);
                        listNews.add(vNewsRagotPotin);
                        
                        DefaultListModel listN = new DefaultListModel();
                        News o;
                        for(int i=0;i<4;i++)
                        {
                            listN = RemplirjLists(listNews.get(i),true);
                            for(int j=0; j < listN.size(); j++)
                            {
                                o = (News) listN.elementAt(j);
                                Vector vMotCle = new Vector(o.getMotCle());
                                for(int a=0; a < vMotCle.size(); a++)
                                {
                                    if(vMotCle.elementAt(a).equals(mcDialog)&&o.getJournaliste().getLogin().equals(nomJournaliste.getLogin()))
                                    {
                                        listTitreNews.add(o);
                                    }
                                }
                            }
                        }
                        if(!listTitreNews.isEmpty())
                        {
                            JList list = new JList(listTitreNews);
                            JDialog listDialog = new JDialog( this, "Liste des news", true );
                            listDialog.setDefaultCloseOperation( JDialog.DISPOSE_ON_CLOSE);

                            DoubleClickjList(list,listDialog);

                            listDialog.getContentPane().add( list );
                            listDialog.pack();
                            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                            listDialog.setLocation(dim.width/2-listDialog.getSize().width/2, dim.height/2-listDialog.getSize().height/2);
                            listDialog.setVisible(true);
                        }
                        else
                        {
                            throw new LoginException("Aucune news trouvées");
                        }
                    }
                    else
                    {
                        throw new LoginException("Veuillez entrer un mot-clé !!!");
                    }
                }
            }
            else
            {
                throw new LoginException("Veuillez-vous connecter !!!");
            }
        } catch (LoginException e) {
            JLabel erreur = new JLabel(e.getErrorMessage());
            JOptionPane.showMessageDialog(this, erreur, "Info", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItemRechMotCleActionPerformed
    
    private void DoubleClickjList(JList list, JDialog listDialog) {
        list.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                if (me.getClickCount() == 2) {
                    listDialog.setVisible(false);
                    News news = (News) list.getSelectedValue();
                    String imp,cat;
                    if(news.getImportant())
                        imp="oui";
                    else
                        imp="non";
                    if(news.getCategorie().equals(Categorie.INTERNATIONAL))
                        cat = "Internationales";
                    else if(news.getCategorie().equals(Categorie.POLITIQUE))
                        cat = "Vie politique";
                    else if(news.getCategorie().equals(Categorie.SPORT))
                        cat = "Infos sports";
                    else
                        cat = "Ragots et potins";

                    Object[] message = {"Titre : "+news.getTitre(),"Catégorie : "+cat,"Important : "+imp,"Mots clé : "+news.getMotCle().toString(),"Commentaire : "+news.getTexte()};
                    Object[] options = {"OK"};
                     JOptionPane.showOptionDialog(null, message, "Détail de la news recherchée",JOptionPane.OK_OPTION,
                         JOptionPane.PLAIN_MESSAGE,null,options,options[0]);
                }
            }
         });
    }
    
    private void jMenuParamDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuParamDateActionPerformed
        JPanel panelPays = new JPanel();
        panelPays.setLayout(new BoxLayout(panelPays,BoxLayout.Y_AXIS));
        panelPays.setAlignmentX(LEFT_ALIGNMENT);
        JLabel JlabelPays = new JLabel("Choisissez le nouvel affichage de la date et heure :");
        JlabelPays.setAlignmentX(LEFT_ALIGNMENT);
        JComboBox<String> comboboxPays = new JComboBox<String>();
        comboboxPays.setMaximumSize(new Dimension(200,50));
        comboboxPays.addItem("France");
        comboboxPays.addItem("Royaume-Uni");
        comboboxPays.addItem("Allemagne");
        comboboxPays.addItem("Italie");
        comboboxPays.addItem("U.S.A.");
        panelPays.add(JlabelPays);
        panelPays.add(comboboxPays);
        
        JPanel panelDate = new JPanel();
        panelDate.setLayout(new BoxLayout(panelDate,BoxLayout.Y_AXIS));
        panelDate.setAlignmentX(LEFT_ALIGNMENT);
        JLabel JlabelDate = new JLabel("Choisissez le nouvel affichage de la date :");
        JlabelDate.setAlignmentX(LEFT_ALIGNMENT);
        JComboBox<String> comboboxDate = new JComboBox<String>();
        comboboxDate.setMaximumSize(new Dimension(200,50));
        comboboxDate.addItem("FULL");
        comboboxDate.addItem("LONG");
        comboboxDate.addItem("MEDIUM");
        comboboxDate.addItem("SHORT");
        panelDate.add(JlabelDate);
        panelDate.add(comboboxDate);
        
        JPanel panelHeure = new JPanel();
        panelHeure.setLayout(new BoxLayout(panelHeure,BoxLayout.Y_AXIS));
        panelHeure.setAlignmentX(LEFT_ALIGNMENT);
        JLabel JlabelHeure = new JLabel("Choisissez le nouvel affichage de l'heure :");
        JlabelHeure.setAlignmentX(LEFT_ALIGNMENT);
        JComboBox<String> comboboxHeure = new JComboBox<String>();
        comboboxHeure.setMaximumSize(new Dimension(200,50));
        comboboxHeure.addItem("FULL");
        comboboxHeure.addItem("LONG");
        comboboxHeure.addItem("MEDIUM");
        comboboxHeure.addItem("SHORT");
        panelHeure.add(JlabelHeure);
        panelHeure.add(comboboxHeure);
        
        Object[] message = {panelPays,panelDate,panelHeure};
        String[] options = new String[]{"OK", "Annuler"};
        int dialog = JOptionPane.showOptionDialog(null,message , "Paramètre date-heure",
                0, JOptionPane.PLAIN_MESSAGE,
                null, options, options[0]);
        if(dialog == JOptionPane.OK_OPTION)
        {
            Date aujourdhui = new Date();
            Locale varloc=Locale.ROOT;
            int idPays = comboboxPays.getSelectedIndex();
            switch(idPays)
            {
                case 0:
                    varloc = Locale.FRANCE;
                    break;
                case 1:
                    varloc = Locale.UK;
                    break;
                case 2:
                    varloc = Locale.GERMANY;
                    break;
                case 3:
                    varloc = Locale.ITALY;
                    break;
                case 4:
                    varloc = Locale.US;
                    break;

            }
            int idDate = comboboxDate.getSelectedIndex();
            int idHeure = comboboxHeure.getSelectedIndex();
            DateFormat dateFormat = DateFormat.getDateTimeInstance(idDate,idHeure,varloc);
            if(varloc==Locale.US)
                dateFormat.setTimeZone(TimeZone.getTimeZone("PST"));
            else if(varloc==Locale.UK)
                dateFormat.setTimeZone(TimeZone.getTimeZone("Europe/London"));
            jLabelDate.setText(dateFormat.format(aujourdhui));
        }
    }//GEN-LAST:event_jMenuParamDateActionPerformed

    private void jMenuItemAProposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAProposActionPerformed
        JPanel panel = new JPanel();
        JLabel JlabelNom = new JLabel("<html> Cette application a été dévelopée par : <br> Kevin Ratz <br> Maxime Troisfontaine <br> Date : 31-03-2019.</html>");
        panel.add(JlabelNom);
        String[] options = new String[]{"OK"};
        JOptionPane.showOptionDialog(null, panel, "A propos de cette application",
                0, JOptionPane.PLAIN_MESSAGE,
                null, options, null);
    }//GEN-LAST:event_jMenuItemAProposActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        try
        {
            String titreNews="";
            String cat="";
            News news = new News();
            DefaultListModel model;
            int selectedIndex;
            if(!jLabelNomJ.getText().isEmpty())
            {
                if(!jListInter.isSelectionEmpty()&&jRadioButtonInter.isSelected()||!jListViePolitique.isSelectionEmpty()&&jRadioButtonPolitique.isSelected()||!jListSports.isSelectionEmpty()&&jRadioButtonSports.isSelected()||!jListRagot.isSelectionEmpty()&&jRadioButtonRagot.isSelected())
                {
                    if(!jListInter.isSelectionEmpty())
                    {
                        titreNews = jListInter.getSelectedValue();
                        cat = "Internationales";
                    }
                    else if(!jListViePolitique.isSelectionEmpty())
                    {
                        titreNews = jListViePolitique.getSelectedValue();
                        cat = "Vie politique";
                    }
                    else if(!jListSports.isSelectionEmpty())
                    {
                        titreNews = jListSports.getSelectedValue();
                        cat = "Infos sports";
                    }
                    else
                    {
                        titreNews = jListRagot.getSelectedValue();
                        cat = "Ragots et potins";
                    }
                    Object ob = "";
                    for(Object item : htNews.keySet()){
                        if(item.toString().equals(cat))
                        {
                            ob = htNews.get(item);
                            break;
                        }
                    }
                    Vector vNews = new Vector();
                    int i=0;
                    if(!ob.equals(""))
                    {
                        vNews = new Vector(Arrays.asList(ob));
                        vNews = (Vector) vNews.elementAt(0);

                        for(i=0; i < vNews.size(); i++)
                        {
                            news = (News) vNews.elementAt(i);
                            if(news.getJournaliste().getLogin().equals(nomJournaliste.getLogin())) {
                                if (news.getTitre().equals(titreNews)) {
                                    //vNews.removeElementAt(i);
                                    break;
                                }
                            }
                        }
                    }
                    JDialogTraitementNews jdtn =new JDialogTraitementNews(this, rootPaneCheckingEnabled, news);
                    jdtn.setModalityType(ModalityType.APPLICATION_MODAL);
                    jdtn.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                    jdtn.setVisible(true);
                    if(jdtn.ok)
                    {
                        if(!jListInter.isSelectionEmpty())
                        {
                            model = (DefaultListModel) jListInter.getModel();
                            selectedIndex = jListInter.getSelectedIndex();
                            if (selectedIndex != -1)
                                model.remove(selectedIndex);
                        }
                        else if(!jListViePolitique.isSelectionEmpty())
                        {
                            model = (DefaultListModel) jListViePolitique.getModel();
                            selectedIndex = jListViePolitique.getSelectedIndex();
                            if (selectedIndex != -1)
                                model.remove(selectedIndex);
                        }
                        else if(!jListSports.isSelectionEmpty())
                        {
                            model = (DefaultListModel) jListSports.getModel();
                            selectedIndex = jListSports.getSelectedIndex();
                            if (selectedIndex != -1)
                                model.remove(selectedIndex);
                        }
                        else
                        {
                            model = (DefaultListModel) jListRagot.getModel();
                            selectedIndex = jListRagot.getSelectedIndex();
                            if (selectedIndex != -1)
                                model.remove(selectedIndex);
                        }
                        vNews.removeElementAt(i);
                        AddjList(jdtn.n);
                    }
                    else
                    {
                        jListInter.clearSelection();
                        jListViePolitique.clearSelection();
                        jListSports.clearSelection();
                        jListRagot.clearSelection();
                    }
                }
                else
                {
                    throw new LoginException("Veuillez selectionner une news dans une liste !!!");
                }
            }
            else
            {
                throw new LoginException("Veuillez-vous connecter !!!");
            }
        } catch (LoginException e) {
            JLabel erreur = new JLabel(e.getErrorMessage());
            JOptionPane.showMessageDialog(this, erreur, "Info", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonEditActionPerformed

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
    private javax.swing.JList<String> jListRagot;
    private javax.swing.JList<String> jListSports;
    private javax.swing.JList<String> jListViePolitique;
    private javax.swing.JMenu jMenuAide;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuConnexions;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItemAPropos;
    private javax.swing.JMenuItem jMenuItemListe;
    private javax.swing.JMenuItem jMenuItemLogin;
    private javax.swing.JMenuItem jMenuItemLogout;
    private javax.swing.JMenuItem jMenuItemNew;
    private javax.swing.JMenuItem jMenuItemNewsPeople;
    private javax.swing.JMenuItem jMenuItemRechCat;
    private javax.swing.JMenuItem jMenuItemRechMotCle;
    private javax.swing.JMenuItem jMenuItemStartReception;
    private javax.swing.JMenuItem jMenuParamDate;
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
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JTextField jTextFieldAddNews;
    // End of variables declaration//GEN-END:variables
}
