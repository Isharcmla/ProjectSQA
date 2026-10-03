package com.google.javascript.jscomp;

import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CheckGlobalThisTest {

  private TestCompiler compiler;
  private CheckGlobalThis checkGlobalThis;

  private static class TestCompiler extends AbstractCompiler {
    private final List<JSError> errors = new ArrayList<JSError>();
    private final List<JSError> warnings = new ArrayList<JSError>();

    @Override
    public void report(JSError error) {
      if (error.level == CheckLevel.ERROR) {
        errors.add(error);
      } else if (error.level == CheckLevel.WARNING) {
        warnings.add(error);
      }
    }

    @Override
    public CheckLevel getDefaultLevel() {
      return CheckLevel.WARNING;
    }

    @Override
    public boolean hasErrors() {
      return !errors.isEmpty();
    }

    @Override
    public boolean hasWarnings() {
      return !warnings.isEmpty();
    }

    @Override
    public int getErrorCount() {
      return errors.size();
    }

    @Override
    public int getWarningCount() {
      return warnings.size();
    }

    @Override
    public Node parseSyntheticCode(String js) {
      return null;
    }

    @Override
    public Node parseSyntheticCode(String fileName, String js) {
      return null;
    }

    @Override
    public Node parseTestCode(String js) {
      return null;
    }

    @Override
    public String toSource(Node n) {
      return null;
    }

    @Override
    public void reportCodeChange() {}

    @Override
    public CodingConvention getCodingConvention() {
      return new DefaultCodingConvention();
    }

    @Override
    public SourceFile getSourceFileByName(String sourceName) {
      return null;
    }
  }

  @Before
  public void setUp() {
    compiler = new TestCompiler();
    checkGlobalThis = new CheckGlobalThis(compiler, CheckLevel.WARNING);
  }

  @Test
  public void testShouldTraverse_functionWithConstructorJSDoc_returnsFalse() {
    Node fnNode = new Node(Token.FUNCTION);
    JSDocInfoBuilder builder = new JSDocInfoBuilder(true);
    builder.recordConstructor();
    fnNode.setJSDocInfo(builder.build(fnNode));

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    boolean result = checkGlobalThis.shouldTraverse(t, fnNode, new Node(Token.BLOCK));
    Assert.assertFalse(result);
  }

  @Test
  public void testShouldTraverse_functionWithInterfaceJSDoc_returnsFalse() {
    Node fnNode = new Node(Token.FUNCTION);
    JSDocInfoBuilder builder = new JSDocInfoBuilder(true);
    builder.recordInterface();
    fnNode.setJSDocInfo(builder.build(fnNode));

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    boolean result = checkGlobalThis.shouldTraverse(t, fnNode, new Node(Token.BLOCK));
    Assert.assertFalse(result);
  }

  @Test
  public void testShouldTraverse_functionWithThisTypeJSDoc_returnsFalse() {
    Node fnNode = new Node(Token.FUNCTION);
    JSDocInfoBuilder builder = new JSDocInfoBuilder(true);
    builder.recordThisType(new Node(Token.STRING));
    fnNode.setJSDocInfo(builder.build(fnNode));

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    boolean result = checkGlobalThis.shouldTraverse(t, fnNode, new Node(Token.BLOCK));
    Assert.assertFalse(result);
  }

  @Test
  public void testShouldTraverse_functionWithOverrideJSDoc_returnsFalse() {
    Node fnNode = new Node(Token.FUNCTION);
    JSDocInfoBuilder builder = new JSDocInfoBuilder(true);
    builder.recordOverride();
    fnNode.setJSDocInfo(builder.build(fnNode));

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    boolean result = checkGlobalThis.shouldTraverse(t, fnNode, new Node(Token.BLOCK));
    Assert.assertFalse(result);
  }

  @Test
  public void testShouldTraverse_functionParentNameWithJSDoc_returnsFalse() {
    Node fnNode = new Node(Token.FUNCTION);
    Node nameNode = Node.newString(Token.NAME, "foo");
    nameNode.addChildToFront(fnNode);

    JSDocInfoBuilder builder = new JSDocInfoBuilder(true);
    builder.recordConstructor();
    nameNode.setJSDocInfo(builder.build(nameNode));

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    boolean result = checkGlobalThis.shouldTraverse(t, fnNode, nameNode);
    Assert.assertFalse(result);
  }

  @Test
  public void testShouldTraverse_functionGrandparentVarWithJSDoc_returnsFalse() {
    Node fnNode = new Node(Token.FUNCTION);
    Node nameNode = Node.newString(Token.NAME, "foo");
    Node varNode = new Node(Token.VAR);
    varNode.addChildToFront(nameNode);
    nameNode.addChildToFront(fnNode);

    JSDocInfoBuilder builder = new JSDocInfoBuilder(true);
    builder.recordConstructor();
    varNode.setJSDocInfo(builder.build(varNode));

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    boolean result = checkGlobalThis.shouldTraverse(t, fnNode, nameNode);
    Assert.assertFalse(result);
  }

  @Test
  public void testShouldTraverse_functionParentAssignWithJSDoc_returnsFalse() {
    Node fnNode = new Node(Token.FUNCTION);
    Node assignNode = new Node(Token.ASSIGN);
    Node lhsNode = Node.newString(Token.NAME, "a");
    assignNode.addChildToBack(lhsNode);
    assignNode.addChildToBack(fnNode);

    JSDocInfoBuilder builder = new JSDocInfoBuilder(true);
    builder.recordConstructor();
    assignNode.setJSDocInfo(builder.build(assignNode));

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    boolean result = checkGlobalThis.shouldTraverse(t, fnNode, assignNode);
    Assert.assertFalse(result);
  }

  @Test
  public void testShouldTraverse_functionInvalidParentContext_returnsFalse() {
    Node fnNode = new Node(Token.FUNCTION);
    Node callNode = new Node(Token.CALL);
    callNode.addChildToFront(fnNode);

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    boolean result = checkGlobalThis.shouldTraverse(t, fnNode, callNode);
    Assert.assertFalse(result);
  }

  @Test
  public void testShouldTraverse_functionValidParentContexts_returnsTrue() {
    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);

    int[] validParentTokens = new int[] {
        Token.BLOCK,
        Token.SCRIPT,
        Token.NAME,
        Token.ASSIGN,
        Token.STRING,
        Token.NUMBER
    };

    for (int tokenType : validParentTokens) {
      Node fnNode = new Node(Token.FUNCTION);
      Node parentNode = new Node(tokenType);
      parentNode.addChildToFront(fnNode);
      boolean result = checkGlobalThis.shouldTraverse(t, fnNode, parentNode);
      Assert.assertTrue("Failed for parent token: " + tokenType, result);
    }
  }

  @Test
  public void testShouldTraverse_assignLhs_returnsTrueAndSetsAssignLhsChild() {
    Node lhs = Node.newString(Token.NAME, "a");
    Node rhs = Node.newString(Token.NAME, "b");
    Node assign = new Node(Token.ASSIGN, lhs, rhs);

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    boolean result = checkGlobalThis.shouldTraverse(t, lhs, assign);
    Assert.assertTrue(result);

    // Call traverse again on lhs to test (assignLhsChild != null) branch
    boolean result2 = checkGlobalThis.shouldTraverse(t, lhs, assign);
    Assert.assertTrue(result2);
  }

  @Test
  public void testShouldTraverse_assignRhsPrototypeProperty_returnsFalse() {
    Node obj = Node.newString(Token.NAME, "Foo");
    Node prop = Node.newString("prototype");
    Node lhs = new Node(Token.GETPROP, obj, prop);
    Node rhs = new Node(Token.FUNCTION);
    Node assign = new Node(Token.ASSIGN, lhs, rhs);

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    boolean result = checkGlobalThis.shouldTraverse(t, rhs, assign);
    Assert.assertFalse(result);
  }

  @Test
  public void testShouldTraverse_assignRhsPrototypeSubproperty_returnsFalse() {
    Node obj = Node.newString(Token.NAME, "Foo");
    Node proto = Node.newString("prototype");
    Node protoProp = new Node(Token.GETPROP, obj, proto);
    Node bar = Node.newString("bar");
    Node lhs = new Node(Token.GETPROP, protoProp, bar);
    Node rhs = new Node(Token.FUNCTION);
    Node assign = new Node(Token.ASSIGN, lhs, rhs);

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    boolean result = checkGlobalThis.shouldTraverse(t, rhs, assign);
    Assert.assertFalse(result);
  }

  @Test
  public void testShouldTraverse_assignRhsNonPrototypeGetProp_returnsTrue() {
    Node obj = Node.newString(Token.NAME, "Foo");
    Node bar = Node.newString("bar");
    Node lhs = new Node(Token.GETPROP, obj, bar);
    Node rhs = new Node(Token.FUNCTION);
    Node assign = new Node(Token.ASSIGN, lhs, rhs);

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    boolean result = checkGlobalThis.shouldTraverse(t, rhs, assign);
    Assert.assertTrue(result);
  }

  @Test
  public void testShouldTraverse_assignRhsNonGetProp_returnsTrue() {
    Node lhs = Node.newString(Token.NAME, "a");
    Node rhs = new Node(Token.FUNCTION);
    Node assign = new Node(Token.ASSIGN, lhs, rhs);

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    boolean result = checkGlobalThis.shouldTraverse(t, rhs, assign);
    Assert.assertTrue(result);
  }

  @Test
  public void testShouldTraverse_nullParent_returnsTrue() {
    Node node = new Node(Token.EXPR_RESULT);
    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    boolean result = checkGlobalThis.shouldTraverse(t, node, null);
    Assert.assertTrue(result);
  }

  @Test
  public void testVisit_thisOnAssignLhsChild_reportsWarningAndResets() {
    Node thisNode = new Node(Token.THIS);
    Node rhs = Node.newString(Token.NAME, "b");
    Node assign = new Node(Token.ASSIGN, thisNode, rhs);

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    checkGlobalThis.shouldTraverse(t, thisNode, assign);
    checkGlobalThis.visit(t, thisNode, assign);

    Assert.assertEquals(1, compiler.getWarningCount());

    // Subsequent visit without lhs child set should not report on standalone THIS
    Node standaloneThis = new Node(Token.THIS);
    checkGlobalThis.visit(t, standaloneThis, new Node(Token.EXPR_RESULT));
    Assert.assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testVisit_thisWithPropertyAccess_reportsWarning() {
    Node thisNode = new Node(Token.THIS);
    Node prop = Node.newString("foo");
    Node getProp = new Node(Token.GETPROP, thisNode, prop);

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    checkGlobalThis.visit(t, thisNode, getProp);

    Assert.assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testVisit_standaloneThis_doesNotReport() {
    Node thisNode = new Node(Token.THIS);
    Node parent = new Node(Token.EXPR_RESULT);

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    checkGlobalThis.visit(t, thisNode, parent);

    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testVisit_nonThisNode_doesNotReport() {
    Node nameNode = Node.newString(Token.NAME, "x");
    Node parent = new Node(Token.EXPR_RESULT);

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    checkGlobalThis.visit(t, nameNode, parent);

    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testVisit_thisWithNullParent_doesNotReport() {
    Node thisNode = new Node(Token.THIS);

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    checkGlobalThis.visit(t, thisNode, null);

    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testCheckGlobalThis_withErrorLevel_reportsError() {
    checkGlobalThis = new CheckGlobalThis(compiler, CheckLevel.ERROR);
    Node thisNode = new Node(Token.THIS);
    Node prop = Node.newString("foo");
    Node getProp = new Node(Token.GETPROP, thisNode, prop);

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    checkGlobalThis.visit(t, thisNode, getProp);

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(0, compiler.getWarningCount());
  }
}
