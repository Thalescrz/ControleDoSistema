/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package programajanela;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Thales
 */
public class Janela extends javax.swing.JFrame {
    private static JFrame frame2;
    String texto;
    /**
     * Creates new form Janela
     */
    public Janela() {
        initComponents();
    }

    public void segundaJanela(){
        frame2 = new JFrame();
        frame2.setSize(300, 300);
//        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setResizable(false);
        frame2.setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrame1.setTitle("ADM");
        jFrame1.setAlwaysOnTop(true);
        jFrame1.setResizable(false);
        jFrame1.setSize(new java.awt.Dimension(300, 300));

        jButton8.setText("Editor de Registro");
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jButton8)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jFrame1.getAccessibleContext().setAccessibleDescription("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Thales");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jButton1.setText("ipconfig");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setText("Adicionar e Selecionar Plano de Desempenho m�ximo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 0, 102));
        jButton3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Info do Sistema");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Processos Ativos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Controle do Sistema");

        jButton5.setText("Planos de Energia");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(245, 245, 20));
        jButton6.setFont(new java.awt.Font("Alef", 0, 12)); // NOI18N
        jButton6.setText("Admin");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jProgressBar1.setBackground(new java.awt.Color(51, 255, 0));
        jProgressBar1.setBorder(new javax.swing.border.MatteBorder(null));
        jProgressBar1.setName("Loading"); // NOI18N

        jLabel2.setText("by@Thalescrz");

        jProgressBar2.setBackground(new java.awt.Color(51, 255, 0));
        jProgressBar2.setBorder(new javax.swing.border.MatteBorder(null));
        jProgressBar2.setName("Loading"); // NOI18N

        jButton7.setBackground(new java.awt.Color(255, 0, 102));
        jButton7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Info de Video");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel3.setText("v1.3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)))
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(2, 2, 2))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton3, jButton4, jButton5, jButton7, jProgressBar1, jProgressBar2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addComponent(jLabel2))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       try {
           
            String comando = "ipconfig"; 

            // Inicar o processo e executar o comando
            ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", comando);
            builder.redirectErrorStream(true);
            Process process = builder.start();

            // Ler a sa�da do processo
             BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));    
             StringBuilder output = new StringBuilder();
             String line;
             while ((line = reader.readLine()) != null) {
                System.out.println(line);
                output.append(line).append("\n");
             }
            // Armazenar a sa�da em uma vari�vel
            texto = output.toString();
            
            // Aguardar o t�rmino do processo
            int exitCode = process.waitFor();
            System.out.println("Comando executado com c�digo de sa�da: " + exitCode);
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }
       
       StringBuilder formattedText = new StringBuilder();
            for (String line : texto.split("\n")) {
                formattedText.append(line).append("\n");
            }
        jTextArea1.setText(formattedText.toString());
                                                             //forma de adicionar outra janela igual
                                                    //        java.awt.EventQueue.invokeLater(new Runnable() {
                                                    //            public void run() {
                                                    //                new Janela().setVisible(true);
                                                    //            }});
    }//GEN-LAST:event_jButton1ActionPerformed

    
    /////////////////////////////////////////////////////////////
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
           
            String comando = "Powercfg -duplicatescheme e9a42b02-d5df-448d-aa00-03f14749eb61\n"; 

            // Inicar o processo e executar o comando
            ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", comando);
            builder.redirectErrorStream(true);
            Process process = builder.start();

            // Ler a sa�da do processo
             BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));    
             StringBuilder output = new StringBuilder();
             String line;
             while ((line = reader.readLine()) != null) {
                System.out.println(line);
                output.append(line).append("\n");
             }
            // Armazenar a sa�da em uma vari�vel
            texto = output.toString();
            
            // Extrair o GUID do texto
            String guid = extractGUID(texto);
            System.out.println("GUID extra�do: " + guid);
            
            // Copiar o GUID para a �rea de transfer�ncia caso queira colar em outro lugar.
            copyToClipboard(guid);
        
            // Exibir o GUID no JTextArea
            //jTextArea1.setText(guid);
            
            String comando2 = "Powercfg /s " + guid; 

            // Inicar o segundo processo e executar o segundo comando
            ProcessBuilder builder2 = new ProcessBuilder("cmd.exe", "/c", comando2);
            builder2.redirectErrorStream(true);
            builder2.start();
            jTextArea1.setText(texto +"\nGUID extra�do: " + guid+ "\n\nPlano de Energia de Desempenho m�ximo Selecionado!");
            
            // Aguardar o t�rmino do processo
            int exitCode = process.waitFor();
            System.out.println("Comando executado com c�digo de sa�da: " + exitCode);
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    ///Extrair a GUID do plano de energia duplicado
        private String extractGUID(String texto) {
        Pattern pattern = Pattern.compile("GUID do Esquema de Energia: ([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})");
        Matcher matcher = pattern.matcher(texto);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "";
    }
        
    //Copiar para �rea de transferencia do sistema o valor encontrado na v�riavel guid
    private void copyToClipboard(String text) {
        java.awt.datatransfer.Clipboard clipboard = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
        java.awt.datatransfer.StringSelection selection = new java.awt.datatransfer.StringSelection(text);
        clipboard.setContents(selection, null);
    }
    
    /////////////////////////////////////////////////////////////
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        jProgressBar1.setValue(0);
        jProgressBar1.setIndeterminate(true);
        
        Thread tarefa = new Thread(() -> {
        try {
             
            String comando = "systeminfo"; 

            // Inicar o processo e executar o comando
            ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", comando);
            builder.redirectErrorStream(true);
            Process process = builder.start();

            // Ler a sa�da do processo
             BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));    
             StringBuilder output = new StringBuilder();
             String line;
             while ((line = reader.readLine()) != null) {
                System.out.println(line);
                output.append(line).append("\n");
             }
            // Armazenar a sa�da em uma vari�vel
            texto = output.toString();
            
            // Aguardar o t�rmino do processo
            int exitCode = process.waitFor();
            System.out.println("Comando executado com c�digo de sa�da: " + exitCode);
            
            SwingUtilities.invokeLater(() -> {
                StringBuilder formattedText = new StringBuilder();
                for (String textLine : texto.split("\n")) {
                    formattedText.append(textLine).append("\n");
                }
                jTextArea1.setText(formattedText.toString());

                // Preencher a barra de progresso at� 100%
                jProgressBar1.setIndeterminate(false);
                jProgressBar1.setValue(100);
            });
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        } 
         
        });

    // Iniciar a thread da tarefa
    tarefa.start();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         try {
           
            String comando = "tasklist"; 

            // Inicar o processo e executar o comando
            ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", comando);
            builder.redirectErrorStream(true);
            Process process = builder.start();

            // Ler a sa�da do processo
             BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));    
             StringBuilder output = new StringBuilder();
             String line;
             while ((line = reader.readLine()) != null) {
                System.out.println(line);
                output.append(line).append("\n");
             }
            // Armazenar a sa�da em uma vari�vel
            texto = output.toString();
            
            // Aguardar o t�rmino do processo
            int exitCode = process.waitFor();
            System.out.println("Comando executado com c�digo de sa�da: " + exitCode);
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }
       
       StringBuilder formattedText = new StringBuilder();
            for (String line : texto.split("\n")) {
                formattedText.append(line).append("\n");
            }
        jTextArea1.setText(formattedText.toString());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
           
            String comando = "powercfg /l"; 

            // Inicar o processo e executar o comando
            ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", comando);
            builder.redirectErrorStream(true);
            Process process = builder.start();

            // Ler a sa�da do processo
             BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));    
             StringBuilder output = new StringBuilder();
             String line;
             while ((line = reader.readLine()) != null) {
                System.out.println(line);
                output.append(line).append("\n");
             }
            // Armazenar a sa�da em uma vari�vel
            texto = output.toString();
            
            // Aguardar o t�rmino do processo
            int exitCode = process.waitFor();
            System.out.println("Comando executado com c�digo de sa�da: " + exitCode);
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }
       
       StringBuilder formattedText = new StringBuilder();
            for (String line : texto.split("\n")) {
                formattedText.append(line).append("\n");
            }
        jTextArea1.setText(formattedText.toString());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jFrame1.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        jButton6.setBackground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        jButton6.setBackground(new java.awt.Color(245, 245, 20));
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jProgressBar2.setValue(0);
        jProgressBar2.setIndeterminate(true);
        
        Thread tarefa = new Thread(() -> {
        try {
             
            String comando = "Get-WmiObject Win32_VideoController"; 

            // Inicar o processo e executar o comando
            ProcessBuilder builder = new ProcessBuilder("powershell.exe", "/c", comando);
            builder.redirectErrorStream(true);
            Process process = builder.start();

            // Ler a sa�da do processo
             BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));    
             StringBuilder output = new StringBuilder();
             String line;
             while ((line = reader.readLine()) != null) {
                System.out.println(line);
                output.append(line).append("\n");
             }
            // Armazenar a sa�da em uma vari�vel
            texto = output.toString();
            
            // Aguardar o t�rmino do processo
            int exitCode = process.waitFor();
            System.out.println("Comando executado com c�digo de sa�da: " + exitCode);
            
            SwingUtilities.invokeLater(() -> {
                StringBuilder formattedText = new StringBuilder();
                for (String textLine : texto.split("\n")) {
                    formattedText.append(textLine).append("\n");
                }
                jTextArea1.setText(formattedText.toString());

                // Preencher a barra de progresso at� 100%
                jProgressBar2.setIndeterminate(false);
                jProgressBar2.setValue(100);
            });
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        } 
         
        });

    // Iniciar a thread da tarefa
    tarefa.start();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
