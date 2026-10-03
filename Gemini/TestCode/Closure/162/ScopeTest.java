package com.google.javascript.jscomp;

import com.google.common.collect.Iterators;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StaticReference;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.StaticSlot;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
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
  public void testGlobalScopeCreation_basicProperties() {
    Assert.assertNull(globalScope.getParent());
    Assert.assertNull(globalScope.getParentScope());
    Assert.assertTrue(globalScope.isGlobal());
    Assert.assertFalse(globalScope.isLocal());
    Assert.assertEquals(0, globalScope.getDepth());
    Assert.assertFalse(globalScope.isBottom());
    Assert.assertSame(globalRoot, globalScope.getRootNode());
    Assert.assertEquals(globalScope, globalScope.getGlobalScope());
    Assert.assertEquals(registry.getNativeObjectType(JSTypeNative.GLOBAL_THIS), globalScope.getTypeOfThis());
    Assert.assertEquals(0, globalScope.getVarCount());
  }

  @Test
  public void testBottomScopeCreation() {
    Node node = new Node(Token.BLOCK);
    ObjectType objType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    Scope bottomScope = new Scope(node, objType);

    Assert.assertNull(bottomScope.getParent());
    Assert.assertTrue(bottomScope.isBottom());
    Assert.assertEquals(0, bottomScope.getDepth());
    Assert.assertSame(node, bottomScope.getRootNode());
    Assert.assertSame(objType, bottomScope.getTypeOfThis());
  }

  @Test
  public void testChildScopeCreation_withFunctionTypeRoot() {
    Node fnNode = new Node(Token.FUNCTION);
    ObjectType thisTypeOfFn = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    FunctionType fnType = registry.createFunctionType(registry.getNativeType(JSTypeNative.NUMBER_TYPE), false);
    fnNode.setJSType(fnType);

    Scope childScope = new Scope(globalScope, fnNode);
    Assert.assertSame(globalScope, childScope.getParent());
    Assert.assertSame(globalScope, childScope.getParentScope());
    Assert.assertSame(globalScope, childScope.getGlobalScope());
    Assert.assertTrue(childScope.isLocal());
    Assert.assertFalse(childScope.isGlobal());
    Assert.assertEquals(1, childScope.getDepth());
    Assert.assertFalse(childScope.isBottom());
    Assert.assertSame(fnNode, childScope.getRootNode());
  }

  @Test
  public void testChildScopeCreation_withoutFunctionTypeRoot() {
    Node blockNode = new Node(Token.BLOCK);
    Scope childScope = new Scope(globalScope, blockNode);
    Assert.assertEquals(globalScope.getTypeOfThis(), childScope.getTypeOfThis());
    Assert.assertEquals(1, childScope.getDepth());
  }

  @Test(expected = NullPointerException.class)
  public void testChildScopeCreation_nullParentThrows() {
    new Scope(null, new Node(Token.BLOCK));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testChildScopeCreation_sameRootAsParentThrows() {
    new Scope(globalScope, globalRoot);
  }

  @Test
  public void testDeclareAndUndeclareVar() {
    Node nameNode = Node.newString(Token.NAME, "x");
    CompilerInput input = new CompilerInput(SourceFile.fromCode("test.js", "var x;"));
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

    Scope.Var var = globalScope.declare("x", nameNode, numberType, input);
    Assert.assertNotNull(var);
    Assert.assertEquals(1, globalScope.getVarCount());
    Assert.assertTrue(globalScope.isDeclared("x", false));
    Assert.assertTrue(globalScope.isDeclared("x", true));
    Assert.assertSame(var, globalScope.getVar("x"));
    Assert.assertSame(var, globalScope.getSlot("x"));
    Assert.assertSame(var, globalScope.getOwnSlot("x"));

    globalScope.undeclare(var);
    Assert.assertEquals(0, globalScope.getVarCount());
    Assert.assertFalse(globalScope.isDeclared("x", false));
    Assert.assertNull(globalScope.getVar("x"));
    Assert.assertNull(globalScope.getOwnSlot("x"));
  }

  @Test(expected = IllegalStateException.class)
  public void testDeclare_emptyNameThrows() {
    Node nameNode = Node.newString(Token.NAME, "");
    globalScope.declare("", nameNode, null, null);
  }

  @Test(expected = IllegalStateException.class)
  public void testDeclare_nullNameThrows() {
    Node nameNode = Node.newString(Token.NAME, "x");
    globalScope.declare(null, nameNode, null, null);
  }

  @Test(expected = IllegalStateException.class)
  public void testDeclare_duplicateNameThrows() {
    Node nameNode1 = Node.newString(Token.NAME, "x");
    Node nameNode2 = Node.newString(Token.NAME, "x");
    globalScope.declare("x", nameNode1, null, null);
    globalScope.declare("x", nameNode2, null, null);
  }

  @Test(expected = IllegalStateException.class)
  public void testUndeclare_wrongScopeThrows() {
    Node nameNode = Node.newString(Token.NAME, "x");
    Scope childScope = new Scope(globalScope, new Node(Token.BLOCK));
    Scope.Var var = globalScope.declare("x", nameNode, null, null);
    childScope.undeclare(var);
  }

  @Test(expected = IllegalStateException.class)
  public void testUndeclare_notPresentThrows() {
    Node nameNode = Node.newString(Token.NAME, "x");
    Scope.Var var = globalScope.declare("x", nameNode, null, null);
    globalScope.undeclare(var);
    globalScope.undeclare(var);
  }

  @Test
  public void testScopeChainingAndLookup() {
    Node childBlock = new Node(Token.BLOCK);
    Scope childScope = new Scope(globalScope, childBlock);

    Node nameX = Node.newString(Token.NAME, "x");
    Node nameY = Node.newString(Token.NAME, "y");

    Scope.Var varX = globalScope.declare("x", nameX, null, null, false);
    Scope.Var varY = childScope.declare("y", nameY, null, null, true);

    Assert.assertSame(varX, childScope.getVar("x"));
    Assert.assertNull(childScope.getOwnSlot("x"));
    Assert.assertTrue(childScope.isDeclared("x", true));
    Assert.assertFalse(childScope.isDeclared("x", false));

    Assert.assertNull(globalScope.getVar("y"));
    Assert.assertFalse(globalScope.isDeclared("y", true));

    Assert.assertNull(childScope.getVar("nonExistent"));
    Assert.assertFalse(childScope.isDeclared("nonExistent", true));
    Assert.assertFalse(childScope.isDeclared("nonExistent", false));
  }

  @Test
  public void testSymbolsAndReferences() {
    Node nameNode = Node.newString(Token.NAME, "x");
    Scope.Var var = globalScope.declare("x", nameNode, null, null);

    Collection<Scope.Var> allSymbols = (Collection<Scope.Var>) globalScope.getAllSymbols();
    Assert.assertEquals(1, allSymbols.size());
    Assert.assertTrue(allSymbols.contains(var));

    Iterator<Scope.Var> varsIter = globalScope.getVars();
    Assert.assertTrue(varsIter.hasNext());
    Assert.assertSame(var, varsIter.next());
    Assert.assertFalse(varsIter.hasNext());

    Iterable<Scope.Var> refs = globalScope.getReferences(var);
    Assert.assertEquals(1, Iterators.size(refs.iterator()));
    Assert.assertSame(var, refs.iterator().next());

    StaticScope<JSType> staticScope = globalScope.getScope(var);
    Assert.assertSame(globalScope, staticScope);
  }

  @Test
  public void testArgumentsVar() {
    Scope.Var args1 = globalScope.getArgumentsVar();
    Scope.Var args2 = globalScope.getArgumentsVar();
    Assert.assertSame(args1, args2);
    Assert.assertEquals("arguments", args1.getName());
    Assert.assertNull(args1.getNode());
    Assert.assertNull(args1.getDeclaration());
    Assert.assertNull(args1.getParentNode());
    Assert.assertEquals(-1, args1.index);
    Assert.assertFalse(args1.isTypeInferred());
    Assert.assertFalse(args1.isDefine());
    Assert.assertNull(args1.getJSDocInfo());

    Scope childScope = new Scope(globalScope, new Node(Token.BLOCK));
    Scope.Var childArgs = childScope.getArgumentsVar();

    Assert.assertFalse(args1.equals(childArgs));
    Assert.assertFalse(args1.equals(null));
    Assert.assertFalse(args1.equals("string"));

    Scope sameRootScope = new Scope(new Node(Token.BLOCK), (ObjectType) null);
    Scope.Arguments sameRootArgs = new Scope.Arguments(sameRootScope);
    Scope.Arguments sameRootArgs2 = new Scope.Arguments(sameRootScope);
    Assert.assertTrue(sameRootArgs.equals(sameRootArgs2));
    Assert.assertEquals(args1.hashCode(), args1.hashCode());
  }

  @Test
  public void testVar_getInitialValue_variousNodeParents() {
    // FUNCTION case
    Node fnNode = new Node(Token.FUNCTION);
    Node fnNameNode = Node.newString(Token.NAME, "fn");
    fnNode.addChildToBack(fnNameNode);
    Scope.Var fnVar = globalScope.declare("fn", fnNameNode, null, null);
    Assert.assertSame(fnNode, fnVar.getInitialValue());

    // ASSIGN case
    Node assignNode = new Node(Token.ASSIGN);
    Node assignNameNode = Node.newString(Token.NAME, "a");
    Node assignValNode = Node.newString(Token.STRING, "val");
    assignNode.addChildToBack(assignNameNode);
    assignNode.addChildToBack(assignValNode);
    Scope childScope1 = new Scope(globalScope, new Node(Token.BLOCK));
    Scope.Var assignVar = childScope1.declare("a", assignNameNode, null, null);
    Assert.assertSame(assignValNode, assignVar.getInitialValue());

    // VAR case
    Node varNode = new Node(Token.VAR);
    Node varNameNode = Node.newString(Token.NAME, "v");
    Node varValNode = new Node(Token.NUMBER);
    varNameNode.addChildToBack(varValNode);
    varNode.addChildToBack(varNameNode);
    Scope childScope2 = new Scope(globalScope, new Node(Token.BLOCK));
    Scope.Var varVar = childScope2.declare("v", varNameNode, null, null);
    Assert.assertSame(varValNode, varVar.getInitialValue());

    // Other parent case
    Node exprNode = new Node(Token.EXPR_RESULT);
    Node exprNameNode = Node.newString(Token.NAME, "e");
    exprNode.addChildToBack(exprNameNode);
    Scope childScope3 = new Scope(globalScope, new Node(Token.BLOCK));
    Scope.Var exprVar = childScope3.declare("e", exprNameNode, null, null);
    Assert.assertNull(exprVar.getInitialValue());
  }

  @Test
  public void testVar_methodsAndProperties() {
    SourceFile sourceFile = SourceFile.fromCode("input.js", "var CONST_VAL = 1;");
    CompilerInput input = new CompilerInput(sourceFile);
    Node nameNode = Node.newString(Token.NAME, "CONST_VAL");
    nameNode.setStaticSourceFile(sourceFile);

    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(true);
    docBuilder.recordNoShadow();
    docBuilder.recordDefineType(new Node(Token.STRING));
    JSDocInfo info = docBuilder.build(nameNode);
    nameNode.setJSDocInfo(info);

    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    Scope.Var var = globalScope.declare("CONST_VAL", nameNode, stringType, input, true);

    Assert.assertEquals("CONST_VAL", var.getName());
    Assert.assertSame(nameNode, var.getNode());
    Assert.assertSame(nameNode, var.getNameNode());
    Assert.assertSame(input, var.getInput());
    Assert.assertEquals("input.js", var.getInputName());
    Assert.assertSame(sourceFile, var.getSourceFile());
    Assert.assertSame(var, var.getSymbol());
    Assert.assertSame(var, var.getDeclaration());
    Assert.assertSame(globalScope, var.getScope());
    Assert.assertTrue(var.isGlobal());
    Assert.assertFalse(var.isLocal());
    Assert.assertFalse(var.isExtern());
    Assert.assertTrue(var.isConst());
    Assert.assertTrue(var.isDefine());
    Assert.assertTrue(var.isNoShadow());
    Assert.assertTrue(var.isTypeInferred());
    Assert.assertSame(stringType, var.getType());
    Assert.assertSame(info, var.getJSDocInfo());

    // setType on inferred var
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    var.setType(numberType);
    Assert.assertSame(numberType, var.getType());

    // resolveType
    var.resolveType(null);
    Assert.assertSame(numberType, var.getType());

    // toString
    Assert.assertEquals("Scope.Var CONST_VAL{number}", var.toString());

    // equals and hashCode
    Assert.assertTrue(var.equals(var));
    Assert.assertFalse(var.equals(null));
    Assert.assertFalse(var.equals("other"));
    Assert.assertEquals(nameNode.hashCode(), var.hashCode());

    Node nameNode2 = Node.newString(Token.NAME, "OTHER");
    Scope.Var otherVar = globalScope.declare("OTHER", nameNode2, null, null);
    Assert.assertFalse(var.equals(otherVar));
  }

  @Test(expected = IllegalStateException.class)
  public void testVar_setType_notInferredThrows() {
    Node nameNode = Node.newString(Token.NAME, "z");
    Scope.Var nonInferredVar = globalScope.declare("z", nameNode, null, null, false);
    nonInferredVar.setType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
  }

  @Test
  public void testVar_isBleedingFunction() {
    Node fnNode = new Node(Token.FUNCTION);
    Node nameNode = Node.newString(Token.NAME, "bleedingFn");
    fnNode.addChildToBack(nameNode);
    fnNode.addChildToBack(new Node(Token.PARAM_LIST));
    fnNode.addChildToBack(new Node(Token.BLOCK));

    // Standalone function declaration is not bleeding
    Scope.Var var1 = globalScope.declare("bleedingFn", nameNode, null, null);
    Assert.assertFalse(var1.isBleedingFunction());

    // Function expression as right side of ASSIGN is a function expression
    Node assignNode = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), fnNode);
    Assert.assertTrue(var1.isBleedingFunction());
  }

  @Test
  public void testVar_nullInputAndNoShadowFalse() {
    Node nameNode = Node.newString(Token.NAME, "noDoc");
    Scope.Var var = globalScope.declare("noDoc", nameNode, null, null);
    Assert.assertEquals("<non-file>", var.getInputName());
    Assert.assertTrue(var.isExtern());
    Assert.assertFalse(var.isNoShadow());
  }

  @Test
  public void testGetDeclarativelyUnboundVarsWithoutTypes() {
    // Var 1: declared with Token.VAR, no type, not extern -> matched
    SourceFile src = SourceFile.fromCode("main.js", "var a;");
    CompilerInput normalInput = new CompilerInput(src);
    Node varNode1 = new Node(Token.VAR);
    Node nameNode1 = Node.newString(Token.NAME, "a");
    varNode1.addChildToBack(nameNode1);
    globalScope.declare("a", nameNode1, null, normalInput, true);

    // Var 2: declared with Token.VAR, but has type -> not matched
    Node varNode2 = new Node(Token.VAR);
    Node nameNode2 = Node.newString(Token.NAME, "b");
    varNode2.addChildToBack(nameNode2);
    globalScope.declare("b", nameNode2, registry.getNativeType(JSTypeNative.NUMBER_TYPE), normalInput, true);

    // Var 3: declared with Token.VAR, no type, but is extern -> not matched
    CompilerInput externInput = new CompilerInput(SourceFile.fromCode("extern.js", "var c;"), true);
    Node varNode3 = new Node(Token.VAR);
    Node nameNode3 = Node.newString(Token.NAME, "c");
    varNode3.addChildToBack(nameNode3);
    globalScope.declare("c", nameNode3, null, externInput, true);

    // Var 4: no parent node -> not matched
    Node nameNode4 = Node.newString(Token.NAME, "d");
    globalScope.declare("d", nameNode4, null, normalInput, true);

    Iterator<Scope.Var> unboundIter = globalScope.getDeclarativelyUnboundVarsWithoutTypes();
    Assert.assertTrue(unboundIter.hasNext());
    Scope.Var match = unboundIter.next();
    Assert.assertEquals("a", match.getName());
    Assert.assertFalse(unboundIter.hasNext());
  }
}
