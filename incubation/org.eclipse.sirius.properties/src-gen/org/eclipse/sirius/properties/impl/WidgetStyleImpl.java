/**
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *
 */
package org.eclipse.sirius.properties.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.sirius.properties.PropertiesPackage;
import org.eclipse.sirius.properties.WidgetStyle;
import org.eclipse.sirius.viewpoint.FontFormat;
import org.eclipse.sirius.viewpoint.description.ColorDescription;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Widget Style</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.eclipse.sirius.properties.impl.WidgetStyleImpl#getLabelFontNameExpression
 * <em>Label Font Name Expression</em>}</li>
 * <li>
 * {@link org.eclipse.sirius.properties.impl.WidgetStyleImpl#getLabelFontSize
 * <em>Label Font Size</em>}</li>
 * <li>
 * {@link org.eclipse.sirius.properties.impl.WidgetStyleImpl#getLabelBackgroundColor
 * <em>Label Background Color</em>}</li>
 * <li>
 * {@link org.eclipse.sirius.properties.impl.WidgetStyleImpl#getLabelForegroundColor
 * <em>Label Foreground Color</em>}</li>
 * <li>
 * {@link org.eclipse.sirius.properties.impl.WidgetStyleImpl#getLabelFontFormat
 * <em>Label Font Format</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WidgetStyleImpl extends MinimalEObjectImpl.Container implements WidgetStyle {
    /**
     * The default value of the '{@link #getLabelFontNameExpression()
     * <em>Label Font Name Expression</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getLabelFontNameExpression()
     * @generated
     * @ordered
     */
    protected static final String LABEL_FONT_NAME_EXPRESSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLabelFontNameExpression()
     * <em>Label Font Name Expression</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getLabelFontNameExpression()
     * @generated
     * @ordered
     */
    protected String labelFontNameExpression = WidgetStyleImpl.LABEL_FONT_NAME_EXPRESSION_EDEFAULT;

    /**
     * The default value of the '{@link #getLabelFontSize()
     * <em>Label Font Size</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getLabelFontSize()
     * @generated
     * @ordered
     */
    protected static final int LABEL_FONT_SIZE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getLabelFontSize()
     * <em>Label Font Size</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getLabelFontSize()
     * @generated
     * @ordered
     */
    protected int labelFontSize = WidgetStyleImpl.LABEL_FONT_SIZE_EDEFAULT;

    /**
     * The cached value of the '{@link #getLabelBackgroundColor()
     * <em>Label Background Color</em>}' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getLabelBackgroundColor()
     * @generated
     * @ordered
     */
    protected ColorDescription labelBackgroundColor;

    /**
     * The cached value of the '{@link #getLabelForegroundColor()
     * <em>Label Foreground Color</em>}' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getLabelForegroundColor()
     * @generated
     * @ordered
     */
    protected ColorDescription labelForegroundColor;

    /**
     * The cached value of the '{@link #getLabelFontFormat()
     * <em>Label Font Format</em>}' attribute list. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getLabelFontFormat()
     * @generated
     * @ordered
     */
    protected EList<FontFormat> labelFontFormat;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected WidgetStyleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.WIDGET_STYLE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getLabelFontNameExpression() {
        return labelFontNameExpression;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setLabelFontNameExpression(String newLabelFontNameExpression) {
        String oldLabelFontNameExpression = labelFontNameExpression;
        labelFontNameExpression = newLabelFontNameExpression;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.WIDGET_STYLE__LABEL_FONT_NAME_EXPRESSION, oldLabelFontNameExpression, labelFontNameExpression));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int getLabelFontSize() {
        return labelFontSize;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setLabelFontSize(int newLabelFontSize) {
        int oldLabelFontSize = labelFontSize;
        labelFontSize = newLabelFontSize;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.WIDGET_STYLE__LABEL_FONT_SIZE, oldLabelFontSize, labelFontSize));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ColorDescription getLabelBackgroundColor() {
        if (labelBackgroundColor != null && labelBackgroundColor.eIsProxy()) {
            InternalEObject oldLabelBackgroundColor = (InternalEObject) labelBackgroundColor;
            labelBackgroundColor = (ColorDescription) eResolveProxy(oldLabelBackgroundColor);
            if (labelBackgroundColor != oldLabelBackgroundColor) {
                if (eNotificationRequired()) {
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.WIDGET_STYLE__LABEL_BACKGROUND_COLOR, oldLabelBackgroundColor, labelBackgroundColor));
                }
            }
        }
        return labelBackgroundColor;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ColorDescription basicGetLabelBackgroundColor() {
        return labelBackgroundColor;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setLabelBackgroundColor(ColorDescription newLabelBackgroundColor) {
        ColorDescription oldLabelBackgroundColor = labelBackgroundColor;
        labelBackgroundColor = newLabelBackgroundColor;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.WIDGET_STYLE__LABEL_BACKGROUND_COLOR, oldLabelBackgroundColor, labelBackgroundColor));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ColorDescription getLabelForegroundColor() {
        if (labelForegroundColor != null && labelForegroundColor.eIsProxy()) {
            InternalEObject oldLabelForegroundColor = (InternalEObject) labelForegroundColor;
            labelForegroundColor = (ColorDescription) eResolveProxy(oldLabelForegroundColor);
            if (labelForegroundColor != oldLabelForegroundColor) {
                if (eNotificationRequired()) {
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.WIDGET_STYLE__LABEL_FOREGROUND_COLOR, oldLabelForegroundColor, labelForegroundColor));
                }
            }
        }
        return labelForegroundColor;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ColorDescription basicGetLabelForegroundColor() {
        return labelForegroundColor;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setLabelForegroundColor(ColorDescription newLabelForegroundColor) {
        ColorDescription oldLabelForegroundColor = labelForegroundColor;
        labelForegroundColor = newLabelForegroundColor;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.WIDGET_STYLE__LABEL_FOREGROUND_COLOR, oldLabelForegroundColor, labelForegroundColor));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<FontFormat> getLabelFontFormat() {
        if (labelFontFormat == null) {
            labelFontFormat = new EDataTypeUniqueEList<FontFormat>(FontFormat.class, this, PropertiesPackage.WIDGET_STYLE__LABEL_FONT_FORMAT);
        }
        return labelFontFormat;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case PropertiesPackage.WIDGET_STYLE__LABEL_FONT_NAME_EXPRESSION:
            return getLabelFontNameExpression();
        case PropertiesPackage.WIDGET_STYLE__LABEL_FONT_SIZE:
            return getLabelFontSize();
        case PropertiesPackage.WIDGET_STYLE__LABEL_BACKGROUND_COLOR:
            if (resolve) {
                return getLabelBackgroundColor();
            }
            return basicGetLabelBackgroundColor();
        case PropertiesPackage.WIDGET_STYLE__LABEL_FOREGROUND_COLOR:
            if (resolve) {
                return getLabelForegroundColor();
            }
            return basicGetLabelForegroundColor();
        case PropertiesPackage.WIDGET_STYLE__LABEL_FONT_FORMAT:
            return getLabelFontFormat();
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
        case PropertiesPackage.WIDGET_STYLE__LABEL_FONT_NAME_EXPRESSION:
            setLabelFontNameExpression((String) newValue);
            return;
        case PropertiesPackage.WIDGET_STYLE__LABEL_FONT_SIZE:
            setLabelFontSize((Integer) newValue);
            return;
        case PropertiesPackage.WIDGET_STYLE__LABEL_BACKGROUND_COLOR:
            setLabelBackgroundColor((ColorDescription) newValue);
            return;
        case PropertiesPackage.WIDGET_STYLE__LABEL_FOREGROUND_COLOR:
            setLabelForegroundColor((ColorDescription) newValue);
            return;
        case PropertiesPackage.WIDGET_STYLE__LABEL_FONT_FORMAT:
            getLabelFontFormat().clear();
            getLabelFontFormat().addAll((Collection<? extends FontFormat>) newValue);
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
        case PropertiesPackage.WIDGET_STYLE__LABEL_FONT_NAME_EXPRESSION:
            setLabelFontNameExpression(WidgetStyleImpl.LABEL_FONT_NAME_EXPRESSION_EDEFAULT);
            return;
        case PropertiesPackage.WIDGET_STYLE__LABEL_FONT_SIZE:
            setLabelFontSize(WidgetStyleImpl.LABEL_FONT_SIZE_EDEFAULT);
            return;
        case PropertiesPackage.WIDGET_STYLE__LABEL_BACKGROUND_COLOR:
            setLabelBackgroundColor((ColorDescription) null);
            return;
        case PropertiesPackage.WIDGET_STYLE__LABEL_FOREGROUND_COLOR:
            setLabelForegroundColor((ColorDescription) null);
            return;
        case PropertiesPackage.WIDGET_STYLE__LABEL_FONT_FORMAT:
            getLabelFontFormat().clear();
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
        case PropertiesPackage.WIDGET_STYLE__LABEL_FONT_NAME_EXPRESSION:
            return WidgetStyleImpl.LABEL_FONT_NAME_EXPRESSION_EDEFAULT == null ? labelFontNameExpression != null : !WidgetStyleImpl.LABEL_FONT_NAME_EXPRESSION_EDEFAULT.equals(labelFontNameExpression);
        case PropertiesPackage.WIDGET_STYLE__LABEL_FONT_SIZE:
            return labelFontSize != WidgetStyleImpl.LABEL_FONT_SIZE_EDEFAULT;
        case PropertiesPackage.WIDGET_STYLE__LABEL_BACKGROUND_COLOR:
            return labelBackgroundColor != null;
        case PropertiesPackage.WIDGET_STYLE__LABEL_FOREGROUND_COLOR:
            return labelForegroundColor != null;
        case PropertiesPackage.WIDGET_STYLE__LABEL_FONT_FORMAT:
            return labelFontFormat != null && !labelFontFormat.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) {
            return super.toString();
        }

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (labelFontNameExpression: ");
        result.append(labelFontNameExpression);
        result.append(", labelFontSize: ");
        result.append(labelFontSize);
        result.append(", labelFontFormat: ");
        result.append(labelFontFormat);
        result.append(')');
        return result.toString();
    }

} // WidgetStyleImpl
