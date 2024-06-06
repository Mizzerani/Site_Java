package Formularios;

import Classes.Dados;

import javax.swing.*;
import java.awt.event.*;

public class
frmLogin extends JDialog {
    private JPanel contentPane;
    private JButton Entrar;
    private JButton Sair;
    private JTextField EUsuario;
    private JPasswordField SUsuario;

    public frmLogin() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(Entrar);

        Entrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Dados msDados = new Dados();
                if (msDados.validarUsuario(EUsuario.getText(),new String(SUsuario.getPassword()))){
                    JOptionPane.showMessageDialog(rootPane, "Usuário e senha incorretos");
                    EUsuario.setText("");
                    SUsuario.setText("");
                    EUsuario.requestFocusInWindow();
                    return;
                }
                onOK();
            }
        });

        Sair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                onCancel();
            }
        });

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        frmLogin dialog = new frmLogin();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
