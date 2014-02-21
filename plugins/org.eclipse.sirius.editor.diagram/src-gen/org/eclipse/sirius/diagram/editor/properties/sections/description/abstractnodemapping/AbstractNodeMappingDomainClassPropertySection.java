/*******************************************************************************
 * Copyright (c) 2007, 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.sirius.diagram.editor.properties.sections.description.abstractnodemapping;

// Start of user code imports

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.sirius.diagram.description.DescriptionPackage;
import org.eclipse.sirius.editor.editorPlugin.SiriusEditor;
import org.eclipse.sirius.editor.properties.sections.common.AbstractTextPropertySection;
import org.eclipse.sirius.editor.tools.api.assist.TypeContentProposalProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

// End of user code imports

/**
 * A section for the domainClass property of a AbstractNodeMapping object.
 */
public class AbstractNodeMappingDomainClassPropertySection extends AbstractTextPropertySection {

    /** Help control of the section. */
    protected CLabel help;

    /**
     * @see org.eclipse.ui.views.properties.tabbed.view.ITabbedPropertySection#refresh()
     */
    public void refresh() {
        super.refresh();

        final String tooltip = getToolTipText();
        if (tooltip != null && help != null) {
            help.setToolTipText(getToolTipText());
        }
    }

    /**
     * @see org.eclipse.sirius.diagram.editor.properties.sections.AbstractTextPropertySection#getDefaultLabelText()
     */
    protected String getDefaultLabelText() {
        return "DomainClass"; //$NON-NLS-1$
    }

    /**
     * @see org.eclipse.sirius.diagram.editor.properties.sections.AbstractTextPropertySection#getLabelText()
     */
    protected String getLabelText() {
        String labelText;
        labelText = super.getLabelText() + "*:"; //$NON-NLS-1$
        // Start of user code get label text

        // End of user code get label text
        return labelText;
    }

    /**
     * @see org.eclipse.sirius.diagram.editor.properties.sections.AbstractTextPropertySection#getFeature()
     */
    public EAttribute getFeature() {
        return DescriptionPackage.eINSTANCE.getAbstractNodeMapping_DomainClass();
    }

    /**
     * @see org.eclipse.sirius.diagram.editor.properties.sections.AbstractTextPropertySection#getFeatureValue(String)
     */
    protected Object getFeatureValue(String newText) {
        return newText;
    }

    /**
     * @see org.eclipse.sirius.diagram.editor.properties.sections.AbstractTextPropertySection#isEqual(String)
     */
    protected boolean isEqual(String newText) {
        return getFeatureAsText().equals(newText);
    }

    /**
     * {@inheritDoc}
     */
    public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
        super.createControls(parent, tabbedPropertySheetPage);
        /*
         * We set the color as it's a TypeName
         */
        text.setBackground(SiriusEditor.getColorRegistry().get("green"));

        text.setToolTipText(getToolTipText());

        help = getWidgetFactory().createCLabel(composite, "");
        FormData data = new FormData();
        data.top = new FormAttachment(text, 0, SWT.TOP);
        data.left = new FormAttachment(nameLabel);
        help.setLayoutData(data);
        help.setFont(SiriusEditor.getFontRegistry().get("description"));
        help.setImage(getHelpIcon());
        help.setToolTipText(getToolTipText());
        nameLabel.setFont(SiriusEditor.getFontRegistry().get("required"));

        TypeContentProposalProvider.bindCompletionProcessor(this, text);

        // Start of user code create controls

        // End of user code create controls

    }

    /**
     * {@inheritDoc}
     */
    protected String getPropertyDescription() {
        return "Type of the element represented by the Node.";
    }

    // Start of user code user operations

    // End of user code user operations
}