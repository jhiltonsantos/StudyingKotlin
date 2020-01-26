package ui;

import manager.ContactManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm extends JFrame {

    private JPanel rootPanel;
    private JLabel labelName;
    private JTextField textName;
    private JTextField textPhone;
    private JButton buttonCancel;
    private JButton buttonSave;
    private JLabel labelPhone;

    private ContactManager mContactManager;

    public ContactForm() {

        setContentPane(rootPanel);
        setSize(500, 300);
        setVisible(true);

        // Tamanho Inicial da Tela [Centro]
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width / 2 - getSize().width / 2, dim.height / 2 - getSize().height / 2);

        // Encerrar o Programa ao fechar a Tela
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mContactManager = new ContactManager();

        setListeners();
    }

    private void setListeners() {
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    String name = textName.getText();
                    String phone = textPhone.getText();

                    mContactManager.save(name, phone);
                    new MainForm();
                    dispose();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(new JFrame(), e.getMessage());
                }
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new MainForm();
                dispose();
            }
        });
    }
}
