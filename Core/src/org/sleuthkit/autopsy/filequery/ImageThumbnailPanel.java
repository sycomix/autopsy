/*
 * Autopsy
 *
 * Copyright 2019 Basis Technology Corp.
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
package org.sleuthkit.autopsy.filequery;

import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import org.openide.util.ImageUtilities;
import org.openide.util.NbBundle;

/**
 * Class which displays a thumbnail and information for an image file.
 */
public class ImageThumbnailPanel extends javax.swing.JPanel implements ListCellRenderer<ImageThumbnailWrapper> {

    private static final long serialVersionUID = 1L;
    private static final Color SELECTION_COLOR = new Color(0, 120, 215);
    private static final String RED_CIRCLE_ICON_PATH = "org/sleuthkit/autopsy/images/red-circle-exclamation.png";
    private static final String YELLOW_CIRCLE_ICON_PATH = "org/sleuthkit/autopsy/images/yellow-circle-yield.png";
    private static final ImageIcon INTERESTING_SCORE_ICON = new ImageIcon(ImageUtilities.loadImage(YELLOW_CIRCLE_ICON_PATH, false));
    private static final ImageIcon NOTABLE_ICON_SCORE = new ImageIcon(ImageUtilities.loadImage(RED_CIRCLE_ICON_PATH, false));

    /**
     * Creates new form ImageThumbnailPanel
     */
    public ImageThumbnailPanel() {
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

        javax.swing.JPanel thumbnailPanel = new javax.swing.JPanel();
        thumbnailLabel = new javax.swing.JLabel();
        fileSizeLabel = new javax.swing.JLabel();
        countLabel = new javax.swing.JLabel();
        isDeletedLabel = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();

        thumbnailPanel.setLayout(new java.awt.GridBagLayout());
        thumbnailPanel.add(thumbnailLabel, new java.awt.GridBagConstraints());

        isDeletedLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/sleuthkit/autopsy/images/file-icon-deleted.png"))); // NOI18N

        scoreLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/sleuthkit/autopsy/images/red-circle-exclamation.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(thumbnailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                        .addComponent(fileSizeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(countLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isDeletedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scoreLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(thumbnailPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fileSizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scoreLabel)
                    .addComponent(isDeletedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel countLabel;
    private javax.swing.JLabel fileSizeLabel;
    private javax.swing.JLabel isDeletedLabel;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JLabel thumbnailLabel;
    // End of variables declaration//GEN-END:variables

    @NbBundle.Messages({"# {0} - fileSize",
        "ImageThumbnailPanel.sizeLabel.text=Size: {0} bytes",
        "# {0} - numberOfInstances",
        "ImageThumbnailPanel.countLabel.text=Number of Instances: {0}"})
    @Override
    public Component getListCellRendererComponent(JList<? extends ImageThumbnailWrapper> list, ImageThumbnailWrapper value, int index, boolean isSelected, boolean cellHasFocus) {
        fileSizeLabel.setText(Bundle.ImageThumbnailPanel_sizeLabel_text(value.getResultFile().getFirstInstance().getSize()));
        countLabel.setText(Bundle.ImageThumbnailPanel_countLabel_text(value.getResultFile().getAllInstances().size()));
        thumbnailLabel.setIcon(new ImageIcon(value.getThumbnail()));
        isDeletedLabel.setVisible(value.getResultFile().isDeleted());
        switch (value.getResultFile().getScore()) {
            case NOTABLE_SCORE:
                scoreLabel.setIcon(NOTABLE_ICON_SCORE);
                break;
            case INTERESTING_SCORE:
                scoreLabel.setIcon(INTERESTING_SCORE_ICON);
                break;
            case NO_SCORE:
            default:
                scoreLabel.setIcon(null);
                break;
        }
        setToolTipText(value.getResultFile().getScoreDescription());
        setBackground(isSelected ? SELECTION_COLOR : list.getBackground());

        return this;
    }

}
