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
package org.eclipse.sirius.viewpoint.description.style;

import org.eclipse.sirius.viewpoint.LabelPosition;
import org.eclipse.sirius.viewpoint.ResizeKind;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Node Style Description</b></em>'. <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc --> Style of a node. <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.eclipse.sirius.viewpoint.description.style.NodeStyleDescription#getSizeComputationExpression
 * <em>Size Computation Expression</em>}</li>
 * <li>
 * {@link org.eclipse.sirius.viewpoint.description.style.NodeStyleDescription#getLabelPosition
 * <em>Label Position</em>}</li>
 * <li>
 * {@link org.eclipse.sirius.viewpoint.description.style.NodeStyleDescription#isHideLabelByDefault
 * <em>Hide Label By Default</em>}</li>
 * <li>
 * {@link org.eclipse.sirius.viewpoint.description.style.NodeStyleDescription#getResizeKind
 * <em>Resize Kind</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.sirius.viewpoint.description.style.StylePackage#getNodeStyleDescription()
 * @model abstract="true"
 * @generated
 */
public interface NodeStyleDescription extends StyleDescription, BorderedStyleDescription, LabelStyleDescription, TooltipStyleDescription {
    /**
     * Returns the value of the '<em><b>Size Computation Expression</b></em>'
     * attribute. The default value is <code>"<%eContents().nSize%>"</code>.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Acceleo expression that computes the size of the node. <!-- end-model-doc
     * -->
     * 
     * @return the value of the '<em>Size Computation Expression</em>'
     *         attribute.
     * @see #setSizeComputationExpression(String)
     * @see org.eclipse.sirius.viewpoint.description.style.StylePackage#getNodeStyleDescription_SizeComputationExpression()
     * @model default="<%eContents().nSize%>"
     *        dataType="org.eclipse.sirius.description.AcceleoExpression"
     * @generated
     */
    String getSizeComputationExpression();

    /**
     * Sets the value of the '
     * {@link org.eclipse.sirius.viewpoint.description.style.NodeStyleDescription#getSizeComputationExpression
     * <em>Size Computation Expression</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Size Computation Expression</em>'
     *            attribute.
     * @see #getSizeComputationExpression()
     * @generated
     */
    void setSizeComputationExpression(String value);

    /**
     * Returns the value of the '<em><b>Label Position</b></em>' attribute. The
     * default value is <code>"border"</code>. The literals are from the
     * enumeration {@link org.eclipse.sirius.viewpoint.LabelPosition}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The
     * position of the label of the node. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Label Position</em>' attribute.
     * @see org.eclipse.sirius.viewpoint.LabelPosition
     * @see #setLabelPosition(LabelPosition)
     * @see org.eclipse.sirius.viewpoint.description.style.StylePackage#getNodeStyleDescription_LabelPosition()
     * @model default="border"
     * @generated
     */
    LabelPosition getLabelPosition();

    /**
     * Sets the value of the '
     * {@link org.eclipse.sirius.viewpoint.description.style.NodeStyleDescription#getLabelPosition
     * <em>Label Position</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Label Position</em>' attribute.
     * @see org.eclipse.sirius.viewpoint.LabelPosition
     * @see #getLabelPosition()
     * @generated
     */
    void setLabelPosition(LabelPosition value);

    /**
     * Returns the value of the '<em><b>Hide Label By Default</b></em>'
     * attribute. The default value is <code>"false"</code>. <!-- begin-user-doc
     * --> <!-- end-user-doc --> <!-- begin-model-doc --> The default visibility
     * of the label (available only if labelPosition equals BORDER).&#xA;A
     * change of this option does not affect already existing elements. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Hide Label By Default</em>' attribute.
     * @see #setHideLabelByDefault(boolean)
     * @see org.eclipse.sirius.viewpoint.description.style.StylePackage#getNodeStyleDescription_HideLabelByDefault()
     * @model default="false"
     * @generated
     */
    boolean isHideLabelByDefault();

    /**
     * Sets the value of the '
     * {@link org.eclipse.sirius.viewpoint.description.style.NodeStyleDescription#isHideLabelByDefault
     * <em>Hide Label By Default</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Hide Label By Default</em>'
     *            attribute.
     * @see #isHideLabelByDefault()
     * @generated
     */
    void setHideLabelByDefault(boolean value);

    /**
     * Returns the value of the '<em><b>Resize Kind</b></em>' attribute. The
     * default value is <code>"NONE"</code>. The literals are from the
     * enumeration {@link org.eclipse.sirius.viewpoint.ResizeKind}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If true
     * then the node can be resized by the user. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Resize Kind</em>' attribute.
     * @see org.eclipse.sirius.viewpoint.ResizeKind
     * @see #setResizeKind(ResizeKind)
     * @see org.eclipse.sirius.viewpoint.description.style.StylePackage#getNodeStyleDescription_ResizeKind()
     * @model default="NONE" required="true"
     * @generated
     */
    ResizeKind getResizeKind();

    /**
     * Sets the value of the '
     * {@link org.eclipse.sirius.viewpoint.description.style.NodeStyleDescription#getResizeKind
     * <em>Resize Kind</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Resize Kind</em>' attribute.
     * @see org.eclipse.sirius.viewpoint.ResizeKind
     * @see #getResizeKind()
     * @generated
     */
    void setResizeKind(ResizeKind value);

} // NodeStyleDescription
