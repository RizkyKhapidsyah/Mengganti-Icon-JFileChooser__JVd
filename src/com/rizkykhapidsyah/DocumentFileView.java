package com.rizkykhapidsyah;

import javax.swing.*;
import javax.swing.filechooser.FileView;
import java.io.File;

public class DocumentFileView extends FileView {

    ImageIcon folderIcon = new ImageIcon("images/folderfile.png");
    ImageIcon docIcon = new ImageIcon("images/docfile.png");
    ImageIcon otherIcon = new ImageIcon("images/otherfile.png");

    public Icon dapatkanIcon(File f) {
        Icon icon = null;

        if (f.isDirectory()) {
            icon = folderIcon;
        } else {
            String ekstensi = DapatkanEkstensi(f);

            if (ekstensi != null) {
                if (ekstensi.equals("DOC") || ekstensi.equals("DOCX")) {
                    icon = docIcon;
                } else {
                    icon = otherIcon;
                }
            }
        }

        return icon;
    }

    public static String DapatkanEkstensi(File f) {
        String ext = null;
        String s = f.getName();
        int i = s.lastIndexOf('.');

        if (i > 0 && i < s.length() - 1) {
            ext = s.substring(i + 1).toUpperCase();
        }

        return ext;
    }

}
