package atividade4csv;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class TelaAferir extends javax.swing.JFrame {

    public TelaAferir() {
        initComponents();
        acessibilidadeAtalho();
        getContentPane().setBackground(Color.WHITE);
        montarTabela();
        //Lógica para os botões
        ButtonGroup group = new ButtonGroup();
        group.add(radioEstresse);
        group.add(radioSemEstresse);
        group.add(radioSemFiltros);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layeredTotal = new javax.swing.JLayeredPane();
        checkEstresse = new javax.swing.JCheckBox();
        btnSalvar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelData1 = new javax.swing.JLabel();
        labelHora = new javax.swing.JLabel();
        timeFormat = new javax.swing.JFormattedTextField();
        dateFormat = new javax.swing.JFormattedTextField();
        btnExcluir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelPres = new javax.swing.JPanel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        txtPressaoSistolica = new javax.swing.JTextField();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        txtPressaoDiastolica = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        radioSemEstresse = new javax.swing.JRadioButton();
        radioEstresse = new javax.swing.JRadioButton();
        radioSemFiltros = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aferir Pressão");
        setBackground(new java.awt.Color(102, 102, 255));
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        layeredTotal.setBackground(new java.awt.Color(0, 0, 0));
        layeredTotal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aferimento de Pressão", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        layeredTotal.setForeground(new java.awt.Color(102, 102, 255));
        layeredTotal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        layeredTotal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                layeredTotalFocusGained(evt);
            }
        });

        checkEstresse.setBackground(new java.awt.Color(155, 155, 225));
        checkEstresse.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        checkEstresse.setText("Está em uma Situação de Estresse?");
        checkEstresse.setNextFocusableComponent(btnSalvar);

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setToolTipText("Salvar Dados");
        btnSalvar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(102, 102, 255));
        jSeparator2.setForeground(new java.awt.Color(102, 102, 255));
        jSeparator2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(montarTabela());
        jTable1.setToolTipText("");
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        jTable1.setRowHeight(22);
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Salvou algo errado?");

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 122, 225), 4, true));

        labelData1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        labelData1.setForeground(new java.awt.Color(0, 0, 0));
        labelData1.setText("Data");

        labelHora.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        labelHora.setForeground(new java.awt.Color(0, 0, 0));
        labelHora.setText("Hora");

        timeFormat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        try {
            timeFormat.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        timeFormat.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        timeFormat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        timeFormat.setNextFocusableComponent(checkEstresse);

        dateFormat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        try {
            dateFormat.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dateFormat.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dateFormat.setToolTipText("Insira a data");
        dateFormat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dateFormat.setNextFocusableComponent(timeFormat);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelData1)
                        .addGap(66, 91, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dateFormat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelData1)
                    .addComponent(labelHora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dateFormat.getAccessibleContext().setAccessibleName("");

        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("Salvar Dados");
        btnExcluir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Clique em Salvar ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ou aperte ALT+S no seu teclado");

        panelPres.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 122, 225), 4, true));
        panelPres.setForeground(new java.awt.Color(255, 255, 255));

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pressão Sistólica(SIS)", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 20), new java.awt.Color(0, 0, 0))); // NOI18N

        txtPressaoSistolica.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtPressaoSistolica.setToolTipText("Insira o resultada da primeira linha");
        txtPressaoSistolica.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtPressaoSistolica.setNextFocusableComponent(txtPressaoDiastolica);
        txtPressaoSistolica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPressaoSistolicaActionPerformed(evt);
            }
        });

        jLayeredPane3.setLayer(txtPressaoSistolica, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(txtPressaoSistolica, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPressaoSistolica)
        );

        jLayeredPane2.setBackground(new java.awt.Color(0, 0, 0));
        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pressão Diastólica(DIA)", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 20), new java.awt.Color(0, 0, 0))); // NOI18N

        txtPressaoDiastolica.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtPressaoDiastolica.setToolTipText("Insira o resultado da segunda linha");
        txtPressaoDiastolica.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtPressaoDiastolica.setNextFocusableComponent(dateFormat);
        txtPressaoDiastolica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPressaoDiastolicaActionPerformed(evt);
            }
        });

        jLayeredPane2.setLayer(txtPressaoDiastolica, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPressaoDiastolica, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPressaoDiastolica)
        );

        javax.swing.GroupLayout panelPresLayout = new javax.swing.GroupLayout(panelPres);
        panelPres.setLayout(panelPresLayout);
        panelPresLayout.setHorizontalGroup(
            panelPresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLayeredPane2)
                    .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPresLayout.setVerticalGroup(
            panelPresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jSeparator1.setBackground(new java.awt.Color(122, 122, 225));
        jSeparator1.setForeground(new java.awt.Color(122, 122, 225));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Histórico ");

        radioSemEstresse.setBackground(new java.awt.Color(155, 155, 225));
        radioSemEstresse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radioSemEstresse.setText("Sem estresse");
        radioSemEstresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSemEstresseActionPerformed(evt);
            }
        });

        radioEstresse.setBackground(new java.awt.Color(157, 157, 225));
        radioEstresse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radioEstresse.setText("Aferimento com alterações de estresse");
        radioEstresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEstresseActionPerformed(evt);
            }
        });

        radioSemFiltros.setBackground(new java.awt.Color(155, 155, 225));
        radioSemFiltros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radioSemFiltros.setText("Remover Filtros");
        radioSemFiltros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSemFiltrosActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("João da Costa");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Paciente:");

        layeredTotal.setLayer(checkEstresse, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredTotal.setLayer(btnSalvar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredTotal.setLayer(jSeparator2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredTotal.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredTotal.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredTotal.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredTotal.setLayer(btnExcluir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredTotal.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredTotal.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredTotal.setLayer(panelPres, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredTotal.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredTotal.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredTotal.setLayer(radioSemEstresse, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredTotal.setLayer(radioEstresse, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredTotal.setLayer(radioSemFiltros, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredTotal.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredTotal.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layeredTotalLayout = new javax.swing.GroupLayout(layeredTotal);
        layeredTotal.setLayout(layeredTotalLayout);
        layeredTotalLayout.setHorizontalGroup(
            layeredTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layeredTotalLayout.createSequentialGroup()
                .addGroup(layeredTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layeredTotalLayout.createSequentialGroup()
                        .addGroup(layeredTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layeredTotalLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(panelPres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layeredTotalLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)))
                        .addGroup(layeredTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layeredTotalLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layeredTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layeredTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layeredTotalLayout.createSequentialGroup()
                                            .addComponent(btnExcluir)
                                            .addGap(9, 9, 9)))
                                    .addGroup(layeredTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(checkEstresse)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))))
                            .addGroup(layeredTotalLayout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layeredTotalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layeredTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addGroup(layeredTotalLayout.createSequentialGroup()
                                .addComponent(radioEstresse)
                                .addGap(18, 18, 18)
                                .addComponent(radioSemEstresse)
                                .addGap(27, 27, 27)
                                .addComponent(radioSemFiltros))
                            .addGroup(layeredTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
                                .addComponent(jSeparator1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layeredTotalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );
        layeredTotalLayout.setVerticalGroup(
            layeredTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layeredTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layeredTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layeredTotalLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(checkEstresse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layeredTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layeredTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layeredTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioSemEstresse)
                    .addComponent(radioEstresse)
                    .addComponent(radioSemFiltros))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        checkEstresse.getAccessibleContext().setAccessibleDescription("Caso se encontre com raiva,triste ou num ritmo fora do normal marque esta caixa");
        btnSalvar.getAccessibleContext().setAccessibleName("Botão para enviar");
        btnSalvar.getAccessibleContext().setAccessibleDescription("Caso as informações estejam corretas clique para enviar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(layeredTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(layeredTotal)
                .addContainerGap())
        );

        layeredTotal.getAccessibleContext().setAccessibleDescription("Aqui deve inserir os dados obtidos ao medir a pessão");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        Paciente p = new Paciente();

        String data = dateFormat.getText();
        String hora = timeFormat.getText();
        String pressaoSistolica = txtPressaoSistolica.getText();
        String pressaoDiastolica = txtPressaoDiastolica.getText();
        if (data.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo Data não pode estar em branco.");
            return;
        }

        if (hora.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo Hora não pode estar em branco.");
            return;
        }

        if (pressaoSistolica.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo Pressão Sistólica não pode estar em branco.");
            return;
        }

        if (pressaoDiastolica.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo Pressão Diastólica não pode estar em branco.");
            return;
        }

        // Validações de formato
        if (!validarCampoNumerico(pressaoSistolica)) {
            JOptionPane.showMessageDialog(null, "Pressão Sistólica inválida. Por favor digite apenas números.");
            return;
        }

        if (!validarCampoNumerico(pressaoDiastolica)) {
            JOptionPane.showMessageDialog(null, "Pressão Diastólica inválida. Por favor digite apenas números.");
            return;
        }

        try {
//            Preenchimento de dados através do user //
            p.setData(dateFormat.getText());
            p.setHora(timeFormat.getText());
            p.setPressaoSistolica(Integer.parseInt(txtPressaoSistolica.getText()));
            p.setPressaoDiastolica(Integer.parseInt(txtPressaoDiastolica.getText()));

            p.setStress(checkEstresse.isSelected());

            if (DadosPacienteCSV.AdicionarDados(p)) {
                JOptionPane.showMessageDialog(null, "Dados Salvos!");
                dateFormat.setText("");
                timeFormat.setText("");
                txtPressaoSistolica.setText("");
                txtPressaoDiastolica.setText("");
                checkEstresse.setSelected(false);

                //tive algum problema com focus.e precisei instaciar a tabela aqui para atualizar dados
                //posteriormente irei avaliar
                montarTabela();
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                String[] novaLinha = {
                    p.getData(),
                    p.getHora(),
                    Integer.toString(p.getPressaoSistolica()),
                    Integer.toString(p.getPressaoDiastolica()),
                    p.isStress() ? "Sim" : "Não"
                };

                model.addRow(novaLinha);  // Adicionar nova linha ao modelo da tabela

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro ao salvar dados!\nRevise as informações e tente novamente");
        }
        JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        montarTabela();
    }//GEN-LAST:event_formWindowGainedFocus

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        //Exclui o registro do arquivo CSV e Da tabela
        int linhExcluir = jTable1.getSelectedRow();
        System.out.println(linhExcluir);

        if (linhExcluir == -1) {
            JOptionPane.showMessageDialog(null, "Escolha um item para excluir");
            return;
        }

        try {
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente Excluir??");
            if (resposta == JOptionPane.YES_OPTION) {

                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.removeRow(linhExcluir);

                //instaciando Dados
                DadosPacienteCSV dados = new DadosPacienteCSV();

                //Remoção do arquivo CSV
                dados.excluir(linhExcluir);

                JOptionPane.showMessageDialog(null, "Aferimento Excluído!");
            }

        } catch (Exception e) {
            System.out.println("erro ao excluir " + e.getMessage());
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtPressaoDiastolicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPressaoDiastolicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPressaoDiastolicaActionPerformed

    private void txtPressaoSistolicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPressaoSistolicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPressaoSistolicaActionPerformed

    private void radioSemEstresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSemEstresseActionPerformed

        // Obter o sorter da tabela
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(jTable1.getModel());
        jTable1.setRowSorter(sorter);
        if (sorter == null) {
            // Caso o sorter não esteja inicializado, cria um novo
            sorter = new TableRowSorter<>(jTable1.getModel());
            jTable1.setRowSorter(sorter);
        }

        // Configurar a ordenação da coluna "Situação de estresse?" (coluna 4)
        sorter.setComparator(4, (String s1, String s2) -> {
            // Priorizar "Não" no início
            return s1.equals("Não") ? -1 : (s2.equals("Não") ? 1 : 0);
        });

        // Aplicar a ordenação
        sorter.setSortKeys(List.of(new RowSorter.SortKey(4, SortOrder.ASCENDING)));


    }//GEN-LAST:event_radioSemEstresseActionPerformed

    private void radioEstresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioEstresseActionPerformed

        // Obter o sorter da tabela
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(jTable1.getModel());
        jTable1.setRowSorter(sorter);
        if (sorter == null) {
            // Caso o sorter não esteja inicializado, cria um novo
            sorter = new TableRowSorter<>(jTable1.getModel());
            jTable1.setRowSorter(sorter);
        }

        // Configurar a ordenação da coluna "Situação de estresse?" (coluna 4)
        sorter.setComparator(4, (String s1, String s2) -> {
            // Priorizar "Sim" no início
            return s1.equals("Sim") ? -1 : (s2.equals("Sim") ? 1 : 0);
        });

        // Aplicar a ordenação
        sorter.setSortKeys(List.of(new RowSorter.SortKey(4, SortOrder.ASCENDING)));


    }//GEN-LAST:event_radioEstresseActionPerformed

    private void radioSemFiltrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSemFiltrosActionPerformed
        // Obter o sorter da tabela
        TableRowSorter<TableModel> sorter = (TableRowSorter<TableModel>) jTable1.getRowSorter();

        if (sorter != null) {
            // Limpar as SortKeys para remover a ordenação
            sorter.setSortKeys(null);
        }
    }//GEN-LAST:event_radioSemFiltrosActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
//        montarTabela();
    }//GEN-LAST:event_formFocusGained

    private void layeredTotalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_layeredTotalFocusGained
        montarTabela();
    }//GEN-LAST:event_layeredTotalFocusGained

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new TelaAferir().setVisible(true);

            }
        });
    }

    public void acessibilidadeAtalho() {

        btnSalvar.setMnemonic(KeyEvent.VK_S); //teclas de atalho ATL+S para enviar

        btnExcluir.setMnemonic(KeyEvent.VK_E); //teclas de atalho ATL+S para excluir
    }

    private DefaultTableModel montarTabela() {
        String[] colunas = {
            "Data",
            "Hora",
            "Pressão Sistólica",
            "Pressão Diastólica", "Situacão de estresse?"
        };
        DefaultTableModel tabela = new DefaultTableModel(colunas, 0);

        //pegar os dados CSV
        ArrayList<Paciente> listaPaciente = DadosPacienteCSV.listarPaciente();

        for (int i = 0; i < listaPaciente.size(); i++) {

            Paciente p = listaPaciente.get(i);
            String paciente = p.isStress() ? "Sim" : "Não";
            String[] linha = {
                p.getData(),
                p.getHora(),
                Integer.toString(p.getPressaoSistolica()),
                Integer.toString(p.getPressaoDiastolica()),
                paciente

            };
            tabela.addRow(linha);

        }

        //Formatações
        JTableHeader cabecalho = jTable1.getTableHeader();
        Font novaFonte = new Font("tahoma", Font.BOLD, 13);
        cabecalho.setAlignmentY(LEFT_ALIGNMENT);
        cabecalho.setAlignmentX(LEFT_ALIGNMENT);
        cabecalho.setFont(novaFonte);

        return tabela;

    }

    boolean validarCampoNumerico(String campo) {
        String regexNumerico = "^\\d+$";
        return Pattern.matches(regexNumerico, campo);
    }

    // Obter os valores dos campos

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox checkEstresse;
    private javax.swing.JFormattedTextField dateFormat;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelData1;
    private javax.swing.JLabel labelHora;
    private javax.swing.JLayeredPane layeredTotal;
    private javax.swing.JPanel panelPres;
    private javax.swing.JRadioButton radioEstresse;
    private javax.swing.JRadioButton radioSemEstresse;
    private javax.swing.JRadioButton radioSemFiltros;
    private javax.swing.JFormattedTextField timeFormat;
    private javax.swing.JTextField txtPressaoDiastolica;
    private javax.swing.JTextField txtPressaoSistolica;
    // End of variables declaration//GEN-END:variables

}
