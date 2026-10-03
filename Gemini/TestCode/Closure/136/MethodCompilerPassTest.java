package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MethodCompilerPassTest {

  private static class DummySignatureStore implements MethodCompilerPass.SignatureStore {
    final Map<String, Node> signatures = new HashMap<String, Node>();
    final Map<String, String> sourceFiles = new HashMap<String, String>();
    int resetCallCount = 0;

    @Override
    public void reset() {
      resetCallCount++;
      signatures.clear();
      sourceFiles.clear();
    }

    @Override
    public void addSignature(String functionName, Node functionNode, String sourceFile) {
      signatures.put(functionName, functionNode);
      sourceFiles.put(functionName, sourceFile);
    }

    @Override
    public void removeSignature(String functionName) {
      signatures.remove(functionName);
      sourceFiles.remove(functionName);
    }
  }

  private static class TestableMethodCompilerPass extends MethodCompilerPass {
    private final DummySignatureStore signatureStore;
    private final NodeTraversal.Callback actingCallback;
    int actingCallbackCallCount = 0;

    TestableMethodCompilerPass(Compiler compiler) {
      this(compiler, new DummySignatureStore());
    }

    TestableMethodCompilerPass(Compiler compiler, DummySignatureStore signatureStore) {
      super(compiler);
      this.signatureStore = signatureStore;
      this.actingCallback = new NodeTraversal.AbstractPostOrderCallback() {
        @Override
        public void visit(NodeTraversal t, Node n, Node parent) {
          actingCallbackCallCount++;
        }
      };
    }

    @Override
    NodeTraversal.Callback getActingCallback() {
      return actingCallback;
    }

    @Override
    SignatureStore getSignatureStore() {
      return signatureStore;
    }
  }

  private Compiler compiler;
  private DummySignatureStore signatureStore;
  private TestableMethodCompilerPass pass;

  @Before
  public void setUp() {
    compiler = new Compiler();
    signatureStore = new DummySignatureStore();
    pass = new TestableMethodCompilerPass(compiler, signatureStore);
  }

  @Test
  public void testProcess_nullExternsAndEmptyRoot_success() {
    Node root = new Node(Token.BLOCK);
    pass.process(null, root);

    Assert.assertEquals(1, signatureStore.resetCallCount);
    Assert.assertTrue(pass.externMethods.isEmpty());
    Assert.assertTrue(pass.externMethodsWithoutSignatures.isEmpty());
    Assert.assertTrue(pass.methodDefinitions.isEmpty());
    Assert.assertTrue(pass.nonMethodProperties.isEmpty());
  }

  @Test
  public void testProcess_externWithFunctionAssign_signatureAdded() {
    // externs: Foo.bar = function() {}
    Node externs = new Node(Token.BLOCK);
    Node assign = new Node(Token.ASSIGN);
    Node getprop = new Node(Token.GETPROP, Node.newString(Token.NAME, "Foo"), Node.newString(Token.STRING, "bar"));
    Node fn = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    assign.addChildToBack(getprop);
    assign.addChildToBack(fn);
    externs.addChildToBack(assign);

    Node root = new Node(Token.BLOCK);

    pass.process(externs, root);

    Assert.assertTrue(pass.externMethods.contains("bar"));
    Assert.assertFalse(pass.externMethodsWithoutSignatures.contains("bar"));
    Assert.assertTrue(signatureStore.signatures.containsKey("bar"));
    Assert.assertEquals(fn, signatureStore.signatures.get("bar"));
  }

  @Test
  public void testProcess_externWithoutFunctionAssign_markedWithoutSignature() {
    // externs: Foo.bar = 123
    Node externs = new Node(Token.BLOCK);
    Node assign = new Node(Token.ASSIGN);
    Node getprop = new Node(Token.GETPROP, Node.newString(Token.NAME, "Foo"), Node.newString(Token.STRING, "bar"));
    Node number = Node.newNumber(123);
    assign.addChildToBack(getprop);
    assign.addChildToBack(number);
    externs.addChildToBack(assign);

    Node root = new Node(Token.BLOCK);

    pass.process(externs, root);

    Assert.assertTrue(pass.externMethods.contains("bar"));
    Assert.assertTrue(pass.externMethodsWithoutSignatures.contains("bar"));
    Assert.assertFalse(signatureStore.signatures.containsKey("bar"));
  }

  @Test
  public void testProcess_externGetPropWithNonStringProperty_ignored() {
    // externs: Foo[123]
    Node externs = new Node(Token.BLOCK);
    Node getelem = new Node(Token.GETELEM, Node.newString(Token.NAME, "Foo"), Node.newNumber(123));
    externs.addChildToBack(getelem);

    Node root = new Node(Token.BLOCK);

    pass.process(externs, root);

    Assert.assertTrue(pass.externMethods.isEmpty());
  }

  @Test
  public void testProcess_externObjectLitWithFunctionAndNonFunction() {
    // externs: { fn: function(){}, val: 10 }
    Node externs = new Node(Token.BLOCK);
    Node objlit = new Node(Token.OBJECTLIT);
    Node fn = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    Node num = Node.newNumber(10);

    objlit.addChildToBack(Node.newString(Token.STRING, "fn"));
    objlit.addChildToBack(fn);
    objlit.addChildToBack(Node.newString(Token.STRING, "val"));
    objlit.addChildToBack(num);
    externs.addChildToBack(objlit);

    Node root = new Node(Token.BLOCK);

    pass.process(externs, root);

    Assert.assertTrue(pass.externMethods.contains("fn"));
    Assert.assertTrue(pass.externMethods.contains("val"));
    Assert.assertTrue(pass.externMethodsWithoutSignatures.contains("val"));
    Assert.assertFalse(pass.externMethodsWithoutSignatures.contains("fn"));
    Assert.assertTrue(signatureStore.signatures.containsKey("fn"));
    Assert.assertFalse(signatureStore.signatures.containsKey("val"));
  }

  @Test
  public void testProcess_sourceStaticMethodFunction_signatureAdded() {
    // JS: Foo.baz = function() {}
    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);
    Node assign = new Node(Token.ASSIGN);
    Node getprop = new Node(Token.GETPROP, Node.newString(Token.NAME, "Foo"), Node.newString(Token.STRING, "baz"));
    Node fn = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    assign.addChildToBack(getprop);
    assign.addChildToBack(fn);
    root.addChildToBack(assign);

    pass.process(externs, root);

    Assert.assertTrue(signatureStore.signatures.containsKey("baz"));
    Assert.assertTrue(pass.methodDefinitions.containsKey("baz"));
    Assert.assertFalse(pass.nonMethodProperties.contains("baz"));
  }

  @Test
  public void testProcess_sourceStaticMethodNonFunctionAssign_addedToNonMethodProperties() {
    // JS: Foo.baz = 123
    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);
    Node assign = new Node(Token.ASSIGN);
    Node getprop = new Node(Token.GETPROP, Node.newString(Token.NAME, "Foo"), Node.newString(Token.STRING, "baz"));
    Node num = Node.newNumber(123);
    assign.addChildToBack(getprop);
    assign.addChildToBack(num);
    root.addChildToBack(assign);

    pass.process(externs, root);

    Assert.assertFalse(signatureStore.signatures.containsKey("baz"));
    Assert.assertTrue(pass.nonMethodProperties.contains("baz"));
  }

  @Test
  public void testProcess_sourcePrototypePropertyAssignFunction_signatureAdded() {
    // JS: Foo.prototype.method = function() {}
    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);
    Node assign = new Node(Token.ASSIGN);
    Node protoProp = new Node(Token.GETPROP, Node.newString(Token.NAME, "Foo"), Node.newString(Token.STRING, "prototype"));
    Node methodProp = new Node(Token.GETPROP, protoProp, Node.newString(Token.STRING, "method"));
    Node fn = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    assign.addChildToBack(methodProp);
    assign.addChildToBack(fn);
    root.addChildToBack(assign);

    pass.process(externs, root);

    Assert.assertTrue(signatureStore.signatures.containsKey("method"));
    Assert.assertTrue(pass.methodDefinitions.containsKey("method"));
    Assert.assertFalse(pass.nonMethodProperties.contains("method"));
  }

  @Test
  public void testProcess_sourceObjectLit_signaturesAndNonMethodsIdentified() {
    // JS: var obj = { fnKey: function(){}, nonFnKey: "text" }
    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);
    Node objlit = new Node(Token.OBJECTLIT);
    Node fn = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    Node strVal = Node.newString(Token.STRING, "text");

    objlit.addChildToBack(Node.newString(Token.STRING, "fnKey"));
    objlit.addChildToBack(fn);
    objlit.addChildToBack(Node.newString(Token.STRING, "nonFnKey"));
    objlit.addChildToBack(strVal);
    root.addChildToBack(objlit);

    pass.process(externs, root);

    Assert.assertTrue(signatureStore.signatures.containsKey("fnKey"));
    Assert.assertTrue(pass.methodDefinitions.containsKey("fnKey"));
    Assert.assertTrue(pass.nonMethodProperties.contains("nonFnKey"));
  }

  @Test
  public void testProcess_sourceStaticMethodDefinedInExternWithoutSignature_skipped() {
    // externs: Foo.bar (no signature)
    Node externs = new Node(Token.BLOCK);
    Node extGetprop = new Node(Token.GETPROP, Node.newString(Token.NAME, "Foo"), Node.newString(Token.STRING, "bar"));
    externs.addChildToBack(extGetprop);

    // JS: Foo.bar = function() {}
    Node root = new Node(Token.BLOCK);
    Node assign = new Node(Token.ASSIGN);
    Node getprop = new Node(Token.GETPROP, Node.newString(Token.NAME, "Foo"), Node.newString(Token.STRING, "bar"));
    Node fn = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    assign.addChildToBack(getprop);
    assign.addChildToBack(fn);
    root.addChildToBack(assign);

    pass.process(externs, root);

    Assert.assertTrue(pass.externMethodsWithoutSignatures.contains("bar"));
    Assert.assertFalse(signatureStore.signatures.containsKey("bar"));
    Assert.assertFalse(pass.methodDefinitions.containsKey("bar"));
  }

  @Test
  public void testProcess_varReferencingFunction_resolvedFromScope() {
    // JS: var myFn = function() {}; Foo.bar = myFn;
    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);

    Node varNode = new Node(Token.VAR);
    Node fnNameNode = Node.newString(Token.NAME, "myFn");
    Node fn = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    fnNameNode.addChildToBack(fn);
    varNode.addChildToBack(fnNameNode);
    root.addChildToBack(varNode);

    Node assign = new Node(Token.ASSIGN);
    Node getprop = new Node(Token.GETPROP, Node.newString(Token.NAME, "Foo"), Node.newString(Token.STRING, "bar"));
    Node rhsName = Node.newString(Token.NAME, "myFn");
    assign.addChildToBack(getprop);
    assign.addChildToBack(rhsName);
    root.addChildToBack(assign);

    pass.process(externs, root);

    Assert.assertTrue(signatureStore.signatures.containsKey("bar"));
    Assert.assertTrue(pass.methodDefinitions.containsKey("bar"));
  }

  @Test
  public void testProcess_varReferencingNonFunction_addedToNonMethodProperties() {
    // JS: var myVal = 42; Foo.bar = myVal;
    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);

    Node varNode = new Node(Token.VAR);
    Node varName = Node.newString(Token.NAME, "myVal");
    varName.addChildToBack(Node.newNumber(42));
    varNode.addChildToBack(varName);
    root.addChildToBack(varNode);

    Node assign = new Node(Token.ASSIGN);
    Node getprop = new Node(Token.GETPROP, Node.newString(Token.NAME, "Foo"), Node.newString(Token.STRING, "bar"));
    Node rhsName = Node.newString(Token.NAME, "myVal");
    assign.addChildToBack(getprop);
    assign.addChildToBack(rhsName);
    root.addChildToBack(assign);

    pass.process(externs, root);

    Assert.assertFalse(signatureStore.signatures.containsKey("bar"));
    Assert.assertTrue(pass.nonMethodProperties.contains("bar"));
  }

  @Test(expected = IllegalStateException.class)
  public void testProcess_undefinedVar_throwsIllegalStateExceptionNotInIdeMode() {
    // JS: Foo.bar = undefinedVar;
    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);

    Node assign = new Node(Token.ASSIGN);
    Node getprop = new Node(Token.GETPROP, Node.newString(Token.NAME, "Foo"), Node.newString(Token.STRING, "bar"));
    Node rhsName = Node.newString(Token.NAME, "undefinedVar");
    assign.addChildToBack(getprop);
    assign.addChildToBack(rhsName);
    root.addChildToBack(assign);

    pass.process(externs, root);
  }

  @Test
  public void testProcess_undefinedVarInIdeMode_handledGracefully() {
    CompilerOptions options = new CompilerOptions();
    options.ideMode = true;
    compiler.initOptions(options);

    TestableMethodCompilerPass idePass = new TestableMethodCompilerPass(compiler, signatureStore);

    // JS: Foo.bar = undefinedVar;
    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);

    Node assign = new Node(Token.ASSIGN);
    Node getprop = new Node(Token.GETPROP, Node.newString(Token.NAME, "Foo"), Node.newString(Token.STRING, "bar"));
    Node rhsName = Node.newString(Token.NAME, "undefinedVar");
    assign.addChildToBack(getprop);
    assign.addChildToBack(rhsName);
    root.addChildToBack(assign);

    idePass.process(externs, root);

    Assert.assertFalse(signatureStore.signatures.containsKey("bar"));
    Assert.assertFalse(idePass.methodDefinitions.containsKey("bar"));
  }
}
