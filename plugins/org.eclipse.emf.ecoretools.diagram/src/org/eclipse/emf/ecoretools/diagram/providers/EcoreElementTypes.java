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
 **********************************************************************/

package org.eclipse.emf.ecoretools.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecoretools.diagram.part.EcoreDiagramEditorPlugin;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated NOT
 */
public class EcoreElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private EcoreElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType EPackage_79 = getElementType("org.eclipse.emf.ecoretools.diagram.EPackage_79"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EClass_1001 = getElementType("org.eclipse.emf.ecoretools.diagram.EClass_1001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EPackage_1002 = getElementType("org.eclipse.emf.ecoretools.diagram.EPackage_1002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EAnnotation_1003 = getElementType("org.eclipse.emf.ecoretools.diagram.EAnnotation_1003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EDataType_1004 = getElementType("org.eclipse.emf.ecoretools.diagram.EDataType_1004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EEnum_1005 = getElementType("org.eclipse.emf.ecoretools.diagram.EEnum_1005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EAttribute_2001 = getElementType("org.eclipse.emf.ecoretools.diagram.EAttribute_2001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EOperation_2002 = getElementType("org.eclipse.emf.ecoretools.diagram.EOperation_2002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EClass_2003 = getElementType("org.eclipse.emf.ecoretools.diagram.EClass_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EDataType_2004 = getElementType("org.eclipse.emf.ecoretools.diagram.EDataType_2004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EEnum_2005 = getElementType("org.eclipse.emf.ecoretools.diagram.EEnum_2005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EEnumLiteral_2006 = getElementType("org.eclipse.emf.ecoretools.diagram.EEnumLiteral_2006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EStringToStringMapEntry_2007 = getElementType("org.eclipse.emf.ecoretools.diagram.EStringToStringMapEntry_2007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EAnnotationReferences_3001 = getElementType("org.eclipse.emf.ecoretools.diagram.EAnnotationReferences_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EReference_3002 = getElementType("org.eclipse.emf.ecoretools.diagram.EReference_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EClassESuperTypes_3003 = getElementType("org.eclipse.emf.ecoretools.diagram.EClassESuperTypes_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass && !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return EcoreDiagramEditorPlugin.getInstance().getItemImageDescriptor(eClass.getEPackage().getEFactoryInstance().create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated NOT
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);

		return (ENamedElement) getElements().get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(EPackage_79);
			KNOWN_ELEMENT_TYPES.add(EClass_1001);
			KNOWN_ELEMENT_TYPES.add(EPackage_1002);
			KNOWN_ELEMENT_TYPES.add(EAnnotation_1003);
			KNOWN_ELEMENT_TYPES.add(EDataType_1004);
			KNOWN_ELEMENT_TYPES.add(EEnum_1005);
			KNOWN_ELEMENT_TYPES.add(EAttribute_2001);
			KNOWN_ELEMENT_TYPES.add(EOperation_2002);
			KNOWN_ELEMENT_TYPES.add(EClass_2003);
			KNOWN_ELEMENT_TYPES.add(EDataType_2004);
			KNOWN_ELEMENT_TYPES.add(EEnum_2005);
			KNOWN_ELEMENT_TYPES.add(EEnumLiteral_2006);
			KNOWN_ELEMENT_TYPES.add(EStringToStringMapEntry_2007);
			KNOWN_ELEMENT_TYPES.add(EAnnotationReferences_3001);
			KNOWN_ELEMENT_TYPES.add(EReference_3002);
			KNOWN_ELEMENT_TYPES.add(EClassESuperTypes_3003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * Filter issues
	 * 
	 * @return elements map
	 */
	public static Map<IElementType, EClass> getElements() {
		if (elements == null) {
			elements = new IdentityHashMap();

			elements.put(EPackage_79, EcorePackage.eINSTANCE.getEPackage());

			elements.put(EClass_1001, EcorePackage.eINSTANCE.getEClass());

			elements.put(EPackage_1002, EcorePackage.eINSTANCE.getEPackage());

			elements.put(EAnnotation_1003, EcorePackage.eINSTANCE.getEAnnotation());

			elements.put(EDataType_1004, EcorePackage.eINSTANCE.getEDataType());

			elements.put(EEnum_1005, EcorePackage.eINSTANCE.getEEnum());

			elements.put(EAttribute_2001, EcorePackage.eINSTANCE.getEAttribute());

			elements.put(EOperation_2002, EcorePackage.eINSTANCE.getEOperation());

			elements.put(EClass_2003, EcorePackage.eINSTANCE.getEClass());

			elements.put(EDataType_2004, EcorePackage.eINSTANCE.getEDataType());

			elements.put(EEnum_2005, EcorePackage.eINSTANCE.getEEnum());

			elements.put(EEnumLiteral_2006, EcorePackage.eINSTANCE.getEEnumLiteral());

			elements.put(EStringToStringMapEntry_2007, EcorePackage.eINSTANCE.getEStringToStringMapEntry());

			elements.put(EAnnotationReferences_3001, EcorePackage.eINSTANCE.getEAnnotation_References());

			elements.put(EReference_3002, EcorePackage.eINSTANCE.getEReference());

			elements.put(EClassESuperTypes_3003, EcorePackage.eINSTANCE.getEClass_ESuperTypes());
		}
		return elements;
	}

}
