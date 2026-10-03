package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class PeepholeSubstituteAlternateSyntaxTest {

  private Compiler compiler;
  private PeepholeSubstituteAlternateSyntax peephole;

  @Before
  public void setUp() {
    compiler = new Compiler();
    compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.NORMALIZED);
    peephole = new PeepholeSubstituteAlternateSyntax();
    peephole.beginTraversal(compiler);
  }

  private void test(String js, String expected) {
    Compiler c = new Compiler();
    c.setLifeCycleStage(AbstractCompiler.LifeCycleStage.NORMALIZED);
    Node root = c.parseTestCode(js);
    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(c, new PeepholeSubstituteAlternateSyntax());
    pass.process(null, root);
    String actual = c.toSource(root);

    Compiler c2 = new Compiler();
    Node expectedRoot = c2.parseTestCode(expected);
    String expectedSource = c2.toSource(expectedRoot);
    assertEquals(expectedSource, actual);
  }

  private void testSame(String js) {
    test(js, js);
  }

  @Test
  public void testOptimizeSubtree_unhandledNodeType_returnsSameNode() {
    Node node = new Node(Token.EMPTY);
    Node result = peephole.optimizeSubtree(node);
    assertSame(node, result);
  }

  @Test
  public void testOptimizeSubtree_notNormalizedAST_standardConstructorsUntouched() {
    Compiler c = new Compiler();
    c.setLifeCycleStage(AbstractCompiler.LifeCycleStage.RAW);
    PeepholeSubstituteAlternateSyntax rawPeephole = new PeepholeSubstituteAlternateSyntax();
    rawPeephole.beginTraversal(c);

    Node newObj = new Node(Token.NEW, Node.newString(Token.NAME, "Object"));
    Node parent = new Node(Token.EXPR_RESULT, newObj);
    Node result = rawPeephole.optimizeSubtree(newObj);
    assertEquals(Token.NEW, result.getType());
  }

  @Test
  public void testContainsUnicodeEscape_variousInputs() {
    assertFalse(PeepholeSubstituteAlternateSyntax.containsUnicodeEscape(""));
    assertFalse(PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("hello"));
    assertFalse(PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("abc 123"));
    assertTrue(PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\u0000"));
    assertTrue(PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\uFFFF"));
    assertTrue(PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\u1234"));
  }

  @Test
  public void testDontTraverseFunctionsPredicate() {
    Node fn = new Node(Token.FUNCTION);
    Node var = new Node(Token.VAR);
    assertFalse(PeepholeSubstituteAlternateSyntax.DONT_TRAVERSE_FUNCTIONS_PREDICATE.apply(fn));
    assertTrue(PeepholeSubstituteAlternateSyntax.DONT_TRAVERSE_FUNCTIONS_PREDICATE.apply(var));
  }

  @Test
  public void testReduceReturn_undefined() {
    test("function f() { return undefined; }", "function f() { return; }");
  }

  @Test
  public void testReduceReturn_voidZero() {
    test("function f() { return void 0; }", "function f() { return; }");
  }

  @Test
  public void testReduceReturn_voidWithSideEffects() {
    testSame("function f() { return void foo(); }");
  }

  @Test
  public void testReduceReturn_inLoopToBreak() {
    test("function f() { while(true) { return; } }", "function f() { for(;1;) { break; } }");
  }

  @Test
  public void testReduceReturn_matchingFollowReturn() {
    test("function f() { while(true) { if (x) return 1; return 1; } }",
         "function f() { for(;1;) { if (x) break; return 1; } }");
  }

  @Test
  public void testMinimizeNot_equalityOperators() {
    test("!(x == y)", "x != y");
    test("!(x != y)", "x == y");
    test("!(x === y)", "x !== y");
    test("!(x !== y)", "x === y");
    testSame("!(x > y)");
    testSame("!(x <= y)");
  }

  @Test
  public void testMinimizeCondition_notNot() {
    test("if (!!x) foo();", "x && foo();");
  }

  @Test
  public void testMinimizeCondition_deMorganLaws() {
    test("if (!(!x && !y)) foo();", "(x || y) && foo();");
    test("if (!(!x || !y)) foo();", "(x && y) && foo();");
  }

  @Test
  public void testMinimizeCondition_andOrSimplification() {
    test("if (x || false) foo();", "x && foo();");
    test("if (x && true) foo();", "x && foo();");
    test("if (true || x) foo();", "foo();");
  }

  @Test
  public void testMinimizeCondition_hookSimplification() {
    test("if (x ? true : false) foo();", "x && foo();");
    test("if (x ? false : true) foo();", "!x && foo();");
    test("if (x ? true : y) foo();", "(x || y) && foo();");
    test("if (x ? y : false) foo();", "(x && y) && foo();");
  }

  @Test
  public void testMinimizeIf_singleBranchAndOr() {
    test("if (x) foo();", "x && foo();");
    test("if (!x) foo();", "x || foo();");
  }

  @Test
  public void testMinimizeIf_propertyAssignmentPreserved() {
    testSame("if (x) a.b = 1;");
  }

  @Test
  public void testMinimizeIf_invertNotWithElse() {
    test("if (!x) foo(); else bar();", "if (x) bar(); else foo();");
  }

  @Test
  public void testMinimizeIf_danglingElsePreserved() {
    testSame("if (!x) { if (y) a(); else b(); } else c();");
  }

  @Test
  public void testMinimizeIf_returnHook() {
    test("if (x) return 1; else return 2;", "return x ? 1 : 2;");
  }

  @Test
  public void testMinimizeIf_assignHook() {
    test("if (x) a = 1; else a = 2;", "a = x ? 1 : 2;");
    testSame("if (x) a[i++] = 1; else a[i++] = 2;");
  }

  @Test
  public void testMinimizeIf_callHook() {
    test("if (x) foo(); else bar();", "x ? foo() : bar();");
  }

  @Test
  public void testMinimizeIf_varThenAssignElse() {
    test("if (x) var y = 1; else y = 2;", "var y = x ? 1 : 2;");
  }

  @Test
  public void testMinimizeIf_assignThenVarElse() {
    test("if (x) y = 1; else var y = 2;", "var y = x ? 1 : 2;");
  }

  @Test
  public void testMinimizeIf_repeatedStatements() {
    test("function f() { if (a) { x = 1; return true; } else { x = 2; return true; } }",
         "function f() { if (a) x = 1; else x = 2; return true; }");
  }

  @Test
  public void testMinimizeLoops_conditions() {
    test("while (true) {}", "for (;1;) {}");
    test("do {} while (false);", "do {} while (0);");
    test("for (;true;) {}", "for (;1;) {}");
    testSame("for (x in y) {}");
  }

  @Test
  public void testFoldStandardConstructors_Object() {
    test("new Object()", "({})");
    test("Object()", "({})");
  }

  @Test
  public void testFoldStandardConstructors_Array() {
    test("new Array()", "[]");
    test("new Array(0)", "[]");
    test("new Array('a')", "['a']");
    test("new Array([1, 2])", "[[1, 2]]");
    test("new Array(1, 2)", "[1, 2]");
    test("new Array(5)", "Array(5)");
    test("Array()", "[]");
  }

  @Test
  public void testFoldStandardConstructors_Error() {
    test("new Error()", "Error()");
  }

  @Test
  public void testFoldRegularExpression_simple() {
    test("new RegExp('abc')", "/abc/");
    test("new RegExp('abc', 'i')", "/abc/i");
    test("new RegExp('abc', 'm')", "/abc/m");
    test("new RegExp('a/b')", "/a\\/b/");
    test("new RegExp('a\\\\/b')", "/a\\/b/");
  }

  @Test
  public void testFoldRegularExpression_unsafeOrInvalid() {
    testSame("new RegExp('abc', 'g')");
    testSame("new RegExp('')");
    testSame("new RegExp('abc', 'invalid')");
    testSame("new RegExp('a', 'b', 'c')");
  }

  @Test
  public void testFoldRegularExpression_longPattern() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 110; i++) {
      sb.append('a');
    }
    testSame("new RegExp('" + sb.toString() + "')");
  }

  @Test
  public void testDiagnosticType_exists() {
    assertNotNull(PeepholeSubstituteAlternateSyntax.INVALID_REGULAR_EXPRESSION_FLAGS);
  }
}
