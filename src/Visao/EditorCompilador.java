/**
 *
 * @author Carlos Fernandes
 * @author Clayton Andrade
 *
 */
package Visao;

import Lexico.AnalizadorLexico;
import Models.Token;
import Models.Lista;
import Semantica.AnalisadorSemanticoVariaveis;
import Semantica.AnalisadorSemanticoVariaveisNaodeClarada;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Sintatico.AnalisadorSintatico;
import java.awt.Color;
import java.awt.Font;

public class EditorCompilador extends javax.swing.JFrame {

    Token token = new Token();
    Lista listaToken = new Lista();
    ImageIcon icon = new ImageIcon("@stack.png");
    private DefaultTableModel modeloTable;
    public int resultadoJanelas;
    public String EnderecoArquivo, EnderecoTemporario, bufferIn;
    public String data;

    public void setTitle(String title) {
        super.setTitle("@CompAlg");

    }

    public EditorCompilador() {

        initComponents();
        setLocationRelativeTo(null);
        getListaMunuAtt(listaToken);
        setResizable(false);
        Area_Texto.setForeground(Color.BLUE);
        Area_Texto.setFont(new Font("Consolas", Font.BOLD, 12));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Limpar = new javax.swing.JButton();
        Analisar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Area_Texto = new javax.swing.JTextArea();
        Nome_Programa = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLbResult = new javax.swing.JLabel();
        jTfResultado = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Abrir = new javax.swing.JCheckBoxMenuItem();
        Salvar = new javax.swing.JMenuItem();
        About = new javax.swing.JMenu();
        Sobre = new javax.swing.JMenuItem();
        LogOut = new javax.swing.JMenu();
        Sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Spear");
        setBackground(java.awt.SystemColor.activeCaption);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Limpar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });
        getContentPane().add(Limpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 110, 30));

        Analisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Analisar.setText("Analisar");
        Analisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalisarActionPerformed(evt);
            }
        });
        getContentPane().add(Analisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 30));

        Area_Texto.setColumns(20);
        Area_Texto.setRows(5);
        Area_Texto.setText(" program testeproc1;\n" +
            "          var X, y, z :integer;\n" +
            " procedure P; \n" +
            "          var A :integer;\n" +
            "              begin\n" +
            "                  readln(a);\n" +
            "                  if a=x then\n" +
            "                      z:=z+x\n" +
            "                  else begin\n" +
            "            Z:=z+x;\n" +
            "            call p;\n" +
            "               end;\n" +
            "                           end;\n" +
            "        begin\n" +
            "           Z:=0;\n" +
            "           readln(x,y);\n" +
            "             if x>y then\n" +
            "                 call p\n" +
            "             else\n" +
            "           Z:=z+x+y;\n" +
            "         writeln(z);\n" +
            "end.\n ");
        jScrollPane2.setViewportView(Area_Texto);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 480, 450));

        Nome_Programa.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Nome_Programa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nome_Programa.setText("Analisador CompAlg++");
        getContentPane().add(Nome_Programa, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 280, 30));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CÓDIGO", "TOKEN", "LINHA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(Table);
        Table.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 300, 450));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 260, 60));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, -1, 20));

        jLbResult.setText("Resultado");
        getContentPane().add(jLbResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 80, 20));
        getContentPane().add(jTfResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 506, 180, 30));

        jMenu1.setText("Arquivo");

        Abrir.setSelected(false);
        Abrir.setText("Abrir");
        Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirActionPerformed(evt);
            }
        });
        jMenu1.add(Abrir);

        Salvar.setText("Salvar");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });
        jMenu1.add(Salvar);

        jMenuBar1.add(jMenu1);

        About.setText("Sobre");

        Sobre.setText("Sobre o Programa");
        Sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreActionPerformed(evt);
            }
        });
        About.add(Sobre);

        jMenuBar1.add(About);

        LogOut.setText("Sair");

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        LogOut.add(Sair);

        jMenuBar1.add(LogOut);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed

        String message = "Tem certeza que deseja Limpar o texto e a Tabela do analisador?";
        String title = "Confirmação";
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            ((DefaultTableModel) Table.getModel()).setNumRows(0);
            Table.updateUI();

            Area_Texto.setText("");
        }


    }//GEN-LAST:event_LimparActionPerformed
    private void AnalisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalisarActionPerformed
        listaToken.linpar();
        getListaMunuAtt(listaToken);
        String texto = String.valueOf(Area_Texto.getText());
        AnalizadorLexico cc = new AnalizadorLexico();
        listaToken = cc.getPalavra(texto);

        AnalisadorSintatico Sintatico = new AnalisadorSintatico();
        if (Sintatico.Analisar(listaToken) == AnalisadorSintatico.AnaliseSintatica_ComErros) {
            jTfResultado.setForeground(Color.RED);
            jTfResultado.setText("Erro!...");
            JOptionPane.showMessageDialog(null, Sintatico.returnErro(), "", JOptionPane.ERROR_MESSAGE);
        } else {
            new AnalisadorSemanticoVariaveis(listaToken).analisar();
            new AnalisadorSemanticoVariaveisNaodeClarada(listaToken).analisarr();
            jTfResultado.setForeground(Color.GREEN);
            jTfResultado.setText("Sucesso!...");
        }

        getListaMunuAtt(listaToken);
    }//GEN-LAST:event_AnalisarActionPerformed

    private void AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirActionPerformed

        String message = "Tem certeza? Essa ação vai limpar a Tela e a Tabela do Analisador.?";
        String title = "Confirmação";
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            ((DefaultTableModel) Table.getModel()).setNumRows(0);
            Table.updateUI();
            Area_Texto.setText("");

            JFileChooser openFile = new JFileChooser();
            openFile.showOpenDialog(openFile);
            resultadoJanelas = JFileChooser.OPEN_DIALOG;

            if (JFileChooser.APPROVE_OPTION == resultadoJanelas) {
                EnderecoArquivo = openFile.getSelectedFile().toString();
                AbrirArquivo();
            }

        }


    }//GEN-LAST:event_AbrirActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        Fechar();
        // TODO add your handling code here:
    }//GEN-LAST:event_SairActionPerformed

    private void SobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreActionPerformed

        MenssagemPercaDados();
    }//GEN-LAST:event_SobreActionPerformed

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed

        JFileChooser saveFile = new JFileChooser();
        saveFile.showSaveDialog(saveFile);
        resultadoJanelas = JFileChooser.OPEN_DIALOG;
        if (JFileChooser.APPROVE_OPTION == resultadoJanelas) {
            EnderecoArquivo = saveFile.getSelectedFile().toString();
            SalvarArquivo();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        }
    }//GEN-LAST:event_SalvarActionPerformed

    public void getListaMunuAtt(Lista li) {

        modeloTable = (DefaultTableModel) Table.getModel();
        while (modeloTable.getRowCount() > 0) {
            modeloTable.removeRow(0);
        }
        for (int i = 0; i < li.getLista().size(); i++) {
            Token c = new Token();
            c = li.getLista().get(i);
            modeloTable.addRow(new Object[]{c.getCodigo(), c.getNome(), c.getLinha()});
        }
        Table.setModel(modeloTable);
    }

    private void AbrirArquivo() {
        try {
            FileReader fileReader = new FileReader(EnderecoArquivo);
            BufferedReader reader = new BufferedReader(fileReader);
            while ((data = reader.readLine()) != null) {
                Area_Texto.append(data + "\n");
            }
            setTitle(EnderecoArquivo);
            fileReader.close();
            reader.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
    }

    private void MenssagemPercaDados() {
        String message = "Você vai perder os dados na caixa de texto, deseja prosseguir?";
        String title = "Confirmação";
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            Area_Texto.setText("");
            Area_Texto.setText(" program testeproc1;\n"
                    + "          var X, y, z :integer;\n"
                    + " procedure P; \n"
                    + "          var A :integer;\n"
                    + "              begin\n"
                    + "                  readln(a);\n"
                    + "                  if a=x then\n"
                    + "                      z:=z+x\n"
                    + "                  else begin\n"
                    + "            Z:=z+x;\n"
                    + "            call p;\n"
                    + "               end;\n"
                    + "                           end;\n"
                    + "        begin\n"
                    + "           Z:=0;\n"
                    + "           readln(x,y);\n"
                    + "             if x>y then\n"
                    + "                 call p\n"
                    + "             else\n"
                    + "           Z:=z+x+y;\n"
                    + "         writeln(z);\n"
                    + "end. ");
        }

    }

    private void Fechar() {
        String message = "Tem certeza que deseja sair do analisador?";
        String title = "Confirmação";
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            System.exit(0);
        }

    }

    private void SalvarArquivo() {
        try {
            FileWriter escrever;
            escrever = new FileWriter(new File(EnderecoArquivo));
            escrever.write(Area_Texto.getText());
            escrever.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditorCompilador().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu About;
    private javax.swing.JCheckBoxMenuItem Abrir;
    private javax.swing.JButton Analisar;
    private javax.swing.JTextArea Area_Texto;
    private javax.swing.JButton Limpar;
    private javax.swing.JMenu LogOut;
    private javax.swing.JLabel Nome_Programa;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JMenuItem Salvar;
    private javax.swing.JMenuItem Sobre;
    private javax.swing.JTable Table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLbResult;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTextField jTfResultado;
    // End of variables declaration//GEN-END:variables

}
