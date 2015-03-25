/*******************************************************************************
 * Copyright (c) 2007, 2015 THALES GLOBAL SERVICES and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.sirius.diagram.ui.internal.edit.parts;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.ui.internal.providers.SiriusElementTypes;
import org.eclipse.sirius.diagram.ui.internal.providers.SiriusParserProvider;

/**
 * @was-generated
 */
public class DNodeContainerName2EditPart extends AbstractDiagramElementContainerNameEditPart implements ITextAwareEditPart {

    /**
     * @was-generated
     */
    public static final int VISUAL_ID = 5005;

    /**
     * @was-generated
     */
    public DNodeContainerName2EditPart(View view) {
        super(view);
    }

    /**
     * @was-generated
     */
    public IParser getParser() {
        if (parser == null) {
            String parserHint = ((View) getModel()).getType();
            IAdaptable hintAdapter = new SiriusParserProvider.HintAdapter(SiriusElementTypes.DNodeContainer_3008, getParserElement(), parserHint);
            parser = ParserService.getInstance().getParser(hintAdapter);
        }
        return parser;
    }
}
