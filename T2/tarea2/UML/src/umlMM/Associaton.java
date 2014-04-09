/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package umlMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Associaton</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link umlMM.Associaton#getName <em>Name</em>}</li>
 *   <li>{@link umlMM.Associaton#getSource <em>Source</em>}</li>
 *   <li>{@link umlMM.Associaton#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link umlMM.Associaton#getDestintation <em>Destintation</em>}</li>
 * </ul>
 * </p>
 *
 * @see umlMM.UmlMMPackage#getAssociaton()
 * @model
 * @generated
 */
public interface Associaton extends EObject {
	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link umlMM.Package#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' reference.
	 * @see #setNamespace(umlMM.Package)
	 * @see umlMM.UmlMMPackage#getAssociaton_Namespace()
	 * @see umlMM.Package#getAssociation
	 * @model opposite="Association" required="true"
	 * @generated
	 */
	umlMM.Package getNamespace();

	/**
	 * Sets the value of the '{@link umlMM.Associaton#getNamespace <em>Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' reference.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(umlMM.Package value);

	/**
	 * Returns the value of the '<em><b>Destintation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link umlMM.Class#getDestintationOf <em>Destintation Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destintation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destintation</em>' reference.
	 * @see #setDestintation(umlMM.Class)
	 * @see umlMM.UmlMMPackage#getAssociaton_Destintation()
	 * @see umlMM.Class#getDestintationOf
	 * @model opposite="destintationOf" required="true"
	 * @generated
	 */
	umlMM.Class getDestintation();

	/**
	 * Sets the value of the '{@link umlMM.Associaton#getDestintation <em>Destintation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destintation</em>' reference.
	 * @see #getDestintation()
	 * @generated
	 */
	void setDestintation(umlMM.Class value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see umlMM.UmlMMPackage#getAssociaton_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link umlMM.Associaton#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link umlMM.Class#getSourceOf <em>Source Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(umlMM.Class)
	 * @see umlMM.UmlMMPackage#getAssociaton_Source()
	 * @see umlMM.Class#getSourceOf
	 * @model opposite="sourceOf" required="true"
	 * @generated
	 */
	umlMM.Class getSource();

	/**
	 * Sets the value of the '{@link umlMM.Associaton#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(umlMM.Class value);

} // Associaton
