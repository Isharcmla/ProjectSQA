package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.StaticSlot;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

public class ScopeTest {

  private Compiler compiler;
  private JSTypeRegistry registry;
  private Node globalRoot;
  private Scope globalScope;

  @Before
  public void setUp() {
    compiler = new Compiler();
    registry = compiler.getTypeRegistry();
    globalRoot = new Node(Token.BLOCK);
    globalScope = new Scope(globalRoot, compiler);
  }

  @Test
  public void testConstructor_globalScopeWithCompiler() {
    assertNull(globalScope.getParent());
    assertNull(globalScope.getParentScope());
    assertEquals(globalRoot, globalScope.getRootNode());
    assertEquals(0, globalScope.getDepth());
    assertFalse(globalScope.isBottom());
    assertTrue(globalScope.isGlobal());
    assertFalse(globalScope.isLocal());
    assertEquals(globalScope, globalScope.getGlobalScope());
    assertNotNull(globalScope.getTypeOfThis());
  }

  @Test
  public void testConstructor_bottomScope() {
    ObjectType thisType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    Node bottomRoot = new Node(Token.BLOCK);
    Scope bottomScope = new Scope(bottomRoot, thisType);

    assertNull(bottomScope.getParent());
    assertEquals(bottomRoot, bottomScope.getRootNode());
    assertEquals(0, bottomScope.getDepth());
    assertTrue(bottomScope.isBottom());
    assertTrue(bottomScope.isGlobal());
    assertSame(thisType, bottomScope.getTypeOfThis());
  }

  @Test
  public void testConstructor_childScopeInheritThisType() {
    Node childRoot = new Node(Token.FUNCTION);
    Scope childScope = new Scope(globalScope, childRoot);

    assertSame(globalScope, childScope.getParent());
    assertSame(globalScope, childScope.getParentScope());
    assertSame(childRoot, childScope.getRootNode());
    assertEquals(1, childScope.getDepth());
    assertFalse(childScope.isBottom());
    assertFalse(childScope.isGlobal());
    assertTrue(childScope.isLocal());
    assertSame(globalScope, childScope.getGlobalScope());
    assertSame(globalScope.getTypeOfThis(), childScope.getTypeOfThis());
  }

  @Test
  public void testConstructor_childScopeWithFunctionType() {
    Node fnRoot = new Node(Token.FUNCTION);
    ObjectType fnThisType = registry.getNativeObjectType(JSTypeNative.ARRAY_TYPE);
    FunctionType fnType = registry.createFunctionType(registry.getNativeType(JSTypeNative.NUMBER_TYPE), fnThisType);
    fnRoot.setJSType(fnType);

    Scope fnScope = new Scope(globalScope, fnRoot);
    assertSame(fnThisType, fnScope.getTypeOfThis());
  }

