package com.google.javascript.jscomp;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Reference;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

public class ReferenceCollectingCallbackTest {

  private Compiler parse(String js) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    Node root = compiler.parseTestCode(js);
    return compiler;
  }

  private ReferenceCollectingCallback processJs(String js, Behavior behavior, Predicate<Var> filter) {
    Compiler compiler = parse(js);
    Node root = compiler.getRoot().getLastChild();
    ReferenceCollectingCallback callback;
    if (filter == null) {
      callback = new ReferenceCollectingCallback(compiler, behavior);
    } else {
      callback = new ReferenceCollectingCallback(compiler, behavior, filter);
    }
    callback.process(compiler.getRoot().getFirstChild(), root);
    return callback;
  }

  private ReferenceCollectingCallback processJs(String js) {
    return processJs(js, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR, null);
  }

  private Var findVar(ReferenceCollectingCallback callback, String name) {
    for (Var v : callback.getReferencedVariables()) {
      if (v.getName().equals(name)) {
        return v;
      }
    }
    return null;
  }

  @Test
  public void testProcess_simpleVarDeclarationAndRead() {
    ReferenceCollectingCallback callback = processJs("var a = 1; var b = a;");
    Set<Var> vars = callback.getReferencedVariables();
    Assert.assertNotNull(vars);
    Assert.assertEquals(2, vars.size());

    Var varA = findVar(callback, "a");
    Assert.assertNotNull(varA);
    ReferenceCollection collA = callback.getReferenceCollection(varA);
    Assert.assertNotNull(collA);
    Assert.assertEquals(2, collA.references.size());

    Reference declRef = collA.references.get(0);
    Assert.assertTrue(declRef.isDeclaration());
    Assert.assertTrue(declRef.isVarDeclaration());
    Assert.assertTrue(declRef.isInitializingDeclaration());
    Assert.assertTrue(declRef.isLvalue());
    Assert.assertEquals("a", declRef.getNameNode().getString());
    Assert.assertNotNull(declRef.getAssignedValue());
    Assert.assertEquals(Token.NUMBER, declRef.getAssignedValue().getType());
    Assert.assertNotNull(declRef.getParent());
    Assert.assertNotNull(declRef.getGrandparent());
    Assert.assertNotNull(declRef.getBasicBlock());
    Assert.assertNotNull(declRef.getScope());

    Reference readRef = collA.references.get(1);
    Assert.assertFalse(readRef.isDeclaration());
    Assert.assertFalse(readRef.isVarDeclaration());
    Assert.assertFalse(readRef.isInitializingDeclaration());
    Assert.assertFalse(readRef.isLvalue());
    Assert.assertNull(readRef.getAssignedValue());

    Assert.assertTrue(collA.isWellDefined());
    Assert.assertFalse(collA.isEscaped());
    Assert.assertTrue(collA.isAssignedOnceInLifetime());
    Assert.assertFalse(collA.isNeverAssigned());
    Assert.assertTrue(collA.firstReferenceIsAssigningDeclaration());
    Assert.assertEquals(declRef, collA.getInitializingReference());
    Assert.assertEquals(declRef, collA.getInitializingReferenceForConstants());
  }

  @Test
  public void testProcess_varFilterApplied() {
    Predicate<Var> filter = new Predicate<Var>() {
      @Override
      public boolean apply(Var input) {
        return "target".equals(input.getName());
      }
    };
    ReferenceCollectingCallback callback = processJs("var target = 1; var ignored = 2;",
        ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR, filter);

    Set<Var> vars = callback.getReferencedVariables();
    Assert.assertEquals(1, vars.size());
    Var varTarget = findVar(callback, "target");
    Assert.assertNotNull(varTarget);
    Assert.assertNull(findVar(callback, "ignored"));
  }

  @Test
  public void testBehavior_callbackTriggeredOnExitScope() {
    final int[] count = new int[]{0};
    Behavior customBehavior = new Behavior() {
      @Override
      public void afterExitScope(NodeTraversal t, Map<Var, ReferenceCollection> referenceMap) {
        count[0]++;
      }
    };

    processJs("function f() { var x = 1; } f();", customBehavior, null);
    Assert.assertTrue(count[0] >= 2);
  }

  @Test
  public void testControlFlowConstructs_branchesAndLoops() {
    String js = "var a = 0;\n"
        + "if (a) { a = 1; } else { a = 2; }\n"
        + "for (var i = 0; i < 10; i++) { a++; }\n"
        + "do { a--; } while (false);\n"
        + "while (false) { a = 3; }\n"
        + "try { a = 4; } catch (e) { a = 5; } finally { a = 6; }\n"
        + "switch (a) { case 1: a = 7; break; default: a = 8; }\n"
        + "var cond = a ? 1 : 2;\n"
        + "var bool = a && true || false;\n"
        + "with (a) { a = 9; }";

    ReferenceCollectingCallback callback = processJs(js);
    Var varA = findVar(callback, "a");
    Assert.assertNotNull(varA);
    ReferenceCollection collA = callback.getReferenceCollection(varA);
    Assert.assertNotNull(collA);
    Assert.assertFalse(collA.isAssignedOnceInLifetime());
    Assert.assertFalse(collA.isNeverAssigned());
  }

  @Test
  public void testUninitializedVarFollowedByAssignment() {
    String js = "var a; a = 1; var b = a;";
    ReferenceCollectingCallback callback = processJs(js);
    Var varA = findVar(callback, "a");
    Assert.assertNotNull(varA);
    ReferenceCollection coll = callback.getReferenceCollection(varA);

    Assert.assertFalse(coll.references.get(0).isInitializingDeclaration());
    Assert.assertTrue(coll.references.get(1).isSimpleAssignmentToName());
    Assert.assertEquals(coll.references.get(1), coll.getInitializingReference());
    Assert.assertEquals(coll.references.get(1), coll.getInitializingReferenceForConstants());
    Assert.assertTrue(coll.isWellDefined());
    Assert.assertTrue(coll.isAssignedOnceInLifetime());
    Assert.assertFalse(coll.isNeverAssigned());
    Assert.assertFalse(coll.firstReferenceIsAssigningDeclaration());
  }

  @Test
  public void testUninitializedVarWithoutAssignment() {
    String js = "var a;";
    ReferenceCollectingCallback callback = processJs(js);
    Var varA = findVar(callback, "a");
    ReferenceCollection coll = callback.getReferenceCollection(varA);

    Assert.assertNull(coll.getInitializingReference());
    Assert.assertNull(coll.getInitializingReferenceForConstants());
    Assert.assertFalse(coll.isWellDefined());
    Assert.assertFalse(coll.isAssignedOnceInLifetime());
    Assert.assertTrue(coll.isNeverAssigned());
    Assert.assertFalse(coll.firstReferenceIsAssigningDeclaration());
  }

  @Test
  public void testFunctionDeclarationReference() {
    String js = "function foo(param) { return param; } foo(1);";
    ReferenceCollectingCallback callback = processJs(js);
    Var varFoo = findVar(callback, "foo");
    Assert.assertNotNull(varFoo);
    ReferenceCollection collFoo = callback.getReferenceCollection(varFoo);

    Reference declFoo = collFoo.references.get(0);
    Assert.assertTrue(declFoo.isDeclaration());
    Assert.assertTrue(declFoo.isInitializingDeclaration());
    Assert.assertTrue(declFoo.isHoistedFunction());
    Assert.assertNotNull(declFoo.getAssignedValue());
    Assert.assertEquals(Token.FUNCTION, declFoo.getAssignedValue().getType());

    Var varParam = findVar(callback, "param");
    Assert.assertNotNull(varParam);
    ReferenceCollection collParam = callback.getReferenceCollection(varParam);
    Reference declParam = collParam.references.get(0);
    Assert.assertTrue(declParam.isDeclaration());
    Assert.assertTrue(declParam.isInitializingDeclaration());
    Assert.assertNull(declParam.getAssignedValue());
  }

  @Test
  public void testCatchClauseReference() {
    String js = "try {} catch (e) { var x = e; }";
    ReferenceCollectingCallback callback = processJs(js);
    Var varE = findVar(callback, "e");
    Assert.assertNotNull(varE);
    ReferenceCollection collE = callback.getReferenceCollection(varE);

    Reference declE = collE.references.get(0);
    Assert.assertTrue(declE.isDeclaration());
    Assert.assertTrue(declE.isInitializingDeclaration());
  }

  @Test
  public void testVariableEscapedScope() {
    String js = "var a = 1; function f() { return a; }";
    ReferenceCollectingCallback callback = processJs(js);
    Var varA = findVar(callback, "a");
    Assert.assertNotNull(varA);
    ReferenceCollection collA = callback.getReferenceCollection(varA);
    Assert.assertTrue(collA.isEscaped());
  }

  @Test
  public void testForInAssignment() {
    String js = "var obj = {x: 1}; for (var p in obj) { var k = p; }";
    ReferenceCollectingCallback callback = processJs(js);
    Var varP = findVar(callback, "p");
    Assert.assertNotNull(varP);
    ReferenceCollection collP = callback.getReferenceCollection(varP);

    Reference firstRef = collP.references.get(0);
    Assert.assertTrue(firstRef.isLvalue());
  }

  @Test
  public void testForInWithExistingVar() {
    String js = "var p; var obj = {}; for (p in obj) {}";
    ReferenceCollectingCallback callback = processJs(js);
    Var varP = findVar(callback, "p");
    Assert.assertNotNull(varP);
    ReferenceCollection collP = callback.getReferenceCollection(varP);
    Assert.assertTrue(collP.references.get(1).isLvalue());
  }

  @Test
  public void testCompoundAndIncDecAssignments() {
    String js = "var a = 0; a += 1; a++; ++a; a--; --a;";
    ReferenceCollectingCallback callback = processJs(js);
    Var varA = findVar(callback, "a");
    Assert.assertNotNull(varA);
    ReferenceCollection collA = callback.getReferenceCollection(varA);

    for (Reference ref : collA.references) {
      Assert.assertTrue(ref.isLvalue());
    }
    Assert.assertFalse(collA.isAssignedOnceInLifetime());
  }

  @Test
  public void testAssignmentInsideLoopNotAssignedOnce() {
    String js = "var a; while (true) { a = 1; }";
    ReferenceCollectingCallback callback = processJs(js);
    Var varA = findVar(callback, "a");
    Assert.assertNotNull(varA);
    ReferenceCollection collA = callback.getReferenceCollection(varA);
    Assert.assertFalse(collA.isAssignedOnceInLifetime());
  }

  @Test
  public void testConstantsAssignedAfterUse() {
    String js = "function f() { return C; } var C = 42;";
    ReferenceCollectingCallback callback = processJs(js);
    Var varC = findVar(callback, "C");
    Assert.assertNotNull(varC);
    ReferenceCollection collC = callback.getReferenceCollection(varC);

    Assert.assertNotNull(collC.getInitializingReferenceForConstants());
    Assert.assertEquals(Token.VAR, collC.getInitializingReferenceForConstants().getParent().getType());
  }

  @Test
  public void testReferenceCollectionEmptyState() {
    ReferenceCollection emptyColl = new ReferenceCollection();
    Assert.assertFalse(emptyColl.isWellDefined());
    Assert.assertFalse(emptyColl.isEscaped());
    Assert.assertNull(emptyColl.getInitializingReference());
    Assert.assertNull(emptyColl.getInitializingReferenceForConstants());
    Assert.assertFalse(emptyColl.isAssignedOnceInLifetime());
    Assert.assertTrue(emptyColl.isNeverAssigned());
    Assert.assertFalse(emptyColl.firstReferenceIsAssigningDeclaration());
  }

  @Test
  public void testBasicBlockProvablyExecutesBefore() {
    Node rootNode = new Node(Token.BLOCK);
    BasicBlock rootBlock = new BasicBlock(null, rootNode);
    Assert.assertNull(rootBlock.getParent());
    Assert.assertTrue(rootBlock.provablyExecutesBefore(rootBlock));

    Node childNode = new Node(Token.BLOCK, rootNode);
    BasicBlock childBlock = new BasicBlock(rootBlock, childNode);
    Assert.assertEquals(rootBlock, childBlock.getParent());
    Assert.assertTrue(rootBlock.provablyExecutesBefore(childBlock));
    Assert.assertFalse(childBlock.provablyExecutesBefore(rootBlock));

    Node funcNode = new Node(Token.FUNCTION, new Node(Token.NAME, "foo"), new Node(Token.LP), new Node(Token.BLOCK));
    Node hoistedParent = new Node(Token.SCRIPT, funcNode);
    BasicBlock hoistedBlock = new BasicBlock(rootBlock, funcNode);
    Assert.assertFalse(rootBlock.provablyExecutesBefore(hoistedBlock));

    BasicBlock unrelatedBlock = new BasicBlock(null, new Node(Token.BLOCK));
    Assert.assertFalse(rootBlock.provablyExecutesBefore(unrelatedBlock));
  }

  @Test
  public void testNewBleedingFunctionReference() {
    Compiler compiler = parse("var f = function bleed() {};");
    Node root = compiler.getRoot().getLastChild();
    Node script = root.getFirstChild();
    Node varNode = script.getFirstChild();
    Node assignName = varNode.getFirstChild();
    Node funcNode = assignName.getFirstChild();

    BasicBlock block = new BasicBlock(null, root);
    NodeTraversal t = new NodeTraversal(compiler, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
    t.traverse(root);

    Reference bleedingRef = Reference.newBleedingFunction(t, block, funcNode);
    Assert.assertNotNull(bleedingRef);
    Assert.assertEquals("bleed", bleedingRef.getNameNode().getString());
    Assert.assertEquals(funcNode, bleedingRef.getParent());
    Assert.assertEquals(varNode.getFirstChild(), bleedingRef.getGrandparent());
    Assert.assertEquals(block, bleedingRef.getBasicBlock());
    Assert.assertNull(bleedingRef.getSourceName());
  }

  @Test
  public void testGetReferenceCollection_nonExistentVarReturnsNull() {
    ReferenceCollectingCallback callback = processJs("var x = 1;");
    Assert.assertNull(callback.getReferenceCollection(null));
  }
}
