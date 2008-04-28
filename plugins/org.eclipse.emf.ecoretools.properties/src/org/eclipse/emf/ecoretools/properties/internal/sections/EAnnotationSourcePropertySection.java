/***********************************************************************
 * Copyright (c) 2007 Anyware Technologies
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Anyware Technologies - initial API and implementation
 *
 * $Id: EAnnotationSourcePropertySection.java,v 1.3 2008/04/28 10:24:47 jlescot Exp $
 **********************************************************************/

package org.eclipse.emf.ecoretools.properties.internal.sections;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecoretools.properties.internal.Messages;
import org.eclipse.emf.tabbedproperties.sections.AbstractStringPropertySection;

/**
 * The section for the source property of an EAnnotation Object.
 * 
 * Creation 5 avr. 2006
 * 
 * @author jlescot
 */
public class EAnnotationSourcePropertySection extends AbstractStringPropertySection {

	/**
	 * @see org.eclipse.emf.tabbedproperties.sections.AbstractTextPropertySection#getLabelText()
	 */
	@Override
	protected String getLabelText() {
		return Messages.EAnnotationSourcePropertySection_Source;
	}

	/**
	 * @see org.eclipse.emf.tabbedproperties.sections.AbstractTextPropertySection#getFeature()
	 */
	@Override
	protected EStructuralFeature getFeature() {
		return EcorePackage.eINSTANCE.getEAnnotation_Source();
	}
}
