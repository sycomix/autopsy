/*
 * Autopsy Forensic Browser
 *
 * Copyright 2011-2017 Basis Technology Corp.
 * Contact: carrier <at> sleuthkit <dot> org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sleuthkit.autopsy.communications;

import java.util.List;
import java.util.stream.Collectors;
import org.openide.explorer.ExplorerManager;
import org.openide.util.NbBundle;
import org.openide.windows.Mode;
import org.openide.windows.RetainLocation;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;
import org.sleuthkit.autopsy.coreutils.ThreadConfined;

/**
 * Top component which displays something.
 */
@TopComponent.Description(
        preferredID = "CVTTopComponent",
        //iconBase="SET/PATH/TO/ICON/HERE", //use this to put icon in window title area,
        persistenceType = TopComponent.PERSISTENCE_NEVER)
@TopComponent.Registration(mode = "cvt", openAtStartup = false)
@RetainLocation("cvt")
@NbBundle.Messages("CVTTopComponent.name= Communications Visualization")
public final class CVTTopComponent extends TopComponent implements ExplorerManager.Provider {

    private static final long serialVersionUID = 1L;

    @ThreadConfined(type = ThreadConfined.ThreadType.AWT)
    private final ExplorerManager em = new ExplorerManager();

    public CVTTopComponent() {
        initComponents();
        setName(Bundle.CVTTopComponent_name());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        accountsBrowser = new org.sleuthkit.autopsy.communications.AccountsBrowser();
        jPanel1 = new javax.swing.JPanel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(CVTTopComponent.class, "CVTTopComponent.jPanel2.border.title"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 232, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jSplitPane1.setDividerLocation(600);

        jTabbedPane1.addTab(org.openide.util.NbBundle.getMessage(CVTTopComponent.class, "CVTTopComponent.accountsBrowser.TabConstraints.tabTitle"), accountsBrowser); // NOI18N

        jPanel1.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 716, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab(org.openide.util.NbBundle.getMessage(CVTTopComponent.class, "CVTTopComponent.TabConstraints.tabTitle"), jPanel1); // NOI18N

        jSplitPane1.setLeftComponent(jTabbedPane1);

        jSplitPane2.setDividerLocation(200);
        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jTextField1.setText(org.openide.util.NbBundle.getMessage(CVTTopComponent.class, "CVTTopComponent.jTextField1.text")); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jSplitPane2.setTopComponent(jTextField1);

        jTextField2.setText(org.openide.util.NbBundle.getMessage(CVTTopComponent.class, "CVTTopComponent.jTextField2.text")); // NOI18N
        jSplitPane2.setRightComponent(jTextField2);

        jSplitPane1.setRightComponent(jSplitPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1334, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSplitPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.sleuthkit.autopsy.communications.AccountsBrowser accountsBrowser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void componentOpened() {
        super.componentOpened();
        WindowManager.getDefault().setTopComponentFloating(this, true);
    }

    @Override
    public ExplorerManager getExplorerManager() {
        return em;
    }
    
      @Override
    public List<Mode> availableModes(List<Mode> modes) {
        /*
         * This looks like the right thing to do, but online discussions seems
         * to indicate this method is effectively deprecated. A break point
         * placed here was never hit.
         */
        return modes.stream().filter(mode -> mode.getName().equals("cvt"))
                .collect(Collectors.toList());
    }
}
