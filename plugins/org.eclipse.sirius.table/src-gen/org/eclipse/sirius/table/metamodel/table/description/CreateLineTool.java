/*******************************************************************************
 * Copyright (c) 2007-2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.sirius.table.metamodel.table.description;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Create Line Tool</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.eclipse.sirius.table.metamodel.table.description.CreateLineTool#getMapping
 * <em>Mapping</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage#getCreateLineTool()
 * @model
 * @generated
 */
public interface CreateLineTool extends CreateTool {
    /**
     * Returns the value of the '<em><b>Mapping</b></em>' reference. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mapping</em>' reference isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Mapping</em>' reference.
     * @see #setMapping(LineMapping)
     * @see org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage#getCreateLineTool_Mapping()
     * @model
     * @generated
     */
    LineMapping getMapping();

    /**
     * Sets the value of the '
     * {@link org.eclipse.sirius.table.metamodel.table.description.CreateLineTool#getMapping
     * <em>Mapping</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Mapping</em>' reference.
     * @see #getMapping()
     * @generated
     */
    void setMapping(LineMapping value);

} // CreateLineTool
