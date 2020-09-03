package com.rizkykhapidsyah;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FormUtama extends JFrame {

    JPanel panel;
    JButton btnOpenFile;

    public FormUtama() {
        super("Preview Image File Chooser");
        inisialisai_komponen();
    }

    public void inisialisai_komponen() {
        panel = new JPanel();
        btnOpenFile = new JButton("Buka File");

        btnOpenFile.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                bukaJFileChooser();
            }
        });

        panel.add(btnOpenFile);

        getContentPane().add(panel, BorderLayout.CENTER);
        setPreferredSize(new Dimension(300, 100));
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void bukaJFileChooser() {
        JFileChooser fc = new JFileChooser();

        fc.setFileView(new DocumentFileView());
        fc.showOpenDialog(this);
    }
}
