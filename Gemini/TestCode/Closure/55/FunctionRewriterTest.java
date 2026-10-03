package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FunctionRewriterTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  private void testRewrite(String js, String expected) {
    Node root = compiler.parseTestCode(js);
    Node externs = new Node(Token.BLOCK);
    Node mainRoot = new Node(Token.BLOCK, externs, root);

    FunctionRewriter rewriter = new FunctionRewriter(compiler);
    rewriter.process(externs, root);

    String actual = compiler.toSource(root);
    String expectedNormalized = compiler.toSource(compiler.parseTestCode(expected));
    Assert.assertEquals(expectedNormalized, actual);
  }

  private void testSame(String js) {
    testRewrite(js, js);
  }

  @Test
  public void testProcess_emptyProgram_noChanges() {
    testSame("");
  }

  @Test
  public void testProcess_noReducibleFunctions_noChanges() {
    String js = "var a = 1; var b = 2; function foo() { return a + b; }";
    testSame(js);
  }

  @Test
  public void testProcess_emptyFunctions_belowSavingsThreshold_notRewritten() {
    String js = "a.prototype.foo = function() {};";
    testSame(js);
  }

  @Test
  public void testProcess_emptyFunctions_aboveSavingsThreshold_rewritten() {
    StringBuilder input = new StringBuilder();
    StringBuilder expected = new StringBuilder(
        "function JSCompiler_emptyFn() { return function() {} }\n"
    );

    for (int i = 0; i < 10; i++) {
      input.append("a.prototype.f").append(i).append(" = function() {};\n");
      expected.append("a.prototype.f").append(i).append(" = JSCompiler_emptyFn();\n");
    }

    testRewrite(input.toString(), expected.toString());
  }

  @Test
  public void testProcess_identityFunctions_aboveSavingsThreshold_rewritten() {
    StringBuilder input = new StringBuilder();
    StringBuilder expected = new StringBuilder(
        "function JSCompiler_identityFn() { return function(JSCompiler_identityFn_value) { return JSCompiler_identityFn_value; } }\n"
    );

    for (int i = 0; i < 10; i++) {
      input.append("a.prototype.f").append(i).append(" = function(x) { return x; };\n");
      expected.append("a.prototype.f").append(i).append(" = JSCompiler_identityFn();\n");
    }

    testRewrite(input.toString(), expected.toString());
  }

  @Test
  public void testProcess_identityFunction_noParamsOrMismatch_notRewritten() {
    String js = ""
        + "a.prototype.f1 = function() { return x; };\n"
        + "a.prototype.f2 = function(x) { return y; };\n"
        + "a.prototype.f3 = function(x) { return; };\n";
    testSame(js);
  }

  @Test
  public void testProcess_returnConstantFunctions_aboveSavingsThreshold_rewritten() {
    StringBuilder input = new StringBuilder();
    StringBuilder expected = new StringBuilder(
        "function JSCompiler_returnArg(JSCompiler_returnArg_value) { return function() { return JSCompiler_returnArg_value; } }\n"
    );

    for (int i = 0; i < 10; i++) {
      input.append("a.prototype.f").append(i).append(" = function() { return 10; };\n");
      expected.append("a.prototype.f").append(i).append(" = JSCompiler_returnArg(10);\n");
    }

    testRewrite(input.toString(), expected.toString());
  }

  @Test
  public void testProcess_returnNonConstant_notRewritten() {
    StringBuilder input = new StringBuilder();
    for (int i = 0; i < 10; i++) {
      input.append("a.prototype.f").append(i).append(" = function() { return nonConstVariable; };\n");
    }
    testSame(input.toString());
  }

  @Test
  public void testProcess_getterFunctions_aboveSavingsThreshold_rewritten() {
    StringBuilder input = new StringBuilder();
    StringBuilder expected = new StringBuilder(
        "function JSCompiler_get(JSCompiler_get_name) { return function() { return this[JSCompiler_get_name]; } }\n"
    );

    for (int i = 0; i < 10; i++) {
      input.append("a.prototype.getProp").append(i).append(" = function() { return this.prop").append(i).append("; };\n");
      expected.append("a.prototype.getProp").append(i).append(" = JSCompiler_get(\"prop").append(i).append("\");\n");
    }

    testRewrite(input.toString(), expected.toString());
  }

  @Test
  public void testProcess_getterFunction_notThis_notRewritten() {
    StringBuilder input = new StringBuilder();
    for (int i = 0; i < 10; i++) {
      input.append("a.prototype.f").append(i).append(" = function() { return other.prop").append(i).append("; };\n");
    }
    testSame(input.toString());
  }

  @Test
  public void testProcess_setterFunctions_aboveSavingsThreshold_rewritten() {
    StringBuilder input = new StringBuilder();
    StringBuilder expected = new StringBuilder(
        "function JSCompiler_set(JSCompiler_set_name) { return function(JSCompiler_set_value) { this[JSCompiler_set_name] = JSCompiler_set_value; } }\n"
    );

    for (int i = 0; i < 10; i++) {
      input.append("a.prototype.setProp").append(i).append(" = function(v) { this.prop").append(i).append(" = v; };\n");
      expected.append("a.prototype.setProp").append(i).append(" = JSCompiler_set(\"prop").append(i).append("\");\n");
    }

    testRewrite(input.toString(), expected.toString());
  }

  @Test
  public void testProcess_setterFunction_mismatchParamOrNotThis_notRewritten() {
    String js = ""
        + "a.prototype.f1 = function() { this.prop = 1; };\n"
        + "a.prototype.f2 = function(v) { other.prop = v; };\n"
        + "a.prototype.f3 = function(v) { this.prop = otherVal; };\n"
        + "a.prototype.f4 = function(v) { return this.prop = v; };\n";
    testSame(js);
  }

  @Test
  public void testProcess_multipleStatementsInFunction_notRewritten() {
    StringBuilder input = new StringBuilder();
    for (int i = 0; i < 10; i++) {
      input.append("a.prototype.f").append(i).append(" = function(x) { var y = 1; return x; };\n");
    }
    testSame(input.toString());
  }

  @Test
  public void testProcess_namedFunctionStatement_notRewritten() {
    StringBuilder input = new StringBuilder();
    for (int i = 0; i < 10; i++) {
      input.append("function f").append(i).append("() { return 10; }\n");
    }
    testSame(input.toString());
  }

  @Test
  public void testParseHelperCode_validReducer() {
    FunctionRewriter rewriter = new FunctionRewriter(compiler);
    FunctionRewriter.Reducer reducer = new FunctionRewriter.Reducer() {
      @Override
      String getHelperSource() {
        return "function helper() { return 1; }";
      }

      @Override
      Node reduce(Node node) {
        return node;
      }
    };

    Node helperNode = rewriter.parseHelperCode(reducer);
    Assert.assertNotNull(helperNode);
    Assert.assertEquals(Token.FUNCTION, helperNode.getType());
  }

  @Test
  public void testParseHelperCode_invalidReducerSource_returnsNull() {
    FunctionRewriter rewriter = new FunctionRewriter(compiler);
    FunctionRewriter.Reducer reducer = new FunctionRewriter.Reducer() {
      @Override
      String getHelperSource() {
        return "";
      }

      @Override
      Node reduce(Node node) {
        return node;
      }
    };

    Node helperNode = rewriter.parseHelperCode(reducer);
    Assert.assertNull(helperNode);
  }

  @Test
  public void testReducer_buildCallNode_withAndWithoutArgument() {
    FunctionRewriter.Reducer reducer = new FunctionRewriter.Reducer() {
      @Override
      String getHelperSource() {
        return "";
      }

      @Override
      Node reduce(Node node) {
        return node;
      }
    };

    Node callWithoutArg = reducer.buildCallNode("testFn", null, 1, 2);
    Assert.assertEquals(Token.CALL, callWithoutArg.getType());
    Assert.assertTrue(callWithoutArg.getBooleanProp(Node.FREE_CALL));
    Assert.assertEquals(1, callWithoutArg.getLineno());
    Assert.assertEquals(2, callWithoutArg.getCharno());
    Assert.assertEquals("testFn", callWithoutArg.getFirstChild().getString());
    Assert.assertNull(callWithoutArg.getFirstChild().getNext());

    Node arg = Node.newString("argumentValue");
    Node callWithArg = reducer.buildCallNode("testFn2", arg, 3, 4);
    Assert.assertEquals(Token.CALL, callWithArg.getType());
    Assert.assertTrue(callWithArg.getBooleanProp(Node.FREE_CALL));
    Assert.assertEquals("testFn2", callWithArg.getFirstChild().getString());
    Assert.assertNotNull(callWithArg.getFirstChild().getNext());
    Assert.assertEquals("argumentValue", callWithArg.getFirstChild().getNext().getString());
  }
}
