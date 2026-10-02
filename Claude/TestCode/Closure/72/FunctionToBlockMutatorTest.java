package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.common.base.Supplier;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

public class FunctionToBlockMutatorTest {

  private Compiler compiler;
  private FunctionToBlockMutator mutator;
  private int uniqueId;

  @Before
  public void setUp() {
    compiler = new Compiler();
    uniqueId = 0;
    Supplier<String> safeNameIdSupplier = new Supplier<String>() {
      @Override
      public String get() {
        return String.valueOf(uniqueId++);
      }
    };
    mutator = new FunctionToBlockMutator(compiler, safeNameIdSupplier);
  }

  private Node findNodeOfType(Node root, int type) {
    if (root == null) {
      return null;
    }
    if (root.getType() == type) {
      return root;
    }
    for (Node c = root.getFirstChild(); c != null; c = c.getNext()) {
      Node result = findNodeOfType(c, type);
      if (result != null) {
        return result;
      }
    }
    return null;
  }

  private Node parseFunction(String js) {
    Node script = compiler.parseTestCode(js);
    return findNodeOfType(script, Token.FUNCTION);
  }

  private Node parseCall(String js) {
    Node script = compiler.parseTestCode(js);
    return findNodeOfType(script, Token.CALL);
  }

  @Test
  public void testMutate_simpleReturn_normalCase() {
    Node fnNode = parseFunction("function f(a) { return a + 1; }");
    Node callNode = parseCall("f(2);");
    assertNotNull(fnNode);
    assertNotNull(callNode);

    Node result = mutator.mutate(
        "f", fnNode, callNode, "result", false, false);

    assertNotNull(result);
    assertEquals(Token.BLOCK, result.getType());
  }

  @Test
  public void testMutate_noReturn_needsDefaultResult_dummyAssignmentAdded() {
    Node fnNode = parseFunction("function f() { var x = 1; }");
    Node callNode = parseCall("f();");

    Node result = mutator.mutate(
        "f", fnNode, callNode, "result", true, false);

    assertNotNull(result);
    assertEquals(Token.BLOCK, result.getType());
  }

  @Test
  public void testMutate_noReturn_noDefaultResultNeeded_noExtraAssignment() {
    Node fnNode = parseFunction("function f() { var x = 1; }");
    Node callNode = parseCall("f();");

    Node result = mutator.mutate(
        "f", fnNode, callNode, "result", false, false);

    assertNotNull(result);
    assertEquals(Token.BLOCK, result.getType());
  }

  @Test
  public void testMutate_multipleReturns_labelBlockCreated() {
    Node fnNode = parseFunction(
        "function f(a) { if (a) { return 1; } return 2; }");
    Node callNode = parseCall("f(1);");

    Node result = mutator.mutate(
        "f", fnNode, callNode, "result", false, false);

    assertNotNull(result);
    assertEquals(Token.BLOCK, result.getType());
  }

  @Test
  public void testMutate_emptyFunctionName_usesAnonLabel() {
    Node fnNode = parseFunction(
        "function f(a) { if (a) { return 1; } return 2; }");
    Node callNode = parseCall("f(1);");

    Node result = mutator.mutate(
        "", fnNode, callNode, "result", false, false);

    assertNotNull(result);
  }

  @Test
  public void testMutate_nullFunctionName_usesAnonLabel() {
    Node fnNode = parseFunction(
        "function f(a) { if (a) { return 1; } return 2; }");
    Node callNode = parseCall("f(1);");

    Node result = mutator.mutate(
        null, fnNode, callNode, "result", false, false);

    assertNotNull(result);
  }

  @Test
  public void testMutate_callInLoop_uninitializedVarFixed() {
    Node fnNode = parseFunction(
        "function f(a) { var x; return a; }");
    Node callNode = parseCall("f(1);");

    Node result = mutator.mutate(
        "f", fnNode, callNode, "result", false, true);

    assertNotNull(result);
  }

  @Test
  public void testMutate_paramNotModified_directInlineArgs() {
    Node fnNode = parseFunction(
        "function f(a) { return a; }");
    Node callNode = parseCall("f(5);");

    Node result = mutator.mutate(
        "f", fnNode, callNode, "result", false, false);

    assertNotNull(result);
  }

  @Test
  public void testMutate_modifiedParameter_aliasCreated() {
    Node fnNode = parseFunction(
        "function f(a) { a = a + 1; return a; }");
    Node callNode = parseCall("f(x);");

    Node result = mutator.mutate(
        "f", fnNode, callNode, "result", false, false);

    assertNotNull(result);
  }

  @Test
  public void testMutate_noArguments_hasArgsFalse() {
    Node fnNode = parseFunction(
        "function f() { return 42; }");
    Node callNode = parseCall("f();");

    Node result = mutator.mutate(
        "f", fnNode, callNode, "result", false, false);

    assertNotNull(result);
  }

  @Test
  public void testMutate_resultNameNull_noAssignmentCreated() {
    Node fnNode = parseFunction("function f() { return 1; }");
    Node callNode = parseCall("f();");

    Node result = mutator.mutate(
        "f", fnNode, callNode, null, false, false);

    assertNotNull(result);
  }

  @Test(expected = NullPointerException.class)
  public void testMutate_nullFnNode_throwsNullPointerException() {
    Node callNode = parseCall("f();");
    mutator.mutate("f", null, callNode, "result", false, false);
  }

  @Test(expected = NullPointerException.class)
  public void testMutate_nullCallNode_throwsNullPointerException() {
    Node fnNode = parseFunction("function f() { return 1; }");
    mutator.mutate("f", fnNode, null, "result", false, false);
  }

  @Test
  public void testMutate_emptyFunctionBody_noReturnStatement() {
    Node fnNode = parseFunction("function f() {}");
    Node callNode = parseCall("f();");

    Node result = mutator.mutate(
        "f", fnNode, callNode, "result", false, false);

    assertNotNull(result);
    assertEquals(Token.BLOCK, result.getType());
  }

  @Test
  public void testMutate_emptyReturnStatement_defaultValueUsed() {
    Node fnNode = parseFunction("function f() { return; }");
    Node callNode = parseCall("f();");

    Node result = mutator.mutate(
        "f", fnNode, callNode, "result", true, false);

    assertNotNull(result);
    assertEquals(Token.BLOCK, result.getType());
  }

  @Test
  public void testLabelNameSupplier_get_returnsFormattedName() {
    final int[] counter = {0};
    Supplier<String> idSupplier = new Supplier<String>() {
      @Override
      public String get() {
        return String.valueOf(counter[0]++);
      }
    };
    FunctionToBlockMutator.LabelNameSupplier supplier =
        new FunctionToBlockMutator.LabelNameSupplier(idSupplier);
    String name = supplier.get();
    assertTrue(name.startsWith("JSCompiler_inline_label_"));
  }

  @Test
  public void testLabelNameSupplier_getMultipleTimes_incrementsId() {
    final int[] counter = {0};
    Supplier<String> idSupplier = new Supplier<String>() {
      @Override
      public String get() {
        return String.valueOf(counter[0]++);
      }
    };
    FunctionToBlockMutator.LabelNameSupplier supplier =
        new FunctionToBlockMutator.LabelNameSupplier(idSupplier);
    String first = supplier.get();
    String second = supplier.get();
    assertTrue(!first.equals(second));
  }
}
