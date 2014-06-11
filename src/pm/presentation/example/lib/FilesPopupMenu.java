/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pm.presentation.example.lib;

import javax.swing.JPopupMenu;

/**
 *
 * @author user
 */
public class FilesPopupMenu extends JPopupMenu {
    private FilesMainPanel filesMainPanel;
    private ShowPropertiesMI showProperties;
    

    /**
     * Creates new form FilesPopupMenu
     */
    public FilesPopupMenu() {
        initComponents();
    }
    public FilesPopupMenu(FilesMainPanel filesMP) {
        filesMainPanel = filesMP;
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        showPropertiesMI1 = showProperties = new pm.presentation.example.lib.ShowPropertiesMI(filesMainPanel);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pm.presentation.example.lib.ShowPropertiesMI showPropertiesMI1;
    // End of variables declaration//GEN-END:variables
}