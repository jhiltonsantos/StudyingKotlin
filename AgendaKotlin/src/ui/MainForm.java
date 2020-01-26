package ui;

import entity.ContactEntity;
import manager.ContactManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MainForm extends JFrame {
    private JPanel rootPanel;
    private JButton buttonNewContant;
    private JButton buttonRemove;
    private JTable tableContats;

    private ContactManager mContactManager;

    public MainForm() {

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
        loadContacts();
    }

    private void loadContacts() {
        List<ContactEntity> contactEntityList = mContactManager.getList();
    }

    private void setListeners() { // Acoes dos Butoes
        buttonNewContant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new ContactForm();
                dispose();
            }
        });

        buttonRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
    }
}

