package ui;

import com.sun.tools.javac.Main;
import entity.ContactEntity;
import manager.ContactManager;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MainForm extends JFrame {
    private JPanel rootPanel;
    private JButton buttonNewContact;
    private JButton buttonRemove;
    private JTable tableContacts;
    private JLabel labelContactCount;

    private ContactManager mContactManager;
    private String mName = "";
    private String mPhone = "";

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
        List<ContactEntity> contactList = mContactManager.getList();

        // Tabela sem Dados com as colunas - Coluna [0,0]
        String[] columnNames = {"Nome", "Telefone"};
        DefaultTableModel model = new DefaultTableModel(new Object[0][0], columnNames);

        for (ContactEntity i : contactList) {
            Object[] obj = new Object[2];
            obj[0] = i.getName();
            obj[1] = i.getPhone();

            model.addRow(obj);
        }

        // Validacao para Remover Seleção
        tableContacts.clearSelection();
        tableContacts.setModel(model);

        labelContactCount.setText(mContactManager.getContactCount());
    }

    private void setListeners() { // Acoes dos Butoes
        // Salvar Contatos
        buttonNewContact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new ContactForm();
                dispose();
            }
        });

        tableContacts.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                if (listSelectionEvent.getValueIsAdjusting()) {
                    if (tableContacts.getSelectedRow() != -1) {
                        // Pegando valor da linha selecionada e coluna nome (tableContact[model[0]])
                        mName = tableContacts.getValueAt(tableContacts.getSelectedRow(), 0).toString();
                        mPhone = tableContacts.getValueAt(tableContacts.getSelectedRow(), 0).toString();
                    }
                }
            }
        });

        // Remover Contatos
        buttonRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    mContactManager.remove(mName, mPhone);
                    loadContacts();

                    mName = "";
                    mPhone = "";
                }catch (Exception e) {
                    JOptionPane.showMessageDialog(new JFrame(), e.getMessage());
                }
            }
        });
    }
}

