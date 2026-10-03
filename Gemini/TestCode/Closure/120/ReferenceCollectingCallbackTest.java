package com.google.javascript.jscomp;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Reference;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReferenceCollectingCallbackTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  private Node parse(String js) {
    return compiler.parseTestCode(js);
  }

  @Test
  public void testProcess_standardTraversal_populatesReferences() {
    Node root = parse("var x = 1; x++; function foo(y) { return x + y; }");
    Node externs = new Node(Token.BLOCK);

    final List<Var> exitedScopeVars = new ArrayList<Var>();
    Behavior testBehavior = new Behavior() {
      @Override
      public void afterExitScope(NodeTraversal t, ReferenceMap rm) {
        Var xVar = t.getScope().getVar("x");
        if (xVar != null) {
          exitedScopeVars.add(xVar);
          ReferenceCollection refs = rm.getReferences(xVar);
          Assert.assertNotNull(refs);
          Assert.assertEquals(3, refs.references.size());
        }
      }
    };

    ReferenceCollectingCallback callback = new ReferenceCollectingCallback(compiler, testBehavior);
    callback.process(externs, root);

    Iterable<Var> allSymbols = callback.getAllSymbols();
    Assert.assertTrue(Iterables.size(allSymbols) > 0);

    Var xVar = null;
    for (Var v : allSymbols) {
      if ("x".equals(v.getName())) {
        xVar = v;
        break;
      }
    }
    Assert.assertNotNull(xVar);
    Assert.assertEquals(xVar.scope, callback.getScope(xVar));
    ReferenceCollection refs = callback.getReferences(xVar);
    Assert.assertNotNull(refs);
    Assert.assertEquals(3, refs.references.size());
  }

  @Test
  public void testHotSwapScript_processesSuccessfully() {
    Node scriptRoot = parse("var a = 10; a = 20;");
    ReferenceCollectingCallback callback = new ReferenceCollectingCallback(
        compiler, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);

    callback.hotSwapScript(scriptRoot, null);
    Iterable<Var> symbols = callback.getAllSymbols();
    Assert.assertTrue(Iterables.size(symbols) > 0);
  }

  @Test
  public void testVarFilter_excludesUnmatchedVars() {
    Node root = parse("var a = 1; var b = 2;");
    Predicate<Var> filter = new Predicate<Var>() {
      @Override
      public boolean apply(Var input) {
        return input != null && "a".equals(input.getName());
      }
    };

    ReferenceCollectingCallback callback = new ReferenceCollectingCallback(
        compiler, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR, filter);
    callback.process(new Node(Token.BLOCK), root);

    boolean foundA = false;
    boolean foundB = false;
    for (Var v : callback.getAllSymbols()) {
      if ("a".equals(v.getName())) {
        foundA = true;
      }
      if ("b".equals(v.getName())) {
        foundB = true;
      }
    }
    Assert.assertTrue(foundA);
    Assert.assertFalse(foundB);
  }

  @Test
  public void testArgumentsKeyword_collectedInFunctionScope() {
    Node root = parse("function test() { return arguments.length; }");
    final boolean[] argumentsChecked = new boolean[]{false};
    Behavior behavior = new Behavior() {
      @Override
      public void afterExitScope(NodeTraversal t, ReferenceMap referenceMap) {
        if (!t.getScope().isGlobal()) {
          Var argsVar = t.getScope().getArgumentsVar();
          Assert.assertNotNull(argsVar);
          ReferenceCollection refs = referenceMap.getReferences(argsVar);
          Assert.assertNotNull(refs);
          Assert.assertEquals(1, refs.references.size());
          argumentsChecked[0] = true;
        }
      }
    };

    ReferenceCollectingCallback callback = new ReferenceCollectingCallback(compiler, behavior);
    callback.process(new Node(Token.BLOCK), root);
    Assert.assertTrue(argumentsChecked[0]);
  }

  @Test
  public void testControlStructures_coverageForBlockBoundaries() {
    String js = "var x = 1;\n" +
        "if (x > 0) { x++; } else { x--; }\n" +
        "while (x < 10) { x++; }\n" +
        "do { x++; } while (x < 15);\n" +
        "for (var i = 0; i < 5; i++) { x += i; }\n" +
        "try { x++; } catch (e) { x--; } finally { x = 0; }\n" +
        "var y = (x > 0) ? x : 0;\n" +
        "var z = (x > 0) && (x < 100);\n" +
        "var w = (x <= 0) || (x >= 100);\n" +
        "switch (x) {\n" +
        "  case 1: x++; break;\n" +
        "  default: break;\n" +
        "}";

    Node root = parse(js);
    ReferenceCollectingCallback callback = new ReferenceCollectingCallback(
        compiler, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
    callback.process(new Node(Token.BLOCK), root);
    Assert.assertNotNull(callback.getAllSymbols());
  }

  @Test
  public void testReferenceCollection_isWellDefined_true() {
    Node root = parse("var a = 1; var b = a + 1;");
    ReferenceCollectingCallback callback = new ReferenceCollectingCallback(
        compiler, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
    callback.process(new Node(Token.BLOCK), root);

    Var aVar = null;
    for (Var v : callback.getAllSymbols()) {
      if ("a".equals(v.getName())) {
        aVar = v;
      }
    }
    Assert.assertNotNull(aVar);
    ReferenceCollection refs = callback.getReferences(aVar);
    Assert.assertTrue(refs.isWellDefined());
    Assert.assertTrue(refs.firstReferenceIsAssigningDeclaration());
  }

  @Test
  public void testReferenceCollection_isWellDefined_falseWhenUninitialized() {
    Node root = parse("var a; var b = a;");
    ReferenceCollectingCallback callback = new ReferenceCollectingCallback(
        compiler, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
    callback.process(new Node(Token.BLOCK), root);

    Var aVar = null;
    for (Var v : callback.getAllSymbols()) {
      if ("a".equals(v.getName())) {
        aVar = v;
      }
    }
    Assert.assertNotNull(aVar);
    ReferenceCollection refs = callback.getReferences(aVar);
    Assert.assertFalse(refs.isWellDefined());
    Assert.assertFalse(refs.firstReferenceIsAssigningDeclaration());
  }

  @Test
  public void testReferenceCollection_emptyCollectionChecks() {
    ReferenceCollection empty = new ReferenceCollection();
    Assert.assertFalse(empty.isWellDefined());
    Assert.assertTrue(empty.isNeverAssigned());
    Assert.assertNull(empty.getInitializingReference());
    Assert.assertNull(empty.getInitializingReferenceForConstants());
    Assert.assertFalse(empty.isAssignedOnceInLifetime());
    Assert.assertFalse(empty.firstReferenceIsAssigningDeclaration());
    Assert.assertFalse(empty.isEscaped());

    Iterator<Reference> iterator = empty.iterator();
    Assert.assertFalse(iterator.hasNext());
  }

  @Test
  public void testReferenceCollection_isEscaped() {
    Node root = parse("var a = 1; function inner() { return a; }");
    ReferenceCollectingCallback callback = new ReferenceCollectingCallback(
        compiler, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
    callback.process(new Node(Token.BLOCK), root);

    Var aVar = null;
    for (Var v : callback.getAllSymbols()) {
      if ("a".equals(v.getName())) {
        aVar = v;
      }
    }
    Assert.assertNotNull(aVar);
    ReferenceCollection refs = callback.getReferences(aVar);
    Assert.assertTrue(refs.isEscaped());
  }

  @Test
  public void testReferenceCollection_isAssignedOnceInLifetime_loopAssignment() {
    Node root = parse("var a = 0; for (var i = 0; i < 5; i++) { a = i; }");
    ReferenceCollectingCallback callback = new ReferenceCollectingCallback(
        compiler, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
    callback.process(new Node(Token.BLOCK), root);

    Var aVar = null;
    for (Var v : callback.getAllSymbols()) {
      if ("a".equals(v.getName())) {
        aVar = v;
      }
    }
    Assert.assertNotNull(aVar);
    ReferenceCollection refs = callback.getReferences(aVar);
    Assert.assertFalse(refs.isAssignedOnceInLifetime());
  }

  @Test
  public void testReferenceCollection_isAssignedOnceInLifetime_singleInFunction() {
    Node root = parse("function foo() { var a = 1; return a; }");
    ReferenceCollectingCallback callback = new ReferenceCollectingCallback(
        compiler, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
    callback.process(new Node(Token.BLOCK), root);

    Var aVar = null;
    for (Var v : callback.getAllSymbols()) {
      if ("a".equals(v.getName())) {
        aVar = v;
      }
    }
    Assert.assertNotNull(aVar);
    ReferenceCollection refs = callback.getReferences(aVar);
    Assert.assertTrue(refs.isAssignedOnceInLifetime());
  }

  @Test
  public void testReferenceCollection_isNeverAssigned() {
    Node root = parse("function f(param) { return param; }");
    ReferenceCollectingCallback callback = new ReferenceCollectingCallback(
        compiler, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
    callback.process(new Node(Token.BLOCK), root);

    Var paramVar = null;
    for (Var v : callback.getAllSymbols()) {
      if ("param".equals(v.getName())) {
        paramVar = v;
      }
    }
    Assert.assertNotNull(paramVar);
    ReferenceCollection refs = callback.getReferences(paramVar);
    Assert.assertFalse(refs.isNeverAssigned());
  }

  @Test
  public void testReferenceCollection_constantsLateInitialized() {
    Node root = parse("function f() { var x; x = 5; return x; }");
    ReferenceCollectingCallback callback = new ReferenceCollectingCallback(
        compiler, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
    callback.process(new Node(Token.BLOCK), root);

    Var xVar = null;
    for (Var v : callback.getAllSymbols()) {
      if ("x".equals(v.getName())) {
        xVar = v;
      }
    }
    Assert.assertNotNull(xVar);
    ReferenceCollection refs = callback.getReferences(xVar);
    Assert.assertNotNull(refs.getInitializingReferenceForConstants());
    Assert.assertNotNull(refs.getInitializingReference());
  }

  @Test
  public void testReferenceMethods() {
    Node root = parse("var x = 10; function f(a) { try {} catch(e) { e = 1; } }");
    ReferenceCollectingCallback callback = new ReferenceCollectingCallback(
        compiler, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
    callback.process(new Node(Token.BLOCK), root);

    Var xVar = null;
    for (Var v : callback.getAllSymbols()) {
      if ("x".equals(v.getName())) {
        xVar = v;
      }
    }
    Assert.assertNotNull(xVar);
    ReferenceCollection refs = callback.getReferences(xVar);
    Reference declRef = refs.references.get(0);

    Assert.assertNotNull(declRef.getNode());
    Assert.assertNotNull(declRef.getParent());
    Assert.assertNotNull(declRef.getGrandparent());
    Assert.assertNotNull(declRef.getScope());
    Assert.assertNotNull(declRef.getInputId());
    Assert.assertEquals(xVar, declRef.getSymbol());
    Assert.assertTrue(declRef.isDeclaration());
    Assert.assertTrue(declRef.isVarDeclaration());
    Assert.assertFalse(declRef.isHoistedFunction());
    Assert.assertTrue(declRef.isInitializingDeclaration());
    Assert.assertNotNull(declRef.getAssignedValue());
    Assert.assertTrue(declRef.isLvalue());

    Scope clonedScope = new Scope(root, compiler);
    Reference cloned = declRef.cloneWithNewScope(clonedScope);
    Assert.assertEquals(clonedScope, cloned.getScope());
  }

  @Test
  public void testReference_createRefForTest() {
    CompilerInput input = new CompilerInput(
        SourceFile.fromCode("test.js", "var a;"), false);
    Reference ref = Reference.createRefForTest(input);
    Assert.assertNotNull(ref);
    Assert.assertEquals(new InputId("test.js"), ref.getInputId());
    Assert.assertEquals(Token.NAME, ref.getNode().getType());
  }

  @Test
  public void testReference_newBleedingFunction() {
    Node root = parse("var f = function myFunc() {};");
    Node funcNode = root.getFirstChild().getFirstChild().getFirstChild();

    NodeTraversal t = new NodeTraversal(compiler, callbackWithScope());
    BasicBlock bb = new BasicBlock(null, root);
    Reference ref = Reference.newBleedingFunction(t, bb, funcNode);
    Assert.assertNotNull(ref);
    Assert.assertEquals("myFunc", ref.getNode().getString());
  }

  private NodeTraversal.Callback callbackWithScope() {
    return new NodeTraversal.AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {}
    };
  }

  @Test
  public void testBasicBlock_hierarchyAndExecutionOrder() {
    Node rootNode = new Node(Token.BLOCK);
    BasicBlock globalBlock = new BasicBlock(null, rootNode);
    Assert.assertTrue(globalBlock.isGlobalScopeBlock());
    Assert.assertNull(globalBlock.getParent());

    Node childNode = new Node(Token.BLOCK);
    rootNode.addChildToBack(childNode);
    BasicBlock childBlock = new BasicBlock(globalBlock, childNode);
    Assert.assertFalse(childBlock.isGlobalScopeBlock());
    Assert.assertEquals(globalBlock, childBlock.getParent());

    Assert.assertTrue(globalBlock.provablyExecutesBefore(childBlock));
    Assert.assertFalse(childBlock.provablyExecutesBefore(globalBlock));

    BasicBlock anotherGlobal = new BasicBlock(null, new Node(Token.BLOCK));
    Assert.assertTrue(globalBlock.provablyExecutesBefore(anotherGlobal));
  }

  @Test
  public void testForIn_lvalueReference() {
    Node root = parse("var obj = {a: 1}; for (var p in obj) {}");
    ReferenceCollectingCallback callback = new ReferenceCollectingCallback(
        compiler, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
    callback.process(new Node(Token.BLOCK), root);

    Var pVar = null;
    for (Var v : callback.getAllSymbols()) {
      if ("p".equals(v.getName())) {
        pVar = v;
      }
    }
    Assert.assertNotNull(pVar);
    ReferenceCollection refs = callback.getReferences(pVar);
    Assert.assertTrue(refs.references.get(0).isLvalue());
  }

  @Test
  public void testFunctionDeclaration_assignedValue() {
    Node root = parse("function myNamedFunc() {}");
    ReferenceCollectingCallback callback = new ReferenceCollectingCallback(
        compiler, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
    callback.process(new Node(Token.BLOCK), root);

    Var funcVar = null;
    for (Var v : callback.getAllSymbols()) {
      if ("myNamedFunc".equals(v.getName())) {
        funcVar = v;
      }
    }
    Assert.assertNotNull(funcVar);
    ReferenceCollection refs = callback.getReferences(funcVar);
    Reference declRef = refs.references.get(0);
    Assert.assertNotNull(declRef.getAssignedValue());
    Assert.assertTrue(declRef.isHoistedFunction());
  }
}
