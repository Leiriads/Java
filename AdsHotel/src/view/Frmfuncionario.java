
package view;

import dao.FuncionarioDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Funcionario;
import model.Utilitarios;
import negocio.ValidacaoCpf;
import negocio.ValidacaoCpf2;


public class Frmfuncionario extends javax.swing.JFrame {
    
    // Método listar na tabela
    public void listar() {
        FuncionarioDAO dao = new FuncionarioDAO();
        List<Funcionario> lista = dao.listarFuncionarios();
        DefaultTableModel dados = (DefaultTableModel) tabelaFuncionarios.getModel();
        dados.setNumRows(0);

        // para cada item dessa lista, é criado um objeto do tipo Cliente chamado c
        for (Funcionario c : lista) {
            dados.addRow(new Object[]{
                c.getNome(),
                c.getCpf(),
                c.getEmail(),
                c.getTelefone(),});
        }

    }

    /**
     * Creates new form Frmcliente
     */
    public Frmfuncionario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        funcionarios = new javax.swing.JTabbedPane();
        painelCadastroFuncionario = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        btnPesquisar = new javax.swing.JButton();
        painelConsultaFuncionario = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtNomeConsultar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFuncionarios = new javax.swing.JTable();
        btnConsultar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FUNCIONÁRIOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26))
        );

        funcionarios.setBackground(new java.awt.Color(255, 255, 255));
        funcionarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("NOME:");

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("CPF:");

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("EMAIL:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("TELEFONE:");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPesquisar.setText("PESQUISAR");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCadastroFuncionarioLayout = new javax.swing.GroupLayout(painelCadastroFuncionario);
        painelCadastroFuncionario.setLayout(painelCadastroFuncionarioLayout);
        painelCadastroFuncionarioLayout.setHorizontalGroup(
            painelCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroFuncionarioLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(painelCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(52, 52, 52)
                .addGroup(painelCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNome)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                    .addComponent(txtCpf)
                    .addComponent(txtTelefone))
                .addGap(44, 44, 44)
                .addComponent(btnPesquisar)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        painelCadastroFuncionarioLayout.setVerticalGroup(
            painelCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroFuncionarioLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(painelCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(painelCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(painelCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPesquisar)))
                .addGap(49, 49, 49)
                .addGroup(painelCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(painelCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        funcionarios.addTab("DADOS DO FUNCIONÁRIO", painelCadastroFuncionario);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("NOME:");

        txtNomeConsultar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tabelaFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "E-mail", "Telefone"
            }
        ));
        tabelaFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaFuncionariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaFuncionarios);

        btnConsultar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(51, 51, 255));
        btnConsultar.setText("CONSULTAR");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelConsultaFuncionarioLayout = new javax.swing.GroupLayout(painelConsultaFuncionario);
        painelConsultaFuncionario.setLayout(painelConsultaFuncionarioLayout);
        painelConsultaFuncionarioLayout.setHorizontalGroup(
            painelConsultaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConsultaFuncionarioLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(painelConsultaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelConsultaFuncionarioLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(52, 52, 52)
                        .addComponent(txtNomeConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnConsultar)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        painelConsultaFuncionarioLayout.setVerticalGroup(
            painelConsultaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConsultaFuncionarioLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(painelConsultaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNomeConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        funcionarios.addTab("CONSULTA FUNCIONÁRIOS", painelConsultaFuncionario);

        btnNovo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnNovo.setText("NOVO");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAtualizar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAtualizar.setText("ATUALIZAR");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(funcionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(btnNovo)
                        .addGap(53, 53, 53)
                        .addComponent(btnSalvar)
                        .addGap(61, 61, 61)
                        .addComponent(btnAtualizar)
                        .addGap(54, 54, 54)
                        .addComponent(btnExcluir)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(funcionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnAtualizar)
                    .addComponent(btnExcluir))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // botão SALVAR:
        
        Funcionario obj = new Funcionario();
        obj.setFuncionario(txtNome.getText(), txtCpf.getText(), txtEmail.getText(), txtTelefone.getText());

        ValidacaoCpf validacpf = new ValidacaoCpf();

        validacpf.setCPF(obj.getCpf());//passando como argumento o getCpf do obj que recebe o cpf do funcionario
        
        if (ValidacaoCpf2.isCPF(validacpf.getCPF()) == true) {
            FuncionarioDAO dao = new FuncionarioDAO();
            dao.cadastrarFuncionario(obj);

        new Utilitarios().LimparTela(painelCadastroFuncionario);
        }else{
            JOptionPane.showMessageDialog(null, "Erro, CPF invalido !!!");
            System.out.printf("Erro, CPF invalido !!!\n");
        }
        
        
        //txtnome.setText("");
        //txtcpf.setText("");
        //txtemail.setText("");
        //txttelefone.setText("");
    }                                         

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // botão ATUALIZAR:

        Funcionario obj = new Funcionario();
        obj.setFuncionario(txtNome.getText(), txtCpf.getText(), txtEmail.getText(), txtTelefone.getText());

        FuncionarioDAO dao = new FuncionarioDAO();
        dao.alterarFuncionario(obj);

        new Utilitarios().LimparTela(painelCadastroFuncionario);
    }                                            

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // botão EXCLUIR:

        Funcionario obj = new Funcionario();
        obj.setFuncionario(txtNome.getText(), txtCpf.getText(), txtEmail.getText(), txtTelefone.getText());

        FuncionarioDAO dao = new FuncionarioDAO();
        dao.excluirFuncionario(obj);

        new Utilitarios().LimparTela(painelCadastroFuncionario);
    }                                          

    private void formWindowActivated(java.awt.event.WindowEvent evt) {                                     
        // Carrega a lista
        listar();
    }                                    

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // Botão pesquisar cliente por Nome
        String nome = "%" + txtNomeConsultar.getText() + "%";

        FuncionarioDAO dao = new FuncionarioDAO();
        List<Funcionario> lista = dao.consultaFuncionariosPorNome(nome);
        DefaultTableModel dados = (DefaultTableModel) tabelaFuncionarios.getModel();
        dados.setNumRows(0);

        // para cada item dessa lista, é criado um objeto do tipo Cliente chamado c
        for (Funcionario c : lista) {
            dados.addRow(new Object[]{
                c.getNome(),
                c.getCpf(),
                c.getEmail(),
                c.getTelefone(),});
        }
    }                                            

    private void tabelaFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {                                                
        // Pega os dados
        funcionarios.setSelectedIndex(0);

        txtNome.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 0).toString());
        txtCpf.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 1).toString());
        txtEmail.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 2).toString());
        txtTelefone.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 3).toString());
    }                                               

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // Botão buscar cliente por CPF

        String cpf = txtCpf.getText();
        //Clientes obj = new Clientes();
        FuncionarioDAO dao = new FuncionarioDAO();

        Funcionario obj = dao.buscaFuncionarioPorCpf(cpf);

        if (obj.getCpf() != null) {
            //Exibir os dados do objeto nos campos de texto
            txtNome.setText(obj.getNome());
            txtCpf.setText(obj.getCpf());
            txtEmail.setText(obj.getEmail());
            txtTelefone.setText(obj.getTelefone());
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado");
        }
    }                                            

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // Botão NOVO
        new Utilitarios().LimparTela(painelCadastroFuncionario);

    }                                       

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frmfuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frmfuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frmfuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frmfuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmfuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTabbedPane funcionarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelCadastroFuncionario;
    private javax.swing.JPanel painelConsultaFuncionario;
    private javax.swing.JTable tabelaFuncionarios;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeConsultar;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration                   
}
