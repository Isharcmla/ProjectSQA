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
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReferenceCollectingCallbackTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  private ReferenceCollectingCallback parseAndRun(String js, Behavior behavior, Predicate<Var> filter) {
    Node root = compiler.parseTestCode(js);
    Node externs = new Node(Token.BLOCK);
    ReferenceCollectingCallback callback = new ReferenceCollectingCallback(compiler, behavior, filter);
    callback.process(externs, root);
    return callback;
  }

  private ReferenceCollectingCallback parseAndRun(String js, Behavior behavior) {
    return parseAndRun(js, behavior, Predicates.<Var>alwaysTrue());
  }

  private Map<String, ReferenceCollection> collectReferences(String js) {
    final Map<String, ReferenceCollection> map = new HashMap<String, ReferenceCollection>();
    Behavior behavior = new Behavior() {
      @Override
      public void afterExitScope(NodeTraversal t, Map<Var, ReferenceCollection> referenceMap) {
        for (Map.Entry<Var, ReferenceCollection> entry : referenceMap.entrySet()) {
          map.put(entry.getKey().getName(), entry.getValue());
        }
      }
    };
    parseAndRun(js, behavior);
    return map;
  }

  @Test
  public void testProcess_simpleVarDeclaration_recordsReference() {
    Map<String, ReferenceCollection> refs = collectReferences("var a = 1;");
    Assert.assertTrue(refs.containsKey("a"));
    ReferenceCollection col = refs.get("a");
    Assert.assertEquals(1, col.references.size());
    Assert.assertTrue(col.isWellDefined());
    Assert.assertTrue(col.isAssignedOnceInLifetime());
    Assert.assertFalse(col.isNeverAssigned());
    Assert.assertTrue(col.firstReferenceIsAssigningDeclaration());
  }

  @Test
  public void testProcess_uninitializedVar_isNotWellDefined() {
    Map<String, ReferenceCollection> refs = collectReferences("var a; a = 2;");
    Assert.assertTrue(refs.containsKey("a"));
    ReferenceCollection col = refs.get("a");
    Assert.assertEquals(2, col.references.size());
    Assert.assertTrue(col.isWellDefined());
    Assert.assertNotNull(col.getInitializingReference());
    Assert.assertEquals(col.references.get(1), col.getInitializingReference());
    Assert.assertFalse(col.firstReferenceIsAssigningDeclaration());
    Assert.assertTrue(col.isAssignedOnceInLifetime());
    Assert.assertFalse(col.isNeverAssigned());
  }

  @Test
  public void testProcess_varWithoutAssignment_isNeverAssigned() {
    Map<String, ReferenceCollection> refs = collectReferences("var a;");
    ReferenceCollection col = refs.get("a");
    Assert.assertEquals(1, col.references.size());
    Assert.assertFalse(col.isWellDefined());
    Assert.assertNull(col.getInitializingReference());
    Assert.assertNull(col.getInitializingReferenceForConstants());
    Assert.assertTrue(col.isNeverAssigned());
    Assert.assertFalse(col.isAssignedOnceInLifetime());
  }

  @Test
  public void testProcess_varAssignedMultipleTimes_notAssignedOnce() {
    Map<String, ReferenceCollection> refs = collectReferences("var a = 1; a = 2; a = 3;");
    ReferenceCollection col = refs.get("a");
    Assert.assertEquals(3, col.references.size());
    Assert.assertTrue(col.isWellDefined());
    Assert.assertFalse(col.isAssignedOnceInLifetime());
    Assert.assertFalse(col.isNeverAssigned());
  }

  @Test
  public void testProcess_varUsedBeforeAssigned_notWellDefined() {
    Map<String, ReferenceCollection> refs = collectReferences("function f() { x = 2; var x = 1; }");
    ReferenceCollection col = refs.get("x");
    Assert.assertNotNull(col);
  }

  @Test
  public void testProcess_escapedVariable_detected() {
    Map<String, ReferenceCollection> refs = collectReferences("var a = 1; function f() { return a; }");
    ReferenceCollection col = refs.get("a");
    Assert.assertNotNull(col);
    Assert.assertTrue(col.isEscaped());
  }

  @Test
  public void testProcess_nonEscapedVariable() {
    Map<String, ReferenceCollection> refs = collectReferences("var a = 1; var b = a + 1;");
    ReferenceCollection col = refs.get("a");
    Assert.assertNotNull(col);
    Assert.assertFalse(col.isEscaped());
  }

  @Test
  public void testProcess_functionDeclaration_initialization() {
    Map<String, ReferenceCollection> refs = collectReferences("function f() {}");
    ReferenceCollection col = refs.get("f");
    Assert.assertNotNull(col);
    Assert.assertTrue(col.isWellDefined());
    Reference ref = col.references.get(0);
    Assert.assertTrue(ref.isDeclaration());
    Assert.assertTrue(ref.isHoistedFunction());
    Assert.assertTrue(ref.isInitializingDeclaration());
    Assert.assertNotNull(ref.getAssignedValue());
  }

  @Test
  public void testProcess_catchClause_initialization() {
    Map<String, ReferenceCollection> refs = collectReferences("try {} catch (e) { e; }");
    ReferenceCollection col = refs.get("e");
    Assert.assertNotNull(col);
    Reference ref = col.references.get(0);
    Assert.assertTrue(ref.isDeclaration());
    Assert.assertFalse(ref.isVarDeclaration());
    Assert.assertTrue(ref.isInitializingDeclaration());
  }

  @Test
  public void testProcess_functionParameters() {
    Map<String, ReferenceCollection> refs = collectReferences("function f(param1, param2) { return param1 + param2; }");
    ReferenceCollection p1 = refs.get("param1");
    Assert.assertNotNull(p1);
    Assert.assertTrue(p1.references.get(0).isDeclaration());
    Assert.assertTrue(p1.references.get(0).isInitializingDeclaration());
  }

  @Test
  public void testControlStructures_blockBoundaries() {
    String js = "var a = 1;\n" +
        "if (a > 0) { a++; } else { a--; }\n" +
        "while (a < 10) { a++; }\n" +
        "do { a++; } while(a < 20);\n" +
        "for (var i = 0; i < 5; i++) { a += i; }\n" +
        "for (var k in {}) { a += k; }\n" +
        "try { a++; } catch (e) { a--; }\n" +
        "switch (a) { case 1: a++; break; }\n" +
        "var b = a > 0 ? a : 0;\n" +
        "var c = a && b;\n" +
        "var d = a || b;\n" +
        "with ({}) { a++; }";
    Map<String, ReferenceCollection> refs = collectReferences(js);
    Assert.assertTrue(refs.containsKey("a"));
    Assert.assertTrue(refs.containsKey("i"));
    Assert.assertTrue(refs.containsKey("k"));
  }

  @Test
  public void testFilterPredicate_ignoresFilteredVars() {
    Predicate<Var> filter = new Predicate<Var>() {
      @Override
      public boolean apply(Var input) {
        return "allowed".equals(input.getName());
      }
    };
    final Map<String, ReferenceCollection> map = new HashMap<String, ReferenceCollection>();
    Behavior behavior = new Behavior() {
      @Override
      public void afterExitScope(NodeTraversal t, Map<Var, ReferenceCollection> referenceMap) {
        for (Map.Entry<Var, ReferenceCollection> entry : referenceMap.entrySet()) {
          map.put(entry.getKey().getName(), entry.getValue());
        }
      }
    };
    parseAndRun("var allowed = 1; var ignored = 2;", behavior, filter);
    Assert.assertTrue(map.containsKey("allowed"));
    Assert.assertFalse(map.containsKey("ignored"));
  }

  @Test
  public void testConstructor_defaultFilter() {
    ReferenceCollectingCallback rcc = new ReferenceCollectingCallback(compiler, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
    Node root = compiler.parseTestCode("var x = 1;");
    rcc.process(new Node(Token.BLOCK), root);
    Assert.assertNull(rcc.getReferenceCollection(null));
  }

  @Test
  public void testReferenceCollection_emptyCollection() {
    ReferenceCollection col = new ReferenceCollection();
    Assert.assertFalse(col.isWellDefined());
    Assert.assertFalse(col.isEscaped());
    Assert.assertNull(col.getInitializingReference());
    Assert.assertNull(col.getInitializingReferenceForConstants());
    Assert.assertFalse(col.isAssignedOnceInLifetime());
    Assert.assertTrue(col.isNeverAssigned());
    Assert.assertFalse(col.firstReferenceIsAssigningDeclaration());
  }

  @Test
  public void testReference_operationsAndLvalues() {
    Map<String, ReferenceCollection> refs = collectReferences("var a = 0; a++; a--; a += 1;");
    ReferenceCollection col = refs.get("a");
    Assert.assertNotNull(col);
    List<Reference> list = col.references;
    Assert.assertEquals(4, list.size());
    for (Reference r : list) {
      Assert.assertTrue(r.isLvalue());
    }
  }

  @Test
  public void testReference_gettersAndMethods() {
    Map<String, ReferenceCollection> refs = collectReferences("var a = 1; var b = a;");
    ReferenceCollection colA = refs.get("a");
    Reference refDecl = colA.references.get(0);
    Reference refRead = colA.references.get(1);

    Assert.assertNotNull(refDecl.getNameNode());
    Assert.assertNotNull(refDecl.getParent());
    Assert.assertNotNull(refDecl.getGrandparent());
    Assert.assertNotNull(refDecl.getBasicBlock());
    Assert.assertNotNull(refDecl.getScope());
    Assert.assertNull(refDecl.getSourceName());

    Assert.assertNotNull(refDecl.getAssignedValue());
    Assert.assertFalse(refRead.isSimpleAssignmentToName());
    Assert.assertFalse(refRead.isDeclaration());
    Assert.assertFalse(refRead.isHoistedFunction());
  }

  @Test
  public void testReference_newBleedingFunction() {
    Node funcNode = compiler.parseTestCode("var f = function bleed() {};").getFirstChild().getFirstChild().getFirstChild();
    Assert.assertEquals(Token.FUNCTION, funcNode.getType());
    BasicBlock block = new BasicBlock(null, funcNode);
    NodeTraversal t = new NodeTraversal(compiler, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
    t.traverse(funcNode);
    Reference ref = Reference.newBleedingFunction(t, block, funcNode);
    Assert.assertNotNull(ref);
    Assert.assertEquals("bleed", ref.getNameNode().getString());
    Assert.assertEquals(block, ref.getBasicBlock());
  }

  @Test
  public void testBasicBlock_provablyExecutesBefore() {
    Node root = compiler.parseTestCode("function outer() { function inner() {} }");
    BasicBlock rootBlock = new BasicBlock(null, root);
    BasicBlock childBlock1 = new BasicBlock(rootBlock, root.getFirstChild());
    BasicBlock childBlock2 = new BasicBlock(childBlock1, root.getFirstChild().getLastChild());

    Assert.assertNull(rootBlock.getParent());
    Assert.assertEquals(rootBlock, childBlock1.getParent());
    Assert.assertEquals(childBlock1, childBlock2.getParent());

    Assert.assertTrue(rootBlock.provablyExecutesBefore(rootBlock));
    Assert.assertTrue(rootBlock.provablyExecutesBefore(childBlock1));
    Assert.assertTrue(rootBlock.provablyExecutesBefore(childBlock2));
    Assert.assertFalse(childBlock1.provablyExecutesBefore(rootBlock));

    Node hoistedFunc = root.getFirstChild();
    BasicBlock hoistedBlock = new BasicBlock(rootBlock, hoistedFunc);
    BasicBlock childOfHoisted = new BasicBlock(hoistedBlock, hoistedFunc.getLastChild());
    Assert.assertFalse(rootBlock.provablyExecutesBefore(childOfHoisted));
  }

  @Test
  public void testReferenceCollection_getInitializingReferenceForConstants() {
    Map<String, ReferenceCollection> refs = collectReferences("var a; a = 10; a;");
    ReferenceCollection col = refs.get("a");
    Assert.assertNotNull(col);
    Reference initRef = col.getInitializingReferenceForConstants();
    Assert.assertNotNull(initRef);
    Assert.assertEquals(col.references.get(1), initRef);
  }

  @Test
  public void testReferenceCollectingCallback_doNothingBehavior() {
    ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR.afterExitScope(null, null);
  }
}
