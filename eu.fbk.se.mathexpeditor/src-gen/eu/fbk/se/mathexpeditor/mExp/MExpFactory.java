/**
 * generated by Xtext 2.27.0
 */
package eu.fbk.se.mathexpeditor.mExp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.fbk.se.mathexpeditor.mExp.MExpPackage
 * @generated
 */
public interface MExpFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MExpFactory eINSTANCE = eu.fbk.se.mathexpeditor.mExp.impl.MExpFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Const Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Const Definition</em>'.
   * @generated
   */
  ConstDefinition createConstDefinition();

  /**
   * Returns a new object of class '<em>Var Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var Definition</em>'.
   * @generated
   */
  VarDefinition createVarDefinition();

  /**
   * Returns a new object of class '<em>Exp Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exp Definition</em>'.
   * @generated
   */
  ExpDefinition createExpDefinition();

  /**
   * Returns a new object of class '<em>Math Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Math Expression</em>'.
   * @generated
   */
  MathExpression createMathExpression();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MExpPackage getMExpPackage();

} //MExpFactory
