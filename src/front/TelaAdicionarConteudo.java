/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front;

import back.bean.AlternativaBean;
import back.bean.CategoriaBean;
import back.bean.PerguntaBean;
import back.bean.RespostaBean;
import back.dao.AlternativaDao;
import back.dao.CategoriaDao;
import back.dao.PerguntaDao;
import back.dao.RespostaDao;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author matheus
 */
public class TelaAdicionarConteudo extends javax.swing.JFrame {

    CategoriaDao daoCategoria = null;

    public TelaAdicionarConteudo() {
        initComponents();
        setSize(600, 450);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        
        preencheCombo();
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
        campoPergunta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoAlternativa1 = new javax.swing.JTextField();
        campoAlternativa2 = new javax.swing.JTextField();
        campoAlternativa3 = new javax.swing.JTextField();
        campoAlternativa4 = new javax.swing.JTextField();
        campoAlternativa5 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoResposta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboCategorias = new javax.swing.JComboBox<>();
        botaoLimpar = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        botaoConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Descrição Pergunta:");

        campoPergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPerguntaActionPerformed(evt);
            }
        });

        jLabel2.setText("Alternativas:");

        jLabel3.setText("Resposta Correta:");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel4.setText("Categoria:");

        botaoLimpar.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        botaoVoltar.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        botaoConfirmar.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        botaoConfirmar.setText("Confirmar");
        botaoConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoAlternativa1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoAlternativa2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoAlternativa3, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoAlternativa4, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoAlternativa5, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel3)))
                .addGap(0, 158, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comboCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoLimpar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(29, 29, 29)
                .addComponent(botaoConfirmar)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoAlternativa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoAlternativa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoAlternativa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoAlternativa4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoAlternativa5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(campoResposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoConfirmar)
                            .addComponent(botaoVoltar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoLimpar)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void preencheCombo() {

        daoCategoria = new CategoriaDao();

        List<CategoriaBean> categorias = daoCategoria.listarCategorias();

        for (int i = 0; i < categorias.size(); i++) {
            comboCategorias.addItem(String.valueOf(categorias.get(i).getDescricao()));
        }

    }

    private void cadastraPergunta() {
        daoCategoria = new CategoriaDao();

        String pergunta = campoPergunta.getText();

        int categoriaId = daoCategoria.retornaIdCategoria(comboCategorias.getSelectedItem().toString());

        PerguntaBean bean = new PerguntaBean(0, categoriaId, pergunta);
        PerguntaDao daoPergunta = new PerguntaDao();

        daoPergunta.insereNovaPergunta(bean);
    }

    private void cadastraResposta() {

        PerguntaDao dao = new PerguntaDao();

        int ultimaPerguntaCadastrada = dao.retornaUltimaPerguntaCadastrada();
        String resposta = campoResposta.getText();

        RespostaBean bean = new RespostaBean(0, resposta, ultimaPerguntaCadastrada);
        RespostaDao daoResposta = new RespostaDao();

        daoResposta.insereNovaResposta(bean);

    }

    private void cadastraAlternativa() {

        PerguntaDao daoPergunta = new PerguntaDao();
        
        int perguntaId = daoPergunta.retornaUltimaPerguntaCadastrada();
        
        String alternativas[] = {campoAlternativa1.getText(), campoAlternativa2.getText(), campoAlternativa3.getText(),
            campoAlternativa4.getText(), campoAlternativa5.getText()};

        
        
        AlternativaBean beanAlternativa = new AlternativaBean(0, alternativas);
        AlternativaDao daoAlternativa  = new AlternativaDao();
        
        
        daoAlternativa.insereNovaAlternativa(beanAlternativa);
        
        int vetorAlternativasId [] = daoAlternativa.retorna_5_ultimasAlternativas();
        
        for(int i = 0; i < vetorAlternativasId.length; i++){
            daoAlternativa.insereNovaAlternativa_Pergunta(vetorAlternativasId[i], perguntaId);
        }
    }
    
    private boolean verificaCampoEmBranco(){
        
        String campos [] = new String[6];
        
        campos[0] = campoPergunta.getText();
        campos[1] = campoAlternativa1.getText();
        campos[2] = campoAlternativa2.getText();
        campos[3] = campoAlternativa3.getText();
        campos[4] = campoAlternativa4.getText();
        campos[5] = campoResposta.getText();
        
        for(int i=0 ; i < campos.length; i++){
            
            if(campos[i].equals("") | campos[i] == null){
                return false;
            }
            
        }
        
        // todos os campos foram preenchidos!!!
        return true;
        
    }
    

    private void campoPerguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPerguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPerguntaActionPerformed

    private void botaoConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmarActionPerformed

        if(verificaCampoEmBranco() == true){
        
        cadastraPergunta();
        cadastraResposta();
        cadastraAlternativa();
        JOptionPane.showMessageDialog(null,"Pergunta Formada!!!");
        limpaCampos();
        
        }else{
            
            JOptionPane.showMessageDialog(null,"Por favor, preencha todos os campos!");
            
        }
        
    }//GEN-LAST:event_botaoConfirmarActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        dispose();
        TelaInicial tela = new TelaInicial();
        tela.setVisible(true);

    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        limpaCampos();
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void limpaCampos(){
        campoAlternativa1.setText("");
        campoAlternativa2.setText("");
        campoAlternativa3.setText("");
        campoAlternativa4.setText("");
        campoAlternativa5.setText("");
        campoPergunta.setText("");
        campoResposta.setText("");
    }
    
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
            java.util.logging.Logger.getLogger(TelaAdicionarConteudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarConteudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarConteudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarConteudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdicionarConteudo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoConfirmar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField campoAlternativa1;
    private javax.swing.JTextField campoAlternativa2;
    private javax.swing.JTextField campoAlternativa3;
    private javax.swing.JTextField campoAlternativa4;
    private javax.swing.JTextField campoAlternativa5;
    private javax.swing.JTextField campoPergunta;
    private javax.swing.JTextField campoResposta;
    private javax.swing.JComboBox<String> comboCategorias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
