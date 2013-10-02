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
package org.eclipse.sirius.viewpoint.description.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.sirius.viewpoint.description.DescriptionPackage;
import org.eclipse.sirius.viewpoint.description.DragAndDropTargetDescription;
import org.eclipse.sirius.viewpoint.description.tool.ContainerDropDescription;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Drag And Drop Target Description</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.eclipse.sirius.viewpoint.description.impl.DragAndDropTargetDescriptionImpl#getDropDescriptions
 * <em>Drop Descriptions</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class DragAndDropTargetDescriptionImpl extends EObjectImpl implements DragAndDropTargetDescription {
    /**
     * The cached value of the '{@link #getDropDescriptions()
     * <em>Drop Descriptions</em>}' reference list. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getDropDescriptions()
     * @generated
     * @ordered
     */
    protected EList<ContainerDropDescription> dropDescriptions;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected DragAndDropTargetDescriptionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DescriptionPackage.Literals.DRAG_AND_DROP_TARGET_DESCRIPTION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<ContainerDropDescription> getDropDescriptions() {
        if (dropDescriptions == null) {
            dropDescriptions = new EObjectResolvingEList<ContainerDropDescription>(ContainerDropDescription.class, this, DescriptionPackage.DRAG_AND_DROP_TARGET_DESCRIPTION__DROP_DESCRIPTIONS);
        }
        return dropDescriptions;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case DescriptionPackage.DRAG_AND_DROP_TARGET_DESCRIPTION__DROP_DESCRIPTIONS:
            return getDropDescriptions();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case DescriptionPackage.DRAG_AND_DROP_TARGET_DESCRIPTION__DROP_DESCRIPTIONS:
            getDropDescriptions().clear();
            getDropDescriptions().addAll((Collection<? extends ContainerDropDescription>) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case DescriptionPackage.DRAG_AND_DROP_TARGET_DESCRIPTION__DROP_DESCRIPTIONS:
            getDropDescriptions().clear();
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case DescriptionPackage.DRAG_AND_DROP_TARGET_DESCRIPTION__DROP_DESCRIPTIONS:
            return dropDescriptions != null && !dropDescriptions.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // DragAndDropTargetDescriptionImpl