  @Test(expected = RuntimeException.class)
  public void testConstructor_childScopeWithNullParent_throwsException() {
    new Scope(null, new Node(Token.FUNCTION));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConstructor_childScopeWithSameRootNode_throwsException() {
    new Scope(globalScope, globalRoot);
  }

  @Test
  public void testDeclareAndUndeclare_normal() {
    Node nameNode = Node.newString(Token.NAME, "foo");
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    CompilerInput input = new CompilerInput(SourceFile.fromCode("test.js", "var foo;"));

    Scope.Var varFoo = globalScope.declare("foo", nameNode, numberType, input);
    assertNotNull(varFoo);
    assertEquals("foo", varFoo.getName());
    assertEquals(1, globalScope.getVarCount());
    assertSame(varFoo, globalScope.getVar("foo"));
    assertSame(varFoo, globalScope.getSlot("foo"));
    assertSame(varFoo, globalScope.getOwnSlot("foo"));
    assertTrue(globalScope.isDeclared("foo", false));
    assertTrue(globalScope.isDeclared("foo", true));

    globalScope.undeclare(varFoo);
    assertEquals(0, globalScope.getVarCount());
    assertNull(globalScope.getVar("foo"));
    assertNull(globalScope.getSlot("foo"));
    assertNull(globalScope.getOwnSlot("foo"));
    assertFalse(globalScope.isDeclared("foo", false));
  }

  @Test(expected = IllegalStateException.class)
  public void testDeclare_nullName_throwsException() {
    Node nameNode = Node.newString(Token.NAME, "foo");
    globalScope.declare(null, nameNode, null, null);
  }

  @Test(expected = IllegalStateException.class)
  public void testDeclare_emptyName_throwsException() {
    Node nameNode = Node.newString(Token.NAME, "");
    globalScope.declare("", nameNode, null, null);
  }

  @Test(expected = IllegalStateException.class)
  public void testDeclare_duplicateVariable_throwsException() {
    Node nameNode1 = Node.newString(Token.NAME, "foo");
    Node nameNode2 = Node.newString(Token.NAME, "foo");
    globalScope.declare("foo", nameNode1, null, null);
    globalScope.declare("foo", nameNode2, null, null);
  }

  @Test(expected = IllegalStateException.class)
  public void testUndeclare_variableFromDifferentScope_throwsException() {
    Node childRoot = new Node(Token.FUNCTION);
    Scope childScope = new Scope(globalScope, childRoot);
    Node nameNode = Node.newString(Token.NAME, "bar");
    Scope.Var varBar = childScope.declare("bar", nameNode, null, null);
    globalScope.undeclare(varBar);
  }

  @Test(expected = IllegalStateException.class)
  public void testUndeclare_variableNotInScope_throwsException() {
    Node nameNode = Node.newString(Token.NAME, "foo");
    Scope.Var varFoo = globalScope.declare("foo", nameNode, null, null);
    globalScope.undeclare(varFoo);
    globalScope.undeclare(varFoo);
  }

  @Test
  public void testHierarchyAndLookup() {
    Node childRoot = new Node(Token.FUNCTION);
    Scope childScope = new Scope(globalScope, childRoot);

    Node grandChildRoot = new Node(Token.FUNCTION);
    Scope grandChildScope = new Scope(childScope, grandChildRoot);

    Node gVarNode = Node.newString(Token.NAME, "gVar");
    Scope.Var gVar = globalScope.declare("gVar", gVarNode, null, null);

    Node cVarNode = Node.newString(Token.NAME, "cVar");
    Scope.Var cVar = childScope.declare("cVar", cVarNode, null, null);

    assertSame(globalScope, grandChildScope.getGlobalScope());
    assertEquals(2, grandChildScope.getDepth());

    assertNull(grandChildScope.getOwnSlot("gVar"));
    assertSame(gVar, grandChildScope.getSlot("gVar"));
    assertSame(gVar, grandChildScope.getVar("gVar"));
    assertFalse(grandChildScope.isDeclared("gVar", false));
    assertTrue(grandChildScope.isDeclared("gVar", true));

    assertSame(cVar, grandChildScope.getVar("cVar"));
    assertNull(grandChildScope.getVar("nonExistent"));
    assertFalse(grandChildScope.isDeclared("nonExistent", true));
    assertFalse(grandChildScope.isDeclared("nonExistent", false));
  }

  @Test
  public void testGetVarsIterator() {
    Node var1Node = Node.newString(Token.NAME, "a");
    Node var2Node = Node.newString(Token.NAME, "b");
    globalScope.declare("a", var1Node, null, null);
    globalScope.declare("b", var2Node, null, null);

    Iterator<Scope.Var> it = globalScope.getVars();
    assertTrue(it.hasNext());
    assertEquals("a", it.next().getName());
    assertTrue(it.hasNext());
    assertEquals("b", it.next().getName());
    assertFalse(it.hasNext());
  }

  @Test
  public void testVar_propertiesAndFlags() {
    Node nameNode = Node.newString(Token.NAME, "MY_CONST");
    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    builder.recordDefineType(new Node(Token.STRING));
    builder.recordNoShadow();
    JSDocInfo docInfo = builder.build(nameNode);
    nameNode.setJSDocInfo(docInfo);

    CompilerInput externInput = new CompilerInput(SourceFile.fromCode("externs.js", "var MY_CONST;"), true);
    Scope.Var declaredVar = globalScope.declare("MY_CONST", nameNode, null, externInput, false);

    assertEquals("MY_CONST", declaredVar.getName());
    assertSame(nameNode, declaredVar.getNameNode());
    assertSame(docInfo, declaredVar.getJSDocInfo());
    assertTrue(declaredVar.isDefine());
    assertTrue(declaredVar.isNoShadow());
    assertTrue(declaredVar.isExtern());
    assertTrue(declaredVar.isConst());
    assertFalse(declaredVar.isTypeInferred());
    assertEquals("externs.js", declaredVar.getInputName());
    assertSame(globalScope, declaredVar.getScope());
    assertTrue(declaredVar.isGlobal());
    assertFalse(declaredVar.isLocal());
    assertEquals("Scope.Var MY_CONST", declaredVar.toString());
  }

  @Test
  public void testVar_localAndNullInput() {
    Node childRoot = new Node(Token.FUNCTION);
    Scope childScope = new Scope(globalScope, childRoot);
    Node nameNode = Node.newString(Token.NAME, "localVar");

    Scope.Var var = childScope.declare("localVar", nameNode, null, null, true);

    assertTrue(var.isLocal());
    assertFalse(var.isGlobal());
    assertTrue(var.isExtern());
    assertEquals("<non-file>", var.getInputName());
    assertFalse(var.isNoShadow());
    assertFalse(var.isDefine());
    assertNull(var.getJSDocInfo());
    assertTrue(var.isTypeInferred());
  }

  @Test
  public void testVar_nonExternInput() {
    CompilerInput input = new CompilerInput(SourceFile.fromCode("app.js", "var x;"));
    Node nameNode = Node.newString(Token.NAME, "x");
    Scope.Var var = globalScope.declare("x", nameNode, null, input, true);
    assertFalse(var.isExtern());
    assertEquals("app.js", var.getInputName());
  }

  @Test
  public void testVar_setAndResolveType() {
    Node nameNode = Node.newString(Token.NAME, "inferredVar");
    Scope.Var var = globalScope.declare("inferredVar", nameNode, null, null, true);

    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    var.setType(stringType);
    assertSame(stringType, var.getType());

    ErrorReporter reporter = compiler.getErrorReporter();
    var.resolveType(reporter);
    assertSame(stringType, var.getType());

    Scope.Var nullTypeVar = globalScope.declare("nullTypeVar", Node.newString(Token.NAME, "nullTypeVar"), null, null, true);
    nullTypeVar.resolveType(reporter);
    assertNull(nullTypeVar.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testVar_setTypeOnDeclaredVar_throwsException() {
    Node nameNode = Node.newString(Token.NAME, "declaredVar");
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    Scope.Var var = globalScope.declare("declaredVar", nameNode, numberType, null, false);
    var.setType(numberType);
  }

  @Test
  public void testVar_getInitialValue_function() {
    Node fnNode = new Node(Token.FUNCTION);
    Node nameNode = Node.newString(Token.NAME, "fnName");
    fnNode.addChildToFront(nameNode);

    Scope.Var var = globalScope.declare("fnName", nameNode, null, null);
    assertSame(fnNode, var.getInitialValue());
    assertNull(var.getParentNode().getFirstChild().getNext());
  }

  @Test
  public void testVar_getInitialValue_varDeclaration() {
    Node varNode = new Node(Token.VAR);
    Node nameNode = Node.newString(Token.NAME, "v");
    Node valueNode = Node.newNumber(42);
    nameNode.addChildToFront(valueNode);
    varNode.addChildToFront(nameNode);

    Scope.Var var = globalScope.declare("v", nameNode, null, null);
    assertSame(valueNode, var.getInitialValue());
    assertSame(varNode, var.getParentNode());
  }

  @Test
  public void testVar_getInitialValue_assign() {
    Node assignNode = new Node(Token.ASSIGN);
    Node nameNode = Node.newString(Token.NAME, "a");
    Node valueNode = Node.newString("val");
    assignNode.addChildToBack(nameNode);
    assignNode.addChildToBack(valueNode);

    Scope.Var var = globalScope.declare("a", nameNode, null, null);
    assertSame(valueNode, var.getInitialValue());
  }

  @Test
  public void testVar_getInitialValue_otherOrNullParent() {
    Node nameNode = Node.newString(Token.NAME, "orphan");
    Scope.Var var = globalScope.declare("orphan", nameNode, null, null);
    assertNull(var.getParentNode());
    assertNull(var.getInitialValue());

    Node blockNode = new Node(Token.BLOCK);
    Node nameNode2 = Node.newString(Token.NAME, "inBlock");
    blockNode.addChildToFront(nameNode2);
    Scope.Var var2 = globalScope.declare("inBlock", nameNode2, null, null);
    assertNull(var2.getInitialValue());
  }

  @Test
  public void testVar_isBleedingFunction() {
    Node fnNode = new Node(Token.FUNCTION);
    Node nameNode = Node.newString(Token.NAME, "bleedingFn");
    Node paramList = new Node(Token.LP);
    Node body = new Node(Token.BLOCK);
    fnNode.addChildToBack(nameNode);
    fnNode.addChildToBack(paramList);
    fnNode.addChildToBack(body);

    Node assignNode = new Node(Token.ASSIGN);
    Node targetNode = Node.newString(Token.NAME, "target");
    assignNode.addChildToBack(targetNode);
    assignNode.addChildToBack(fnNode);

    Scope.Var var = globalScope.declare("bleedingFn", nameNode, null, null);
    assertTrue(var.isBleedingFunction());
  }

  @Test
  public void testVar_equalsAndHashCode() {
    Node nameNode1 = Node.newString(Token.NAME, "x");
    Node nameNode2 = Node.newString(Token.NAME, "x");

    Scope.Var var1 = globalScope.declare("x", nameNode1, null, null);

    Node childRoot = new Node(Token.FUNCTION);
    Scope childScope = new Scope(globalScope, childRoot);
    Scope.Var var2 = childScope.declare("x_child", nameNode1, null, null);
    Scope.Var var3 = childScope.declare("x_child2", nameNode2, null, null);

    assertTrue(var1.equals(var1));
    assertTrue(var1.equals(var2));
    assertEquals(var1.hashCode(), var2.hashCode());

    assertFalse(var1.equals(var3));
    assertFalse(var1.equals(null));
    assertFalse(var1.equals("some string"));
  }
}
